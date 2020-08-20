public class TwoQueueStack<E> implements Stack<E> {
  private SLList<E> qA = new SLList<E>();
  private SLList<E> qB = new SLList<E>();
  private int n;

  @Override
  public void push(E e) {
    qB.addBack(e);
    while(qA.size() > 0) {
      E value = qA.removeFront();
      qB.addBack(value);
    }
    SLList<E> temp = qA;
    qA = qB;
    qB = temp;
    n++;
  }

  @Override
  public E pop() {
    E value = qA.removeFront();
    n--;
    return value;
  }

  @Override
  public int size() {
    return n;
  }

}