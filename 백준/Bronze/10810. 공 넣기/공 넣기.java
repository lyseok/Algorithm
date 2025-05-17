import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[N]; // N개 만큼의 바구니 선언
		
		for(int m = 0; m < M; m++) { // M번 만큼 반복
			st = new StringTokenizer(br.readLine()); // i, j, k 를 입력받아 각 변수에 저장
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			for(int idx = i-1; idx < j; idx++) { // i번 바구니부터 j번 바구니까지 반복
				basket[idx] = k; // 범위의 바구니에 k번 공을 넣어라
			}
		}
		
		for(int i : basket) {
			bw.write(i + " ");
		}
		bw.flush();
		bw.close();
	}
}