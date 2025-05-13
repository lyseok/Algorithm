import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int input1 = Integer.parseInt(st.nextToken());
			int input2 = Integer.parseInt(st.nextToken());
			
			result += (input1 * input2);
		}
		if(X == result) System.out.println("Yes");
		else System.out.println("No");

	}
}