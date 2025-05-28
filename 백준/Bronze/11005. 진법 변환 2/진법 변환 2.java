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
    	int N = Integer.parseInt(st.nextToken());
    	int B = Integer.parseInt(st.nextToken());
    	br.close();
    	
    	int temp;
    	char ch;
    	String result = "";
    	
    	while(N > 0) {
    		temp = N % B;
    		if(temp >= 10) {
    			ch = (char) (temp - 10 + 'A');
    		} else {
    			ch = (char) (temp + '0');
    		}
    		N /= B;
    		result += ch;
    	}

    	for(int i = result.length() - 1; i >= 0; i--) {
    		bw.write(result.charAt(i));
    	}
    	bw.flush();
    	bw.close();
	}
}


