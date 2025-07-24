class MinStack {

    Stack<Integer> stack = new Stack();
    int min;

    // Set the default min value as the Integer.MAX
    public MinStack() {
        min = Integer.MAX_VALUE;
    }

  // Always push the min element first which tracks the minimum so far, update the min comparing min with the upcoming value and push the value to the stack
    public void push(int val) {
        stack.push(min);
        min = Math.min(val, min);
        stack.push(val);
    }

  // Pop the value and the minimum so far
    public void pop() {
        if(stack.isEmpty()) return;
        int val = stack.pop();
        min = stack.pop();
    }

    public int top() {
        return stack.isEmpty()?-1:stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
