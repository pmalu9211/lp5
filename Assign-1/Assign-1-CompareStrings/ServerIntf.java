import java.rmi.*;

interface ServerIntf extends Remote {

    public String compareStrings(String str1, String str2) throws RemoteException;
}
