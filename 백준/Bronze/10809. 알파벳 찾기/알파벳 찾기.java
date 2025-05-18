import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        int[] alpha = new int[26];
        for(int i = 0; i < alpha.length; i++) {
        	alpha[i] = -1;
        }
        
        st = new StringTokenizer(br.readLine());
        String S = st.nextToken();
        
        char[] chArr = new char[S.length()];
        for(int i = 0; i < S.length(); i++) {
        	chArr[i] = S.charAt(i);
        	if(alpha[(int)chArr[i] - (int)'a'] == -1) {
        		alpha[(int)chArr[i] - (int)'a'] = i;
        	}
        }
        
        for(int i : alpha) {
        	bw.write(i + " ");
        }
        bw.flush();
        bw.close();
         
	}

}