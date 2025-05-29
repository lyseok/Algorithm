import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int M = Integer.parseInt(br.readLine());
    	int N = Integer.parseInt(br.readLine());
    	br.close();
    	int result = 0;
    	int min = Integer.MAX_VALUE;
    	start : for(int i = M; i <= N; i++) {
    		if(i <= 1) {
    			continue;
    		}
    		for(int j = 2; j < i; j++) {
    			if(i % j == 0) {
    				continue start;
    			}
    		}
    		result += i;
    		if(i < min) {
    			min = i;
    		}
    	}
    	if(result == 0) {
    		bw.write(-1 + "\n");
    	} else {
	    	bw.write(result + "\n");
	    	bw.write(min + "\n");
    	}
    	bw.flush();
    	bw.close();
	}
}
