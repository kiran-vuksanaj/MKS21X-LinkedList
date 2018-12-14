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
      out+=current.getData()+",";
      current = current.next();
    }
    return out.substring(0,out.length()-1)+"]";
  }
  private Node getNode(int index){
    Node current = start;
    while(index > 0){
      current = current.next();
      index--;
    }
    return current;
  }
  public Integer get(int index){
    return getNode(index).getData();
  }
  public Integer set(int index, Integer val){
    return getNode(index).setData(val);
  }
  public boolean contains(Integer value){
    Node current = start;
    while(!(current.getData().equals(value)) && current != end){
      current = current.next();
    }
    return current==end;

  }



  private class Node{
    private Integer data;
    private Node next,prev;
    public Node(int data,Node next,Node prev){
      this.data = data;
      this.next = next;
      this.prev = prev;
    }
    public Integer getData(){
      return data;
    }
    public Integer setData(Integer data){
      Integer out = this.data;
      this.data = data;
      return out;
    }
    public Node prev(){
      return prev;
    }
    public Node next(){
      return next;
    }
    private void setPrev(Node n){
      prev = n;
    }
    private void setNext(Node n){
      next = n;
    }
    public boolean addAfter(int val){
      next = new Node(val,next,this);
      if(next.next()!=null) next.next().setPrev(next);
      return true;
    }
    public boolean remove(){
      if(next != null) next.setPrev(prev);
      if (prev != null) prev.setNext(next);
      return true;
    }
  }
}
