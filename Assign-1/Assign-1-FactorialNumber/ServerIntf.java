import java.rmi.*;

interface ServerIntf extends Remote {

    public long factorial(int num) throws RemoteException;
}
