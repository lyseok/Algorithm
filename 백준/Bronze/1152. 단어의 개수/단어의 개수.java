import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        int count = 0;
        try {
        	st = new StringTokenizer(br.readLine());
	        while(true) {
		        String str = st.nextToken();
		        count++;
	        }
        } catch(NoSuchElementException e) {
        	System.out.println(count);
        }
        
        
    }

}