import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        String[] input = new String[2];
        int[] rNum = new int[2];
        st = new StringTokenizer(br.readLine());
        
        for(int i = 0; i < input.length; i++) {
        	input[i] = st.nextToken();
        }
        
        char[] chArr = new char[input[0].length()];
        int[] num = new int[2];
        for(int j = 0; j < input.length; j++) {
	        for(int i = 0; i < input[0].length(); i++) {
	        	chArr[(input[j].length()-1)-i] = input[j].charAt(i);
	        }
	        input[j] = (String.valueOf(chArr[0])) + 
	        		(String.valueOf(chArr[1])) +
	        		(String.valueOf(chArr[2]));
	        num[j] = Integer.parseInt(input[j]);
        }
        
        if(num[0] > num[1]) {
        	bw.write(String.valueOf(num[0]));
        } else {
        	bw.write(String.valueOf(num[1]));
        }
        bw.flush();
        bw.close();
    }
    

}