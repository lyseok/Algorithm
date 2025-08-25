import java.util.*;
import java.io.*;
 
class Main {
    public static void main(String args[]) throws IOException	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
 
        int cnt = 0;
        for(int i=0; i<N; i++) {
            int low = 0, high = N-1;
            while(low < high) {
                int sum = arr[low] + arr[high];
 
                if(sum < arr[i])
                    low++;
                else if(sum > arr[i])
                    high--;
                else {
                    if(low != i && high != i) {
                        cnt++;
                        break;
                    } else {
                        if(low == i) low++;
                        else high--;
                    }
 
                }
            }
        }
        System.out.println(cnt);
    }
}