import com.example.grpc.calculator.*; // Importa tudo gerado
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.io.IOException;

public class CalculatorServer {

    // A classe interna que implementa a lógica do serviço
    static class CalculatorImpl extends CalculatorGrpc.CalculatorImplBase {

        // Implementa o método Add
        @Override
        public void add(CalcRequest request, StreamObserver<CalcResponse> responseObserver) {
            double result = request.getNumber1() + request.getNumber2();
            System.out.println("Requisição de Soma recebida: " + request.getNumber1() + " + " + request.getNumber2());

            // Cria a resposta usando o builder
            CalcResponse response = CalcResponse.newBuilder().setResult(result).build();

            // Envia a resposta para o cliente
            responseObserver.onNext(response);
            // Finaliza a chamada
            responseObserver.onCompleted();
        }

        @Override
        public void subtract(CalcRequest request, StreamObserver<CalcResponse> responseObserver) {
            double result = request.getNumber1() - request.getNumber2();
            System.out.println(
                    "Requisição de Subtração recebida: " + request.getNumber1() + " - " + request.getNumber2());
            CalcResponse response = CalcResponse.newBuilder().setResult(result).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void multiply(CalcRequest request, StreamObserver<CalcResponse> responseObserver) {
            double result = request.getNumber1() * request.getNumber2();
            System.out.println(
                    "Requisição de Multiplicação recebida: " + request.getNumber1() + " * " + request.getNumber2());
            CalcResponse response = CalcResponse.newBuilder().setResult(result).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void divide(CalcRequest request, StreamObserver<CalcResponse> responseObserver) {
            if (request.getNumber2() == 0) {
                // Envia um erro para o cliente
                System.out.println("Erro: Tentativa de divisão por zero.");
                responseObserver.onError(
                        Status.INVALID_ARGUMENT
                                .withDescription("Não é possível dividir por zero")
                                .asRuntimeException());
                return; // Importante para não continuar a execução
            }
            double result = request.getNumber1() / request.getNumber2();
            System.out
                    .println("Requisição de Divisão recebida: " + request.getNumber1() + " / " + request.getNumber2());
            CalcResponse response = CalcResponse.newBuilder().setResult(result).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        // Cria o servidor na porta especificada, adicionando nosso serviço
        Server server = ServerBuilder.forPort(port)
                .addService(new CalculatorImpl())
                .build();

        // Inicia o servidor
        server.start();
        System.out.println("Servidor iniciado na porta " + port);

        // Garante que a aplicação principal não termine, mantendo o servidor em
        // execução
        server.awaitTermination();
    }
}