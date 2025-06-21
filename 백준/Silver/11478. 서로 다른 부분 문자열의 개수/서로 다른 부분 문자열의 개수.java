import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
    public static void main(String[] args) throws IOException {
    	new Main().set();
	}
    
    public void set() throws IOException {
    	Set<String> set = new HashSet<String>();
    	
    	String input = br.readLine();
    	
    	for(int i = 0; i < input.length(); i++) {
    		for(int j = i + 1; j <= input.length(); j++) {
    			set.add(input.substring(i, j));
    		}
    	}
    	bw.write(String.valueOf(set.size()));
    	bw.flush();
    	bw.close();
    
    }
}