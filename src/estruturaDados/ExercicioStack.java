package estruturaDados;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioStack {
	public static void main(String[] args) {

		Stack<String> pilhaLivros = new Stack<>();
		Scanner leia = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("----------------------------");
			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("----------------------------");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 0:
				System.out.println("Programa finalizado!");
				break;
			case 1:
				System.out.println("Adicione um livro a pilha: ");
				String livro = leia.nextLine(); // cria a variavel livro e armazena o que o usuário digitar.
				pilhaLivros.push(livro); // adiciona a pilha o livro digitado
				System.out.println("Livro: " + livro + " foi adicionado!");
				break;
			case 2:
				if (pilhaLivros.isEmpty()) {
					System.out.println("A pilha está vazia!");
				} else {
					System.out.println("Listando todos os Livros: ");

					Iterator<String> iPilhaLivros = pilhaLivros.iterator(); // iterator para percorrer a pilha e listar o que estiver contido nela.

					while (iPilhaLivros.hasNext()) {
						System.out.println(iPilhaLivros.next());
					}

				}
				break;
			case 3:
				if (pilhaLivros.isEmpty()) { // se a pilha estiver vazia mostra o erro.
					System.out.println("Não foi possivel retirar, pilha vazia!");
				} else {
					System.out.println("Retirando o Livro da pilha: ");
					System.out.println("O livro: " + pilhaLivros.pop() + " foi retirado!");
				}
				break;
			default:
				System.out.println("Opção inválida! Tente novamente...");
				break;
			}

		} while (opcao != 0);
		leia.close();
	}
}
