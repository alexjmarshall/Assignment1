public class MinStack<E> extends SLList<E> implements Stack<E> {

  @Override
  public boolean push(E e) {
    Node<E> node = new Node<E>(e);
    if(n == 0) {
      first = node;
      last = node;
    } else {
      node.next = first;
      first= node;
    }
    n++;
    return true;
  }

  @Override
  public E pop() {
    return super.removeFront();
  }
  
}