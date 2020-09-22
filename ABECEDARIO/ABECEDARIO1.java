package pila;
import java.util.Scanner;
public class Pila {
    public static void main(String[] args) {        
        Scanner leer = new Scanner(System.in);        
        System.out.println("Bienvenido");
        System.out.println("Digita el tamaño de esta pila");        
        int tamaño = leer.nextInt();
        int dato = 0, opc = 0;       
        IntroPila a = new IntroPila(tamaño);        
        do{
            System.out.println("Que deseas hacer");
            System.out.println("1. Ingresar dato --- 2. Eliminar dato --- 3-.Saber si esta vacia ---");
            System.out.println("4-.Tamaño de la pila --- 5.Salir");
            opc = leer.nextInt();            
            switch (opc){
                case 1:
                    System.out.println("Inserte dato");
                    a.Insertar( dato = leer.nextInt());
                    System.out.println("Dato insertado");
                    System.out.println("");
                    break;                    
                case 2:
                    a.Eliminar();
                    break;                    
                case 3:
                    System.out.println(a.vacio());
                    System.out.println("");
                    break;                    
                case 4:
                    System.out.println(a.Tamaño());
                    break;               
            }         
        }while (opc!= 5);
    }
}
        
    
    

