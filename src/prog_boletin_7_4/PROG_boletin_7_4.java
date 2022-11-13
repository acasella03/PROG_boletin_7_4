package prog_boletin_7_4;

import java.util.Scanner;

public class PROG_boletin_7_4 {
    
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce nombre:");
        String nombre1 = scanner1.next();
        System.out.println("Introduce peso:");
        float peso1 = scanner1.nextFloat();
        
        Persona persona1 = new Persona();
        persona1.setNombre(nombre1);
        persona1.setPeso(peso1);
        
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Introduce nombre");
        String nombre2 = scanner2.next();
        System.out.println("Introduce peso");
        float peso2 = scanner2.nextFloat();
        
        Persona persona2 = new Persona();
        persona2.setNombre(nombre2);
        persona2.setPeso(peso2);
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        
        persona1.personaMasPesada(persona2.getNombre(), persona2.getPeso());
        
        persona1.personaMasPesada2(persona2);
        persona2.personaMasPesada2(persona1);
        
    }
    
}
