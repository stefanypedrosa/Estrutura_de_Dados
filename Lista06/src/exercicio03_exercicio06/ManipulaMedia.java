package exercicio03_exercicio06;

import javax.swing.JOptionPane;

public class ManipulaMedia {
	ListaDuplamenteEncadeadaMedia lista = new ListaDuplamenteEncadeadaMedia();
	
	public void executar() {
		int opc2;		
		do {
			opc2 = Integer.parseInt(JOptionPane.showInputDialog("Manipulando Media\n1 - Insere no fim\n2 - Insere no inicio\n3 - Remove no fim\n4 - Remove no inicio\n5 - Exibir Lista de Medias\n6 - Ordenação por MergeSort\n7 - Ordenação por QuickSort\n8 - Alunos Aprovados e Reprovados\n0 - Voltar ao menu principal"));
			MergeSort ms = new MergeSort();
			QuickSort qs = new QuickSort();
			switch(opc2) {
			case 1:
				int aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do aluno"));
				int disc = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da disciplina"));
				double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a media do aluno"));
				lista.inserirMedia(new Media(aluno, disc, media));
				break;
			case 2:
				aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do aluno"));
				disc = Integer.parseInt(JOptionPane.showInputDialog("Digite o id da disciplina"));
				media = Double.parseDouble(JOptionPane.showInputDialog("Digite a media do aluno"));
				lista.inserirInicio(new Media(aluno, disc, media));
				break;
			case 3:
				lista.removerFinal();
				break;
			case 4:
				lista.removerInicio();
				break;
			case 5:
				lista.exibirMedia();
				break;
			case 6:
				if(lista.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Lista Vazia, preencha primeiro!");
				}
				else {
					ms.executar(lista.converteLista(), lista.exibirTamanho());
				}
				break;
			case 7:
				if(lista.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Lista Vazia, preencha primeiro!");
				}
				else{
					qs.executar(lista.converteLista(), lista.exibirTamanho());
				}
				break;
			case 8:
					lista.reprovadosAprovados();
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
