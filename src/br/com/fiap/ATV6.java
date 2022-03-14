package br.com.fiap;

import javax.swing.JOptionPane;

public class ATV6 {
public static void main(String[] args) {
	 final float PI = 3.14f;
	 double raio = 0;
	 String aux;
	 try {
		
		 aux = JOptionPane.showInputDialog("Digite o Numero do Raio ");
		 JOptionPane.showMessageDialog(null, "O valor de PI é " + PI + "\nA Area do Circulo é "
				 + (PI * (raio * raio)));
		
		 
	} catch (Exception e) {
		JOptionPane.showMessageDialog(null, "formato incorreto");	}
	 
	 
}
}
