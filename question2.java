package question2;

public class question2 {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public question2(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full.");
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value );
    }

    public int pop() {
        if (top == -1) {
            System.out.println("The stack is empty stack you can not pop an element.");
            return -1;
        }
        int poppedElement = stackArray[top--];
        System.out.println("Popped " + poppedElement );
        return poppedElement;
    }


    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }


    public static void main(String[] args) {
        question2 stack = new question2(5);

        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();


        stack.pop();
    }
}