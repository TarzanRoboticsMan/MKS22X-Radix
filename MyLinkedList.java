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
}
