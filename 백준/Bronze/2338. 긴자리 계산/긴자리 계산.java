import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws IOException {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			BigInteger a = new BigInteger(br.readLine());
	        BigInteger b = new BigInteger(br.readLine());
	        
	        bw.write(a.add(b) + "\n");
	        bw.write(a.subtract(b) + "\n");
	        bw.write(a.multiply(b) + "\n");
			
			bw.flush();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
