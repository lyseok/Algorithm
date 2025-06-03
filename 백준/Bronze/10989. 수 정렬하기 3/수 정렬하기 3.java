import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	StringTokenizer st;
	public static void main(String[] args) throws IOException {
		new Main().sort();
	}
	
	public void sort() throws IOException {
		int N = Integer.valueOf(br.readLine());
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++ ) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		Arrays.sort(arr);
		
		for(int i : arr) {
			bw.write(i+"\n");
		}
		bw.flush();
		bw.close();
	}
}