import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		st = new StringTokenizer(br.readLine());
		
		int N = Integer.valueOf(st.nextToken());
		int k = Integer.valueOf(st.nextToken());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length - i; j++) {
				if(arr[j-1] < arr[j]) {
					swap(arr, j-1, j);
				}
			}
		}
		bw.write(arr[k-1]+"");
		bw.flush();
		bw.close();
	}
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}