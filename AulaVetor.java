package aula;
import java.util.Scanner;

public class AulaVetor {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		int x;
		System.out.println("1#\n");
		int saldos[] = new int [10];
		for (int i = 0; i < 10; i++) {
			x = i + 1;
			System.out.print("Saldo da pessoa " + x +": ");
			saldos[i] = le.nextInt();
		}
		System.out.print("Valores dos saldos positivos: ");
		for (int i = 0; i < 10; i++) {
			if (saldos[i] >= 0)
				System.out.println(saldos[i]);
		}
		x = 0;
		for (int i = 0; i < 10; i++) {
			if (saldos[i] < 0)
				x++;
		}
		System.out.print("Numero de pessoas com saldo negativo: " + x);
		System.out.println("\n2#\n");
		int digitos[] = new int [10];
		int maioral = -999999999;
		x = 0;
		for (int i = 0; i < 10; i++) {
			x = i + 1;
			System.out.print("Elemento " + x +": ");
			digitos[i] = le.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			if (digitos[i] > maioral)
				maioral = digitos[i];
				x = i;
		}
		System.out.println("O maior elemento presente e " + maioral + " e esta presente na posicao " + x );
		System.out.println("\n3#\n");
		x = 0;
		int soma, n, y = 0;
		System.out.print("Numero total de alunos na sala: ");
		n = le.nextInt();
		int rm[] = new int[n];
		int notas1[] = new int[n];
		int notas2[] = new int[n];
		int medias[] = new int[n];
		int aprovados[] = new int [n];
		for (int i = 0; i < n; i++) {
			x = i + 1;
			System.out.print("\nRM numero " + x +": ");
			rm[i] = le.nextInt();
			System.out.print("Nota do RM " + rm[i] +" na primeira prova: ");
			notas1[i] = le.nextInt();
			System.out.print("Nota do RM " + rm[i] +" na segunda prova: ");
			notas2[i] = le.nextInt();
			soma = notas1[i] + notas2[i];
			medias[i] = soma/2;
			System.out.print("Media do RM " + rm[i] +": " + medias[i]);
			if (medias[i] >= 6)
				aprovados[i] = rm[i];
				y++;
		}
		System.out.println("\nRM dos alunos aprovados:");
		for (int i = 0; i < y; i++) {
			if (aprovados[i] != 0)
				System.out.println("RM " + aprovados[i]);
		}
	}
}
		