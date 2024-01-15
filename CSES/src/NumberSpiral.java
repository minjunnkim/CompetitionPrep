import java.io.*;
import java.util.*;
public class NumberSpiral {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(in.readLine());
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine());
				long y = Long.parseLong(st.nextToken());
				long x = Long.parseLong(st.nextToken());
				long temp = Math.max(x, y);
				long ans = 0;
				
				
				if(x == y) {
					sb.append((long)Math.pow(x, 2)-(x-1)).append("\n");
				}
				else if(temp % 2 == 0) {
					if(x > y) {
						ans = (temp*temp-(temp-1));
						ans -= (temp-y);
						sb.append(ans).append("\n");
					}
					else {
						ans = (temp*temp-(temp-1));
						ans += (temp-x);
						sb.append(ans).append("\n");
					}
				}
				else {
					if(x > y) {
						ans = (temp*temp-(temp-1));
						ans += (temp-y);
						sb.append(ans).append("\n");
					}
					else {
						ans = (temp*temp-(temp-1));
						ans -= (temp-x);
						sb.append(ans).append("\n");
					
					}
				}
				
			}
			System.out.println(sb.toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}

//n^2-(n-1)
