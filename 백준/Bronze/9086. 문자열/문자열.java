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
		int T = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int idx = str.length()-1;
			
			bw.write(str.charAt(0));
			bw.write(str.charAt(idx));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
