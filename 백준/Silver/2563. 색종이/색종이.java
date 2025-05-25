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

    	boolean[][] arr = new boolean[100][100];
    	int count = 0;
    	
    	int N = Integer.parseInt(br.readLine());
    	for(int  i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		int X = Integer.parseInt(st.nextToken());
    		int Y = Integer.parseInt(st.nextToken());
    		filled(arr, X, Y);
    	}
    	
    	for(int i = 0; i < 100; i++ ) {
    		for(int j = 0; j < 100; j++) {
    			if(arr[i][j] == true) {
    				count++;
    			}
    		}
    	}

    	bw.write(String.valueOf(count));
    	
    	bw.flush();
    	bw.close();
    	br.close();
	}
    
    public static void filled(boolean[][] arr,int x, int y) {
    	for(int i = 0; i < 10; i++) {
    		for(int j = 0; j < 10; j++) {
    			arr[y+i][x+j] = true;
    		}
    	}
    }
}