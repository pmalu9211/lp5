import java.rmi.*;

interface ServerIntf extends Remote {

    public String printMessage(String name) throws RemoteException;
}
