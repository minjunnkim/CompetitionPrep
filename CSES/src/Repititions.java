import java.io.*;
import java.util.*;
public class Repititions {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			String s = in.readLine();
			
			char key = s.charAt(0);
			int ans = 0;
			int count = 0;
			
			for(int i = 0; i < s.length(); i++) {
				if(key == s.charAt(i)) count++;
				else {
					ans = Math.max(count, ans);
					key = s.charAt(i);
					count = 1;
				}
			}
			
			ans = Math.max(count,  ans);
			System.out.println(ans);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
