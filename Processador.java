package filas;
import java.util.Scanner;

public class Processador {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opcao, resp;
        do  {
        	System.out.println("1 - Submete processo para execução");
        	System.out.println("2 - Executa processo");
        	System.out.println("3 - Shutdown");
        	opcao = le.nextInt();
        	switch(opcao) {
        	case 1:
        		System.out.println("Insira pid do processo: ");
        		int pid = le.nextInt();
        		fila.enqueue(pid);
        	case 2:
        		if (fila.isEmpty())
        			System.out.println("Nao ha processos na fila.");
        		else {	
	        		pid = fila.dequeue();
	        		System.out.println("Processo "+pid+" esta em execucao...");
	        		System.out.println("Confirmação de conclusao (1-sim): ");
	        		resp = le.nextInt();
	        		if (resp==1)
	        			System.out.println("Processo concluido");
	        		else {
	        			System.out.println("Processo retornando a fila");
	        			fila.enqueue(pid);
	        		}
        		}
        		break;
        	case 3:
        		if (!fila.isEmpty()) {
        			System.out.println("Ainda ha processos na fila. \nConfirme para encerrar todos (1-sim): ");
        			resp = le.nextInt();
        			if (resp != 1)
        				opcao = 0;
        			else {
        				while (!fila.isEmpty()) {
        					System.out.println("Encerrando processo " + fila.dequeue()+"...");
        				}
        			}
        		}
        	default:
        		System.out.println("Opcao invalida!");
        	}
        } while (opcao != 3);
        System.out.println("Shutdown");
        le.close();
    }
}

