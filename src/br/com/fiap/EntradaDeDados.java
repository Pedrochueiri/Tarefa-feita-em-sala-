package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String[] args) {
		
		int num1 = 0, num2 = 0;
		Scanner scan;
		try {
			scan = new Scanner(System.in);
			System.out.println("Digite um N�mero ");
			num1 = scan.nextInt();
			System.out.println("Digite outro N�mero ");
			num2 = scan.nextInt();
			System.out.println("Soma:" + (num1 + num2));
			
		} catch (Exception e) {
			System.out.println("Formato N�merico incorreto");
			
		}

	}
}
