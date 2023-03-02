package Lista2;

import javax.swing.JOptionPane;

public class Exercício7 {
	
	public static void main(String[] args) {
		
		double[][] notas = new double[3][4];
		for (int i = 0; i < 3; i++) {
			for (int c = 0; c < 4; c++) {
		notas[i][c] = Integer.parseInt(JOptionPane.showInputDialog("Informe a nota : "));
		
			}
		}
	}
}
