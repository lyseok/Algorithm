import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	
    	while(true) {
    		int n = Integer.parseInt(br.readLine());
    		if(n == -1) {
    			break;
    		}
    		int sum = 0;
    		for(int i = 1; i <= n/2; i++) {
    			if(n % i == 0) {
    				sum += i;
    				list.add(i);
    			}
    		}
    		if(n == sum) {
    			bw.write(n + " = ");
    			for(int i = 0; i < list.size()-1; i++) {
    				bw.write(list.get(i) + " + ");
    			}
    			bw.write(list.get(list.size()-1) + "\n");
    		} else {
    			bw.write(n + " is NOT perfect.\n");
    		}
    		list.clear();
    	}
    	

    	br.close();
    	bw.flush();
    	bw.close();
	}
}