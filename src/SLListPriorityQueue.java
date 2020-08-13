public class SLListPriorityQueue extends SLList<Integer> implements PriorityQueue<Integer> {

  @Override
  public Integer deleteMin() {
    Node<Integer> min = first;
    Node<Integer> minPrev = null;
    Node<Integer> curr = first.next;
    Node<Integer> prev = first;

    while(curr != null) {
      if(min.value > curr.value) {
        min = curr;
        minPrev = prev;
      }
      prev = curr;
      curr = curr.next;
    }

    if(min.equals(first)) {
      first = first.next;
    } else if(min.equals(last)) {
      minPrev.next = null;
      last = minPrev;
    } else {
      minPrev.next = min.next;
    }
    
    n--;

    return min.value;
  }
  
}