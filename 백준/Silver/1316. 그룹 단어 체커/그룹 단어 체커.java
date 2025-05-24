import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = 0;


		for(int i = 0; i < N; i++) {
			if(cheak(br.readLine())) {
				count++;
			}
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		br.close();
	
	}
	
	public static boolean cheak(String str) {
		boolean[] alpha = new boolean[26];
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);
			int prev = (i > 0) ? str.charAt(i - 1): 0;
			if(alpha[now - 'a'] == false) {
				
				alpha[now - 'a'] = true;
			} else if (now != prev) {
				return false;
			}
		}
		return true;
	}
	
}
