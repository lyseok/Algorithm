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
    	int input = Integer.parseInt(br.readLine());
    	bw.write(input + "\n");
    	bw.write("1\n");
    	
    	bw.flush();
    	bw.close();
    }

}