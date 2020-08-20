public class MinStack implements Stack<Integer> {
  private Integer[] arr;
  private Integer[] arr2;
  private int n;

  MinStack(int length) {
    arr = new Integer[length];
    arr2 = new Integer[length];
  }

  @Override
  public void push(Integer e) {
    arr[n] = e;
    if(n == 0 || e < arr2[n-1] ) {
      arr2[n] = e;
    } else {
      arr2[n] = arr2[n-1];
    }
    n++;
  }

  @Override
  public Integer pop() {
    if(n < 1) {
      return null;
    } else {
      Integer val = arr[n];
      arr[n] = null;
      arr2[n] = null;
      n--;
      return val;
    }
  }

  public Integer getMin() {
    return arr2[n-1];
  }

  @Override
  public int size() {
    return n;
  }
  
}