public class SLList<E> implements Queue<E> {
  protected Node<E> first;
  protected Node<E> last;
  protected int n;

  @Override
  public boolean add(E e) {
    Node<E> node = new Node<E>(e);

    //if list is empty, new node is both first and last in list
    if (n == 0) {
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
  public E remove() {
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
      //advance to index in list
      Node<E> curr = first;
      Node<E> prev = null;
      Node<E> next = first.next;

      while(index > 0) {
        prev = curr;
        curr = curr.next;
        next = curr.next;
        index--;
      }

      //if index is first or second to last, adjust first and last vars
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