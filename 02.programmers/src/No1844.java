import java.util.Arrays;

public class No1844 {
      public static void main(String[] args) {
            int[][] maps = {{1,0,1,1,1}, {1,0,1,0,1}, {1,0,1,1,1}, {1,1,1,0,1}, {0,0,0,0,1}};
//            int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
            No1844 no1844 = new No1844();
            int answer = no1844.solution(maps);
            System.out.println(answer);
      }

      public int solution(int[][] maps) {
            int go = 1;

            int w = maps.length, h = maps[0].length;
            int x = 0, y = 0;

            int[] current = {x, y};
            int[] destination = {w - 1, h - 1};


            return go;
      }
}
