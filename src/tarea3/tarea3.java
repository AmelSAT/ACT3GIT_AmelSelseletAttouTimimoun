package tarea3;

import java.util.Random;
import java.util.Scanner;

public class tarea3 {

    public static void main(String[] args) {
        mostrarNumerosAleatorios();
        obtenerEnterosEntreDosNumeros();
    }
    
    public static void mostrarNumerosAleatorios() {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println(rand.nextInt(10) + 1);
        }
    }

    public static void obtenerEnterosEntreDosNumeros() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.print("Introduce el primer número: ");
        int num2 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num3 = scanner.nextInt();
        System.out.print("Introduce el tercer número: "); 

        if (num1 != num2) {
            int start = Math.min(num1, num2);
            int end = Math.max(num1, num2);
            for (int i = start; i <= end; i += 7) {
                System.out.println(i);
            }
        } else {
            System.out.println("El número " + num3 + " está entre " + num1 + " y " + num2);
        }
    }
}
