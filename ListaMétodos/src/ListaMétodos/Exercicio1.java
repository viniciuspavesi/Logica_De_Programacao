package ListaMétodos;

import javax.swing.JOptionPane;

// Faça um programa que solicite o ano de nascimento de um usuário e seja mostrada a sua idade em 2021.
// Não é necessário considerar se o usuário já fez ou não aniversário. Um método deve ser criado para
// solicitar o ano de nascimento ao usuário e retorná-lo, e outro método deve ser criado para receber
// o ano de nascimento, calcular a idade atual e mostrá-la.


public class Exercicio1 {

	public static void main(String[] args) {
		
		int anoNasc = solicitarAno();
		calcularIdade(anoNasc);
	}
	
	public static int solicitarAno () {
		
		int anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu nascimento:"));
		
		return anoNasc;
	}
	
	public static void calcularIdade (int anoNasc) {
		
		int ano = 2021;
		
		int idadeAtual = ano - anoNasc;

		JOptionPane.showMessageDialog(null, idadeAtual, "Sua idade em 2021 é:", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
