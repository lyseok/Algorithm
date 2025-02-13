import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int N = Integer.parseInt(br.readLine());
    	br.close();
    	
    	int temp = 2;
    	for(int i = 0; i < N; i++) {
    		temp = temp + ( temp - 1 );
    	}
    	bw.write(String.valueOf((int) Math.pow(temp, 2)));
    	

    	bw.flush();
    	bw.close();
	}
}