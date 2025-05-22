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
        int T = Integer.parseInt(st.nextToken());
        
        for(int i = 0; i < T; i++) {
        	st = new StringTokenizer(br.readLine());
        	int loop = Integer.parseInt(st.nextToken());
        	String input = st.nextToken();
        	for(int j = 0; j < input.length(); j++) {
        		for(int k = 0; k < loop; k++) {
        			bw.write(input.charAt(j));
        		}
        	}
        	bw.newLine();
        }
         bw.flush();
         bw.close();
	}

}