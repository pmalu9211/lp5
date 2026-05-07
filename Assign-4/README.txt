What This Assignment Does

The server acts as:

Time Daemon / Coordinator

Clients act as:

Machines with different clocks

The server:

collects client times
calculates average time
sends adjustment values
clients synchronize clocks
How To Run (Ubuntu/Linux)
Step 1 → Open Terminal
Step 2 → Run Server First
python3 server.py

Expected:

Enter number of clients:

Example:

2

Server now waits for 2 clients.

Step 3 → Open NEW Terminal for Client 1

Run:

python3 client.py

Input:

Enter server IP:

If same machine:

127.0.0.1
Step 4 → Open Another Terminal for Client 2

Run again:

python3 client.py

Enter:

127.0.0.1
Now Synchronization Starts Automatically
Expected Server Output

Example:

Client 1 Time: 10:20:15
Client 2 Time: 10:20:19
Server Time: 10:20:17
Average Time: 10:20:17

Meaning:

server collected all clocks
calculated average time
Expected Client Output

Client 1:

Local Time: 10:20:15
Adjusted Time: 10:20:17

Client 2:

Local Time: 10:20:19
Adjusted Time: 10:20:17
What Is Happening Internally
Client Side

Client:

generates local clock
sends time to server
receives correction value
adjusts clock
Server Side

Server:

receives all client times
checks own time
computes average
sends adjustments
Why Random Time Is Used

This line:

random.uniform(-5, 5)

simulates different machine clocks.

Otherwise all clocks would show same system time.

What Is Berkeley Algorithm

Berkeley Algorithm synchronizes clocks in distributed systems using:

coordinator server
average time calculation
clock adjustment
What Is Time Daemon

Time daemon is the coordinator process managing synchronization.

In your code:

server.py = Time Daemon
Infinite Loop Meaning
while True:

means synchronization runs continuously.

Which Problem Statements Are Satisfied
PS	Status
4.1 Berkeley Synchronization	✅
4.2 Berkeley + Time Daemon	✅
4.3 Berkeley + Time Daemon	✅
Viva One-Line Answer

Berkeley Algorithm synchronizes distributed system clocks by calculating average time using a coordinator (time daemon) and adjusting all client clocks accordingly.



-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# Berkeley Algorithm Viva Questions & Answers

## 1. What is Berkeley Algorithm?

Berkeley Algorithm is a clock synchronization algorithm used in distributed systems.

---

## 2. What is the purpose of Berkeley Algorithm?

To synchronize clocks of multiple machines.

---

## 3. Why is clock synchronization important?

To maintain consistent time across distributed systems.

---

## 4. What is clock drift?

Difference in clocks between systems over time.

---

## 5. What is synchronization?

Making all clocks show nearly same time.

---

## 6. What is a distributed system?

Multiple computers working together.

---

## 7. What is Time Daemon?

Coordinator server responsible for synchronization.

---

## 8. Which file acts as Time Daemon in your code?

```text id="bv1"
server.py
```

---

## 9. What is the role of server in Berkeley Algorithm?

Collect times, calculate average, send adjustments.

---

## 10. What is the role of client?

Send local time and adjust clock.

---

## 11. What protocol is used in your code?

TCP Socket communication.

---

## 12. Why use sockets?

For communication between server and clients.

---

## 13. What is socket programming?

Communication between processes using sockets.

---

## 14. What does this line do?

```python id="bv2"
s.bind((HOST, PORT))
```

Binds server to IP and port.

---

## 15. What does this line do?

```python id="bv3"
s.listen(10)
```

Server waits for client connections.

---

## 16. What does this line do?

```python id="bv4"
c.connect((HOST, PORT))
```

Client connects to server.

---

## 17. Why is port number used?

To identify communication endpoint.

---

## 18. Which port is used in your code?

```text id="bv5"
9999
```

---

## 19. What is localhost IP?

```text id="bv6"
127.0.0.1
```

---

## 20. What happens if server is not started?

Client connection fails.

---

## 21. What is average time in Berkeley Algorithm?

Mean of all client and server times.

---

## 22. Why calculate average time?

To synchronize all clocks fairly.

---

## 23. What does this line do?

```python id="bv7"
avg = (sum(times) + server_time) / (len(times) + 1)
```

Calculates average synchronized time.

---

## 24. Why is server time included in average?

Coordinator clock also participates.

---

## 25. What is clock adjustment?

Difference added/subtracted to synchronize time.

---

## 26. What does this line do?

```python id="bv8"
new = local + diff
```

Adjusts client clock.

---

## 27. Why random time is generated?

To simulate different machine clocks.

---

## 28. What does this line do?

```python id="bv9"
random.uniform(-5, 5)
```

Creates random clock drift.

---

## 29. Why use infinite loop?

Continuous synchronization.

---

## 30. What does:

```python id="bv10"
while True:
```

mean?

Program runs continuously forever.

---

## 31. What is clock skew?

Difference between two clocks.

---

## 32. What is network latency?

Delay during communication.

---

## 33. Can latency affect synchronization?

Yes.

---

## 34. What happens if client disconnects?

Server communication fails for that client.

---

## 35. What is TCP?

Reliable connection-oriented protocol.

---

## 36. Why TCP used instead of UDP?

Reliable communication required.

---

## 37. Difference between TCP and UDP?

| TCP                 | UDP            |
| ------------------- | -------------- |
| Reliable            | Faster         |
| Connection-oriented | Connectionless |

---

## 38. What is socket?

Endpoint for communication.

---

## 39. What is client-server architecture?

Client requests, server responds.

---

## 40. What is process communication?

Data exchange between processes.

---

## 41. What is inter-process communication?

Communication between different programs/processes.

---

## 42. Why use Python for Berkeley Algorithm?

Simple socket programming support.

---

## 43. What is timestamp?

Current system time value.

---

## 44. What does:

```python id="bv11"
time.time()
```

return?

Current UNIX timestamp.

---

## 45. Why use datetime module?

To display readable time.

---

## 46. What does:

```python id="bv12"
datetime.fromtimestamp()
```

do?

Converts timestamp into readable time.

---

## 47. What is synchronization interval?

Time gap between synchronization operations.

---

## 48. Why use:

```python id="bv13"
time.sleep(5)
```

To synchronize every 5 seconds.

---

## 49. What are advantages of Berkeley Algorithm?

* Simple
* Efficient
* Centralized synchronization

---

## 50. What are disadvantages?

Single point of failure.

---

## 51. What happens if Time Daemon fails?

Synchronization stops.

---

## 52. Is Berkeley Algorithm centralized or distributed?

Centralized synchronization.

---

## 53. What is coordinator in Berkeley Algorithm?

Time daemon server.

---

## 54. Can Berkeley Algorithm work on physical machines?

Yes.

---

## 55. Can it work on same machine?

Yes, using localhost.

---

## 56. What is synchronization error?

Difference remaining after synchronization.

---

## 57. Why does Berkeley Algorithm not use UTC directly?

It internally synchronizes local clocks.

---

## 58. What is UNIX timestamp?

Seconds since Jan 1, 1970.

---

## 59. What is daemon process?

Background service process.

---

## 60. One-line viva answer?

> Berkeley Algorithm synchronizes clocks in distributed systems by using a coordinator server that calculates average time and adjusts all client clocks accordingly.
