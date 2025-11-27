import java.util.*;

public class No42840 {
      public static void main(String[] args) {
            int[] answers = {1,3,2,4,2};
//            int[] answers = {1,2, 3, 4, 5};

            No42840 no = new No42840();
            List<Integer> answer = no.solution(answers);
            System.out.println(answer);
      }

      public List<Integer> solution(int[] answers) {
            int[] A = {1,2,3,4,5};
            int[] B = {2,1,2,3,2,4,2,5};
            int[] C = {3,3,1,1,2,2,4,4,5,5};

            int[] score = new int[3];
            score[0] = score(A, answers);
            score[1] = score(B, answers);
            score[2] = score(C, answers);

            int maxScore = Arrays.stream(score).max().getAsInt();

            List<Integer> list = new ArrayList<>();
            for(int i = 1; i <= score.length; i++){
                  if(score[i-1] == maxScore) list.add(i);
            }

            return list;
      }

      private int score(int[] P, int[] answer) {
            int score = 0;
            int i = 0;

            while(i < answer.length){
                  if(answer[i] == P[i % P.length]){
                        score++;
                        i++;
                  } else {
                        i++;
                  }
            }
            return score;
      }

}
