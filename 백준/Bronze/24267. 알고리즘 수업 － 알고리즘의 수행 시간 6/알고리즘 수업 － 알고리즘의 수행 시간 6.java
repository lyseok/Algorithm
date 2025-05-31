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
    	long n = Long.parseLong(br.readLine());
    	br.close();

    	bw.write((n*(n-1)*(n-2)/6)+"\n");
    	bw.write("3\n");
    	
    	bw.flush();
    	bw.close();
    }

}