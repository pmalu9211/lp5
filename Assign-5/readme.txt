# Assignment 5: Token Ring Algorithm

This practical demonstrates the **Token Ring Algorithm** for distributed mutual exclusion. It simulates how processes in a logical ring pass a "token" to gain access to a shared resource (Critical Section).

## 🚀 How to Run

### 1. Compile the Java file

Open your terminal in the `Ass_5` directory and run:

```bash
javac TokenRing.java
```

### 2. Run the Program

Execute the compiled class:

```bash
java TokenRing
```

### 3. Follow the Prompts

- Enter the number of nodes (e.g., `5`).
- The program will show the logical ring structure.
- Enter the **Sender ID**, **Receiver ID**, and the **Data** you want to send.
- Watch how the token moves from its current position to the sender, and how data is forwarded through the ring.

---

## 🛠️ Code Logic Flow

The implementation in `TokenRing.java` simulates the algorithm through the following steps:

1. **Ring Initialization**: The user specifies the number of nodes, and a logical ring is formed (0 → 1 → 2 → ... → n-1 → 0).
2. **Token Management**: A variable `token` tracks the current holder. It starts at node `0`.
3. **Token Passing**: When a sender is chosen, the token is passed sequentially through the ring until it reaches the sender's ID.
4. **Critical Section**: Once the sender has the token, it "enters" the critical section to send data.
5. **Data Forwarding**: The data is forwarded node-by-node from the sender until it reaches the specified receiver.
6. **Token Release**: After the transaction, the sender "exits" the critical section and the token is passed to the next process in the ring.

---

## 🎓 Viva Questions & Answers

### 1. What is the Token Ring Algorithm?

It is a **distributed mutual exclusion algorithm** where processes are organized in a logical ring. A special message called a **token** circulates around the ring. Only the process holding the token can enter the Critical Section.

### 2. How is Mutual Exclusion guaranteed?

Mutual exclusion is guaranteed because there is only **one token** in the entire system. Since a process must possess the token to access the shared resource, no two processes can enter the Critical Section simultaneously.

### 3. Does this algorithm suffer from starvation?

No. Because the token moves in a fixed circular path, every process that wants to enter the Critical Section will eventually receive the token. This ensures **fairness**.

### 4. What are the advantages of Token Ring?

- **No Starvation:** Every process gets a turn.
- **Deadlock Free:** The sequential passing of the token prevents deadlocks.
- **Fairness:** High degree of fairness as the token circulates regularly.

### 5. What are the disadvantages of Token Ring?

- **Token Loss:** If the token is lost (due to process failure), the system stops unless a recovery mechanism exists.
- **Single Point of Failure:** If any process in the ring fails, the ring is broken and must be reconfigured.
- **High Latency:** A process might have to wait for the token to travel through the entire ring even if no other process needs it.

### 6. What happens if a process holding the token crashes?

The token is lost. The system needs a **monitor** or an **election algorithm** (like Bully or Ring) to detect the loss and regenerate a new token.

### 7. How does data transmission work in this simulation?

In this simulation:

1. The token moves from its current position to the **Sender**.
2. The Sender enters the **Critical Section** and sends the data.
3. The data is **forwarded** node-by-node through the ring until it reaches the **Receiver**.
4. The Sender then exits the Critical Section and passes the token to the next node.

### 8. Compare Token Ring with Centralized Algorithm.

- **Centralized:** Simple, but the coordinator is a single point of failure and a bottleneck.
- **Token Ring:** Distributed, no single bottleneck, but more complex to handle failures (broken ring or lost token).