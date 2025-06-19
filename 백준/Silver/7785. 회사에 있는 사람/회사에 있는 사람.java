import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {
	private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private StringTokenizer st;
	
    public static void main(String[] args) throws IOException {
    	new Main().map();
	}
    
    public void map() throws IOException {
    	int N = Integer.parseInt(br.readLine());
    	Map<String, String> map = new HashMap<String, String>();
    	
    	for(int i = 0; i < N; i++ ) {
    		st = new StringTokenizer(br.readLine());
    		map.put(st.nextToken(), st.nextToken());
    	}
    	
    	List<String> list = new ArrayList<String>();
    	
    	Iterator<String> it = map.keySet().iterator();
    	while(it.hasNext()) {
    		String key = it.next();
    		if(map.get(key).equals("enter")) {
    			list.add(key);
    		}
    	}
    	
    	Collections.sort(list, new Comparator<String>() {
    		@Override
    		public int compare(String o1, String o2) {
    			return o1.compareTo(o2) * -1;
    		}
		});
    	
    	for(String str : list) {
    		bw.write(str);
    		bw.newLine();
    	}
    	bw.flush();
    	bw.close();
    }

}