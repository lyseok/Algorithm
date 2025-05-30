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
    	int[] angle = new int[3];
    	for(int i = 0; i < angle.length; i++) {
    		angle[i] = Integer.parseInt(br.readLine());
    	}
    	if(triangle(angle)) {
    		if(angle[0] == angle[1] && angle[1] == angle[2]) {
    			bw.write("Equilateral");
    		} else if(angle[0] == angle[1] || angle[1] == angle[2] || angle[0] == angle[2]) {
    			bw.write("Isosceles");
    		} else {
    			bw.write("Scalene");
    		}
    	} else {
    		bw.write("Error");
    	}
    	bw.flush();
    	bw.close();
    }
    
    public boolean triangle(int[] angle) {
    	int result = 0;
    	for(int i : angle) {
    		result += i;
    	}
    	if(result == 180) {
    		return true;
    	} else {
    		return false;
    	}
    }

}