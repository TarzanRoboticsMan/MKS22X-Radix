public class MyLinkedList<E>{
  public class Node{
    //Three fields
    private Node next; public E data;
    //Constructor??
    public Node(E value){
      data = value;
    }
    public Node(E value, Node newNext){
      data = value;
      next = newNext;
    }
    //Methods
    public Node next(){return next;}
    public void setNext(Node other){next = other;}
    public String toString(){return ""+data;}
  }
  //Fields
  public Node first, last;
  public int size;

  //Constructor
  public MyLinkedList(){};

  public String toString(){
    String ans = ""+first;
    Node current = first.next();
    while (current!=null){
      ans+=", "+current;
      current=current.next();
    }
    return ans;
  }
  public void clear(){
    first=null;last = null;
    size=0;
  }
  public boolean add(E data){
    last.setNext(new Node(data));
    size++;
    last=last.next();
    return true;
  }
  public void extend(MyLinkedList<E> other){
    last.setNext(other.first);
    size+=other.size;
    last=other.last;
    other.first=null;other.last=null;other.size=0;
  }
  public E removeFront(){
    Node ans = first;
    first=first.next();
    size--;
    return ans.data;
  }
}
