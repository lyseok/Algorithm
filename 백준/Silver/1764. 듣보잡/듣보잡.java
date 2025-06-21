import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
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
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	Set<String> s1 = new HashSet<String>();
    	Set<String> s2 = new HashSet<String>();
    	
    	for(int i = 0 ; i < N; i++) {
    		s1.add(br.readLine());
    	}
    	for(int i = 0; i < M; i++) {
    		s2.add(br.readLine());
    	}
    	s1.retainAll(s2); 
    	
    	List<String> list = new ArrayList<String>(s1);
    	Collections.sort(list);
    	
    	bw.write(list.size()+"\n");
    	for(String str : list) {
    		bw.write(str + "\n");
    	}
    	bw.flush();
    	bw.close();
    }
}