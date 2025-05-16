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
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int input1 = Integer.parseInt(st.nextToken());
			int input2 = Integer.parseInt(st.nextToken());
			
			if(input1 == 0 && input2 == 0) break;
			int result = input1 + input2;
			bw.write(String.valueOf(result));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}