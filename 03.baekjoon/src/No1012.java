import java.util.Scanner;

public class No1012 {

    // 배추밭
    private final static int[][] field = {
            {1, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 1, 1, 1},
            {0, 0, 0, 0, 1, 0, 1, 1, 1}
    };

    public static void main(String[] args) {
        // 출력 확인용
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------------------\n");

        // 현재 좌표
        int X = 0, Y = 0;

        for(int x = 0; x < field.length; x++){
            for(int y = 0; y < field[x].length; y++){
                // 배추 발견
                if(field[x][y] == 1){
                    X = x;
                    Y = y;
                }

            }
        }





    }
}
