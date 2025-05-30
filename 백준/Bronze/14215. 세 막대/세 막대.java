import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private StringTokenizer st;
	
    public static void main(String[] args) throws IOException {
    	new Main().triangle();
	}
    
    public void triangle() throws NumberFormatException, IOException {
    	st = new StringTokenizer(br.readLine());
    	int result = 0;
    	int[] arr = new int[3];
    	for(int i = 0; i < 3; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}
    	Arrays.sort(arr);
    	
    	if(arr[2] >= arr[0] + arr[1]) {
    		arr[2] = arr[0] + arr[1] - 1;
    	}
    	result = arr[0] + arr[1] + arr[2];    		
    	
    	bw.write(String.valueOf(result));    		
    	
    	
    	bw.flush();
    	bw.close();
    }

}