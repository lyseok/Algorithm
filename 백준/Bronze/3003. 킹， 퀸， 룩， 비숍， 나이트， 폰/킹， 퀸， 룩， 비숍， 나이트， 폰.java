import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        	
		int[] eArr = new int[]{1, 1, 2, 2, 2, 8};
		int[] iArr = new int[6];

		for(int i = 0; i< iArr.length; i++) {
			iArr[i] = Integer.parseInt(st.nextToken());
		}

		for(int i = 0; i <iArr.length; i++) {
			System.out.printf("%d", eArr[i] - iArr[i]);
			if(i != iArr.length) System.out.print(" ");
		}

    }

}