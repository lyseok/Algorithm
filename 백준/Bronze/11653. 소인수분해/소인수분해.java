import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
    	new Main().factorization();
	}
    
    public void factorization() throws NumberFormatException, IOException {
    	int input = Integer.parseInt(br.readLine());
    	while(true) {
    		if(input <= 1) break;
    		int div = divisor(input);
    		bw.write(div+ "\n");
    		input /= div;
    	}
    	bw.flush();
    	bw.close();
    }
    
    public int divisor(int number) {
    	for(int i = 2; i <= number; i++) {
    		if(number % i == 0) {
    			return i;
    		}
    	}
    	return 1;
    }
}
