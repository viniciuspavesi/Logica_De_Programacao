package Lista1;

import javax.swing.JOptionPane;

// Fa�a um programa que pe�a ao usu�rio para informar 03 n�meros e mostre o menor entre eles.
// Considere que o usu�rio n�o poder� informar n�meros iguais.

public class Exerc�cio3 {

	public static void main(String[] args) {

		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor informe o primeiro valor:"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor informe o segundo valor:"));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Por favor informe o terceiro valor:"));

		if ((num1 < num2) && (num1 < num3)) {
			JOptionPane.showMessageDialog(null, num1, "O menor valor:", JOptionPane.INFORMATION_MESSAGE);
		} else if (num2 < num3) {
			JOptionPane.showMessageDialog(null, num2, "O menor valor:", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, num3, "O menor valor:", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
