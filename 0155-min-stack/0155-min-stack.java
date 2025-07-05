import java.util.*;

// Define a simple Pair class
class Pair {
    int value;
    int currentMin;
    Pair(int value, int currentMin) {
        this.value = value;
        this.currentMin = currentMin;
    }
}

class MinStack {
    Stack<Pair> stk = new Stack<>();

    public MinStack() {
        // Nothing needed here; stack is already initialized
    }
    
    public void push(int val) {
        if (stk.isEmpty()) {
            stk.push(new Pair(val, val));
        } else {
            int minVal = Math.min(val, stk.peek().currentMin);
            stk.push(new Pair(val, minVal));
        }
    }
    
    public void pop() {
        stk.pop();
    }
    
    public int top() {
        return stk.peek().value;
    }
    
    public int getMin() {
        return stk.peek().currentMin;
    }
}

/**
 * Example usage:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int top = obj.top();
 * int min = obj.getMin();
 */
