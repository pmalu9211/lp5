import java.rmi.*;

interface ServerIntf extends Remote {

    public double powerCalculation(int num) throws RemoteException;
}
