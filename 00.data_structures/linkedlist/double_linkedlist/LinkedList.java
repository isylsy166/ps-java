package linkedlist.double_linkedlist;

import javax.management.relation.RoleInfoNotFoundException;

public class LinkedList<T> {
      Node<T> root;
      Node<T> tail;
      int size;

      public LinkedList<T> pushBack(T data) {
            Node<T> node = new Node<>();
            node.data = data;

            if (root == null) {
                  root = node;
                  tail = node;
                  size = 1;
                  return this;
            }

            node.prev = tail;   // 새 노드가 기존 마지막 노드를 뒤로 가리키고
            tail.next = node;   // 기존 마지막 노드가 새 노드를 앞으로 가리킨다
            tail = node;        // tail을 새 노드로 옮긴다
                                // node.next는 null 그대로 (새 노드가 끝이므로)
            size++;
            return this;
      }

      public LinkedList<T> pushFront(T data) {
            Node<T> node = new Node<>();
            node.data = data;

            if (root == null) {
                  root = node;
                  tail = node;
                  size = 1;
                  return this;
            }

            node.next = root;
            root = node;
            size++;
            return this;
      }
}
