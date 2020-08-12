public class App {
    public static void main(String[] args) throws Exception {
        SLList<Integer> list = new SLList<Integer>();

        list.addBack(1);
        list.addBack(2);
        list.addBack(3);
        list.removeFront();
        System.out.println(list.size());

        String values = list.printValues();
        System.out.println(values);
    }
}
