package Lista2;

import javax.swing.JOptionPane;

// Escreva um programa que leia um n�mero inteiro e apresente um menu para o usu�rio escolher:
// 1. Verificar se o n�mero � m�ltiplo de algum outro n�mero (pedir ao usu�rio esse n�mero);
// 2. Verificar se o n�mero � par;
// 3. Verificar se o n�mero est� entre 0 e 1000;
// 4. Sair
// Ap�s as entradas de dados, deve ser mostrado ao usu�rio o resultado da respectiva op��o escolhida,
// e novamente o menu. Para a op��o �4- Sair�, utilize System.exit(0);

public class Exercicio3 {

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero inteiro: "));

		int opcao = Integer.parseInt(JOptionPane.showInputDialog(
				"O que voc� deseja verificar ?" + "\n 1 - Verificar se o n�mero � m�ltiplo de algum outro n�mero."
						+ "\n 2 - Verificar se o n�mero � par." + "\n 3 - Verificar se o n�mero est� entre 0 e 1000"
						+ "\n 4 - Sair"));

		switch (opcao) {

		case 1:
			int multiplo = Integer.parseInt(JOptionPane.showInputDialog("Informe o outro n�mero: "));
			if ((multiplo / num) > 1) {
				JOptionPane.showMessageDialog(null, "N�mero � m�ltiplo deste segundo n�mero!");
			} else {
				JOptionPane.showMessageDialog(null, "N�mero N�O � m�ltiplo deste segundo n�mero!");
			}
			break;

		case 2:
			if (num % 2 == 0) {
				JOptionPane.showMessageDialog(null, "Este n�mero � par!");
			} else {
				JOptionPane.showMessageDialog(null, "Este n�mero N�O � par!");
			}
			break;

		case 3:
			if ((num >= 0) && (num <= 1000)) {
				JOptionPane.showMessageDialog(null, "Este n�mero est� entre 0 e 1000!");
			} else {
				JOptionPane.showMessageDialog(null, "Este n�mero N�O est� entre 0 e 1000!");
			}
			break;
			
		case 4:
			System.exit(0);
			
		}

	}
}
