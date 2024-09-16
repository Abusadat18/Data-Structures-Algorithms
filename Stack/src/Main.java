public class Main {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Top element is: " + s.top());
        System.out.println("Element popped is " + s.pop());
        s.push(40);
        System.out.println("Element popped is " + s.pop());
        System.out.println("Size of stack is " + s.size());
    }
}

class Stack {
    int size = 10000;
    int[] arr = new int[size];
    int top = -1;

    void push(int element){
        top++;
        arr[top] = element;
    }

    int pop(){
        int temp = arr[top];
        top--;
        return temp;
    }

    int top(){
        return arr[top];
    }

    int size(){
        return top+1;
    }
}