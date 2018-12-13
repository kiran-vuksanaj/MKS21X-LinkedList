public class MyLinkedList{
  private int size;
  private Node start,end;
  public MyLinkedList(){
    size=0;
  }
  public int size(){
    return size;
  }
  public boolean add(int value){
    if(size()==0){
      start = new Node(value,null,null);
      end = start;
      size++;
    }else{
      end.addAfter(value);
      end = end.next();
      size++;
    }
    return true;
  }
  public String toString(){
    String out = "[";
    Node current = start;
    while(current != null){
      out+=current.get()+",";
      current = current.next();
    }
    return out.substring(0,out.length()-1)+"]";
  }
  private class Node{
    private int data;
    private Node next,prev;
    public Node(int data,Node next,Node prev){
      this.data = data;
      this.next = next;
      this.prev = prev;
    }
    public int get(){
      return data;
    }
    public boolean set(int data){
      this.data = data;
      return true;
    }
    public Node prev(){
      return prev;
    }
    public Node next(){
      return next;
    }
    private boolean setPrev(Node n){
      prev = n;
      return true;
    }
    private boolean setNext(Node n){
      next = n;
      return true;
    }
    public boolean addAfter(int val){
      next = new Node(val,next,this);
      if(next.next()!=null) next.next().setPrev(next);
      return true;
    }
    public boolean remove(){
      next.setPrev(prev);
      prev.setNext(next);
      return true;
    }
  }
}
