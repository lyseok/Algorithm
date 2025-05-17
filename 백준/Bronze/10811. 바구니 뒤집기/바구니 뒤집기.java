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
		
		int[] basket = new int[N];
		for(int i = 1; i <= N; i++) {
			basket[i-1] = i;
		}
		
		for(int k = 0 ; k < M; k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			int[] arr = new int[j-(i-1)];
			int idx = 0;
			for(int n = i-1; n < j; n++) {
				arr[idx++] = basket[n];
			}
			for(int n = i-1; n < j; n++) {
				basket[n] = arr[--idx];
			}
		}
		for(int n : basket) {
			bw.write(n + " ");
		}
		bw.flush();
		bw.close();
		
	}
}