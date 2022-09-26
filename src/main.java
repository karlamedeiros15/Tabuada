import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entrada, resultado;
        int limite = 10;
        int contador = 0;


        System.out.println("Qual tabuada você quer saber? ");
        entrada = scan.nextInt();

        do{
            resultado = entrada * contador;
            System.out.println(entrada + "*" + contador + "=" + resultado);
            contador++;
        }
        while(contador <= limite);
    }
}
