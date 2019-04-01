public class Radix{
  public static void radixsort(int[]data){
    helper(data, 1);
  }
  private static void helper(int[]data, int digit){
    @SuppressWarnings("unchecked")
    MyLinkedList<Integer>[] buckets = new MyLinkedList[10];
    for(int x:data){
      buckets[x/digit%10].add(x);
    }
  }
}
