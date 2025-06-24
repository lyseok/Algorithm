import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private StringTokenizer st;
	
    public static void main(String[] args) throws IOException {
    	new Main().start();
	}
    
    public void start() throws IOException {
    	Stack<Integer> stack = new Stack<Integer>();
    	
    	int K = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < K; i++) {
    		int input = Integer.parseInt(br.readLine());
    		if(input == 0) {
    			stack.pop();
    			continue;
    		}
    		stack.add(input);
    	}
    	br.close();
    	
    	int  result = 0;
    	while(!stack.empty()) {
    		result += stack.pop();
    	}
    	bw.write(result + "");
		bw.flush();
		bw.close();
    }
}