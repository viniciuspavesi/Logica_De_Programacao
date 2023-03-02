package Lista1;

import javax.swing.JOptionPane;

// Façã um programa que carregue os valores das vendas de uma loja no primeiro semestre do ano.
// Considere para tal uma matriz [6,4], sendo que sÃ£o 06 meses e 04 semanas por mês. Ao final, mostre na tela: 
// - Total de vendas do semestre
// - Total vendido em cada mês

public class Exercicio8 {

	public static void main(String[] args) {

		double soma = 0;
		double[][] semestres = new double[6][4];
		for (int a = 0; a < 6; a++) {
			double somaMes = 0;
			for (int b = 0; b < 4; b++) {
				semestres[a][b] = Double.parseDouble(JOptionPane.showInputDialog(
						"Informe o valor de vendas da " + (b + 1) + "° semana, no " + (a + 1) + "° mês:"));
				soma = soma + semestres[a][b];
				somaMes = somaMes + semestres[a][b];
			}
			JOptionPane.showMessageDialog(null, somaMes, "Soma deste mês foi:", JOptionPane.INFORMATION_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, soma, "Soma total do semestre foi:", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
