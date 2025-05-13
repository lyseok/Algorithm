import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int time = sc.nextInt();
		
		int totalMin = hour * 60 + minute + time;
		hour = totalMin / 60 % 24;
		minute = totalMin % 60;
		
		System.out.printf("%d %d", hour, minute);
	}

}