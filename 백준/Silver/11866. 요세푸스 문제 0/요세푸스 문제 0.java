import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);  // 사람 수
        int K = Integer.parseInt(input[1]);  // 제거할 순서
        
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {  // 1부터 N까지 큐에 추가
            queue.add(i);
        }

        sb.append("<");
        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {  // K-1번째까지 앞으로 이동
                queue.addLast(queue.pollFirst());
            }
            sb.append(queue.pollFirst());  // K번째 사람 제거
            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");

        System.out.println(sb.toString());  // 결과 출력
    }
}