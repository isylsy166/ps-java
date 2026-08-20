import java.util.Stack;

public class stack {
    public static void main(String[] args) {

        // 스택 선언 (LIFO : 마지막에 넣은 게 먼저 나온다)
        Stack<Integer> s = new Stack<>();

        // push : 맨 위에 쌓는다. 넣은 값을 그대로 돌려준다
        for(int i = 1; i <= 3; i++) {
            s.push(i);
            System.out.println("stack: " + s);              // [1, 2, 3]  <- 오른쪽 끝이 맨 위
        }
        System.out.println();

        // peek : 맨 위 값을 제거하지 않고 확인만 한다
        System.out.println("peek(): 맨 위에 쌓인 값 확인(제거 X) - " + s.peek());       // 3
        System.out.println("stack: " + s);              // [1, 2, 3]  <- 그대로
        System.out.println();

        // pop : 맨 위 값을 꺼내면서 제거한다
        System.out.println("pop(): 맨 위에 값 꺼내기(제거 O) - " + s.pop());        // 3
        System.out.println("stack: " + s);              // [1, 2]
        System.out.println();

        // search : 맨 위를 1로 셌을 때 몇 번째인지. 없으면 -1
        System.out.println("search(): 맨 위에서부터 찾음. 찾으면 인덱스 반환");
        System.out.println("search(2): " + s.search(2));
        System.out.println("search(1): " + s.search(1));
        System.out.println();
        System.out.println("없으면 -1 반환");
        System.out.println("search(9): " + s.search(9));

        System.out.println("stack의 크기(개수) - size(): " + s.size());


        // empty : 비어 있으면 true (isEmpty() 와 같다)
        System.out.println(s.empty());      // false

        s.pop();
        s.pop();
        System.out.println(s.empty());      // true


        // 빈 스택에서 pop / peek 하면 EmptyStackException 이 터진다
        // 그래서 꺼내기 전에 항상 비었는지 확인하는 습관이 필요하다
        if (!s.empty()) {
            System.out.println(s.pop());
        } else {
            System.out.println("스택이 비어 있음");
        }
    }
}
