javac.*.java
rmiregistry

new window
java server

new window 
java client

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Part 1 — Basic RMI + Server.java Viva Answers
1. What is RMI in Java?

RMI allows a Java program to call methods of an object located on another machine.

2. What does RMI stand for?

Remote Method Invocation.

3. Why is RMI used in distributed systems?

RMI enables communication between distributed Java applications.

4. What is a distributed system?

A distributed system is a collection of multiple computers working together as one system.

5. Difference between RMI and Socket Programming?
RMI	Socket
High-level API	Low-level API
Object-oriented	Data stream communication
Easy to implement	More coding required
6. What is remote method invocation?

Calling a method on an object located remotely over a network.

7. How does client-server communication happen in RMI?

Client uses stub reference to invoke methods on remote server object through RMI Registry.

8. What is the role of middleware in RMI?

Middleware handles communication between distributed applications.

9. What protocol does Java RMI use?

TCP/IP.

10. Why is RMI platform independent?

Because Java is platform independent.

Server.java Questions
11. What is the role of Server.java?

It creates remote object and registers it with RMI Registry.

12. Why do we use:
Naming.rebind("Server", serverImpl);

To register remote object with registry using name "Server".

13. What is RMI Registry?

RMI Registry is a naming service used to store and locate remote objects.

14. What does rebind() do?

It binds or replaces an existing remote object registration.

15. Difference between bind() and rebind()?
bind()	rebind()
Fails if name exists	Replaces existing object
16. Why is the server object registered?

So clients can access it remotely.

17. What happens if the server is not started?

Client cannot connect to remote object.

18. Why is exception handling used in server code?

To handle network and remote communication errors safely.

19. Why do we create remote object before registration?

Because registry stores reference of remote object.

20. What happens internally in rebind()?

Registry stores remote object reference with given name.

21. Why do we use:
ServerImpl serverImpl = new ServerImpl();

To create instance of remote object implementation.

22. Why is server always started before client?

Because client needs remote object already registered.

23. What happens if two servers use same registry name?

Second registration replaces first object if rebind() is used.

24. Why is main() method required in server?

Execution starts from main().

25. Why is server continuously running?

To handle client requests anytime.

26. What is server-side processing?

Actual computation performed on server machine.

27. What is remote communication?

Communication between programs running on different systems.

28. What is network transparency?

User does not know computation is happening remotely.

29. What is stub in RMI?

Client-side proxy for remote object.

30. What is skeleton in RMI?

Server-side component handling incoming requests (automatic in modern Java).

31. Why is RMI object-oriented?

Because remote objects and methods are used.

32. What is a JVM?

Java Virtual Machine that executes Java bytecode.

33. Can RMI communicate between different operating systems?

Yes, if Java is installed.

34. What is naming service?

Service used to map names with remote objects.

35. Why use string "Server" in rebind?

It acts as identifier for client lookup.

36. What happens if registry is not running?

Server registration fails.

37. What command starts registry?
rmiregistry
38. Why compile all Java files?

To generate class files required for execution.

39. What is remote reference?

Reference pointing to object on another machine.

40. What is distributed object?

Object accessible remotely over network.

	
Part 2 — Client.java + ServerIntf.java + ServerImpl.java Viva Answers
Client.java Viva Questions
41. What is the role of Client.java?
Client sends requests to server and receives results.

42. Explain this line:
String serverURL = "rmi://localhost/Server";
It specifies location and name of remote object.

43. What does localhost mean?
Current machine.

44. What does "Server" represent in URL?
Registered remote object name.

45. Why use:
Naming.lookup(serverURL);
To search and access remote object from registry.

46. What is returned by lookup()?
Stub reference of remote object.

47. Why typecasting is needed?
Because lookup() returns generic Remote object.

48. Explain:
(ServerIntf) Naming.lookup(serverURL);
Converts returned remote object into ServerIntf type.

49. How does client communicate with server?
Through stub object over network.

50. Why is Scanner used?
To take user input.

51. What happens if server URL is wrong?
Client gets connection or lookup error.

52. What happens if server is offline?
RemoteException occurs.

53. Why does client not contain business logic?
Because computation is handled on server side.

54. What is client-side processing?
Tasks performed on client machine like input/output.

55. Why are results displayed on client side?
Because client requested computation.

56. What happens internally when client calls remote method?
Request goes to server, server executes method, result returns to client.

57. Why use remote object instead of local object?
To access services on another machine.

58. What is a proxy object?
Intermediate object representing remote object locally.

59. Why is RMI easier than socket programming?
No manual data transfer handling required.

60. What happens if registry name is incorrect?
Lookup fails.

ServerIntf.java Viva Questions
61. Why do we create interface in RMI?
To define remote methods accessible to clients.

62. Why does interface extend Remote?
To mark it as remote interface.

63. Why must remote methods throw RemoteException?
To handle communication/network failures.

64. What is the purpose of remote methods?
To allow client to invoke methods remotely.

65. Why are interface methods public?
Because client must access them remotely.

66. Can RMI work without interface?
No, remote methods must be declared in interface.

67. What is method declaration?
Specification of method name, return type, and parameters.

68. Why should interface and implementation methods match?
For proper method overriding.

69. What is loose coupling?
Client depends only on interface, not implementation.

70. Why use abstraction in RMI?
To hide implementation details.

ServerImpl.java Viva Questions
71. Why does ServerImpl implement ServerIntf?
To provide implementation of remote methods.

72. Why extend UnicastRemoteObject?
To make object remotely accessible.

73. What is UnicastRemoteObject?
Class used to export remote objects.

74. What is a remote object?
Object whose methods are invoked remotely.

75. Why constructor throws RemoteException?
Because remote object creation may involve network operations.

76. Where is business logic written?
Inside ServerImpl.java.

77. Why is actual computation done on server?
Because server provides remote services.

78. What happens if division by zero occurs?
Arithmetic error or invalid result occurs.

79. Why use implementation class separately?
To separate interface from logic.

80. What is method overriding?
Providing implementation for interface methods.

81. Why are methods public in implementation class?
Because overridden interface methods are public.

82. What is server-side object creation?
Creating remote service object on server.

83. Can multiple clients access same server object?
Yes.

84. How does Java RMI support concurrency?
Using multiple threads internally.

85. What is remote service?
Functionality provided remotely by server.

86. What happens when client invokes addition method?
Request goes to server, computation happens, result returns.

87. What is method invocation?
Calling/executing a method.

88. Why use return values in remote methods?
To send results back to client.

89. What is server response?
Result returned after processing client request.

90. Why is RMI called distributed object technology?
Because remote objects are distributed across systems.

Part 3 — Distributed Systems + Multithreading Viva Answers
91. What is client-server architecture?

Client sends requests and server processes them.

92. What are advantages of distributed systems?
Scalability
Resource sharing
Faster processing
Fault tolerance
93. What are disadvantages of distributed systems?
Complex design
Network dependency
Security issues
Synchronization problems
94. What is transparency in distributed systems?

User feels system behaves like a single machine.

95. What is scalability?

Ability to handle increasing workload.

96. What is fault tolerance?

System continues working even if some components fail.

97. What is concurrency?

Multiple tasks executing simultaneously.

98. What is synchronization?

Coordination between multiple processes/threads.

99. What is process communication?

Exchange of data between processes.

100. What is IPC?

Inter-Process Communication.

101. Why is RMI called distributed computing?

Because communication happens across multiple systems.

102. What is resource sharing?

Sharing hardware/software resources over network.

103. What is distributed processing?

Processing tasks across multiple machines.

104. What is network dependency?

System relies on network availability.

105. What is latency?

Delay in network communication.

Multithreading Viva
106. Why is this called multi-threaded communication?

Because multiple clients can connect simultaneously.

107. How does RMI support multiple clients?

Using separate threads internally.

108. What is a thread?

Lightweight execution unit inside process.

109. Difference between process and thread?
Process	Thread
Heavyweight	Lightweight
Separate memory	Shared memory
110. Can multiple clients access server simultaneously?

Yes.

111. What happens when many clients connect together?

Server handles them using multiple threads.

112. What is multithreading?

Executing multiple threads simultaneously.

113. Why are threads faster?

They share resources and have low overhead.

114. What is context switching?

CPU switching between threads/processes.

115. What is thread synchronization?

Controlling shared resource access.

116. Why are threads important in servers?

To handle multiple requests concurrently.

117. Difference between concurrency and parallelism?
Concurrency	Parallelism
Multiple tasks progress together	Multiple tasks execute simultaneously
118. What is deadlock?

Processes waiting indefinitely for resources.

119. What is starvation?

Process never gets required resources.

120. What is mutual exclusion?

Only one process accesses resource at a time.

Part 4 — Networking + Exception Handling Viva Answers
121. What is RemoteException?

Exception for remote communication failures.

122. Why must remote methods throw RemoteException?

To handle network-related errors.

123. What types of network failures can occur?
Server crash
Connection loss
Timeout
Registry failure
124. What happens if server crashes?

Client receives exception/error.

125. What happens if client disconnects suddenly?

Server stops processing that request.

126. What is localhost IP address?
127.0.0.1
127. What is port number in networking?

Unique communication endpoint number.

128. What is default RMI Registry port?
1099
129. What protocol does RMI use?

TCP/IP.

130. Difference between TCP and UDP?
TCP	UDP
Reliable	Faster
Connection-oriented	Connectionless
131. Why does RMI use TCP?

Because reliable communication is required.

132. What is packet loss?

Loss of transmitted network packets.

133. What is network timeout?

Delay exceeding allowed waiting time.

134. What is exception handling?

Mechanism to handle runtime errors safely.

135. Why use try-catch blocks?

To prevent program termination due to errors.

136. What is checked exception?

Exception checked at compile time.

137. Is RemoteException checked or unchecked?

Checked exception.

138. What is connection-oriented communication?

Communication with established connection.

139. What is reliability in networking?

Guaranteed data delivery.

140. What is bandwidth?

Amount of data transferred per second.

Part 5 — Advanced + Trap Questions Viva Answers
141. Difference between local and remote method call?
Local Call	Remote Call
Same JVM	Different JVM/machine
Faster	Slower
142. What is stub in RMI?

Client-side proxy object.

143. What is serialization?

Converting object into byte stream.

144. Why is serialization important?

To transfer objects across network.

145. What is marshalling?

Preparing object for transmission.

146. What is unmarshalling?

Reconstructing transmitted object.

147. What are distributed objects?

Objects accessible remotely over network.

148. How can security be added in RMI?

Using authentication, SSL, and security manager.

149. Can RMI work over internet?

Yes.

150. Difference between RMI and Web Services?
RMI	Web Services
Java-specific	Language-independent
Faster	More interoperable
151. What are limitations of RMI?
Java dependent
Network overhead
Complex debugging
152. Why is RMI Java-specific?

Because it works using Java objects and JVM.

153. What is middleware architecture?

Software layer between applications and OS/network.

154. Can non-Java clients connect to RMI?

Generally no.

155. Why use RMI instead of sockets?

RMI is simpler and object-oriented.

156. What happens if registry is not running?

Lookup and registration fail.

157. Why interface methods must match implementation?

For correct overriding and remote invocation.

158. Why use localhost?

To test server and client on same machine.

159. Can client and server run on different systems?

Yes.

160. What if two servers use same registry name?

New registration replaces old one if rebind() used.

161. What happens if remote object is not bound?

Client lookup fails.

162. What is JVM?

Java Virtual Machine.

163. What is bytecode?

Platform-independent compiled Java code.

164. What is platform independence?

Run same program on different OS.

165. What is network topology?

Arrangement of network devices.

166. What is distributed transparency?

User cannot distinguish local vs remote resources.

167. What is scalability in RMI?

Ability to support more clients.

168. Why is RMI object-oriented?

Because remote objects and methods are used.

169. What is service-oriented communication?

Server provides services to clients.

170. Explain complete RMI flow.
Server creates remote object
Object registered using rebind()
Client performs lookup()
Client gets stub
Client invokes remote method
Server processes request
Result sent back to client