import java.util.Scanner;

public class Lista_Encadeada {

    public static class NO{
    int dado;
    NO prox;
    }

    public static void main(String[] args) {
    Scanner le = new Scanner(System.in);
    NO lista = new NO();

    //Primeiro NÓ
    System.out.print("Informe dado: ");
    lista.dado = le.nextInt();
    lista.prox = null;

    //Segundo NÓ
    NO novo1 = new NO();
    System.out.print("Informe dado: ");
    novo1.dado = le.nextInt();
    novo1.prox = null;
    
    //Terceiro Nó
    NO novo2 = new NO();
    System.out.print("Informe dado: ");
    novo2.dado = le.nextInt();
    novo2.prox = null;

    //Conectando os 2 NÓS
    lista.prox = novo1;
    novo1.prox = novo2;

    System.out.println("\n'Lista' \t Dado: "+ lista.dado+"\t Endereço: "+ lista +"\t Prox: "+ lista.prox);
    System.out.println("'Novo1' \t Dado: "+ novo1.dado+"\t Endereço: "+ novo1 +"\t Prox: "+ novo1.prox);
    System.out.println("'Novo2' \t Dado: "+ novo2.dado+"\t Endereço: "+ novo2 +"\t Prox: "+ novo2.prox);
    
    lista.prox = null;
    novo1.prox = null;    
    novo2.prox = null;

    System.out.println("\nEX1");

    novo2.prox = lista;
    lista.prox = novo1;

    System.out.println("\n'Lista' \t Dado: "+ lista.dado+"\t Endereço: "+ lista +"\t Prox: "+ lista.prox);
    System.out.println("'Novo1' \t Dado: "+ novo1.dado+"\t Endereço: "+ novo1 +"\t Prox: "+ novo1.prox);
    System.out.println("'Novo2' \t Dado: "+ novo2.dado+"\t Endereço: "+ novo2 +"\t Prox: "+ novo2.prox);
    
    lista.prox = null;
    novo1.prox = null;    
    novo2.prox = null;

    System.out.println("\nEX2");

    novo2.prox = lista;
    lista.prox = novo1;
    lista = novo2;

    System.out.println("\n'Lista' \t Dado: "+ lista.dado+"\t Endereço: "+ lista +"\t Prox: "+ lista.prox);
    System.out.println("'Novo1' \t Dado: "+ novo1.dado+"\t Endereço: "+ novo1 +"\t Prox: "+ novo1.prox);
    System.out.println("'Novo2' \t Dado: "+ novo2.dado+"\t Endereço: "+ novo2 +"\t Prox: "+ novo2.prox);

    System.out.println("\nEX3");
    System.out.println("\nLista dos dados em ordem: ");

    NO aux = lista;
    while(aux != null) {
        System.out.println(aux.dado);
        aux = aux.prox;
    }

    le.close();
    }
}

