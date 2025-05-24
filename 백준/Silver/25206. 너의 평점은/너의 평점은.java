import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String[][] gradeArr = { { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" },
				{ "4.5", "4.0", "3.5", "3.0", "2.5", "2.0", "1.5", "1.0", "0.0" } };
		double totalScore = 0;
		double totalGrade = 0;

		for (int i = 0; i < 20; i++) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			double grade = Double.parseDouble(st.nextToken());
			String scoreInput = st.nextToken();

			for (int j = 0; j < gradeArr[0].length; j++) {
				if (scoreInput.equals(gradeArr[0][j])) {
					scoreInput = gradeArr[1][j];
				}
			}

			if (!scoreInput.equals("P")) {
				double score = Double.parseDouble(scoreInput);
				totalScore += score * grade;
				totalGrade += grade;
			}

		}
		System.out.printf("%.6f\n", totalScore / totalGrade);

	}

}