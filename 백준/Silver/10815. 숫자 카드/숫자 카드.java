import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private StringTokenizer st;
	
    public static void main(String[] args) throws IOException {
    	new Main().set();
	}
    
    public void set() throws IOException {
    	int N = Integer.parseInt(br.readLine());
    	Set<Integer> set = new HashSet<Integer>();
    	List<Integer> list = new ArrayList<Integer>();
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < N; i++) {
    		set.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	int M = Integer.parseInt(br.readLine());
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < M; i++) {
    		if(set.contains(Integer.parseInt(st.nextToken()))) {
    			list.add(1);
    		} else {
    			list.add(0);
    		}
    	}
    	for(int i : list) {
    		bw.write(i + " ");
    	}
    	bw.flush();
    	bw.close();

    }

}