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
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	int[][] arr = new int[N][M]; 
    	int num;
    	
    	for(int i = 0; i < arr.length * 2; i++) {
    		st = new StringTokenizer(br.readLine());
    		if(i >= N) {
    			num = i - N;
    		}
    		else {
    			num = i;
    		}
    		for(int j = 0; j < arr[num].length; j++) {
    			int input = Integer.parseInt(st.nextToken());
    			arr[num][j] += input;
    		}
    	}
    	
    	for(int[] i : arr) {
    		for(int j : i) {
    			bw.write(j + " ");
    		}
    		bw.newLine(); 		
    	}
    	bw.flush();
    	bw.close();
    	br.close();
    	
	}
}