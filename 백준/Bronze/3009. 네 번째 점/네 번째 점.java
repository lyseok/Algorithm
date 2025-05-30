import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private StringTokenizer st;
	
    public static void main(String[] args) throws IOException {
    	new Main().ract();
	}
    
    public void ract() throws NumberFormatException, IOException {
    	ArrayList<Integer> x = new ArrayList<Integer>();
    	ArrayList<Integer> y = new ArrayList<Integer>();
    	int xx = 0;
    	int yy = 0;
    	
    	for(int i = 0; i < 3; i++) {
    		st = new StringTokenizer(br.readLine());
    		x.add(Integer.parseInt(st.nextToken()));
    		y.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	for(int i = 0; i < 3; i++) {
    		if(Collections.frequency(x, x.get(i)) == 1) {
    			xx = x.get(i);
    		}
    		if(Collections.frequency(y, y.get(i)) == 1) {
    			yy = y.get(i);
    		}
    	}
    	bw.write(xx + " " + yy);
    	bw.flush();
    	bw.close();
    	br.close();
    }

}