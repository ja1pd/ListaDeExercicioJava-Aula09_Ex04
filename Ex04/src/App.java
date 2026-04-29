// Nome: João Pedro Bastos Neves
// Matricula: 1261948367

import java.util.Scanner;

public class App {

    public static int contarPares(int[] numeros) {
        int cont = 0;
        for (int i = 0; i < numeros.length; i++) {
            if ((numeros[i] % 2) == 0 )  {
                cont++;
            }
        }
        return cont;
    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int tamanho;
        int num;

        System.out.print("Insira o tamanho da lista: ");
        tamanho = scanner.nextInt();
        int[] array = new int[tamanho];


        for (int i = 0; i < tamanho; i++) {
            System.out.print("Insira o "+(i+1)+"° Item da Lista:");
            num = scanner.nextInt();
            array[i] = num;
        }

        System.out.println("Aquantidade de pares da lista é: " + contarPares(array));

        scanner.close();
    }
}
