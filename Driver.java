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
    System.out.println(MLL.contains(4));
    System.out.println(MLL.contains(432));
    System.out.println(MLL.contains(-3));
    System.out.println(MLL.contains(1));
    System.out.println(MLL.contains(7));
    System.out.println(MLL.indexOf(4));
    System.out.println(MLL.indexOf(432));
    System.out.println(MLL.indexOf(-3));
    System.out.println(MLL.indexOf(1));
    System.out.println(MLL.indexOf(7));
    System.out.println("___");
    System.out.println(MLL.remove(0));
    System.out.println(MLL);
    System.out.println(MLL.remove(3));
    System.out.println(MLL);
    System.out.println(MLL.remove(1));
    System.out.println(MLL);
  }
}
