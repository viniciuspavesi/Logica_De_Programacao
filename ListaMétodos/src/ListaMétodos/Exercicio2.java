package ListaM?todos;

import javax.swing.JOptionPane;

// Fa?a um programa que receba as tr?s notas de um aluno e pergunte ao professor qual m?dia
// ele deseja calcular: aritm?tica ou ponderada. Se for a m?dia ponderada, os pesos de cada
// nota devem ser informados.
// - Cada m?dia dever? ser calculada por um m?todo;
// - Os dois m?todos devem receber como par?metros as notas;
// - No caso do m?todo da m?dia ponderada, al?m das notas, o m?todo dever? receber tamb?m os
// pesos, que devem ser previamente solicitados ao usu?rio;
// - Os dois m?todos devem retornar a m?dia;
// - Um m?todo deve ser criado para receber a m?dia final e mostrar se o aluno est? aprovado
// ou reprovado, considerando que a m?dia m?nima para aprova??o ? 7.


public class Exercicio2 {

	public static void main(String[] args) {
	
		
		double[] notas = new double[3];
		for (int i = 0; i < 3; i++) {
			notas[i] = Integer
					.parseInt(JOptionPane.showInputDialog("Informe a " + (i + 1) + "? nota do aluno: "));
		}
		
		int tipoMedia = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de m?dia desejada: "
				+ "\n 1- Aritm?tica"
				+ "\n 2- Ponderada"));
		
		for (int i = 0; i < 3; i++) {
		while ((tipoMedia != 1) && (tipoMedia != 2)){
			tipoMedia = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de m?dia desejada: "
					+ "\n 1- Aritm?tica"
					+ "\n 2- Ponderada"));
			}
		}
		
		switch (tipoMedia) {
		
		case 1:
			double media = calcularAritmetica(notas);
			mostrarMedia(media);
		break;
		case 2:
			double[] pesos = new double[3];
			for (int c = 0; c < 3; c++) {
			pesos[c] = Integer.parseInt(JOptionPane.showInputDialog("Informe o peso da " + (c+ 1) + "? nota do aluno: "));
			}
			media = calcularPonderada(notas, pesos);
			mostrarMedia(media);
		break;
			}
		}
	
		
	public static double calcularAritmetica (double [] notas) {
		
		double media = (notas[0] + notas[1] + notas [2]) / 3;
			
		return media;
	}
	
	public static double calcularPonderada (double [] notas, double [] pesos) {
		
		double media = ((notas[0]*pesos[0]) + (notas[1]*pesos[1]) + (notas[2]*pesos[2])) / (pesos[0] + pesos[1] + pesos[2]);
		
		return media;
	}
	
	public static void mostrarMedia (double media) {
		
		if (media > 7) {
		JOptionPane.showMessageDialog(null, "Parab?ns voc? foi aprovado!");
		}else{
		JOptionPane.showMessageDialog(null, "Sua m?dia foi abaixo de 7, voc? foi reprovado!");
		}
	}
}
	

