
package test;

import domain.Cliente;
import java.util.Date;

public class TestCliente {
    public static void main(String[] args) {
        
        Date date1 = new Date();
        Cliente cliente1 = new Cliente(date1, true, "Karla",'F', 28, "Saturno 15" );
        System.out.println("cliente1 = " + cliente1);
    }
}
