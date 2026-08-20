/**
 * 원하는 문자열 찾기
 * @author 프로그래머스
 */

public class No181878 {
    public static void main(String[] args){
        String myString = "AbCdEfG";
        String pat = "aBc";
        int result = 0;

        String str = myString.toLowerCase();
        String str2 = pat.toLowerCase();

        if (str.indexOf(str2) != -1) {
            result = 1;
        }
        result = 0;

        System.out.println(result);
    }
}
