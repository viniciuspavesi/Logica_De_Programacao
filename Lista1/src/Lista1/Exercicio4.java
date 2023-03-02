package Lista1;

import javax.swing.JOptionPane;

// Faça um algoritmo que mostre a soma de todos os valores pares entre o intervalo de dois
// números digitados pelo usuário.

public class Exercicio4 {

	public static void main(String[] args) {

		int[] nums = new int[2];
		for (int i = 0; i < 2; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "° número:"));
		}

		int soma = 0;
		for (int i = nums[0]; i <= nums[1]; i++) {
			if (i % 2 == 0) {
				soma = soma + i;
			}
		}
		JOptionPane.showMessageDialog(null, soma, "Soma dos valores pares:", JOptionPane.INFORMATION_MESSAGE);

	}
}