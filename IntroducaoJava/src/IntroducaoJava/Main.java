package IntroducaoJava;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		int[] valores= new int[10];
		for (int i=0; i<10; i++) {
			valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"� valor: "));
			while (valores[i] < 0) {
				valores[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+"� valor: "));
			}
		}
		
		String repetir;
		
		do {
			
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("O que voc� deseja ver ?"
					+ "\n 1 - Todos os valores"
					+ "\n 2 - Somente o primeiro valor"
					+ "\n 3 - Somente o �ltimo valor"
					+ "\n 4 - Ver os valores pares"
					+ "\n 5 - O valor mais alto"));
			
			switch (opcao) {
			
			case 1:
				for (int i=0; i<10; i++) {
					JOptionPane.showMessageDialog(null, valores[i], "Valor "+ (i+1), JOptionPane.INFORMATION_MESSAGE);	
				}
			break;
			
			case 2: 
				JOptionPane.showMessageDialog(null, valores[0], "Primeiro valor ", JOptionPane.INFORMATION_MESSAGE);
			break;
			
			case 3:
				JOptionPane.showMessageDialog(null, valores[9], "�ltimo valor ", JOptionPane.INFORMATION_MESSAGE);
			break;
			
			case 4: 
				String valoresPares = "";
				for (int i=0; i<10; i++) {
					if (valores[i]%2==0) {
						if (valoresPares!="") {
							valoresPares += ", ";
						}
						valoresPares += valores[i];
					}
				}
				JOptionPane.showMessageDialog(null, valoresPares, "Valores Pares", JOptionPane.INFORMATION_MESSAGE);
			break;
			
			case 5:
				int valorAlto = 0;
				for (int i=0; i<10; i++) {
					if (valores[i] > valorAlto) {
					valorAlto = valores[i]; }
				}
				JOptionPane.showMessageDialog(null, valorAlto, "Maior valor", JOptionPane.INFORMATION_MESSAGE);
			break;
		
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida", "Erro", JOptionPane.WARNING_MESSAGE);
			break;
			}
			
			repetir = JOptionPane.showInputDialog("Deseja voltar ao menu ?"
					+ "\n Digite S para sim ou outro caractere para encerrar:");
		}while (repetir.equalsIgnoreCase("S"));

	}

}
