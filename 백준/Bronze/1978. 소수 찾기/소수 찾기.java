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
    	
    	int N = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int count = 0;
    	
    	start : for(int i = 0; i < N; i++) {
    		int input = Integer.parseInt(st.nextToken());
    		if(input <= 1) {
    			continue;
    		} else {
    			for(int j = 2; j < input; j++) {
    				if(input % j == 0) continue start;
    			}
    			count++;    			
    		}
    	}
    	bw.write(String.valueOf(count));
    	
    	br.close();
    	bw.flush();
    	bw.close();
	}
}