package ListaMétodos;

import javax.swing.JOptionPane;

// Faça um programa que a partir do valor de uma compra, faça o cálculo de um desconto para o usuário. O programa deve solicitar
// o valor total da compra por meio de um método, que deverá retorná-lo. Um método deve ser criado para receber o valor da compra
// e mostrar o valor final com desconto, considerando:
//
// - Até R$100 - sem desconto, o valor permanece o mesmo
// - De R$100,01 a R$200 - desconto de 20%
// - Acima de R$200 - desconto de 30%



public class Exercicio3 {
		
	public static void main(String[] args) {
		
		double valor = valorTotal();
		valorFinal(valor);
	
	}
	
	public static double valorTotal () {
		
		double valor = Integer.parseInt(JOptionPane.showInputDialog("Por favor informe o valor total da compra:"));
		
		return valor;
		
	}
	
	public static void valorFinal (double valorTotal) {
		
		if(valorTotal<=100){
			double desc = 0;
			valorTotal = valorTotal - desc;
		}else if(valorTotal>200){
			double desc = (valorTotal/100) * 30;
			valorTotal = valorTotal - desc;
		}else{
			double desc = (valorTotal/100) * 20;
			valorTotal = valorTotal - desc;
		}
		
		JOptionPane.showMessageDialog(null, valorTotal, "O valor da sua compra é de:", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
}
