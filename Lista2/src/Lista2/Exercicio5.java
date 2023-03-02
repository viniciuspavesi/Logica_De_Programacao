package Lista2;

import javax.swing.JOptionPane;

// Faça um programa que solicite alguns dados dos usuários que frequentam um clube. O programa
// deve solicitar a idade, se a pessoa é fumante ou não (1- SIM, 2- NÃO), seu salário liquído e
// há quanto tempo frequenta o clube (em meses). O usuário deverá digitar "encerrar" quando não
// tiver mais pessoas para registrar. 
// Como dados de saída, o programa deve exibir:
// - A média das idades das pessoas;
// - A média salarial das pessoas;
// - Quantos são fumantes e quantos não são fumantes;
// - A porcentagem de pessoas que frequentam o clube há mais de 03 meses. 

public class Exercicio5 {

	public static void main(String[] args) {

		String resp;

		int mediaIdade = 0;
		int somaIdade = 0;
		int contador = 0;
		double mediaSalario = 0;
		double somaSalario = 0;
		int fumaSim = 0;
		int fumaNao = 0;
		double qtdPessoas = 0;
		double porc = 0;

		do {

			int[] idade = new int[1];
			for (int i = 0; i < 1; i++) {
				idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
				somaIdade = somaIdade + idade[i];
				
			}

			int[] fumante = new int[1];
			for (int i = 0; i < 1; i++) {
				fumante[i] = Integer
						.parseInt(JOptionPane.showInputDialog("Você fuma ? " + "\n 1 - SIM" + "\n 2 - NÃO"));
				
				switch (fumante[i]){
				
				case 1:
				fumaSim = fumaSim + 1;
				break;
				
				case 2:
				fumaNao = fumaNao + 1;	
				}

			}

			int[] salario = new int[1];
			for (int i = 0; i < 1; i++) {
				salario[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe seu salário liquído: "));
				somaSalario = somaSalario + salario[i];

			}

			int[] tempo = new int[1];
			for (int i = 0; i < 1; i++) {
				tempo[i] = Integer
						.parseInt(JOptionPane.showInputDialog("Informe quantos meses você frequenta o clube: "));
				if (tempo[i] >=3) {
				qtdPessoas = qtdPessoas + 1;
				}
					
			}

			contador = contador + 1;
			resp = JOptionPane.showInputDialog("Existem mais pesssoas para se registrar ?");

		} while (!resp.equalsIgnoreCase("encerrar"));

		mediaIdade = (somaIdade / contador);
		mediaSalario = (somaSalario / contador);
		porc = (qtdPessoas / contador) * 100;
		
		JOptionPane.showMessageDialog(null, mediaIdade, "Média das idades:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, mediaSalario, "Média Salarial das Pessoas:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, fumaNao, "Quantidade de pessoas não fumantes:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, fumaSim, "Quantidade de pessoas fumantes:", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, porc, "Porcentagem de pessoas que frequentam o clube há mais de 03 meses:", JOptionPane.INFORMATION_MESSAGE);
	}

}
