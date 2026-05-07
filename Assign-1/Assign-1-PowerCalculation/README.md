# Assignment 1: Java Remote Method Invocation (RMI)

This practical demonstrates a simple Distributed System application using Java RMI to perform addition on a remote server.

## 🚀 How to Run

Follow these steps in order:

### 1. Compile all Java files
Open your terminal and run:
```bash
javac *.java
```

### 2. Start the RMI Registry
The registry is a naming service that allows the client to find the server. Run this in the background (or a separate terminal):
```bash
rmiregistry &
```
*Note: If you are on Windows, use `start rmiregistry`.*

### 3. Start the Server
In a new terminal window, start the server host:
```bash
java Server
```

### 4. Start the Client
In another terminal window, run the client to interact with the server:
```bash
java Client
```

---

## 🎓 Viva Questions & Answers

### 1. What is Java RMI?
RMI stands for **Remote Method Invocation**. It is an API that allows an object residing in one system (JVM) to access/invoke methods of an object running on another JVM.

### 2. What are the main components of an RMI application?
- **Remote Interface:** Defines the methods that can be called remotely.
- **Remote Implementation:** The actual class that implements the remote interface.
- **Server:** Registers the remote object with the registry.
- **Client:** Looks up the remote object and calls its methods.
- **RMI Registry:** A naming service for looking up remote objects.

### 3. What are Stubs and Skeletons?
- **Stub:** A gateway for the **client side**. It handles communication with the server and sends parameters (Marshalling).
- **Skeleton:** A gateway for the **server side**. It receives requests from the stub, unmarshalls parameters, and calls the actual method on the server object.
*Note: In modern Java (1.2+), skeletons are generated dynamically and aren't manually created.*

### 4. Why do we extend `Remote` and `UnicastRemoteObject`?
- **`Remote` interface:** A marker interface. Every remote object must implement this to indicate its methods are accessible from a remote JVM.
- **`UnicastRemoteObject`:** Provides the basic implementation of a remote object, making it "exportable" so it can listen for incoming RMI calls.

### 5. What is Marshalling and Unmarshalling?
- **Marshalling:** The process of converting a Java object into a format suitable for transmission over a network (Serialization).
- **Unmarshalling:** The process of converting the transmitted data back into a Java object on the receiving end.

### 6. What is the role of `Naming.rebind()` and `Naming.lookup()`?
- **`rebind("Name", object)`:** Used by the Server to register an object in the RMI registry under a specific name.
- **`lookup("URL")`:** Used by the Client to find the remote object using its registered name/URL.

### 7. What common exceptions occur in RMI?
- **`RemoteException`:** Must be handled by all remote methods; occurs during network failures.
- **`NotBoundException`:** Occurs when the client tries to lookup a name not present in the registry.
- **`AlreadyBoundException`:** Occurs when binding a name that is already in use.
