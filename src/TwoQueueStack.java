public class TwoQueueStack<E> implements Stack<E> {
  private SLList<E> qA = new SLList<E>();
  private SLList<E> qB = new SLList<E>();
  private int n;

  @Override
  public void push(E e) {
    qB.addBack(e);// 1
    while(qA.size() > 0) {// n + 1
      E value = qA.removeFront();// n
      qB.addBack(value);// n
    }
    SLList<E> temp = qA;// 1
    qA = qB;// 1
    qB = temp;// 1
    n++;// 1
  }
  // Total: 1 + n + 1 + 2n + 4
  // = 6 + 3n
  // = O(n)/linear time

  @Override
  public E pop() {
    E value = qA.removeFront();// 1
    n--;// 1
    return value;
  }
  // Total: 2
  // = O(1)/constant time

  @Override
  public int size() {
    return n;
  }

}