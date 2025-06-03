import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;


public class Main {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		new Main().sort();
	}
	
	public void sort() throws IOException {
		int[] arr = new int[5];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(br.readLine());
			sum += arr[i];
		}
		int avg = sum / arr.length;
		Arrays.sort(arr);
		bw.write(avg +"\n");
		bw.write(String.valueOf(arr[2]));
		bw.flush();
		bw.close();
	}
}