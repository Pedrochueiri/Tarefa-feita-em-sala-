package br.com.fiap;

import javax.swing.JOptionPane;

public class ATV1 {
	public static void main(String[] args) {
		
		float p1 = 0, p2 = 0, p3 = 0, p4 = 0;
		String aux;
		try {
			aux = JOptionPane.showInputDialog("Digite a nota da p1 ");
			p1 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a nota da p2 ");
			p2 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a nota da p3 ");
			p3 = Integer.parseInt(aux);
			aux = JOptionPane.showInputDialog("Digite a nota da p4 ");
			p4 = Integer.parseInt(aux);
			JOptionPane.showMessageDialog(null,"p1:" + p1 + "\np2:" + p2 + "\np3:" + p3 + "\np4:" + p4 + "\nMedia = " +
					((p1 + p2 + p3 + p4)/4));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "formato de numero incorreto");		}
		
		
	}
}
