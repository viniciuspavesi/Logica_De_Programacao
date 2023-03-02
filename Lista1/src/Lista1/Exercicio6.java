package Lista1;

import javax.swing.JOptionPane;

// Crie uma calculadora que permita o c�lculo de uma equa��o, sem limite de execu��es definido,
// da seguinte maneira:
// 1. Pe�a o primeiro valor ,
// 2. Pe�a o c�lculo que deseja fazer (entre as 4 opera��es b�sicas),
// 3. Pe�a um segundo valor 
// 4. Efetue o c�lculo,
// 5. Pe�a se o usu�rio quer continuar calculando. Se ele responder que sim, volte para o passo 2
// usando o resultado do c�lculo da linha 4 como primeiro valor, e se disser que n�o, mostre o resultado final . 
// Exemplo de uso para o algoritmo: 4 + 3 = 7 x 4 = 28 / 14 = 2.

public class Exercicio6 {

	public static void main(String[] args) {

		int primeiroValor = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro valor:"));

		String rep;

		do {

			int operacao = Integer.parseInt(JOptionPane.showInputDialog("Informe qual opera��o voc� deseja fazer:"
					+ "\n 1 - Soma" + "\n 2 - Subtra��o" + "\n 3 - Multiplica��o" + "\n 4 - Divis�o"));

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
					JOptionPane.showMessageDialog(null, "O divisor n�o pode ser 0");
				} else {
					resp = (primeiroValor / segundoValor);
					JOptionPane.showMessageDialog(null, resp, "Soma dos valores pares:",
							JOptionPane.INFORMATION_MESSAGE);
					primeiroValor = resp;
				}

				break;

			default:
				JOptionPane.showMessageDialog(null, "Opera��o inv�lida");
				break;
			}

			rep = JOptionPane.showInputDialog("Deseja realizar outra opera��o ?"
					+ "\n Digite S para sim ou outro caractere para encerrar o programa:");

		} while (rep.equalsIgnoreCase("s"));
	}
}
