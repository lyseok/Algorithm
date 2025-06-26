import java.util.*;
import java.io.*;

public class Main {
    public static int n, m;
    public static int dx[]={0,0,1,-1};
    public static int dy[]={1,-1,0,0};
    public static int arr[][];
    public static boolean visited[];
    public static int answer;
    public static ArrayList<Node> home;
    public static ArrayList<Node> chicken;
    public static class Node{
        int x;
        int y;
        public Node(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr=new int[n][n];
        home=new ArrayList<>();
        chicken=new ArrayList<>();

        for(int i=0; i<n; i++){
            st=new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());

                if(arr[i][j] == 1){
                    home.add(new Node(i,j));
                }else if(arr[i][j] == 2){
                    chicken.add(new Node(i,j));
                }
            }
        }

        answer=Integer.MAX_VALUE;
        visited=new boolean[chicken.size()];

        solve(0,0);
        System.out.println(answer);
    }


    public static void solve(int x, int y) {
        if(y==m){
            int res=0;

            for(int i=0; i<home.size(); i++){
                int tmp=Integer.MAX_VALUE;
                
                for(int j=0; j<chicken.size(); j++){
                    if(visited[j]){
                        int dist=Math.abs(home.get(i).x - chicken.get(j).x)+
                                Math.abs(home.get(i).y - chicken.get(j).y);
                        tmp=Math.min(tmp,dist);
                    }
                }
                res+=tmp;
            }
            answer=Math.min(answer,res);
            return;
        }

        for(int i=x; i<chicken.size(); i++){
            visited[i]=true;
            solve(i+1, y+1);
            visited[i]=false;
        }
    }
}