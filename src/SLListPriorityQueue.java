public class SLListPriorityQueue extends SLList<Integer> implements PriorityQueue<Integer> {

  @Override
  public Integer deleteMin() {
    Node<Integer> min = first;// 1
    Node<Integer> minPrev = null;// 1
    Node<Integer> curr = first.next;// 1
    Node<Integer> prev = first;// 1

    while(curr != null) {// n + 1
      if(min.value > curr.value) {// n
        min = curr;// n
        minPrev = prev;// n
      }
      prev = curr;// n
      curr = curr.next;// n
    }

    if(min.equals(first)) {// 1
      first = first.next;// 1
    } else if(min.equals(last)) {// 1
      minPrev.next = null;// 1
      last = minPrev;// 1
    } else {// 1
      minPrev.next = min.next;// 1
    }
    n--;// 1

    return min.value;
  }
  // Total: 4 + n + 1 + 5n + 3 + 1
  // = 9 + 6n
  // = O(n)/linear time
}