//1
public class Stack {
  private int[] stack;
  private int top;
  private int capacity;

  public Stack(int size) {
      capacity = size;
      stack = new int[capacity];
      top = -1;
  }

  public void push(int element) {
      if (top == capacity - 1) {
          System.out.println("Stack is full. Cannot push.");
          return;
      }
      top++;
      stack[top] = element;
  }

  public int pop() {
      if (isEmpty()) {
          System.out.println("Stack is empty. Cannot pop.");
          return -1;
      }
      int val = stack[top];
      top--;
      return val;
  }

  public int peek() {
      if (isEmpty()) {
          System.out.println("Stack is empty. Nothing to peek.");
          return -1;
      }
      return stack[top];
  }

  public boolean isEmpty() {
      return top == -1;
  }

  public int size() {
      return top + 1;
  }
}

//2
public class CustomStack {
  private int[] stack;
  private int top;
  private int capacity;

  public CustomStack(int size) {
      capacity = size;
      stack = new int[capacity];
      top = -1;
  }

  public void push(int val) {
      if (isFull()) {
          System.out.println("Stack is full. Cannot push.");
          return;
      }
      top++;
      stack[top] = val;
  }

  public int pop() {
      if (isEmpty()) {
          System.out.println("Stack is empty. Cannot pop.");
          return -1;
      }
      int val = stack[top];
      top--;
      return val;
  }

  public int peek() {
      if (isEmpty()) {
          System.out.println("Stack is empty. Nothing to peek.");
          return -1;
      }
      return stack[top];
  }

  public boolean isEmpty() {
      return top == -1;
  }

  public boolean isFull() {
      return top == capacity - 1;
  }
}

//3
public class SupermarketQueue {
  private String[] queue;
  private int front;
  private int rear;
  private int size;

  public SupermarketQueue(int capacity) {
      queue = new String[capacity];
      front = 0;
      rear = -1;
      size = 0;
  }

  public void addCustomer(String name) {
      if (size == queue.length) {
          System.out.println("Queue is full. Cannot add customer.");
          return;
      }
      rear = (rear + 1) % queue.length;
      queue[rear] = name;
      size++;
  }

  public void serveCustomer() {
      if (size == 0) {
          System.out.println("Queue is empty. No customer to serve.");
          return;
      }
      System.out.println("Serving: " + queue[front]);
      front = (front + 1) % queue.length;
      size--;
  }

  public void displayQueue() {
      if (size == 0) {
          System.out.println("Queue is empty.");
          return;
      }
      System.out.print("Queue: ");
      for (int i = 0; i < size; i++) {
          int index = (front + i) % queue.length;
          System.out.print(queue[index] + " ");
      }
      System.out.println();
  }

  public void numberOfCustomers() {
      System.out.println("Number of customers in queue: " + size);
  }
}

//4
public class CallCenterQueue {
  private String[] calls;
  private int front;
  private int rear;
  private int size;

  public CallCenterQueue(int capacity) {
      calls = new String[capacity];
      front = 0;
      rear = -1;
      size = 0;
  }

  public void addCall(String callId) {
      if (size == calls.length) {
          System.out.println("Call queue is full. Cannot add call.");
          return;
      }
      rear = (rear + 1) % calls.length;
      calls[rear] = callId;
      size++;
  }

  public void serveCall() {
      if (size == 0) {
          System.out.println("No calls to serve.");
          return;
      }
      System.out.println("Handling call: " + calls[front]);
      front = (front + 1) % calls.length;
      size--;
  }

  public void displayCalls() {
      if (size == 0) {
          System.out.println("No pending calls.");
          return;
      }
      System.out.print("Pending Calls: ");
      for (int i = 0; i < size; i++) {
          int index = (front + i) % calls.length;
          System.out.print(calls[index] + " ");
      }
      System.out.println();
  }

  public void numberOfCalls() {
      System.out.println("Number of pending calls: " + size);
  }
}




import java.util.Scanner;

public class OOP_Stack {
    public static void main(String[] args) {
        //Stack
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Top of Stack: " + stack.peek());
        System.out.println("Stack Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());

        System.out.println();

        //CustomStack
        CustomStack custom = new CustomStack(3);
        custom.push(5);
        custom.push(15);
        custom.push(25);
        System.out.println("Is Full: " + custom.isFull());
        System.out.println("Pop: " + custom.pop());

        System.out.println();

        //SupermarketQueue
        SupermarketQueue market = new SupermarketQueue(4);
        market.addCustomer("Ram");
        market.addCustomer("Shyam");
        market.displayQueue();
        market.serveCustomer();
        market.numberOfCustomers();

        System.out.println();

        //CallCenterQueue
        CallCenterQueue callQueue = new CallCenterQueue(3);
        callQueue.addCall("Call1");
        callQueue.addCall("Call2");
        callQueue.displayCalls();
        callQueue.serveCall();
        callQueue.numberOfCalls();
    }
}

