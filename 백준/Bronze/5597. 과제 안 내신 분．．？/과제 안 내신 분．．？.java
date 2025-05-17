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

		int[] basket = new int[30]; // N개 만큼의 바구니 선언
		
		for(int i = 0 ; i < 28; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			
			basket[num-1]++;
		}
		for(int i = 0; i < 30; i++) {
			if(basket[i] == 0) {
				bw.write(String.valueOf(i+1));
				bw.newLine();
			}
		}
		bw.flush();
		bw.close();
	}
}