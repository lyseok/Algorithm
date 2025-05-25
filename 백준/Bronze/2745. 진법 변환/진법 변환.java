import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	StringTokenizer st;
    	
    	st = new StringTokenizer(br.readLine());
    	String N = st.nextToken();
    	int B = Integer.parseInt(st.nextToken());
    	br.close();
    	
    	int temp = 1;
    	int result = 0;
    	for(int i = 0; i < N.length(); i++) {
    		char ch = N.charAt(N.length() - 1 - i);
    		
    		int num;
    		if(ch >= 'A' && ch <= 'Z') {
    			num = ch - 'A' + 10;
    		} else {
    			num = ch - '0';
    		}
    		if(i == 0) {
    			result += num;
    		}else {
    			int pow = (int) Math.pow(B, temp++);
    			result += pow * num;
    		}
    	}
    	bw.write(String.valueOf(result));
    	bw.flush();
    	bw.close();
	}
}