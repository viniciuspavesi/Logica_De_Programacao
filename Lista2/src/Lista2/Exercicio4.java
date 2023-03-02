package Lista2;

import javax.swing.JOptionPane;

// Sabe-se que o latão é constituído de 70% de cobre e 30% de zinco. Faça um programa que permita
// ao usuário informar uma quantidade de latão em quilos e forneça o total de cobre e zinco necessários
// para fabricar essa quantidade.

public class Exercicio4 {

	public static void main(String[] args) {

		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de latão em quilos: "));

		int qtdeCobre = (qtde / 100) * 70;
		int qtdeZinco = (qtde / 100) * 30;

		JOptionPane.showMessageDialog(null, qtdeCobre, "Quantidade de Cobre necessária:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, qtdeZinco, "Quantidade de Zinco necessária:", JOptionPane.INFORMATION_MESSAGE);
	}
}