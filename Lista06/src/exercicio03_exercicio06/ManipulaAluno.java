package exercicio03_exercicio06;


import javax.swing.JOptionPane;

public class ManipulaAluno {
	int id = 1;
	ListaDuplamenteEncadeadaAluno lista = new ListaDuplamenteEncadeadaAluno();
	
	public void executar() {
		int opc2;		
		do {
			opc2 = Integer.parseInt(JOptionPane.showInputDialog("Manipulando Aluno\n1 - Insere no fim\n2 - Insere no inicio\n3 - Remove no fim\n4 - Remove no inicio\n5 - Exibir Lista de Alunos\n0 - Voltar ao menu principal"));
			
			switch(opc2) {
			case 1:
				String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
				String curso = JOptionPane.showInputDialog("Digite o curso do aluno");
				int semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre do aluno"));
				lista.inserirAluno(new Aluno(id++, nome, curso, semestre));
				break;
			case 2:
				nome = JOptionPane.showInputDialog("Digite o nome do aluno");
				curso = JOptionPane.showInputDialog("Digite o curso do aluno");
				semestre = Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre do aluno"));
				lista.inserirInicio(new Aluno(id++, nome, curso, semestre));
				break;
			case 3:
				lista.removerFinal();
				break;
			case 4:
				lista.removerInicio();
				break;
			case 5:
				lista.exibirAluno();
				break;
			case 0:
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!\nTente novamente:");
				break;
			}
	
		}while(opc2!=0);	
	}
}
