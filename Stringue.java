package strings;
import java.util.Scanner;
public class Stringue {

	public static void main(String[] args) {

		// 1#
		
		Scanner le = new Scanner(System.in);
		System.out.print("1- "); 
		String str1 = "linguagem";
		String str2 = " JAVA";
		str1 += str2;
		System.out.println(str1 + "\nNumero de caracteres: " + str1.length()); 
		
		// 2#
		
		System.out.print("2- "); 
		int N = 50, n = 0, rest, maior = 0;
		char resp;
		String maiorluno = new String();
		String alunos[] = new String[N];
		int notas[] = new int[N];	
		do { 
			System.out.print("Nome do aluno: ");
			alunos[n] = le.nextLine();
			System.out.print("Nota do respectivo aluno: ");
			notas[n] = le.nextInt();
			if (notas[n] > maior) {
				maior = notas[n];
				maiorluno = alunos[n];
			}
			le.nextLine();
			n++;
			rest = N - n;
			System.out.print("Registrar outro aluno? (" + rest + " espacos restantes) S = sim: ");
			resp = le.nextLine().charAt(0); 
		}while (n<N && resp=='S' || resp=='s');
		System.out.print("Aluno com a maior nota: " + maiorluno + " com nota " + maior);
		
		// 3#
		
		System.out.print("\n3- "); 
		int M = 200, m = 0, p, reste;
		String presentes[] = new String[M];
		String verify = null;
		String name = new String();
		boolean encontrou;
		do { 
			System.out.print("Nome do aluno presente: ");
			presentes[m] = le.nextLine();
			m++;
			reste = M - m;
			System.out.print("Registrar outro aluno? (" + reste + " espacos restantes) S = sim: ");
			resp = le.nextLine().charAt(0); 
		}while (m<M && resp=='S' || resp=='s');
		do { 
			System.out.print("Verificar presenca do aluno: ");
			verify = le.nextLine();
			encontrou = false;
			for (p = 0; p<m; p++) {
				name = presentes[p];
				if (name.equalsIgnoreCase(verify)) {
					encontrou = true;
				}
			}
			if (encontrou == true)
				System.out.print("Aluno encontrado e com presenca!\n");
			else
				System.out.print("Aluno Not Found!\n");
			
			System.out.print("Verificar presenca de outro aluno? S = sim: ");
			resp = le.nextLine().charAt(0); 
		}while (resp=='S' || resp=='s');
	}
}
