package br.com.fiap;

import javax.swing.JOptionPane;

public class ATV4 {
	public static void main(String[] args) {
		int ano1 = 0, ano = 0;
		String aux;
		try {
			
			aux = JOptionPane.showInputDialog("Digite o seu ano de nacimento ");
			ano1 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite o ano atual ");
			ano = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null,
					"Ano de nacimento " + ano1 + "\nAno Atual " + ano + "\nSua idade é " + (ano - ano1));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "formato incorreto");
		}
			
		
	
	
	}
}
