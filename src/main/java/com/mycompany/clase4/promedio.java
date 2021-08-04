/*
DecimalFormat-agrega decimales segun los 0
 */
package com.mycompany.clase4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class promedio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        int i, maximo = 0, minimo = 101;
        float promedio = 0;
        String nomaximo = "", nominimo = "";
        String nombre[] = new String[3];
        double notas[] = new double[3];
        for (i = 0; i < 3; i++) {
            System.out.println("Digite los nombres del alumno");
            nombre[i] = entrada.next();
            System.out.println("Digite las notas");
            notas[i] = entrada.nextDouble();
            promedio = ((float) (promedio + notas[i] / 3));
            if (notas[i] > maximo) {
                maximo = (int) notas[i];
                nomaximo = nombre[i];
            }
            if (notas[i] < minimo) {
                minimo = (int) notas[i];
                nominimo = nombre[i];
            }
        }
        for (i = 0; i < 3; i++) {
            System.out.println(i + 1 + ")" + nombre[i] + "=" + notas[i]);
        }
        System.out.println("El promedio de las notas es: " + df.format(promedio));
        System.out.println(nomaximo + " Tiene la nota mayor con: " + maximo);
        System.out.println(nominimo + " Tiene la nota menor con: " + minimo);
    }
}
