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
    return current!=end || end.getData().equals(value);
  }
  public int indexOf(Integer value){
    Node current = start;
    int i = 0;
    while(!(current.getData().equals(value)) && current != end){
      current = current.next();
      i++;
    }
    if (current==end && !(end.getData().equals(value))) return -1;
    else return i;
  }
  public Integer remove(int index){
    if(index==0){
      start = start.next();
      return start.prev().remove().getData();
    }
    if(index==size()-1){
      end = end.prev();
      return end.next().remove().getData();
    }
    return getNode(index).remove().getData();
  }
  public void add(int index,Integer value){
    if(index==0){
      start = new Node(value,start,null);
    }else if(index==size()-1){
      end = end.addAfter(value);
    }else{
      getNode(index).addAfter(value);
    }
  }



  private class Node{
    private Integer data;
    private Node next,prev;
    public Node(Integer data,Node next,Node prev){
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
    public Node addAfter(Integer val){
      next = new Node(val,next,this);
      if(next.next()!=null) next.next().setPrev(next);
      return next;
    }
    public Node remove(){
      if(next != null) next.setPrev(prev);
      if (prev != null) prev.setNext(next);
      return this;
    }
  }
}
