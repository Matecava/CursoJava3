package test;

import domain.Persona;
import java.util.Arrays;

public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + Arrays.deepToString(edades));

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 4;
        edades[1][1] = 9;
        edades[2][0] = 2;
        edades[2][1] = 6;

        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades = " + Arrays.deepToString(edades));
        System.out.println(edades.length);

        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades " + ren + "-" + col + ": " + edades[ren][col]);
            }
        }

        String frutas[][] = {{"Naranja", "Limon"}, {"Frutilla", "Cereza", "Mora"}};
        imprimir(frutas);
   

        System.out.println("frutas = " + Arrays.deepToString(frutas));

        Persona personas[][] = new Persona[2][3];

        personas[0][0] = new Persona("Mateo");
        personas[0][1] = new Persona("Agustin");
        personas[0][2] = new Persona("juan");
        personas[1][0] = new Persona("Carlos");
        personas[1][1] = new Persona("Alejandro");
        personas[1][2] = new Persona("Pedro");
        
        imprimir(personas);

        System.out.println("personas = " + Arrays.deepToString(personas));

    }
    
    public static void imprimir(Object matriz[][]){
         for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("matriz " + ren + "-" + col + ": " + matriz[ren][col]);
            }
        }
    }

}
