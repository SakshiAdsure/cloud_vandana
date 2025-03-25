package com.string.program;

import java.util.Arrays;
import java.util.Scanner;

public class STring_Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter first string :");
		String str1=sc.nextLine();
		System.out.println("Enter second string :");
		String str2 = sc.nextLine();
		
		char x[] = str1.toCharArray();
		char y[] = str2.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		Boolean result = Arrays.equals(x, y);
		
		if(result == true) {
			System.out.println("String are anagram");
		} else {
			System.out.println("String are not anagram");
		}

	}

}
