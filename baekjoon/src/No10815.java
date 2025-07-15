import java.util.*;

public class No10815 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arrN = new int[N];
        for(int i = 0; i < N; i++){
            arrN[i] = sc.nextInt();
        }

        Arrays.sort(arrN);

        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < M; i++){
            int target = sc.nextInt();
            if(binarySearch(arrN, target)){
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb.toString().trim());
    }

    // 이분 탐색 메서드
    public static boolean binarySearch(int[] arr, int key){
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == key) return true;
            else if(arr[mid] < key) left = mid + 1;
            else right = mid - 1;
        }

        return false;
    }
}
