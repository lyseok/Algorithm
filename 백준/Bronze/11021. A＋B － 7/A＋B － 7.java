import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int[] result = new int[T];
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			int input1 = Integer.parseInt(st.nextToken());
			int input2 = Integer.parseInt(st.nextToken());
			
			result[i] = input1 + input2;
			
		}
		for(int i = 0; i < T; i++) {
			System.out.printf("Case #%d: %d\n", (i+1), result[i]);
			
		}

	}
}