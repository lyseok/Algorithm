import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Main {
	public static int N, M;			
	public static int map[][];		
	public static int virusMap[][];
	public static int max = 0;		
	public static int[] dx = {0, -1, 0, 1};	
	public static int[] dy = {-1, 0, 1, 0};

	public static void dfs(int count) {
		if(count == 3) {	
			bfs();
			return;
		}

		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 0) {	
					map[i][j] = 1;
					dfs(count+1);	
					map[i][j] = 0;	
				}
			}
		}
	}

	public static void bfs() {
		virusMap = new int[N][M];

		for(int i=0; i<N; i++) 
			for(int j=0; j<M; j++) 
				virusMap[i][j] = map[i][j];	

		Queue<Point> q = new LinkedList<>();
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(virusMap[i][j] == 2) {
					q.add(new Point(i, j));
				}
			}
		}

		while(!q.isEmpty()) {
			Point p = q.poll();
			int x = p.x;
			int y = p.y;

			for(int i=0; i<4; i++) {	
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx>=0 && ny>=0 && nx<N && ny<M) {	
					if(virusMap[nx][ny] == 0) {	
						virusMap[nx][ny] = 2;
						q.add(new Point(nx, ny));
					}
				}
			}
		}
		max = checkVirusCount();		
	}

	public static int checkVirusCount() {
		int cnt = 0;
		for(int i=0; i<N; i++) 
			for(int j=0; j<M; j++)
				if(virusMap[i][j] == 0) 
					cnt ++;
		return Math.max(max, cnt);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];

		for(int i=0; i<N; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				if(map[i][j] == 0) {
					map[i][j] = 1;
					dfs(1);
					map[i][j] = 0;
				}
			}
		}

		System.out.println(max);
		bf.close();
	}
}