package Lista2;

import javax.swing.JOptionPane;

// Escreva um programa que leia um número inteiro e apresente um menu para o usuário escolher:
// 1. Verificar se o número é múltiplo de algum outro número (pedir ao usuário esse número);
// 2. Verificar se o número é par;
// 3. Verificar se o número está entre 0 e 1000;
// 4. Sair
// Após as entradas de dados, deve ser mostrado ao usuário o resultado da respectiva opção escolhida,
// e novamente o menu. Para a opção “4- Sair”, utilize System.exit(0);

public class Exercicio3 {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));

		int opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"O que você deseja verificar ?" + "\n 1 - Verificar se o número é múltiplo de algum outro número."
						+ "\n 2 - Verificar se o número é par." + "\n 3 - Verificar se o número está entre 0 e 1000"
						+ "\n 4 - Sair"));

		switch (opcao) {

		case 1:
			int multiplo = Integer.parseInt(JOptionPane.showInputDialog("Informe o outro número: "));
			if ((multiplo / num) > 1) {
				JOptionPane.showMessageDialog(null, "Número é múltiplo deste segundo número!");
			} else {
				JOptionPane.showMessageDialog(null, "Número NÃO é múltiplo deste segundo número!");
			}
			break;

		case 2:
			if (num % 2 == 0) {
				JOptionPane.showMessageDialog(null, "Este número é par!");
			} else {
				JOptionPane.showMessageDialog(null, "Este número NÃO é par!");
			}
			break;

		case 3:
			if ((num >= 0) && (num <= 1000)) {
				JOptionPane.showMessageDialog(null, "Este número está entre 0 e 1000!");
			} else {
				JOptionPane.showMessageDialog(null, "Este número NÃO está entre 0 e 1000!");
			}
			break;
			
		case 4:
			System.exit(0);
			
		}

	}
}
