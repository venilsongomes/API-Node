import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Servidor {
    public static void main(String[] args) {
        try {
            CalculadoraImpl impl = new CalculadoraImpl();
            Calculadora stub = (Calculadora) UnicastRemoteObject.exportObject(impl, 0);

            // Cria um registry na porta 1099 (se já existir, retorna o registry existente)
            try {
                LocateRegistry.createRegistry(1099); // Tenta criar um novo registry
                System.out.println("Registry criado na porta 1099.");
            } catch (Exception e) {
                System.out.println("Registry já existe (ou não foi possível criar): " + e.getMessage());
            }

            Registry registry = LocateRegistry.getRegistry(1099);// Obtém o registry na porta 1099
            registry.rebind("CalculadoraService", stub); // registra o stub com o nome "CalculadoraService"

            System.out.println("Servidor RMI pronto. Serviço 'CalculadoraService' registrado.");
        } catch (Exception e) {
            System.err.println("Falha ao iniciar servidor: " + e);
            e.printStackTrace();
        }
    }
}
