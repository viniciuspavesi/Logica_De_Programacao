package Lista1;

import javax.swing.JOptionPane;

// Fa�a um algoritmo que pe�a para o usu�rio inserir uma quantidade em horas,
// outra em minutos e mais uma em segundos e mostre quantos segundos esse hor�rio cont�m.

public class Exercicio1 {

	public static void main(String[] args) {
		
		int horas=0;
			horas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas: "));
		
		int minutos=0;
			minutos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de minutos: "));
			
		int segundos=0;
			segundos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de segundos: "));
		
		int total = (horas * 3600) + (minutos * 60) + (segundos);
		
		JOptionPane.showMessageDialog(null, total, ":", JOptionPane.INFORMATION_MESSAGE);
		
		}

	}

