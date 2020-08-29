public class DLList<E> {
  private int n;
  private Node<E> dummy = new Node<E>();

  public int size() {
    return n;
  }

  public void addFront(E e) {
    Node<E> node = new Node<E>(e);

    //if list is empty, set new node as both next and prev of dummy
    //else, insert between dummy and 'first' node
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
    //if list is empty, set new node as both next and prev of dummy
    //else, insert between dummy and 'last' node
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
      //advance to index in list
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

      //if index is first or second to last, adjust dummy pointers
      if(curr.equals(dummy.next)) {
        dummy.next = curr.next;
      } else if (curr.next.equals(dummy.prev)) {
        dummy.prev = curr;
      }

      //swap nodes
      prev.next = next;
      next.prev = prev;
      curr.next = nextNext;
      nextNext.prev = curr;
      curr.prev = next;
      next.next = curr;
    }

    return true;
  }

  public void reverseValues() {
    Node<E> curr = dummy;
    Node<E> prev = dummy.prev;
    Node<E> next = dummy.next;
    
    do {
      //adjust pointers
      next = curr.next;
      curr.next = prev;
      curr.prev = next;
      //advance in list
      prev = curr;
      curr = next;
    } while(curr.value != null);
  }
}