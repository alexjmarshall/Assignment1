public class App {
    public static void main(String[] args) throws Exception {
        SLListPriorityQueue q = new SLListPriorityQueue();
        q.add(2);
        q.add(3);
        q.add(1);
        String vals = q.printValues();
        System.out.println("Initial values: " + vals);
        System.out.println("Size: " + q.size());
        Integer min = q.deleteMin();
        System.out.println("Minimum value: " + min);
        vals = q.printValues();
        System.out.println("Remaining values after deleteMin(): " + vals);
        System.out.println("Size: " + q.size());


        TwoQueueStack<Integer> stack = new TwoQueueStack<Integer>();
        System.out.println("Push order: 1 2 3");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Pop order: " + stack.pop() + " " + stack.pop() + " " + stack.pop());


        SLList<Integer> slList = new SLList<Integer>();
        slList.add(1);
        slList.add(2);
        slList.add(3);
        slList.add(4);
        slList.add(5);
        System.out.println(slList.printValues());
        slList.swapWithNext(4);
        System.out.println(slList.printValues());


        DLList<Integer> dlList = new DLList<Integer>();
        dlList.addFront(1);
        dlList.addFront(2);
        dlList.addFront(3);
        dlList.addFront(4);
        dlList.addFront(5);
        System.out.println(dlList.printValues());
        dlList.swapWithNext(2);
        System.out.println(dlList.printValues());


        DLList<Integer> dlList2 = new DLList<Integer>();
        dlList2.addFront(5);
        dlList2.addFront(4);
        dlList2.addFront(3);
        dlList2.addFront(2);
        dlList2.addFront(1);
        String values = dlList2.printValues();
        System.out.println(values);
        dlList2.reverseValues();
        values = dlList2.printValues();
        System.out.println(values);


        MinStack minstack = new MinStack(20);
        minstack.push(5);
        System.out.println(minstack.getMin());
        minstack.push(3);
        System.out.println(minstack.getMin());
        minstack.push(4);
        System.out.println(minstack.getMin());
        minstack.push(2);
        System.out.println(minstack.getMin());
        minstack.push(2);
        System.out.println(minstack.getMin());
        minstack.push(3);
        minstack.push(3);
        System.out.println(minstack.getMin());
        System.out.println(minstack.pop());
        System.out.println(minstack.pop());
        System.out.println(minstack.pop());
        System.out.println(minstack.pop());
        System.out.println(minstack.getMin());
    }
}
