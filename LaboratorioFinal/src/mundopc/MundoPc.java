package mundopc;

import com.gm.mundopc.*;

public class MundoPc {
    public static void main(String[] args) {
        Raton raton1 = new Raton("Usb", "Snake");
        Teclado teclado1 = new Teclado("Bluetooth", "Asus");
        Monitor monitor1 = new Monitor("Samsung",32);
        Computadora computadora1 = new Computadora("Pc gamer", monitor1, teclado1, raton1 );
        System.out.println("computadora gamer = " + computadora1);
        
        
        Raton raton2 = new Raton("Usb", "Constructor");
        Teclado teclado2 = new Teclado("Bluetooth", "Samsung");
        Monitor monitor2 = new Monitor("Lenovo",34);
        Computadora computadora2 = new Computadora("Computadora de oficina", monitor2, teclado2, raton2 );
        System.out.println("computadora de oficina = " + computadora2);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora2);
        orden1.agregarComputadora(computadora1);
        
        
        orden1.mostrarOrden();
    }
}
