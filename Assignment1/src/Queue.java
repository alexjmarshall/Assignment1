public interface Queue<E> {
  public boolean addBack(E e);

  public E removeFront();
}