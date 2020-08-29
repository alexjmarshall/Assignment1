public class MinStack implements Stack<Integer> {
  private Integer[] arr; //main array
  private Integer[] arr2; //min values array
  private int n;

  MinStack(int length) {
    arr = new Integer[length];
    arr2 = new Integer[length];
  }

  @Override
  public void push(Integer e) {
    arr[n] = e;

    //if stack is empty, or new value is less than previous min value, add it to min value array
    //else, add previous min value again to min value array
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
      Integer val = arr[n-1];
      arr[n-1] = null;
      arr2[n-1] = null;

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