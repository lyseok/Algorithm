import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
    public static void main(String[] args) throws IOException {
    	new Main().start();
	}
    
    public void start() throws IOException {
    	Stack<Character> stack = new Stack<Character>();
    	
    	int T = Integer.parseInt(br.readLine());
    	
    	for(int i = 0; i < T; i++) {
    		char[] arr = br.readLine().toCharArray();
    		boolean VPS = true;
    		
    		for(int j = 0; j < arr.length; j++) {
    			if(arr[j] == '(') stack.add('(');
    			if(arr[j] == ')') {
    				if(j < arr.length && stack.empty()) {
    					VPS = false;
    					break;
    				}
    				stack.pop();
    			}
    		}
    		if(stack.size() > 0) VPS = false;
    		if(VPS) {
    			bw.write("YES\n");
    		} else {
    			bw.write("NO\n");    			
    		}
    		stack.clear();
    	}
    	bw.flush();
    	bw.close();
    }
}