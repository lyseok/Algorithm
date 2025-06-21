import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private StringTokenizer st;
	
    public static void main(String[] args) throws IOException {
    	new Main().map();
	}
    
    public void map() throws IOException {
    	int N = Integer.parseInt(br.readLine());
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < N; i++) {
    		int input = Integer.parseInt(st.nextToken());
    		int val = 0;
    		if(map.containsKey(input)) {
    			val = map.get(input);
    		}
    		map.put(input, ++val);
    	}

    	int M = Integer.parseInt(br.readLine());
    	st = new StringTokenizer(br.readLine());
    	br.close();
    	for(int i = 0 ; i < M; i++) {
    		int input = Integer.parseInt(st.nextToken());
    		if(map.containsKey(input)) {
    			bw.write(map.get(input) + " ");
    		} else {
    			bw.write("0 ");
    		}
    	}
    	bw.flush();
    	bw.close();

    }

}