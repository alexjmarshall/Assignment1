public class App {
    public static void main(String[] args) throws Exception {
        SLList<Integer> list = new SLList<Integer>();

        list.addBack(1);
        list.addBack(2);
        list.addBack(3);
        System.out.println(list.removeFront() + " " + list.removeFront() + " " + list.removeFront());
        // list.removeFront();
        // System.out.println(list.size());

        // String values = list.printValues();
        // System.out.println(values);

        TwoQueueStack<Integer> stack = new TwoQueueStack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop() + " " + stack.pop() + " " + stack.pop());
    }
}
