import java.util.Scanner;
public class Função {

public static void main(String[] args) {
	Scanner le = new Scanner(System.in);
	float uno, dos, Mt;
	char ovrll;
	int i;
	for (i = 1; i <= 4; i++) {
		System.out.print("Aluno " + i + "\n");
		System.out.print("Primeira nota: ");
		uno = le.nextFloat();
		System.out.print("Segunda nota: ");
		dos = le.nextFloat();
		Mt = media_com_pesos(uno, dos);
		System.out.print("Média do aluno: " + Mt + "\n");
		ovrll = conceito(Mt);
		System.out.print("Nota " + ovrll + "\n");
		}
	}

public static float media_com_pesos(float a, float b) {
	float m;
	m = (a + b) / 2;
	return m;
	}

public static char conceito(float media) {
	char gud;
	if (media >= 8.5)
		gud = 'E';
	else if (media > 5 && media < 8.5)
		gud = 'B';
	else 
		gud = 'R';
	return gud;
	}
}
