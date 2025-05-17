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
		int N = 9;
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max_Index = 0;
		for(int i = 1; i < N; i++) {
			if(arr[max_Index] < arr[i]) max_Index = i;
		}
		bw.write(String.valueOf(arr[max_Index]));
		bw.newLine();
		bw.write(String.valueOf(max_Index + 1));
		bw.flush();
		bw.close();
	}
}