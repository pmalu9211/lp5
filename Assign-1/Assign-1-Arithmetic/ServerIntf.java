import java.rmi.*;

interface ServerIntf extends Remote{

    // Syntax for method declaration:
    // public double method_name(double num1, double num2) throws RemoteException;

    public double Addition(double num1, double num2) throws RemoteException;
    public double Subtraction(double num1, double num2) throws RemoteException;
    public double Multiplication(double num1, double num2) throws RemoteException;
    public double Division(double num1, double num2) throws RemoteException;
}
