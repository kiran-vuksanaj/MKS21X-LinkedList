public class Driver{
  public static void main(String[] args){
    MyLinkedList MLL = new MyLinkedList();
    MLL.add(4);
    MLL.add(7);
    MLL.add(19);
    MLL.add(-3);
    MLL.add(432);
    System.out.println(MLL.size()+": "+MLL);
    System.out.println(MLL.get(3));
    System.out.println(MLL.get(4));
    System.out.println(MLL.set(1,6));
  }
}
