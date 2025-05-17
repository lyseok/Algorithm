import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] score = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
        	score[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(score);
        int max = score[N-1];

        double sum = 0;
        
        for(int i = 0; i < N; i++) {
        	double result = score[i]/(double)max*100;
        	sum += result;
        }
        
        double avg = sum / (double)N;
        System.out.println(avg);

	}

}