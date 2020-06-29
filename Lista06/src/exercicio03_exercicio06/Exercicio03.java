package exercicio03_exercicio06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio03 {
	public static void main(String[]args) {
		int opc;
		Scanner scan = new Scanner(System.in);
		ManipulaAluno a = new ManipulaAluno();
		ManipulaDisciplina d = new ManipulaDisciplina();
		ManipulaMedia m = new ManipulaMedia();
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog("Bem Vindo ao SIGA\n1 - Manipular Aluno\n2 - Manipular Disciplina\n3 - Manipular Média\n0 - Sair"));
			switch(opc) {
			case 1:
				a.executar();
				break;
			case 2:
				d.executar();
				break;
			case 3:
				m.executar();
				break;
			case 0: 
				JOptionPane.showMessageDialog(null, "Agradecemos sua visita!\nAté mais");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!\nTente novamente:");
				break;
			}
		}while(opc!=0);
	scan.close();
	}	
}
