import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
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
    	
    	Set<Integer> s1 = new HashSet<Integer>();
    	Set<Integer> s2 = new HashSet<Integer>();
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0 ; i < N; i++) {
    		s1.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	Set<Integer> temp = new HashSet<Integer>(s1);
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < M; i++) {
    		s2.add(Integer.parseInt(st.nextToken()));
    	}
    	
    	s1.removeAll(s2);
    	s2.removeAll(temp);

    	bw.write(String.valueOf(s1.size()+s2.size()));
    	bw.flush();
    	bw.close(); 
    }
}