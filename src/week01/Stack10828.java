package week01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Stack10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Integer> stack = new Stack<Integer>();
		int num = Integer.parseInt(br.readLine());
		while( num != 0) {
			num--;
			String com = br.readLine();
			StringTokenizer st = new StringTokenizer(com);
			switch (st.nextToken()) {
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if (stack.empty()) {
				bw.write("-1\n");	
				
				}else {
					bw.write(stack.pop()+"\n");;
				}
				break;
			case "size":
				bw.write(stack.size()+"\n");
				break;
			case "empty":
				if(stack.empty()) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
				break;
			case "top":
				if (stack.empty()) {
				bw.write("-1\n");	
				}else {
					bw.write(stack.get(stack.size()-1)+"\n");;
				}
				break;
			default:
				break;
			}
			bw.flush();
		}
	}
}
