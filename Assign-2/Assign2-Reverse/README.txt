
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Step-by-Step CORBA Execution (Ubuntu/Linux)
Step 1 → Open Terminal
Step 2 → Compile IDL File

Run:

idlj -fall Reverse.idl

This generates:

ReverseModule/
helper/stub files
Step 3 → Compile All Java Files
javac *.java ReverseModule/*.java
Step 4 → Start CORBA Naming Service

Open NEW terminal:

orbd -ORBInitialPort 1050

Keep this terminal running.

Step 5 → Run Server

Open NEW terminal:

java ReverseServer -ORBInitialPort 1050

Expected Output:

Server ready...

Keep server running.

Step 6 → Run Client

Open NEW terminal:

java ReverseClient -ORBInitialPort 1050
Step 7 → Enter String

Example:

Enter string: hello

Expected Output:

Reversed string: olleh
Full Terminal Flow
Terminal 1
orbd -ORBInitialPort 1050
Terminal 2
java ReverseServer -ORBInitialPort 1050

Output:

Server ready...
Terminal 3
java ReverseClient -ORBInitialPort 1050

Input:

Enter string: Distributed

Output:

Reversed string: detubirtsiD
Important Viva Point
What is ORBD?

CORBA naming service daemon used to register and locate remote objects.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Your CORBA String Reversing assignment is correctly implemented.

What This Assignment Does

This is a CORBA distributed application where:

Client sends a string
Server reverses the string
Result returns to client

Example:

Input  : HELLO
Output : OLLEH
Files in Your Assignment
File	Purpose
Reverse.idl	Interface definition
ReverseImpl.java	Business logic
ReverseServer.java	CORBA server
ReverseClient.java	CORBA client
Expected Output
Server Side

Run server:

Server ready...

Server waits for client requests.

Client Side

Example input:

Enter string: hello

Expected output:

Reversed string: olleh
More Example Outputs
Example 1

Input:

ChatGPT

Output:

TPGtahC
Example 2

Input:

Distributed

Output:

detubirtsiD
Flow of Execution
Step 1

Client enters string.

Step 2

Client calls remote CORBA method:

obj.reverse_string(input);
Step 3

Request goes to CORBA server.

Step 4

Server executes:

new StringBuilder(str).reverse().toString();
Step 5

Server sends reversed string back.

Step 6

Client displays result.

What Each File Does
Reverse.idl

Defines remote method:

string reverse_string(in string str);
ReverseImpl.java

Contains actual reversing logic.

ReverseServer.java
Starts CORBA server
Registers object
Waits for requests

Output:

Server ready...
ReverseClient.java
Connects to CORBA server
Sends string
Receives reversed string
What Problem Statement Is Demonstrating

The assignment demonstrates:

distributed computing
object brokering
client-server communication
remote method invocation using CORBA
One-Line Viva Answer

CORBA String Reversing application demonstrates distributed object brokering where client remotely invokes server method to reverse a string

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# CORBA Viva Questions & Answers

## 1. What is CORBA?

CORBA (Common Object Request Broker Architecture) is a middleware technology for distributed object communication.

---

## 2. What does CORBA stand for?

Common Object Request Broker Architecture.

---

## 3. Why is CORBA used?

To enable communication between distributed objects on different machines.

---

## 4. What is object brokering?

Managing communication between distributed objects.

---

## 5. What is distributed computing?

Multiple systems working together over network.

---

## 6. What is middleware?

Software layer between applications and network/OS.

---

## 7. What is ORB in CORBA?

Object Request Broker manages communication between client and server.

---

## 8. What is the role of ORB?

Find remote objects and transfer requests/responses.

---

## 9. What is IDL?

Interface Definition Language.

---

## 10. Why use IDL?

To define remote methods independent of programming language.

---

## 11. What is `Reverse.idl`?

IDL file defining remote interface.

---

## 12. What does this line mean?

```idl id="cq1"
string reverse_string(in string str);
```

Defines remote method for reversing string.

---

## 13. What is `idlj` command?

Generates Java CORBA stub and skeleton files.

---

## 14. What does this command do?

```bash id="cq2"
idlj -fall Reverse.idl
```

Generates all CORBA support files.

---

## 15. What is stub in CORBA?

Client-side proxy for remote object.

---

## 16. What is skeleton?

Server-side request handler.

---

## 17. What is object reference?

Reference used to access remote object.

---

## 18. What is servant object?

Server-side implementation object.

---

## 19. What is `ReverseImpl.java`?

Implementation class containing reversing logic.

---

## 20. What is this line doing?

```java id="cq3"
return new StringBuilder(str).reverse().toString();
```

Reverses input string.

---

## 21. What is `ReverseServer.java`?

CORBA server program.

---

## 22. What is `ReverseClient.java`?

CORBA client program.

---

## 23. What is `orbd`?

CORBA naming service daemon.

---

## 24. Why run `orbd`?

To register and locate CORBA objects.

---

## 25. What does this command do?

```bash id="cq4"
orbd -ORBInitialPort 1050
```

Starts CORBA naming service.

---

## 26. Why use port 1050?

Default CORBA naming service port.

---

## 27. What does this line do?

```java id="cq5"
ORB orb = ORB.init(args, null);
```

Initializes CORBA ORB.

---

## 28. What is Naming Service?

Directory service storing object references.

---

## 29. What does:

```java id="cq6"
resolve_initial_references("NameService")
```

do?

Gets reference to naming service.

---

## 30. What does:

```java id="cq7"
NamingContextExtHelper.narrow(objRef);
```

do?

Converts generic object into naming context.

---

## 31. What does:

```java id="cq8"
ncRef.rebind(...)
```

do?

Registers remote object with naming service.

---

## 32. What does:

```java id="cq9"
ncRef.resolve_str("Reverse")
```

do?

Finds remote object named `"Reverse"`.

---

## 33. What is remote method invocation?

Calling method on remote object.

---

## 34. How does client communicate with server?

Through ORB and stub objects.

---

## 35. What is object serialization?

Converting object/data into transferable format.

---

## 36. What is marshalling?

Preparing request for transmission.

---

## 37. What is unmarshalling?

Reconstructing transmitted request.

---

## 38. What is client-server architecture?

Client requests service; server processes request.

---

## 39. What is distributed object?

Object accessible remotely over network.

---

## 40. Why is CORBA platform independent?

Supports multiple languages and platforms.

---

## 41. Difference between CORBA and RMI?

| CORBA                | RMI                  |
| -------------------- | -------------------- |
| Language independent | Java specific        |
| Uses IDL             | Uses Java interfaces |

---

## 42. Difference between CORBA and Socket Programming?

| CORBA                 | Socket                  |
| --------------------- | ----------------------- |
| High-level middleware | Low-level communication |
| Object-oriented       | Data stream based       |

---

## 43. What is remote object registration?

Storing remote object reference in naming service.

---

## 44. Why is server started before client?

Client requires registered remote object.

---

## 45. What happens if server is not running?

Client connection fails.

---

## 46. What happens if `orbd` is not running?

Object lookup fails.

---

## 47. What is concurrency?

Multiple requests handled simultaneously.

---

## 48. Can CORBA support distributed systems?

Yes.

---

## 49. Can CORBA work on different machines?

Yes.

---

## 50. What is network transparency?

User cannot distinguish local and remote objects.

---

## 51. What is process communication?

Communication between processes.

---

## 52. What is inter-process communication?

Data exchange between different processes.

---

## 53. What is scalability?

Ability to support more users/processes.

---

## 54. What is fault tolerance?

System survives failures.

---

## 55. What are advantages of CORBA?

* Platform independent
* Distributed communication
* Language interoperability

---

## 56. What are disadvantages of CORBA?

* Complex setup
* High overhead

---

## 57. What is ORBInitialPort?

Port number used by ORB naming service.

---

## 58. Why compile generated files?

Required for CORBA communication.

---

## 59. Execution sequence?

```text id="cq10"
1. idlj
2. javac
3. orbd
4. Server
5. Client
```

---

## 60. One-line viva answer?

> CORBA enables distributed object communication where client remotely invokes server methods using ORB and IDL-based object brokering.
