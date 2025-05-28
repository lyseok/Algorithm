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
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
    	int B = Integer.parseInt(st.nextToken());
    	int V = Integer.parseInt(st.nextToken());
    	br.close();
    	int result = (V - B) / (N - B);
    	if((V - B) % (N - B) != 0) {
    		result++;
    	}
    	
    	bw.write(String.valueOf(result));

    	bw.flush();
    	bw.close();
	}
}


