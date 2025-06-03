import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		new Main().sort();
	}
	
	public void sort() throws IOException {
		char[] ch = br.readLine().toCharArray();
		
		for(int i = 0; i < ch.length; i++) {
			for(int j = 1; j < ch.length - i; j++) {
				if(ch[j-1] < ch[j]) {
					swap(ch, j-1, j);
				}
			}
		}
		
		String str = new String(ch);
		bw.write(str);
		bw.flush();
		bw.close();
	}
	
	public void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
}