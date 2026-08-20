import java.util.Scanner;

public class No3136_Valid_Word {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        if(word.length() < 3){
            System.out.println(false);

        }

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for(char c : word.toCharArray()){

            // 영문자 or 숫자만 허용
            if(!Character.isLetterOrDigit(c)) System.out.println(false);

            if(Character.isLetter(c)){
                char lower = Character.toLowerCase(c);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        System.out.println(hasVowel && hasConsonant ? true : false);

    }
}
