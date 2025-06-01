import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private StringTokenizer st;
	
    public static void main(String[] args) throws IOException {
    	new Main().blackJack();
	}
    
    public void blackJack() throws IOException {
    	st = new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	int[] arr = new int[N];
    	st = new StringTokenizer(br.readLine());
    	
    	for(int i = 0; i < N; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	int result = 0;
    	int distance = Integer.MAX_VALUE;
    	
    	for(int i = 0; i < N; i++) {
    		for(int j = 0; j < N; j++) {
    			if(i == j) continue;
    			for(int k = 0; k < N; k++) {
    				if(j == k || i == k) continue;
    				int sum = arr[i] + arr[j] + arr[k];
    				if(M >= sum) {
    					if(distance > M - sum) {
    						distance = M - sum;
    						result = sum;
    					}
    				}
    			}
    		}
    	}
    	bw.write(String.valueOf(result));
    	
    	
    	bw.flush();
    	bw.close();
    }

}