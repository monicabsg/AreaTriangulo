/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d02112020;

import java.util.Scanner;

public class AreaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        System.out.println("Escribe el primer lado: ");
        int a = t.nextInt();
        System.out.println("Escribe el segundo lado: ");
        int b = t.nextInt();
        System.out.println("Escribe el tercer lado: ");
        int c = t.nextInt();

        float s = (a + b + c) / 2;
        float area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("El area del triangulo es: " + area);
    }

}