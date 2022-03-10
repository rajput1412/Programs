package hello;

import java.util.Stack;

public class stack {
	public static void main(String []args) {
		
		
		Stack<Integer>s=new Stack<Integer>();
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		
	}

}
