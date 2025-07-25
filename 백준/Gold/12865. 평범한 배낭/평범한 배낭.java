import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int count = Integer.parseInt(st.nextToken());
		int maximum = Integer.parseInt(st.nextToken());
		int[][] objectArray = new int[count+1][maximum+1];
		
		for(int i = 1; i < count+1; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int weight = Integer.parseInt(st.nextToken());
			int value = Integer.parseInt(st.nextToken());
			
			for(int j = 1; j < maximum+1; j++) {
				if(j < weight) {
					objectArray[i][j] = objectArray[i-1][j];
				}
				else {
					objectArray[i][j] = Math.max(objectArray[i-1][j], objectArray[i-1][j-weight] + value);
				}
			}
		}
		bw.write(objectArray[count][maximum] + "\n");
		bw.flush();
		bw.close();	
	}
}