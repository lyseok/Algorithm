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
		
		for(int k = 1; k <= N; k++) {
			basket[k-1] = k;
		}
		
		for(int k = 0; k < M; k++) {
			st = new StringTokenizer(br.readLine());
			int i = (Integer.parseInt(st.nextToken())) - 1;
			int j = (Integer.parseInt(st.nextToken())) - 1;
			
			int temp = basket[i];
			basket[i] = basket[j];
			basket[j] = temp;
		}
		
		for(int k : basket) {
			bw.write(String.valueOf(k + " "));
		}
		bw.flush();
		bw.close();
	}
}
