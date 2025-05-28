import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int T = Integer.parseInt(br.readLine());
    	int[] result = new int[4];
    	int[] cent = {25, 10, 5, 1};
    	for(int j = 0; j < T; j++) {
	    	int C = Integer.parseInt(br.readLine());
	    	while(C > 0) {
	    		for(int i = 0; i < cent.length; i++) {
	    			result[i] = C / cent[i];
	    			C %= cent[i];
	    			bw.write(result[i] + " ");
	    		}
	    	}
	    	bw.newLine();
    	}
    	br.close();
    	

    	bw.flush();
    	bw.close();
	}
}