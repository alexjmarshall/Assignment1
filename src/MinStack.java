import java.lang.reflect.Array;

public class MinStack<E> implements Stack<E> {
  private E[] arr;
  private E[] arr2;
  private int n;

  public MinStack(Class<E[]> clazz, int length) {
    arr = clazz.cast(Array.newInstance(clazz.getComponentType(), length));
    arr2 = clazz.cast(Array.newInstance(clazz.getComponentType(), length));  
  }

  @Override
  public boolean push(E e) {
    
    return false;
  }

  @Override
  public E pop() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int size() {
    return n;
  }
  
  
}