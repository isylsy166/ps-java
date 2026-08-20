import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class No258712 {
    public static void main(String[] args) {
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

        No258712 no = new No258712();
        int answer = no.solution(friends, gifts);
        System.out.println("정답: " + answer);
    }

    public int solution(String[] friends, String[] gifts) {

        Map<String, Integer> friendsMap = new HashMap<>();
        for(int i = 0; i < friends.length; i++) friendsMap.put(friends[i], i);

        int[][] giftTable = giftTable(friendsMap, gifts); // 주고받은 선물
        int[][] giftCountTable = giftCount(giftTable); // 선물지수
        int[] score = new int[friends.length]; // 받아야할 선물(점수)

        // 주고받은 걸로 계산
        for(int i = 0; i < friends.length; i++){
            for(int j = 0; j < friends.length; j++){
                if(i == j) continue;
                // 다르면 더 많이 준 사람이
                if(giftTable[i][j] > giftTable[j][i]) score[i]++;
                // 같으면 지수 비교
                if(giftTable[i][j] == giftTable[j][i]){
                    int myScore = giftCountTable[i][2];
                    int friendScore = giftCountTable[j][2];
                    if(myScore > friendScore) score[i]++;
                }
            }
        }

        return Arrays.stream(score).max().getAsInt();
    }

    // 주고받은 선물
    public int[][] giftTable(Map<String, Integer> friendsMap, String[] gifts) {
        int[][] giftTable = new int[friendsMap.size()][friendsMap.size()];
        for(String gift : gifts) {
            String[] parts = gift.split(" ");
            int x = friendsMap.get(parts[0]);
            int y = friendsMap.get(parts[1]);
            giftTable[x][y]++;
        }
        return giftTable;
    }

    // 선물 지수
    public int[][] giftCount(int[][] giftTable) {
        int[][] giftCountTable = new int[giftTable.length][3];

        // 준 선물
        for(int i = 0; i < giftTable.length; i++) {
            for(int j = 0; j < giftTable[i].length; j++) {
                giftCountTable[i][0] += giftTable[i][j];
                giftCountTable[i][1] += giftTable[j][i];
                giftCountTable[i][2] = giftCountTable[i][0] - giftCountTable[i][1];
            }
        }
        return giftCountTable;
    }

}
