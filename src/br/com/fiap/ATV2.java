package br.com.fiap;

import java.util.Scanner;

public class ATV2 {
public static void main(String[] args) {
	
	float p1 = 0, p2 = 0, p3 = 0, p4 = 0;
	Scanner scan;
	try {
		scan = new Scanner(System.in);
		System.out.println("Digite a p1: ");
		p1 = scan.nextInt();
		System.out.println("Digite a p2: ");
		p2 = scan.nextInt();
		System.out.println("Digite a p3: ");
		p3 = scan.nextInt();
		System.out.println("Digite a p4: ");
		p4 = scan.nextInt();
		System.out.println("Media" + (p1 + p2 + p3 + p4)/4);		
		
	} catch (Exception e) {
		System.out.println("Formato Númerico incoreto");
	}
	
}
}
