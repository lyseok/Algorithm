import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
    public static void main(String[] args) throws IOException {
    	new Main().algorithm();
	}
    
    public void algorithm() throws NumberFormatException, IOException {
    	bw.write("1\n");
    	bw.write("0\n");
    	
    	bw.flush();
    	bw.close();
    }

}