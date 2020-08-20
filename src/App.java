public class App {
    public static void main(String[] args) throws Exception {
        // SLList<Integer> list = new SLList<Integer>();
        // list.addBack(1);
        // list.addBack(2);
        // list.addBack(3);
        // System.out.println(list.removeFront() + " " + list.removeFront() + " " + list.removeFront());
        // list.removeFront();
        // System.out.println(list.size());

        // String values = list.printValues();
        // System.out.println(values);

        // TwoQueueStack<Integer> stack = new TwoQueueStack<Integer>();

        // stack.push(1);
        // stack.push(2);
        // stack.push(3);
        // System.out.println(stack.pop() + " " + stack.pop() + " " + stack.pop());

        // SLListPriorityQueue q = new SLListPriorityQueue();
        // q.addBack(2);
        // q.addBack(3);
        // q.addBack(1);
        
        // String vals = q.printValues();
        // System.out.println(vals);
        // Integer min = q.deleteMin();
        // System.out.println(min);
        // vals = q.printValues();
        // System.out.println(vals);

        DLList<Integer> dllist = new DLList<Integer>();
        dllist.addFront(5);
        dllist.addFront(4);
        dllist.addFront(3);
        dllist.addFront(2);
        dllist.addFront(1);
        String vals = dllist.printValues();
        System.out.println(vals);

        dllist.reverseValues();
        vals = dllist.printValues();
        System.out.println(vals);


        // list.swapWithNext(4);

        // vals = list.printValues();
        // System.out.println(vals);

        // MinStack minstack = new MinStack(20);
        // minstack.push(5);
        // System.out.println(minstack.getMin());
        // minstack.push(3);
        // System.out.println(minstack.getMin());
        // minstack.push(4);
        // System.out.println(minstack.getMin());
        // minstack.push(2);
        // System.out.println(minstack.getMin());
        // minstack.push(2);
        // System.out.println(minstack.getMin());
        // minstack.push(3);
        // minstack.push(3);
        // minstack.pop();
        // minstack.pop();
        // minstack.pop();
        // minstack.pop();
        // System.out.println(minstack.getMin());
    }
}
