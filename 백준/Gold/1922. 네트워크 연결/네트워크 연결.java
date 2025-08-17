import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

class Edge{
	int a,b,c;
	public Edge(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
}
public class Main {
	static int N,M;
	static int[] parent;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		M=Integer.parseInt(br.readLine());
		
		ArrayList<Edge> edge=new ArrayList<>();
		long ans=0;
		
		for(int i=0; i<M; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x=Integer.parseInt(st.nextToken());
			int y=Integer.parseInt(st.nextToken());
			int z=Integer.parseInt(st.nextToken());
			
			edge.add(new Edge(x,y,z));
		}
		
		Collections.sort(edge, new Comparator<Edge>() {

			@Override
			public int compare(Edge o1, Edge o2) {
				// TODO Auto-generated method stub
				return o1.c - o2.c;
			}
		});
		
		parent = new int[N+1];
		for(int i=1; i<=N; i++){
			parent[i]=i;
		}
		
		for(Edge e: edge){
			int a = find(e.a);
			int b = find(e.b);
			
			if(a!=b) {		
				parent[b]=a; //유니온 해준다. 부모가 같지 않으면 연결~
			
				ans+=e.c;
			}
		}
		
		System.out.println(ans);
	}
	private static int find(int a) {
		if(parent[a]==a)
			return a;
		return parent[a]=find(parent[a]);
	}

}
