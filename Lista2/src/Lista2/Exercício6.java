package Lista2;

import javax.swing.JOptionPane;

// Uma empresa deseja saber alguns dados sobre suas vendas no passado. Faça um programa que armazene em um vetor o valor
// total das vendas de cada um dos 12 meses do ano (que deverá ser informado pelo usuário) e mostre:
// - O mês com a maior venda;
// - O mês com a menor venda;
// - A média das vendas do ano todo;
// - A média das vendas dos meses pares;
// - A média das vendas do 2º semestre.

public class Exercício6 {

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
					.parseInt(JOptionPane.showInputDialog("Informe a venda do " + (i + 1) + "° mês deste ano: "));
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
		
		JOptionPane.showMessageDialog(null, maiorVenda, "Mês com maior venda:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mediaAnual, "Média de vendas do ano todo:",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mediaPares, "Média dos meses pares:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mediaSegundo, "Média do segundo semestre:", JOptionPane.INFORMATION_MESSAGE);
	}
}
