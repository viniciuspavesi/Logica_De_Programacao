package Lista2;

import javax.swing.JOptionPane;

// Faça um programa que receba um vetor de valores e mostre a quantidade de valores negativos.
// Os valores e o tamanho do vetor devem ser informados pelo usuário.

public class Exercicio1 {

	public static void main(String[] args) {
		
		int qtdValores = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de valores que você quer : "));
		
		int[] valores= new int[qtdValores];
		for (int i=0; i<qtdValores; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"° valor: "));

		}
		
		int valoresNegativos = 0;
		for (int i=0; i<qtdValores; i++) {
			if (valores[i]<0) {
				if (valoresNegativos!=0) {
					valoresNegativos += 0;
				}
				valoresNegativos = i + 1;
	}
}
		JOptionPane.showMessageDialog(null, valoresNegativos, "Quantidade de valores negativos:", JOptionPane.INFORMATION_MESSAGE);
	}
}

