package Lista1;

import javax.swing.JOptionPane;

// Crie uma calculadora que permita o cálculo de uma equação, sem limite de execuções definido,
// da seguinte maneira:
// 1. Peça o primeiro valor ,
// 2. Peça o cálculo que deseja fazer (entre as 4 operações básicas),
// 3. Peça um segundo valor 
// 4. Efetue o cálculo,
// 5. Peça se o usuário quer continuar calculando. Se ele responder que sim, volte para o passo 2
// usando o resultado do cálculo da linha 4 como primeiro valor, e se disser que não, mostre o resultado final . 
// Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.

public class Exercicio6 {

	public static void main(String[] args) {

		int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));

		String rep;

		do {

			int operacao = Integer.parseInt(JOptionPane.showInputDialog("Informe qual operação você deseja fazer:"
					+ "\n 1 - Soma" + "\n 2 - Subtração" + "\n 3 - Multiplicação" + "\n 4 - Divisão"));

			int segundoValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo valor:"));

			switch (operacao) {

			case 1:
				int resp = (primeiroValor + segundoValor);
				JOptionPane.showMessageDialog(null, resp, "Soma dos valores pares:", JOptionPane.INFORMATION_MESSAGE);
				primeiroValor = resp;
				break;

			case 2:
				resp = (primeiroValor - segundoValor);
				JOptionPane.showMessageDialog(null, resp, "Soma dos valores pares:", JOptionPane.INFORMATION_MESSAGE);
				primeiroValor = resp;
				break;

			case 3:
				resp = (primeiroValor * segundoValor);
				JOptionPane.showMessageDialog(null, resp, "Soma dos valores pares:", JOptionPane.INFORMATION_MESSAGE);
				primeiroValor = resp;
				break;

			case 4:

				if (segundoValor == 0) {
					JOptionPane.showMessageDialog(null, "O divisor não pode ser 0");
				} else {
					resp = (primeiroValor / segundoValor);
					JOptionPane.showMessageDialog(null, resp, "Soma dos valores pares:",
							JOptionPane.INFORMATION_MESSAGE);
					primeiroValor = resp;
				}

				break;

			default:
				JOptionPane.showMessageDialog(null, "Operação inválida");
				break;
			}

			rep = JOptionPane.showInputDialog("Deseja realizar outra operação ?"
					+ "\n Digite S para sim ou outro caractere para encerrar o programa:");

		} while (rep.equalsIgnoreCase("s"));
	}
}
