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
		String str = st.nextToken();
		st = new StringTokenizer(br.readLine());
		int idx = Integer.parseInt(st.nextToken());
		
		bw.write(str.charAt(idx-1));
		bw.flush();
		bw.close();
		
	}
}