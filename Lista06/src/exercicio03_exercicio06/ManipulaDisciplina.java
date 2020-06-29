package exercicio03_exercicio06;

import javax.swing.JOptionPane;

public class ManipulaDisciplina {
	int id = 1;
	ListaDuplamenteEncadeadaDisciplina lista = new ListaDuplamenteEncadeadaDisciplina();
	
	public void executar() {
		int opc2;		
		do {
			opc2 = Integer.parseInt(JOptionPane.showInputDialog("Manipulando Disciplina\n1 - Insere no fim\n2 - Insere no inicio\n3 - Remove no fim\n4 - Remove no inicio\n5 - Exibir Lista de Disciplinas\n0 - Voltar ao menu principal"));
			
			switch(opc2) {
			case 1:
				String nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
				lista.inserirDisciplina(new Disciplina(id++, nome));
				break;
			case 2:
				nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
				lista.inserirInicio(new Disciplina(id++, nome));
				break;
			case 3:
				lista.removerFinal();
				break;
			case 4:
				lista.removerInicio();
				break;
			case 5:
				lista.exibirDisciplina();
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
