package com;

import java.io.*;
import java.util.*;

public class Main {

	static int ans = 0;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String T = br.readLine();
		
		dfs(S,T);
		
		System.out.println(ans);
	}

	private static void dfs(String s, String t) {
		if(s.length() == t.length()) {
			if(s.equals(t)) {
				ans = 1;
			}
			return;
		}
		if(t.charAt(0) == 'B') {//무조건 뒤집기
			String tmp = t.substring(1);
			StringBuilder sb = new StringBuilder(tmp);
			dfs(s, sb.reverse().toString());
		}
		if(t.charAt(t.length()-1) == 'A') {//A제거
			String tmp = t.substring(0,t.length()-1);
			StringBuilder sb = new StringBuilder(tmp);
			dfs(s, sb.toString());
		}
	}
	
}
