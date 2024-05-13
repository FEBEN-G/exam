package question3;


import question2.Stack;

public class QuestionNo3 {

  private Stack stack1;
  private Stack stack2;

  public QuestionNo3(int capacity) {
    stack1 = new Stack(capacity);
    stack2 = new Stack(capacity);
  }

  public void enqueue(int item) {
    stack1.push(item);
  }

  public int dequeue() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }

    if (!stack2.isEmpty()) {
      return stack2.pop();
    }

    throw new IllegalStateException("Queue is empty");
  }

  public int peek() {
    if (stack2.isEmpty()) {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
    }

    if (!stack2.isEmpty()) {
      return stack2.peek();
    }

    throw new IllegalStateException("Queue is empty");
  }

  public boolean isEmpty() {
    return stack1.isEmpty() && stack2.isEmpty();
  }

}
