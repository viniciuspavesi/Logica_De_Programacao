package Lista2;

import javax.swing.JOptionPane;

// Sabe-se que o lat�o � constitu�do de 70% de cobre e 30% de zinco. Fa�a um programa que permita
// ao usu�rio informar uma quantidade de lat�o em quilos e forne�a o total de cobre e zinco necess�rios
// para fabricar essa quantidade.

public class Exercicio4 {

	public static void main(String[] args) {

		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de lat�o em quilos: "));

		int qtdeCobre = (qtde / 100) * 70;
		int qtdeZinco = (qtde / 100) * 30;

		JOptionPane.showMessageDialog(null, qtdeCobre, "Quantidade de Cobre necess�ria:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, qtdeZinco, "Quantidade de Zinco necess�ria:", JOptionPane.INFORMATION_MESSAGE);
	}
}