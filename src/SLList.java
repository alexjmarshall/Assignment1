public class SLList<E> implements Queue<E> {
  protected Node<E> first;
  protected Node<E> last;
  protected int n;

  @Override
  public boolean addBack(E e) {
    Node<E> node = new Node<E>(e);

    if (n == 0) { // 1
      first = node; // 1
      last = node;  // 1
    } else {
      last.next = node; // 1
      last = node;  // 1
    }

    n++;  // 1

    return true;
  }
  // Total: 6
  // = O(1)/constant time.

  @Override
  public E removeFront() {
    if(n < 1) {
      return null;
    } else {
      E firstVal = first.value;
    first = first.next;
    n--;
    return firstVal;
    }
  }

  public boolean swapWithNext(int index) {
    if(index + 1 >= size()) {
      return false;
    } else {
      Node<E> curr = first;
      Node<E> prev = null;
      Node<E> next = first.next;

      while(index > 0) {
        prev = curr;
        curr = curr.next;
        next = curr.next;
        index--;
      }

      if(curr.equals(first)) {
        first = curr.next;
      } else if (curr.next.equals(last)) {
        last = curr;
      }

      if(prev != null) prev.next = curr.next;
      curr.next = next.next;
      next.next = curr;
    }
    return true;
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

}