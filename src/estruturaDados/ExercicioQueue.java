package estruturaDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioQueue {
	public static void main(String[] args) {

		Queue<String> clientes = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("-----------------------------");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("-----------------------------");
			System.out.println("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			leia.nextLine();

			switch (opcao) {
			case 0:
				System.out.println("Programa Finalizado!");
				break;
			case 1:
				System.out.println("Adicionando Cliente: ");
				String cliente = leia.nextLine();
				clientes.add(cliente);
				System.out.println("Cliente: " + cliente + " adicionado a fila!");
				break;
			case 2:
				if (clientes.isEmpty()) {
					System.out.println("A fila está vazia, não há ninguém na fila...");
				} else {
					System.out.println("Fila de clientes: ");

					Iterator<String> iClientes = clientes.iterator();

					while (iClientes.hasNext()) {
						System.out.println(iClientes.next());
					}

				}
				break;
			case 3:
				if (clientes.isEmpty()) {
					System.out.println("A fila está vazia, não há ninguém para chamar...");
				} else {
					System.out.println("Chamando o Cliente:");
					System.out.println("O Cliente: " + clientes.remove() + " foi chamado!");
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
