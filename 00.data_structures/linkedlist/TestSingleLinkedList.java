package linkedlist;

import linkedlist.single_linkedlist.LinkedList;

public class TestSingleLinkedList {
      public static void main(String[] args) {
            LinkedList<Integer> list = new LinkedList<>();

            list.pushBack(10);
            list.pushFront(20);
            list.pushBack(30);
            list.pushBack(40);
            list.pushFront(35);

            System.out.println(list.size());
      }
}
