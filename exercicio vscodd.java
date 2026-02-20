package aplicacao;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double total, descontado;
		int option, clientes, resp = 1, position = 1;
		while (resp == 1) {
			System.out.print("Informe o numero de clientes a serem atendidos: ");
			clientes = teclado.nextInt();
			while (position <= clientes) {
				System.out.print("\nAtendendo "+ position + "º cliente\n");
				System.out.print("Informe o valor total da compra: ");
				total = teclado.nextDouble();
				System.out.print("Parcelamento (1 a 6 parcelas): ");
				option = teclado.nextInt();
				if (option == 1) {
					descontado = total * 0.9;
					System.out.print("Desconto de 10%\nValor original: " + total + "\nValor final: " + descontado);
				}
				else if (option == 2 || option == 3 ) {
					System.out.print("Sem juros\nValor final: " + total);
				}
				else if (option == 4) {
					descontado = total * 1.05;
					System.out.print("Acrescimo de 5%\nValor original: " + total + "\nValor final: " + descontado);
				}
				else if (option == 5) {
					descontado = total * 1.06;
					System.out.print("Acrescimo de 6%\nValor original: " + total + "\nValor final: " + descontado);
				}
				else if (option == 6) {
					descontado = total * 1.08;
					System.out.print("Acrescimo de 8%\nValor original: " + total + "\nValor final: " + descontado);
				}
				else if (option < 1 || option > 6) {
					System.out.print("Forma de pagamento invalida!");
				}
			position += 1;
			}
			System.out.print("\nTodos os clientes atendidos!");
			System.out.print("\nHa mais clientes para atender? (1 - Sim): ");
			resp = teclado.nextInt();
		}
		System.out.print("Fechando a loja...");
	}
}
