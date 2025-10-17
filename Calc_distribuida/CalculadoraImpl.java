import java.rmi.RemoteException;

public class CalculadoraImpl implements Calculadora {

    @Override
    public int sumar(int a, int b) throws RemoteException {
        System.out.println("Sumando " + a + " + " + b);
        return a + b;
    }

    @Override
    public int subtrair(int a, int b) throws RemoteException {
        System.out.println("Subtraindo " + a + " - " + b);
        return a - b;
    }

    @Override
    public float multiplicar(float a, float b) throws RemoteException {
        System.out.println("Multiplicando " + a + " * " + b);
        return a * b;
    }

    @Override
    public float dividir(float a, float b) throws RemoteException {
        System.out.println("Dividindo " + a + " / " + b);
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return a / b;
    }
    
}
