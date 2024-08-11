import java.util.Stack;

class MyQueue {
    Stack<Integer> s;
    Stack<Integer> t;

    public MyQueue() {
        s = new Stack<>();
        t = new Stack<>();
    }

    public void push(int x) {
        if (s.size() == 0) {
            s.push(x);
            return;
        }
        while (s.size() > 0) {
            t.push(s.pop());
        }
        s.push(x);
        while (t.size() > 0) {
            s.push(t.pop());
        }
    }

    public int pop() {

        int p = s.pop();

        return p;

    }

    public int peek() {
        // if(q.size()==0) return -1;
        return s.peek();
    }

    public boolean empty() {
        return s.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */