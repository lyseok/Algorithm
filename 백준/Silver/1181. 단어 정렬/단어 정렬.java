import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	HashSet<String> set = new HashSet<String>();
	ArrayList<String> list = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {
		new Main().sort();
	}
	
	public void sort() throws IOException {
		int N = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < N; i++) {
			set.add(br.readLine());
		}
		
		String[] arr = new String[set.size()];
		set.toArray(arr);
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length-i; j++) {
				if(arr[j-1].length() > arr[j].length()) {
					swap(arr, j-1, j);
				} 
			}
		}
		
		for(String s : arr) {
			System.out.println(s);
		}
		bw.flush();
		bw.close();
	}
	
	public void swap(String[] ch, int i, int j) {
		String temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
}
