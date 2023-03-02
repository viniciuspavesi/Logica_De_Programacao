package Lista1;

import javax.swing.JOptionPane;

// Desenvolva um programa que pergunte qual é a maioridade civil do seu “estado/país” e que
// posteriormente o usuário informe sua idade. Como resultado, o programa deve informar se
// ele é ou não maior de idade.

public class Exercicio2 {

	public static void main(String[] args) {

		int maioridade = 0;
		int idade = 0;
		
		maioridade = Integer
				.parseInt(JOptionPane.showInputDialog("Por favor informe a maioridade civil do seu estado/país: "));

		idade = Integer.parseInt(JOptionPane.showInputDialog("Por favor informe sua idade: "));

		for (int x = 0; x < 1; x++) {
			if (idade > maioridade) {
				JOptionPane.showMessageDialog(null, "Você é maior de idade!");
			} else {
				JOptionPane.showMessageDialog(null, "Você é menor de idade!");
			}
		}
	}
}