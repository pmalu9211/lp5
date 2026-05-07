import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

    public ServerImpl() throws RemoteException {

    }

    public double powerCalculation(int num) throws RemoteException {

        return Math.pow(2, num);
    }
}
