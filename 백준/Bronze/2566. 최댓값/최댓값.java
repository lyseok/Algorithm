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
    	int max = 0;
    	int maxRow = 0;
    	int maxCol = 0;
    	
    	int[][] arr = new int[9][9];
    	for(int i = 0; i < arr.length; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j = 0; j < arr[i].length; j++) {
    			int input = Integer.parseInt(st.nextToken());
    			if(input >= max) {
    				max = input;
    				maxRow = i + 1;
    				maxCol = j + 1;
    			}
    		}
    	}
    	bw.write(String.valueOf(max));
    	bw.newLine();
    	bw.write(maxRow+" "+maxCol);
    	
    	bw.flush();
    	bw.close();
    	br.close();
	}
}