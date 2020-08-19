public class TwoQueueStack<E> implements Stack<E> {
  SLList<E> qA = new SLList<E>();
  SLList<E> qB = new SLList<E>();
  //TODO add n and check if stack is empty in methods below

  @Override
  public boolean push(E e) {
    qB.addBack(e);
    while(qA.size() > 0) {
      E value = qA.removeFront();
      qB.addBack(value);
    }
    SLList<E> temp = qA;
    qA = qB;
    qB = temp;
    return true;
  }

  @Override
  public E pop() {
    E value = qA.removeFront();
    return value;
  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return 0;
  }

}