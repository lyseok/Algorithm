import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
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
    	int[] arr = new int[N];

    	st = new StringTokenizer(br.readLine());
    	br.close();
    	for(int i = 0; i < N; i++) {
    		int input = Integer.parseInt(st.nextToken());	
    		arr[i] = input;
    	}
    	int[] sortArr = arr.clone();
    	Arrays.sort(sortArr);
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	int rank = 0;
    	for(int i : sortArr) {
    		if(map.containsKey(i)) continue;
    		map.put(i, rank++);
    	}
    	for(int i : arr) {
    		bw.write(map.get(i) + " ");
    	}
    	
    	bw.flush();
    	bw.close();
    }
}