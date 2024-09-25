package project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		int num = 0;
		
		for(int i =  0 ; i < word.length(); i++) {
			char a = word.charAt(i);
			if (a == 'a' || a == 'A') {
				num++;
			}
		}
		System.out.println("Possui: "+ num);
		
		
		sc.close();

	}

}
