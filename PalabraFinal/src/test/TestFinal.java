
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        
        //miVariable = 5;
        
        var variableConstante = Persona.MI_CONSTANTE;
        System.out.println("variableConstante = " + variableConstante);
        
        final Persona persona1 = new Persona();
        persona1.setNombre("Mateo");
        System.out.println("Nombre : " + persona1.getNombre()); 
        
        persona1.setNombre("Juan");
        System.out.println("Nombre : " + persona1.getNombre()); 
    }
}
