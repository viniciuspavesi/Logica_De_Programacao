package Lista1;

import javax.swing.JOptionPane;

// Fa�a uma solu��o que alimente um vetor com 10 valores inteiros e tamb�m que solicite ao
// usu�rio a entrada de dados de um valor inteiro qualquer. A solu��o dever� fazer uma busca do
// valor, informado pelo usu�rio, no vetor e imprima a posi��o em que este foi encontrado ou se n�o foi encontrado.

public class Exercicio7 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		boolean continuar = false;
		String resp = "";
		for (int i = 0; i < 10; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "� n�mero:"));

		}

		do {
			int pesquisa = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero que voc� deseja pesquisar:"));

			int resultado = 0;
			for (int i = 0; i < 10; i++) {
				if (pesquisa == nums[i]) {
					resultado = i + 1;
				}
			}

			if (resultado == 0) {
				JOptionPane.showMessageDialog(null, "A posi��o n�o foi encontrada!");
			} else {
				JOptionPane.showMessageDialog(null, resultado, "A posi��o deste n�mero �:",
						JOptionPane.INFORMATION_MESSAGE);
			}
			
			resp = JOptionPane.showInputDialog("Deseja realizar outra opera��o ?"
					+ "\n Digite S para sim ou outro caractere para encerrar o programa:");
			
			if (resp.equalsIgnoreCase("s")) {
				continuar = true;
			}
			
		} while (continuar);
		
	}
}
