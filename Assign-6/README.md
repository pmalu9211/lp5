/\*

- What Your Bully Algorithm Assignment Is Doing
-
- The assignment simulates leader election in a distributed system.
-
- In distributed systems:
-
- many processes/computers are running
- one process acts as Coordinator/Leader
- if leader fails, a new leader must be elected
-
- Your program demonstrates this concept using the Bully Algorithm.
-
- Main Idea of Bully Algorithm
-
- The process with the highest ID among active processes becomes the leader.
-
- Example:
-
- Processes: 0 1 2 3 4
-
- If all are alive:
-
- Leader = 4
-
- If process 4 fails:
-
- Leader = 3
- What Your Program Simulates
-
- Your code allows:
-
- Creating processes
- Making processes UP/DOWN
- Starting election
- Electing highest active process as coordinator
- Printing messages exchanged
- Step-by-Step Working
- Step 1 → Create Processes
-
- Input:
-
- Enter total number of processes: 5
-
- Processes:
-
- 0 1 2 3 4
-
- Initially all are alive.
-
- Step 2 → Simulate Failure
-
- You can DOWN a process.
-
- Example:
-
- DOWN process 4
-
- Now:
-
- 0(UP) 1(UP) 2(UP) 3(UP) 4(DOWN)
- Step 3 → Start Election
-
- Suppose process 1 detects leader failure.
-
- It starts election:
-
- 1 → 2
-
- Process 2 is alive, so it continues:
-
- 2 → 3
-
- Process 3 checks higher processes:
-
- process 4 is DOWN
-
- So:
-
- 3 becomes leader
- Why It Is Called “Bully” Algorithm
-
- Higher-ID processes “bully” lower-ID processes.
-
- Lower process cannot become leader if higher active process exists.
-
- Highest active process always wins.
-
- What Messages Mean
- Election Message
- (1 -> 2)
-
- means:
-
- Process 1 sends election message to process 2
- Coordinator Message
- 3 => 0
-
- means:
-
- Leader process 3 informs process 0 that it is coordinator
- What Assignment Wants To Demonstrate
-
- The assignment demonstrates:
-
- fault tolerance
- process recovery
- distributed coordination
- leader election
- inter-process communication
- Real-World Use
-
- Leader election is used in:
-
- distributed databases
- cloud systems
- distributed servers
- cluster management
- Time Complexity
-
- Worst-case complexity:
-
- O(n²)
-
- Because many election messages may be exchanged.
-
- One-Line Viva Answer
-
- Bully Algorithm elects the highest active process as coordinator after
- detecting leader failure in a distributed system.
- \*/


/*
 * What Your Token Ring Algorithm Assignment Is Doing
 * 
 * This assignment simulates leader election in a distributed system using the
 * Token Ring Algorithm.
 * 
 * In distributed systems:
 * 
 * many processes are connected logically in a ring
 * one process acts as coordinator/leader
 * if leader fails, a new leader must be elected
 * 
 * Your program demonstrates this process.
 * 
 * Main Idea of Token Ring Algorithm
 * 
 * Processes are connected in a circular ring.
 * 
 * Election message (token) moves around the ring.
 * 
 * The process with the highest active ID becomes leader.
 * 
 * Ring Structure Example
 * 0 → 1 → 2 → 3 → 4 → 0
 * 
 * Message travels in circular form.
 * 
 * What Your Program Simulates
 * 
 * Your code allows:
 * 
 * Creating processes
 * Making processes UP/DOWN
 * Starting election
 * Passing token around ring
 * Electing highest active process
 * Printing exchanged messages
 * Step-by-Step Working
 * Step 1 → Create Processes
 * 
 * Input:
 * 
 * Enter total number of processes: 5
 * 
 * Processes:
 * 
 * 0 1 2 3 4
 * 
 * Initially all are active.
 * 
 * Step 2 → Simulate Failure
 * 
 * Suppose:
 * 
 * Process 4 DOWN
 * 
 * Now:
 * 
 * 0(UP) 1(UP) 2(UP) 3(UP) 4(DOWN)
 * Step 3 → Start Election
 * 
 * Suppose election starts from process 1.
 * 
 * Message/token moves in ring:
 * 
 * 1 → 2
 * 2 → 3
 * 3 → 4
 * 4 → 0
 * 0 → 1
 * 
 * While moving:
 * 
 * active process IDs are checked
 * highest active process is selected
 * 
 * Since process 4 is DOWN:
 * 
 * Leader = 3
 * Why It Is Called Token Ring
 * 
 * A special message called token circulates in ring structure.
 * 
 * Only process holding token can communicate/elect leader.
 * 
 * What Messages Mean
 * Election Message
 * (1 -> 2)
 * 
 * means:
 * 
 * Process 1 passes token to process 2
 * Coordinator Message
 * 3 => 0
 * 
 * means:
 * 
 * Leader process 3 informs process 0 that it is coordinator
 * Difference Between Bully and Token Ring
 * Bully Algorithm Token Ring Algorithm
 * Highest process dominates Token circulates in ring
 * Direct communication Circular communication
 * Faster election More message passing
 * Uses priority IDs Uses ring structure
 * What Assignment Demonstrates
 * 
 * The assignment demonstrates:
 * 
 * distributed coordination
 * leader election
 * ring communication
 * fault handling
 * message passing
 * Time Complexity
 * 
 * Worst-case complexity:
 * 
 * O(n)
 * 
 * because token visits processes sequentially.
 * 
 * Real-World Use
 * 
 * Used in:
 * 
 * distributed networks
 * token-based communication systems
 * ring topology systems
 * One-Line Viva Answer
 * 
 * Token Ring Algorithm elects the highest active process as coordinator by
 * passing a token sequentially around processes arranged in a logical ring.
 */


 
# Bully Algorithm Viva Questions & Answers

## 1. What is Bully Algorithm?

Bully Algorithm is a leader election algorithm where the highest active process becomes coordinator.

---

## 2. Why is it called Bully Algorithm?

Because higher-ID processes dominate lower-ID processes.

---

## 3. What is the main goal of Bully Algorithm?

To elect a new coordinator after leader failure.

---

## 4. Which process becomes leader?

Highest active process ID.

---

## 5. What is coordinator in distributed systems?

Main controlling process.

---

## 6. What happens when coordinator fails?

Election process starts.

---

## 7. Who starts the election?

Process detecting coordinator failure.

---

## 8. What message is sent during election?

Election message.

Example:

```text id="bq1"
1 -> 2
```

---

## 9. What happens if higher process is alive?

Higher process takes over election.

---

## 10. What happens if no higher process responds?

Current process becomes coordinator.

---

## 11. What does this line mean?

```text id="bq2"
3 => 0
```

Coordinator process 3 informs process 0.

---

## 12. Why is highest process selected?

To maintain priority-based coordination.

---

## 13. What is process ID?

Unique identifier of process.

---

## 14. What is process failure?

When process becomes inactive/down.

---

## 15. What is recovery in Bully Algorithm?

DOWN process becoming active again.

---

## 16. Can recovered higher process become coordinator?

Yes.

---

## 17. What is time complexity of Bully Algorithm?

```text id="bq3"
O(n²)
```

---

## 18. Why is complexity O(n²)?

Many election messages may be exchanged.

---

## 19. What are advantages of Bully Algorithm?

- Simple
- Fast coordinator selection

---

## 20. What are disadvantages of Bully Algorithm?

Large number of messages.

---

## 21. What is fault tolerance?

System continues working after failures.

---

## 22. What is distributed election?

Selecting coordinator among distributed processes.

---

## 23. What happens if highest process is DOWN?

Next highest active process becomes coordinator.

---

## 24. Why use boolean alive array?

To store UP/DOWN process status.

---

## 25. What is recursion in Bully code?

Election method calling itself.

---

## 26. Why use recursion?

To continue election with higher processes.

---

## 27. What is message passing?

Communication between processes.

---

## 28. What is process synchronization?

Coordination between processes.

---

## 29. What is concurrency?

Multiple processes executing together.

---

## 30. Real-life use of Bully Algorithm?

Distributed servers and cluster systems.

---

# Token Ring Algorithm Viva Questions & Answers

## 31. What is Token Ring Algorithm?

Leader election algorithm where token circulates in ring structure.

---

## 32. What is logical ring topology?

Processes connected logically in circular form.

---

## 33. What is token in Token Ring?

Special message passed around ring.

---

## 34. What is purpose of token?

To control communication/election.

---

## 35. What is main goal of Token Ring Algorithm?

Elect coordinator in ring network.

---

## 36. Which process becomes leader?

Highest active process in ring.

---

## 37. How does token move?

Sequentially around ring.

---

## 38. Why is modulo used?

```java id="tq1"
(i + 1) % n
```

To make circular movement in ring.

---

## 39. Explain ring structure.

```text id="tq2"
0 → 1 → 2 → 3 → 0
```

---

## 40. What happens if process is DOWN?

Token skips inactive process.

---

## 41. What is coordinator message?

Leader informing all processes.

---

## 42. What does this mean?

```text id="tq3"
(1 -> 2)
```

Process 1 passes token to process 2.

---

## 43. What does this mean?

```text id="tq4"
3 => 0
```

Coordinator 3 informs process 0.

---

## 44. What is time complexity of Token Ring?

```text id="tq5"
O(n)
```

---

## 45. Why is Token Ring complexity lower?

Token moves sequentially only once around ring.

---

## 46. Difference between Bully and Token Ring?

| Bully                    | Token Ring         |
| ------------------------ | ------------------ |
| Higher process dominates | Token circulates   |
| O(n²)                    | O(n)               |
| Direct communication     | Ring communication |

---

## 47. What are advantages of Token Ring?

- Less message overhead
- Organized communication

---

## 48. What are disadvantages of Token Ring?

Failure of ring may affect communication.

---

## 49. What is ring communication?

Processes communicate in circular order.

---

## 50. Real-life use of Token Ring?

Token-based network systems.

---

# Common Viva Questions for Both

## 51. What is leader election?

Selecting coordinator among processes.

---

## 52. Why is coordinator needed?

To manage distributed activities.

---

## 53. What is distributed system?

Multiple systems working together.

---

## 54. What is process?

Independent execution unit.

---

## 55. What is scalability?

Ability to handle increasing workload.

---

## 56. What is fault tolerance?

System survives failures.

---

## 57. What is inter-process communication?

Communication between processes.

---

## 58. What is deadlock?

Processes waiting indefinitely.

---

## 59. What is starvation?

Process never gets required resources.

---

## 60. Difference between centralized and distributed systems?

| Centralized   | Distributed      |
| ------------- | ---------------- |
| Single system | Multiple systems |

---

## 61. Why are election algorithms important?

To maintain coordination after failures.

---

## 62. What happens if all processes are DOWN?

No coordinator can be elected.

---

## 63. What is network topology?

Arrangement of processes/nodes.

---

## 64. What is node in distributed system?

Individual process/system.

---

## 65. What is process recovery?

Reactivating failed process.

---

## 66. Why is leader election dynamic?

Coordinator may change after failures.

---

## 67. What is message overhead?

Extra communication messages exchanged.

---

## 68. Which algorithm is faster?

Bully is faster in selecting coordinator.

---

## 69. Which algorithm uses fewer messages?

Token Ring.

---

## 70. Most important viva answer?

> Bully Algorithm elects highest active process using priority-based messaging, while Token Ring elects coordinator by circulating token in logical ring structure.
