import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
    public static void main(String[] args) throws IOException {
    	new Main().algorithm();
	}
    
    public void algorithm() throws IOException {
    	long input = Long.parseLong(br.readLine());

    	bw.write(input * (input-1)/2 + "\n");
    	bw.write("2\n");
    	
    	bw.flush();
    	bw.close();
    }

}