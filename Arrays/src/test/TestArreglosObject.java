package test;

import domain.Persona;
import java.util.Arrays;

public class TestArreglosObject {

    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        System.out.println("personas = " + Arrays.toString(personas));

        personas[0] = new Persona("Mateo");
        personas[1] = new Persona("Juan");

        System.out.println("personas 0 = " + personas[0]);
        System.out.println("personas 1 = " + personas[1]);

        System.out.println("personas = " + Arrays.toString(personas));
        
        for(int i = 0; i < personas.length; i++){
            System.out.println("personas = " + personas[i]);
        }

    }
}
