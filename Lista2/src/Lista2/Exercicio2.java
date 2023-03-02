package Lista2;

import javax.swing.JOptionPane;

// Escreva um programa que receba quatro notas do aluno e as insira em um vetor. Depois,
// calcule a média aritmética entre as quatro notas e mostre o "conceito" do aluno conforme as instruções: 
// ● 9.0 ou maior = Conceito A
// ● entre 8.0 e 8.9 = Conceito B
// ● entre 7.0 e 7.9 = Conceito C
// ● menor que 7.0 = Conceito D

public class Exercicio2 {

	public static void main(String[] args) {

		int[] valores = new int[4];
		for (int i = 0; i < 4; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + "° valor: "));

		}

		int soma = 0;
		for (int i = 0; i < 4; i++) {
			soma = soma + valores[i];

		}

		int media = 0;
		for (int i = 0; i < 4; i++) {
			media = (soma / 4);

		}

		if (media >= 9) {
			JOptionPane.showMessageDialog(null, "Conceito A");

		}else if ((media >= 8)&&(media <=8.9)){
			JOptionPane.showMessageDialog(null, "Conceito B");
			
		}else if ((media >= 7)&&(media <=7.9)){
			JOptionPane.showMessageDialog(null, "Conceito C");
			
		}else if (media < 7){
			JOptionPane.showMessageDialog(null, "Conceito D");
			
		}
	}

}
