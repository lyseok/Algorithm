import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
    public static void main(String[] args) throws IOException {
    	new Main().decomposition();
	}
    
    public void decomposition() throws IOException {
    	String input = br.readLine();
    	br.close();
    	
    	bw.write(String.valueOf(result(input)));
    		
    	bw.flush();
    	bw.close();
    }
    
    public int result(String str) {
    	int len = str.length();
    	int num = Integer.parseInt(str);
    	
    	for(int i = num - (len * 9); i <= num; i++) {
    		int sum = 0;
    		int number = i;
    		while(number > 0) {
    			sum += number % 10;
    			number /= 10;
    		}
    		if(sum + i == num) {
    			return i;
    		} 
    	}
    	return 0;
    }

}