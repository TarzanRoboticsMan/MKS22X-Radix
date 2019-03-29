public class MyLinkedList<E>{
  public class Node{
    //Three fields
    private Node next; private Integer data;
    //Constructor??
    public Node(Integer value){
      data = value;
    }
    public Node(Integer value, Node newNext){
      data = value;
      next = newNext;
    }
    //Methods
    public Node next(){return next;}
    public void setNext(Node other){next = other;}
    public String toString(){return data;}
  }
  //Fields
  private Node first, last;
  private int size;

  //Constructor
  public MyLinkedList()

  public String toString(){
    String ans =first;
    Node current = first.next();
    while (current!=null){
      ans+=", "+current
      current=current.next();
    }
    return ans;
  }
  public void clear()
  reset the list to an empty state. Very similar to the constructor.
  public boolean/void add(E)
  add an element to the end of the list (the boolean would be true all the time if you want to conform to list standards)
  public void extend(MyLinkedList<E> other)
  in O(1) time, connect the other list to the end of this list.
  The other list is then reset to size 0 (do not wipe out the nodes, just disconnect them.)
  This is how you will merge lists together for your radix sort.
  public E removeFront()
  remove the 1st element of the list, and return that value.
}
