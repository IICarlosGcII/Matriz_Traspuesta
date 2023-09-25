import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nfil, ncol; //Se declaran la variable matriz y su variable para las filas y columnas

        //Pedimos la cantidad de filas para la matriz
        System.out.print("Digite la cantidad de filas de la matriz: ");
        nfil = entrada.nextInt();

        //Pedimos la cantidad de columnas par ala matriz
        System.out.print("Digite la cantidad de columnas de la matriz: ");
        ncol = entrada.nextInt();

        //Declaramos las dimeciones de la matriz con los datos de las filas y columnas
        matriz = new int[nfil][ncol];

        //Pedimos y guardamos los datos de la matriz en su variable
        System.out.print("Digite los datos de la matriz: ");
        for (int f = 0; f < nfil; f++) {
            for (int c = 0; c < ncol; c++) {
                matriz[f][c] = entrada.nextInt();
            }
        }

        //Se muestra la matriz original para comparar con el resultado
        System.out.println("La matriz original es: ");
        for (int f = 0; f < nfil; f++) {
            for (int c = 0; c < ncol; c++) {
                System.out.print(matriz[f][c]+" ");

            }
            System.out.println(" ");
        }

        //Hacemos la logica de la traspuesta, cambiamos fila por columnas
        int aux;
        for (int f = 0; f < nfil; f++) {
            for (int c = 0; c < f; c++) {
                aux = matriz[f][c]; //aux = matriz original
                matriz[f][c] = matriz[c][f] ; //hacemos el cambio de filas x columnas
                matriz[c][f] = aux; //aux = matriz traspuesta, actualizamos la variable aux

            }
        }
        //Se muestra la matriz traspuesta para comparar con la original
        System.out.println("La matriz traspuesta es: ");
        for (int f = 0; f < nfil; f++) {
            for (int c = 0; c < ncol; c++) {
                System.out.print(matriz[f][c]+" ");

            }
            System.out.println(" ");
        }
    }
}