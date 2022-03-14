package br.com.fiap;

import java.util.Scanner;

public class ATV5 {
public static void main(String[] args) {
	final float PI = 3.14f;
	double raio = 0;
	Scanner scan;
	try {
		scan = new Scanner(System.in);
		System.out.println("Digite o Raio do Circulo ");
		raio = scan.nextDouble();
		System.out.println("O Valor de PI é " + PI + "\n Valor do raio " + raio + "\nA Area do circulo é " + (PI * (raio * raio)));
		
		
	} catch (Exception e) {
		System.out.println("Formato incorreto");
	}
}
	
}
