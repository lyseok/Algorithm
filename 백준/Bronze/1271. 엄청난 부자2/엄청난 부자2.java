import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			BigInteger n = new BigInteger(st.nextToken());
	        BigInteger m = new BigInteger(st.nextToken());

			bw.write(n.divide(m) + "\n");
			bw.write(n.remainder(m) +"");
			
			bw.flush();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}