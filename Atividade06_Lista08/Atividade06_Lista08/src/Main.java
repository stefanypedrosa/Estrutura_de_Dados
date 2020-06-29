import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		int opc;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Lista Duplamente Encadeada\n1 - Insere no fim\n2 - Insere no inicio\n3 - Remove no fim \n4 - Remove no inicio\n5 - Exibir Lista \n6 - Ordenação por MergeSort\n7 - Ordenação por QuickSort \n0 - Sair");
			opc = scan.nextInt();
			MergeSort ms = new MergeSort();
			QuickSort qs = new QuickSort();
			switch(opc) {
			case 1:
				System.out.println("Digite o elemento que deseja inserir");
				int elemento = scan.nextInt();
				lista.inserirElemento(elemento);
				break;
			case 2:
				System.out.println("Digite o elemento que deseja inserir");
				elemento = scan.nextInt();
				lista.inserirInicio(elemento);
				break;
			case 3:
				lista.removerFinal();
				break;
			case 4:
				lista.removerInicio();
				break;
			case 5:
				lista.exibir();
				break;
			case 6:
				if(lista.isEmpty()) {
					System.out.println("Lista Vazia, preencha primeiro!");
				}
				else {
					ms.executar(lista.converteLista(), lista.exibirTamanho());
				}
				break;
			case 7:
				if(lista.isEmpty()) {
					System.out.println("Lista Vazia, preencha primeiro!");
				}
				else{
					qs.executar(lista.converteLista(), lista.exibirTamanho());
				}
				break;
			case 0:
				System.out.println("Agradecemos sua visita");
				break;
			default:
				System.out.println("Opção inválida!\nTente novamente:");
				break;
			}
	
		}while(opc!=0);
		scan.close();
	}
}
