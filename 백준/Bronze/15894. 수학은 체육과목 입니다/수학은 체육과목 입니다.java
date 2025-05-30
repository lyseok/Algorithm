import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	new Main().ract();
	}
    
    public void ract() throws NumberFormatException, IOException {
    	long input = Long.parseLong(br.readLine());
    	bw.write(String.valueOf(input * 4));
    	bw.flush();
    	bw.close();
    }

}