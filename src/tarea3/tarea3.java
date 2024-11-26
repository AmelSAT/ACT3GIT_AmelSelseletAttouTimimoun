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
        System.out.print("Introduce el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 != num2) {
            int start = Math.min(num1, num2);
            int end = Math.max(num1, num2);
            for (int i = start; i <= end; i += 7) {
                System.out.println(i);
            }
        } else {
            System.out.println("Los números deben ser distintos.");
        }
    }
}
