package Lista1;

import javax.swing.JOptionPane;

// Faça uma solução que alimente um vetor com 10 valores inteiros e também que solicite ao
// usuário a entrada de dados de um valor inteiro qualquer. A solução deverá fazer uma busca do
// valor, informado pelo usuário, no vetor e imprima a posição em que este foi encontrado ou se não foi encontrado.

public class Exercicio7 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		boolean continuar = false;
		String resp = "";
		for (int i = 0; i < 10; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "° número:"));

		}

		do {
			int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Informe o número que você deseja pesquisar:"));

			int resultado = 0;
			for (int i = 0; i < 10; i++) {
				if (pesquisa == nums[i]) {
					resultado = i + 1;
				}
			}

			if (resultado == 0) {
				JOptionPane.showMessageDialog(null, "A posição não foi encontrada!");
			} else {
				JOptionPane.showMessageDialog(null, resultado, "A posição deste número é:",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
			resp = JOptionPane.showInputDialog("Deseja realizar outra operação ?"
					+ "\n Digite S para sim ou outro caractere para encerrar o programa:");
			
			if (resp.equalsIgnoreCase("s")) {
				continuar = true;
			}
			
		} while (continuar);
		
	}
}
