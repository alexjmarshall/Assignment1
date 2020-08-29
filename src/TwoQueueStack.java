public class TwoQueueStack<E> implements Stack<E> {
  private SLList<E> qA = new SLList<E>();
  private SLList<E> qB = new SLList<E>();
  private int n;

  @Override
  public void push(E e) {
    //store new value in qB, then add all values from qA to qB
    qB.add(e);

    while(qA.size() > 0) {
      E value = qA.remove();
      qB.add(value);
    }

    //swap names of qA and qB
    SLList<E> temp = qA;
    qA = qB;
    qB = temp;

    n++;
  }

  @Override
  public E pop() {
    E value = qA.remove();

    n--;

    return value;
  }

  @Override
  public int size() {
    return n;
  }

}