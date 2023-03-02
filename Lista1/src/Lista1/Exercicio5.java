package Lista1;

import javax.swing.JOptionPane;

// Faça um algoritmo que peça ao usuário 10 números e mostre posteriormente quantos são pares
// e a soma deles, bem como quantos são ímpares e a soma deles.

public class Exercicio5 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		for (int i = 0; i < 10; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "° número:"));
		}

		int somaPares = 0;
		for (int i = 0; i < 10; i++) {
			if ((nums[i] % 2) == 0) {
				somaPares = somaPares + nums[i];
			}
		}

		int somaImpares = 0;
		for (int i = 0; i < 10; i++) {
			if ((nums[i] % 2) == 1) {
				somaImpares = somaImpares + nums[i];
			}
		}

		int qtdPares = 0;
		for (int i = 0; i < 10; i++) {
			if ((nums[i] % 2) == 0) {
				qtdPares = qtdPares + 1;
			}
		}

		int qtdImpares = 0;
		for (int i = 0; i < 10; i++) {
			if ((nums[i] % 2) == 1) {
				qtdImpares = qtdImpares + 1;
			}
		}

		JOptionPane.showMessageDialog(null, somaPares, "Soma dos valores pares:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, qtdPares, "Quantidade de valores pares:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, somaImpares, "Soma dos valores impares:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, qtdImpares, "Quantidade de valores impares:",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
