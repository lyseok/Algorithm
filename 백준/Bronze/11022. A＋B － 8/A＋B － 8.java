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
		int[] input1 = new int[T];
		int[] input2 = new int[T];
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			
			input1[i] = Integer.parseInt(st.nextToken());
			input2[i] = Integer.parseInt(st.nextToken());
			
			result[i] = input1[i] + input2[i];
			
		}
		for(int i = 0; i < T; i++) {
			System.out.printf("Case #%d: %d + %d = %d\n", (i+1), input1[i], input2[i], result[i]);
			
		}

	}
}