import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		
		minute -= 45;
		if(minute < 0) {
			minute += 60;
			hour--;
		}
		if(hour < 0) {
			hour = 23;
		}
		System.out.printf("%d %d\n", hour, minute);
	}

}