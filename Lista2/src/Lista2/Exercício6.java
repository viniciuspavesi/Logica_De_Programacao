package Lista2;

import javax.swing.JOptionPane;

// Uma empresa deseja saber alguns dados sobre suas vendas no passado. Fa�a um programa que armazene em um vetor o valor
// total das vendas de cada um dos 12 meses do ano (que dever� ser informado pelo usu�rio) e mostre:
// - O m�s com a maior venda;
// - O m�s com a menor venda;
// - A m�dia das vendas do ano todo;
// - A m�dia das vendas dos meses pares;
// - A m�dia das vendas do 2� semestre.

public class Exerc�cio6 {

	public static void main(String[] args) {

		double maiorVenda = 0;
		double somaAnual = 0;
		double somaPares = 0;
		double mediaAnual = 0;
		double mediaPares = 0;
		double somaPrimeiro = 0;
		double mediaSegundo = 0;
		
		double[] vendas = new double[12];
		for (int i = 0; i < 12; i++) {
			vendas[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Informe a venda do " + (i + 1) + "� m�s deste ano: "));
			somaAnual = somaAnual + vendas[i];
		}

		for (int i = 0; i < 12; i++) {
			if (vendas[i] > maiorVenda) {
				maiorVenda = i + 1;
			}
			if (vendas[i] % 2 == 0) {
				somaPares = somaPares + vendas[i];
				mediaPares = (somaPares / 6);
			}
		}
		
		for (int i = 0; i < 6; i++) {
			somaPrimeiro = somaPrimeiro + vendas[i];
			mediaSegundo = (somaAnual - somaPrimeiro) / 6;
		}
		
		mediaAnual = somaAnual / 12;
		
		JOptionPane.showMessageDialog(null, maiorVenda, "M�s com maior venda:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mediaAnual, "M�dia de vendas do ano todo:",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mediaPares, "M�dia dos meses pares:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mediaSegundo, "M�dia do segundo semestre:", JOptionPane.INFORMATION_MESSAGE);
	}
}
