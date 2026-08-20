import java.util.PriorityQueue;

public class No13975 {
    public static void main(String[] args) {

        int T = 2;  // 테스트 데이터 개수
        int K1 = 4;  // 파일의 개수
        int[] K1Arr = new int[]{40, 30, 30, 50};

        int K2 = 15;
        int[] K2Arr = new int[]{1, 21, 3, 4, 5, 35, 5, 4, 3, 5, 98, 21, 14, 17, 32};

        int file1 = 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int k : K1Arr){
            minHeap.add(k);
        }

        for(int i = 0; i < minHeap.size(); i++){
            file1 += minHeap.poll();
        }

        System.out.println(file1);
    }
}
