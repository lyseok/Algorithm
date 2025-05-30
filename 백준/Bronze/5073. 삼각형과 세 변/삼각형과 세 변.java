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
    	int[] triLen = new int[3];
    	while(true) {
    		String input = br.readLine();
    		if(input.equals("0 0 0")) break;
    		st = new StringTokenizer(input);
    		
	    	for(int i = 0; i < triLen.length; i++) {
	    		triLen[i] = Integer.parseInt(st.nextToken());
	    	}
	    	triangle(triLen);
    	}
    	bw.flush();
    	bw.close();
    }
    
    public void triangle(int[] triLen) throws IOException {
    	if(checkTriangle(triLen)) {
    		if(triLen[0] == triLen[1] && triLen[1] == triLen[2] && triLen[0] == triLen[2]) {
    			bw.write("Equilateral\n");
    		} else if(triLen[0] == triLen[1] || triLen[1] == triLen[2] || triLen[0] == triLen[2]) {
    			bw.write("Isosceles\n");
    		} else {
    			bw.write("Scalene\n");
    		}
    	} else {
    		bw.write("Invalid\n");
    	}
    }
    
    public boolean checkTriangle(int[] triLen) {
    	int maxLen = 0;
    	int sumLen = 0;
    	for(int i = 0; i < triLen.length; i++) {
    		if(triLen[maxLen] < triLen[i]) {
    			maxLen = i;
    		}
    	}
    	for(int i = 0; i < triLen.length; i++) {
    		if(i != maxLen) {
    			sumLen += triLen[i];
    		}
    	}
    	if(sumLen > triLen[maxLen]) {
    		return true;
    	} else {
    		return false;
    	}
    }

}