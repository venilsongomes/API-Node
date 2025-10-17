import com.example.grpc.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CalculatorClient {
    public static void main(String[] args) throws InterruptedException {

      ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        try{ 
        Scanner scanner = new Scanner(System.in);
      
        double num1 = 0, num2 = 0;

        System.out.println("Informe \n 1 para Soma (+) \n 2 para Subtração (-) \n 3 para Multiplicação (*) \n 4 para Divisão (/)");
        int operacao = scanner.nextInt();

         CalculatorGrpc.CalculatorBlockingStub stub = CalculatorGrpc.newBlockingStub(channel);

        switch (operacao) {
            case 1:
                System.out.println("Informe o primeiro número:");
                num1 = scanner.nextFloat();
                System.out.println("Informe o segundo número:");
                num2 = scanner.nextFloat();
                // Chamar o método de soma
            CalcRequest addRequest = CalcRequest.newBuilder().setNumber1(num1).setNumber2(num2).build();
            CalcResponse addResponse = stub.add(addRequest);
            System.out.println("Soma: " + num1 + " + " + num2 + " = " + addResponse.getResult());
                break;
            case 2:
                System.out.println("Informe o primeiro número:");
                num1 = scanner.nextFloat();
                System.out.println("Informe o segundo número:");
                num2 = scanner.nextFloat();
                // Chamar o método de subtração
                 CalcRequest subtractRequest = CalcRequest.newBuilder().setNumber1(num1).setNumber2(num2).build();
            CalcResponse subtractResponse = stub.subtract(subtractRequest);
            System.out.println("Subtração: " + num1 + " - " + num2 + " = " + subtractResponse.getResult());

                break;
            case 3:
                System.out.println("Informe o primeiro número:");
                num1 = scanner.nextFloat();
                System.out.println("Informe o segundo número:");
                num2 = scanner.nextFloat();
                // Chamar o método de multiplicação
                  CalcRequest multiplyRequest = CalcRequest.newBuilder().setNumber1(num1).setNumber2(num2).build();
            CalcResponse multiplyResponse = stub.multiply(multiplyRequest);
            System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + multiplyResponse.getResult());
                break;
            case 4:
                System.out.println("Informe o primeiro número:");
                num1 = scanner.nextFloat();
                System.out.println("Informe o segundo número:");
                num2 = scanner.nextFloat();
                // Chamar o método de divisão
                CalcRequest divideRequest = CalcRequest.newBuilder().setNumber1(num1).setNumber2(num2).build();
            CalcResponse divideResponse = stub.divide(divideRequest);
            System.out.println("Divisão: " + num1 + " / " + num2 + " = " + divideResponse.getResult());
                break;
        
            default:
                break;
        }

        scanner.close();
    } catch (StatusRuntimeException e) {
       System.out.println("Erro recebido do servidor, como esperado!");
       System.out.println("  Status: " + e.getStatus().getCode());
       System.out.println("  Detalhes: " + e.getStatus().getDescription());
    } finally {
        // Certifique-se de que o canal seja desligado mesmo em caso de erro
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);

}
    }
}
