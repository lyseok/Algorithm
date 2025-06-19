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
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	Map<String, Integer> name = new HashMap<String, Integer>();
    	Map<Integer, String> index = new HashMap<Integer, String>();
    	
    	for(int i = 1; i <= N; i++) {
    		String str = br.readLine();
    		name.put(str, i);
    		index.put(i, str);
    	}
    	
    	for(int i = 0; i < M; i++) {
    		String input = br.readLine();
    		int ch = input.charAt(0);
    	
    		if('1' <= ch && ch <= '9') {
    			bw.write(index.get(Integer.parseInt(input)));
    		} else {
    			bw.write("" + name.get(input));
    		}
    		bw.newLine();
    	}
    	br.close();
    	bw.flush();
    	bw.close();
    }

}