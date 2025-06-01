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
    	new Main().bruteForce();
	}
    
    public void bruteForce() throws IOException {
    	st = new StringTokenizer(br.readLine());
    	int a = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	int c = Integer.parseInt(st.nextToken());
    	int d = Integer.parseInt(st.nextToken());
    	int e = Integer.parseInt(st.nextToken());
    	int f = Integer.parseInt(st.nextToken());
    	
    	start: for(int x = -999; x < 1000; x++) {
    		for(int y = -999; y < 1000; y++) {
    			if((a*x)+(b*y)==c) {
    				if((d*x)+(e*y)==f) {
    					bw.write(x + " " + y);
    					break start;
    				}
    			}
    		}
    	}
    	
    	bw.flush();
    	bw.close();
    }
}
