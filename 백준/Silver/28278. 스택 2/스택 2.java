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
    	
    	int N = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		int input = Integer.parseInt(st.nextToken());
    		
    		switch(input) {
    			case 1: stack.add(Integer.parseInt(st.nextToken())); break;
    			case 2: 
    				if(stack.empty()) { bw.write("-1\n"); } 
    				else { bw.write(stack.pop() + "\n"); }
    				break;
    			case 3:	bw.write(stack.size() + "\n"); break;
    			case 4:
    				if(stack.empty()) { bw.write("1\n"); } 
    				else { bw.write("0\n"); }
    				break;
    			case 5:
    				if(stack.empty()) { bw.write("-1\n"); } 
    				else { bw.write(stack.peek() + "\n"); }
    				break;
    		}
    		
    		bw.flush();    		
    	}
    	bw.close();
    }
}