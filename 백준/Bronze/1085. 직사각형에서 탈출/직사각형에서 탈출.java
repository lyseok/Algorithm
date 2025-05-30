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
    	st = new StringTokenizer(br.readLine());
    	int x = Integer.parseInt(st.nextToken());
    	int y = Integer.parseInt(st.nextToken());
    	int w = Integer.parseInt(st.nextToken());
    	int h = Integer.parseInt(st.nextToken());
    	int result = 0;
    	
    	if(w/2 < x) {
    		result = w - x;
    	} else {
    		result = x;
    	}
    	if(h/2 < y && h - y < result) {
    		result = h - y;
    	} else if(y < result) {
    		result = y;
    	}
    	bw.write(String.valueOf(result));
    	bw.flush();
    	bw.close();
    }

}