import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try {
            // Obter a referência do objeto remoto
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            // 2. procura pelo objeto remoto usando o nome que o servidor registrou
            // O método lookup retorna um objeto do tipo Remote, então fazemos o cast para
            // nossa interface.
            Calculadora calculadora = (Calculadora) registry.lookup("CalculadoraService");
            // 3. Agora podemos chamar os métodos como se fossem locais!

            Scanner scanner = new Scanner(System.in);
            int num1, num2;
            System.out.println("\nDigite \n - 1 para soma \n - 2 para subtração\n - 3 para multiplicação\n - 4 para divisão:");
            int operacao = scanner.nextInt();

            switch (operacao) {
                case 1:
                    System.out.println("Informe o primeiro número:");
                    num1 = scanner.nextInt();
                    System.out.println("Informe o segundo número:");
                    num2 = scanner.nextInt();
                    System.out.println("Resultado da soma: " + calculadora.sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("Informe o primeiro número:");
                    num1 = scanner.nextInt();
                    System.out.println("Informe o segundo número:");
                    num2 = scanner.nextInt();
                    System.out.println("Resultado da subtração: " + calculadora.subtrair(num1, num2));
                    break;
                case 3:
                    System.out.println("Informe o primeiro número:");
                    float nums = scanner.nextFloat();
                    System.out.println("Informe o segundo número:");
                    float nums1 = scanner.nextFloat();
                    System.out.println("Resultado da multiplicação: " + calculadora.multiplicar(nums, nums1));
                    break;
                case 4:
                    System.out.println("Informe o primeiro número:");
                    float num = scanner.nextFloat();
                    System.out.println("Informe o segundo número:");
                    float num3 = scanner.nextFloat();
                    System.out.println("Resultado da divisão: " + calculadora.dividir(num, num3));
                    break;
                default:
                    System.out.println("Operação inválida.");
            }
        } catch (Exception e) {
            System.err.println("Erro no cliente:" + e.toString());
            e.printStackTrace();
        }
    }
}
