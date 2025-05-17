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

		int[] arr = new int[42];
		
		for(int i = 0 ; i < 10; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			num %= 42;
			
			arr[num]++;
		}
		
		int count = 0;
		
		for(int i = 0; i < 42; i++) {
			if(arr[i] != 0) {
				count++;
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
}