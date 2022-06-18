package week01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Stack9093 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		while (cnt-- != 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				
				String str = st.nextToken();
				String res = "";
				
				int length = str.length();
				
				while(--length != -1) {
					
					res = res.concat( str.substring(length));
					str = str.substring(0,length);
				}
				bw.write(res+" ");
			}
			bw.flush();
			
		}
		
	}
}
