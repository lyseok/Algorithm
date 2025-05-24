import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] chArr = new int[26];
        for(int i = 0; i < str.length(); i++) {
        	if(str.charAt(i) >= 'a') {
        		chArr[(str.charAt(i) - 'a')]++;
        	} else {
        		chArr[(str.charAt(i) - 'A')]++;
        	}
        }
        int maxIdx = 0; 
        for(int i  = 0; i < chArr.length; i++) {
        	if(chArr[maxIdx] < chArr[i]) maxIdx = i;
        }
        
        int count = 0;
        for(int i = 0; i < chArr.length; i++) {
        	if(chArr[maxIdx] == chArr[i]) count++;
        }

        if(count >= 2) {
        	bw.write('?');
        } else {
        	bw.write((char)(maxIdx+'A'));
        }
        bw.flush();
        bw.close();

    }

}