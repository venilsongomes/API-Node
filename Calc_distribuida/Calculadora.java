import java.rmi.Remote;

public interface Calculadora extends Remote {

    public int sumar(int a, int b) throws java.rmi.RemoteException;
    public int subtrair(int a, int b) throws java.rmi.RemoteException;
    public float multiplicar(float a, float b) throws java.rmi.RemoteException;
    public float dividir(float a, float b) throws java.rmi.RemoteException;

} 
    

