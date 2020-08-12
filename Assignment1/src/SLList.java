public class SLList<E> implements Queue<E> {
  private Node<E> first;
  private Node<E> last;
  private int n;

  @Override
  public boolean addBack(E e) {
    Node<E> node = new Node<E>(e);
    if(n == 0) {
      first = node;
      last = node;
    } else {
      last.next = node;
      last = node;
    }
    n++;
    return true;
  }

  @Override
  public E removeFront() {
    E firstVal = first.value;
    first = first.next;
    n--;
    return firstVal;
  }

  public int size() {
    return n;
  }

  public String printValues() {
    Node<E> curr = first;
    String values = "";
    while(curr != null) {
      values += (String.valueOf(curr.value) + " ");
      curr = curr.next;
    }
    return values;
  }

  class Node<T> {
    Node<T> next;
    T value;

    public Node(T value) {
      this.value = value;
    }

    public void setNext(Node<T> node) {
      next = node;
    }

    public T getValue() {
      return value;
    }
  }
  
}