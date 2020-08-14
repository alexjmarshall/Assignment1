public class DLList<E> {
  private int n;
  private Node<E> dummy = new Node<E>();

  public int size() {
    return n;
  }

  public void addFront(E e) {
    Node<E> node = new Node<E>(e);
    if(n == 0) {
      dummy.next = node;
      node.next = dummy;
      dummy.prev = node;
      node.prev = dummy;
    } else {
      Node<E> next = dummy.next;
      node.setNext(next);
      node.setPrev(dummy);
      dummy.setNext(node);
      next.setPrev(node);
    }
    n++;
  }

  public void addBack(Node<E> node) {
    if(n == 0) {
      dummy.next = node;
      node.next = dummy;
      dummy.prev = node;
      node.prev = dummy;
    } else {
      Node<E> prev = dummy.prev;
      node.setNext(dummy);
      node.setPrev(prev);
      dummy.setPrev(node);
      prev.setNext(node);
    }
    n++;
  }

  public String printValues() {
    Node<E> curr = dummy.next;
    String values = "";
    while(curr.value != null) {
      values += (String.valueOf(curr.value) + " ");
      curr = curr.next;
    }
    return values;
  }

  public boolean swapWithNext(int index) {
    if(index + 1 >= size()) {
      return false;
    } else {
      Node<E> prev = dummy;
      Node<E> curr = dummy.next;
      Node<E> next = curr.next;
      Node<E> nextNext = next.next;

      while(index > 0) {
        prev = curr;
        curr = curr.next;
        next = curr.next;
        nextNext = next.next;
        index--;
      }

      if(curr.equals(dummy.next)) {
        dummy.next = curr.next;
      } else if (curr.next.equals(dummy.prev)) {
        dummy.prev = curr;
      }

      prev.next = next;
      next.prev = prev;
      curr.next = nextNext;
      nextNext.prev = curr;
      curr.prev = next;
      next.next = curr;
    }
    return true;
  }
}