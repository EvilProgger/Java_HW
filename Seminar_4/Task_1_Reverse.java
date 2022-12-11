import java.util.*;

public class Task_1_Reverse {
     public static void main(String[] args) {
          LinkedList<String> myList = new LinkedList<String>();

          myList.add("1");
          myList.add("2");
          myList.add("3");
          myList.add("4");
          myList.add("5");
          myList.add("8");
          myList.add("11");

          System.out.println("До разворота: " + myList);
          myList = reverseLinkedList(myList);
          System.out.println("После разворота: " + myList);
     }

     public static LinkedList<String> reverseLinkedList(LinkedList<String> llist) {
          LinkedList<String> revLinkedList = new LinkedList<String>();
          for (int i = llist.size() - 1; i >= 0; i--) {

               revLinkedList.add(llist.get(i));
          }
          return revLinkedList;
     }
}
