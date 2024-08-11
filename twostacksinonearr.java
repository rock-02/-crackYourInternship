public class twostacksinonearr {
    class twoStacks {
        int a[];
        int cap;
        int top = -1;
        int top2 = 100;

        twoStacks() {
            a = new int[100];
            cap = 100;
        }

        // Function to push an integer into the stack1.
        void push1(int x) {
            top++;

            a[top] = x;
        }

        // Function to push an integer into the stack2.
        void push2(int x) {

            top2--;
            a[top2] = x;
        }

        // Function to remove an element from top of the stack1.
        int pop1() {
            if (top == -1)
                return top;
            int x = a[top];
            top--;

            return x;
        }

        // Function to remove an element from top of the stack2.
        int pop2() {

            if (top2 == cap)
                return -1;

            int x = a[top2];

            top2++;

            return x;
        }
    }
}
