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
}
