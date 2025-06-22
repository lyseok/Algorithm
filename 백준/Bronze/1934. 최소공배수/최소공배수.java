import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private StringTokenizer st;
	
    public static void main(String[] args) throws IOException {
    	new Main().lcm();
	}
    
    public void lcm() throws IOException {
    	int T = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < T; i ++) {
    		st = new StringTokenizer(br.readLine());
    		int input1 = Integer.parseInt(st.nextToken());
    		int input2 = Integer.parseInt(st.nextToken());
    		
    		bw.write(String.valueOf((input1 * input2) / gcd(input1, input2)));
    		bw.newLine();
    	}
    	br.close();
    	bw.flush();
    	bw.close();
    }
    
    public int gcd(int x, int y) {
    	if(x % y == 0) return y;
    	return gcd(y, x % y);
    }

}