import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private StringTokenizer st;
	
    public static void main(String[] args) throws IOException {
    	new Main().ract();
	}
    
    public void ract() throws NumberFormatException, IOException {
    	int N = Integer.parseInt(br.readLine());
    	int minX = Integer.MAX_VALUE;
    	int maxX = Integer.MIN_VALUE;
    	int minY = Integer.MAX_VALUE;
    	int maxY = Integer.MIN_VALUE;
    	
    	for(int i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		
    		if(x > maxX) {
    			maxX = x;
    		}
    		if(x < minX) {
    			minX = x;
    		}
    		if(y > maxY) {
    			maxY = y;
    		}
    		if(y < minY) {
    			minY = y;
    		}
    	}
    	int result = (maxX - minX) * (maxY - minY);
    	
    	bw.write(String.valueOf(result));
    	bw.flush();
    	bw.close();
    }

}
