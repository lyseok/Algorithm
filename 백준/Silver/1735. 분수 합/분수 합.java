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
    	new Main().fraction();
	}
    
    public void fraction() throws IOException {

		st = new StringTokenizer(br.readLine());
		int i11 = Integer.parseInt(st.nextToken());
		int i12 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int i21 = Integer.parseInt(st.nextToken());
		int i22 = Integer.parseInt(st.nextToken());
		
		int c = (i11 * i22 + i21 * i12);
		int p = (i12 * i22);
		int gcd = gcd(c, p);
		c = c / gcd;
		p = p / gcd;
		
		br.close();
		bw.write(c + " " + p);
		bw.flush();
		bw.close();
    }
    
    public int gcd(int x, int y) {
    	if(x % y == 0) return y;
    	return gcd(y, x % y);
    }
}