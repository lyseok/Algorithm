import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public boolean search(int[] arr, int target) {
		int lt = 0, rt = arr.length - 1;
		while(lt <= rt) {
			int mid = (lt + rt) / 2;
			if(arr[mid] == target) {
				return true;
			}
			if(arr[mid] > target) rt = mid - 1;
			else lt = mid + 1;
		}
		
		return false;
	}
	
	public int[] solution(int N, int M, int[] A, int[] arr) {
		Arrays.sort(A);
		int[] res = new int[M];
		
		for(int i = 0; i < M; i++) {
			if(search(A, arr[i])) {
				res[i] = 1;
			} else {
				res[i] = 0;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) throws IOException {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[] arr = new int[M];		
		for(int i = 0; i < M; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(N, M, A, arr)) {
			System.out.println(x);			
		}
		
		sc.close();
	}
}