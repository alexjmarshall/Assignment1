public class Node<T> {
  Node<T> next;
  Node<T> prev;
  T value;

  public Node() {

  }

  public Node(T value) {
    this.value = value;
  }

  public void setNext(Node<T> node) {
    next = node;
  }

  public void setPrev(Node<T> node) {
    prev = node;
  }

  public T getValue() {
    return value;
  }
  
}