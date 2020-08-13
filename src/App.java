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

        SLList<Integer> list = new SLList<Integer>();
        list.addBack(5);
        list.addBack(4);
        list.addBack(3);
        list.addBack(2);
        list.addBack(1);
        String vals = list.printValues();
        System.out.println(vals);

        list.swapWithNext(0);

        vals = list.printValues();
        System.out.println(vals);
    }
}
