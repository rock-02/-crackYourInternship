import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q;
    Queue<Integer> t;

    public MyStack() {
        q = new LinkedList<>();
        t = new LinkedList<>();
    }

    public void push(int x) {
        if (q.size() == 0) {
            q.add(x);
            return;
        }
        while (q.size() > 0) {
            t.add(q.remove());
        }
        q.add(x);
        while (t.size() > 0) {
            q.add(t.remove());
        }
    }

    public int pop() {
        int p = q.remove();

        return p;
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */