package linkedlist.single_linkedlist;

public class LinkedList<T> {
      Node<T> root;
      Node<T> tail;

      /**
      * 리스트의 맨 마지막에 노드를 연결한다.
      * @return 자기 자신 (pushBack(1).pushBack(2) 처럼 이어쓰기 위해)
      * */
      public LinkedList<T> pushBack(T data) {
            Node<T> node = new Node<>();
            node.data = data;

            // 빈 리스트(노드가 0개)면 첫 노드가 root이자 tail이 된다
            if (root == null) {
                  root = node;
                  tail = node;
                  return this;
            }

            tail.next = node;   // 기존 마지막 노드를 새 노드에 연결하고
            tail = node;        // tail을 새 노드로 옮긴다 (순서 바뀌면 안 됨)
            return this;
      }

      public LinkedList<T> pushFront(T data) {
            Node<T> node = new Node<>();
            node.data = data;

            // 빈 리스트(노드가 0개)면 첫 노드가 root이자 tail이 된다
            if (root == null) {
                  root = node;
                  tail = node;
                  return this;
            }

            node.next = root;   // 새 노드가 기존 첫 노드를 가리키게 하고
            root = node;        // root를 새 노드로 옮긴다 (tail은 그대로)
            return this;
      }

      public Node<T> front() {
            return this.root;
      }

      public Node<T> back() {
            return this.tail;
      }

      public int size() {
            Node<T> node = this.root;
            int size = 0;

            while(node != null) {
                  node = node.next;
                  size++;
            }
            return size;
      }

}

