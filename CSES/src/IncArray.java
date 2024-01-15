import java.io.*;
import java.util.*;
public class IncArray {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt((in.readLine()));
			
			if(n == 1) System.out.print(0);
			else {
				StringTokenizer st = new StringTokenizer(in.readLine());
				int prev = Integer.parseInt(st.nextToken());
				int cur = Integer.parseInt(st.nextToken());
				long ans = 0;
				
				while(st.hasMoreTokens()) {
					if(cur < prev) {
						ans+= prev-cur;
						
					}
					else {
						prev = cur;
					}
					cur = Integer.parseInt(st.nextToken());
					
				}
				System.out.print(ans + (prev-cur));
			}	
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
