package ListaM�todos;

import javax.swing.JOptionPane;

// Fa�a um programa que solicite o ano de nascimento de um usu�rio e seja mostrada a sua idade em 2021.
// N�o � necess�rio considerar se o usu�rio j� fez ou n�o anivers�rio. Um m�todo deve ser criado para
// solicitar o ano de nascimento ao usu�rio e retorn�-lo, e outro m�todo deve ser criado para receber
// o ano de nascimento, calcular a idade atual e mostr�-la.


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

		JOptionPane.showMessageDialog(null, idadeAtual, "Sua idade em 2021 �:", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
