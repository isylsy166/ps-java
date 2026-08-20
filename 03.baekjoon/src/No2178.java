import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class No2178 {

      private static final int[] dx = {1, -1, 0, 0};
      private static final int[] dy = {0, 0, 1, -1};

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();
            int M = sc.nextInt();
            sc.nextLine();

            int[][] map = new int[N][M];

            for (int i = 0; i < N; i++) {
                  String line = sc.nextLine();
                  for (int j = 0; j < M; j++) {
                        map[i][j] = line.charAt(j) - '0';
                  }
            }

            No2178 no = new No2178();
            int answer = no.solution(map);
            System.out.println(answer);
      }

      public int solution(int[][] map) {

            int w = map.length, h = map[0].length;
            int dist = 1;

            for(int i = 0; i < w; i++){
                  System.out.println(Arrays.toString(map[i]) );
            }

            boolean[][] visited = new boolean[w][h];
            Queue<int[]> q = new LinkedList<>();

            q.offer(new int[]{0, 0, dist}); // 시작 위치(1,1)
            visited[0][0] = true;

            while (!q.isEmpty()) {
                  int[] cur = q.poll();
                  int x = cur[0];
                  int y = cur[1];
                  dist = cur[2];

                  System.out.printf("(%d, %d) -> %d\n", x, y, dist);
                  if (x == w - 1 && y == h - 1) return dist;

                  for (int i = 0; i < 4; i++) {
                        int wx = x + dx[i];
                        int hy = y + dy[i];

                        if (wx < 0 || hy < 0 || wx > w - 1 || hy > h - 1) continue;
                        if (visited[wx][hy] || map[wx][hy] == 0) continue;

                        visited[wx][hy] = true;
                        q.offer(new int[]{wx, hy, dist + 1});
                  }
            }
            return dist;
      }
}
