import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private StringTokenizer st;
	
    public static void main(String[] args) throws IOException {
    	new Main().sort();
	}
    
    public void sort() throws IOException {
    	int N = Integer.parseInt(br.readLine());
    	Person[] pArr = new Person[N];
    	
    	for(int i = 0; i < N; i++) {
    		st = new StringTokenizer(br.readLine());
    		int age = Integer.parseInt(st.nextToken());
    		String name = st.nextToken();
    		
    		pArr[i] = new Person(age, name);
    	}
    	Arrays.sort(pArr);
    	
    	for(Person p : pArr) {
    		bw.write(p.toString());
    		bw.newLine();
    	}
    	bw.flush();
    	bw.close();
    	
    }
    
    class Person implements Comparable<Person>{
    	private int age;
    	private String name;
    	
		public Person(int age, String name) {
			this.age = age;
			this.name = name;
		}
		
		public int getAge() {
			return age;
		}
		@Override
		public String toString() {
			return age + " " + name;
		}
    	
		@Override
		public int compareTo(Person o) {
			return Integer.compare(age, o.getAge());
		}
    	
    }
}
