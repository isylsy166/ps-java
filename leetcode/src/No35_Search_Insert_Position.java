import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class No35_Search_Insert_Position {
    public static void main(String[] args) {

        int[] nums = {1,3,5,6}; // 정렬된 숫자들
        int target = 7; //찾을 숫자
        int result = 0; // 결과

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            list.add(nums[i]); // List에 nums값 담기
        }

        if(list.contains(target)){
            result = list.indexOf(target);
        }
        else{
            list.add(target); // list에 target 추가하고
            Collections.sort(list); // 다시 정렬
            result = list.indexOf(target);
        }

        System.out.println(result);

    }
}


