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
        String str = st.nextToken();
        int result = 1;
        
    	for(int i = 0; i < str.length()/2; i++) {
    		if(str.charAt(i) != str.charAt((str.length()-1)-i)) result = 0;
    	}
        
    	bw.write(String.valueOf(result));
    	bw.flush();
    	bw.close();

    }

}