import java.util.Arrays;

public class No42577 {
    public static void main(String[] args){

        String[] phone_book = {"123", "456", "789"};
        boolean result = false;

        // 문자열 배열
        // 1. 문자가 숫자인지, 알파벳인지
        // 2. 정렬하면 더 쉬워지는지

        Arrays.sort(phone_book);
        System.out.println(Arrays.toString(phone_book));

        // 문자열을 하나하나 돌면서 확인(인덱스가 필요한지 아닌지 고민해보기)
        for(int i = 0; i < phone_book.length - 1; i++) {
            // phonebook[i]랑 phonboot[i+1, 2 ...]
            if(phone_book[i+1].startsWith(phone_book[i])) {
                result = true;
            }
            result = false;
        }

        System.out.println(result);
    }
}
