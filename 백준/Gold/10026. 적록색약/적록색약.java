import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static char[][] map1, map2;
    static int[] xMove = {-1, 0, 1, 0};
    static int[] yMove = {0, -1, 0, 1};
    static int N;
    static boolean[][] visited;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());

        map1 = new char[N][N];
        map2 = new char[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            char[] charArray = line.toCharArray();
            for (int j = 0; j < N; j++) {
                map1[i][j] = charArray[j];
                if (charArray[j] == 'G') {
                    map2[i][j] = 'R';
                } else map2[i][j] = charArray[j];
            }
        }

        visited = new boolean[N][N];
        int map1Count = 0;
        int map2Count = 0;

		// map1 적록색약이 아닌 사람이 볼 때의 그룹의 갯수
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    map1Count++;
                    bfs1(new point(i, j));
                }
            }
        }

		// 방문 배열 초기화
        // map2 적록색약인 사람이 볼 때의 그룹의 갯수
        visited = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    map2Count++;
                    bfs2(new point(i, j));
                }
            }
        }

        bw.write(map1Count + " " + map2Count);

        bw.flush();
        bw.close();
        br.close();
    }

    public static void bfs1(point start) {
        Queue<point> queue = new LinkedList<>();
        queue.add(start);
        visited[start.x][start.y] = true;

        while (!queue.isEmpty()) {
            point current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = current.x + xMove[i];
                int newY = current.y + yMove[i];

                if (newX < 0 || newY < 0 || newX >= N || newY >= N || visited[newX][newY]) continue;

                // 같은 색인지 확인
                if (map1[newX][newY] == map1[current.x][current.y]) {
                    visited[newX][newY] = true;
                    queue.add(new point(newX, newY));
                }
            }
        }
    }
    public static void bfs2(point start) {
        Queue<point> queue = new LinkedList<>();
        queue.add(start);
        visited[start.x][start.y] = true;

        while (!queue.isEmpty()) {
            point current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int newX = current.x + xMove[i];
                int newY = current.y + yMove[i];

                if (newX < 0 || newY < 0 || newX >= N || newY >= N || visited[newX][newY]) continue;

                // 같은 색인지 확인
                if (map2[newX][newY] == map2[current.x][current.y]) {
                    visited[newX][newY] = true;
                    queue.add(new point(newX, newY));
                }
            }
        }
    }

    public static class point {
        int x;
        int y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}