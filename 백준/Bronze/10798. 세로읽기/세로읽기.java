import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[][] ch = new char[5][];
        char[] chArr = null;
        int len = 0;
        
        for(int i = 0; i < 5; i++ ) {
        	String input = br.readLine();
        	for(int j = 0; j < input.length(); j++) {
        		chArr = input.toCharArray();
        	}
        	ch[i] = chArr;
        	if(len < chArr.length) {
        		len = chArr.length;
        	}
        }
        
        for(int j = 0; j < len; j++) {
	        for(int i = 0; i < ch.length; i++) {
	        	if(j < ch[i].length) {
	        		bw.write(ch[i][j]);
	        	}
	        }
        }
        bw.flush();
        bw.close();
        br.close();

    }

}