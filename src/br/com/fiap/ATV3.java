package br.com.fiap;

import java.util.Scanner;

public class ATV3 {
public static void main(String[] args) {
	int ano = 0, ano1 = 0;
	Scanner scan;
	try {
		scan = new Scanner(System.in);
		System.out.println("Digite o seu ano de nacimento ");
		ano = scan.nextInt();
		System.out.println("Digite o ano atual ");
		ano1 = scan.nextInt();
		System.out.println("Sua idade é " + (ano1 - ano));
		
		
	} catch (Exception e) {
		System.out.println("Formato incorreto");
	}
	
}
}
