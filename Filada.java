package filas;
import java.util.Scanner;

public class Filada {

    public static void main(String[] args) {
        Scanner le = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        System.out.print("Informe valor a ser inserido (negativo para sair): ");
        int valor = le.nextInt();
        while (valor >= 0) {
            fila.enqueue(valor);
            System.out.print("Informe valor a ser inserido (negativo para sair): ");
            valor = le.nextInt();
        }
        while (!fila.isEmpty()) {
            System.out.println("Valor retirado da fila: "+fila.dequeue());
        }
        le.close();
    }
}

