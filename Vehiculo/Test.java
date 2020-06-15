import java.util.Scanner;
public class Test{
    public static void main(String []args){
        Scanner leer=new Scanner(System.in);
        Vehiculo a[]=new Vehiculo[10];
        for(int i=0;i<a.length;i++){
            System.out.println("Ingrese el numero de rudas del vehiculo " + i);
            int ruedas=leer.nextInt();
            System.out.println("Ingrese el numero de matricula  del vehiculo " + i);
            int matricula=leer.nextInt();
            System.out.println("Ingrese el numero de puertas  del vehiculo " + i);
            int puertas=leer.nextInt();
            System.out.println("Ingrese el numero de pasajeros MAXIMOS del vehiculo " + i);
            int pasajeros=leer.nextInt();
            a[i]= new Vehiculo(ruedas,matricula,puertas,pasajeros);
            if(a[i].getRuedas()==4 && (a[i].getPuertas()==4 || a[i].getPuertas()==2 ) && a[i].getPasajeros()<=5){
                System.out.println("El vehiculo " + i + " es un Coche");
            }else if(a[i].getRuedas()==2 && a[i].getPuertas()==0 && a[i].getPasajeros()<=2){
                System.out.println("El vehiculo " + i + " es una Moto");
            }else if(a[i].getRuedas()==0 && a[i].getPuertas()==0 && a[i].getPasajeros()>0){
                System.out.println("El vehiculo " + i + " es una Lancha");
            }else{
                System.out.println("Puede que haya ingresado numeros negativos o el vehiculo no se encuentra registrado en este programa");
            }

             /*for(int i=0;i<a.length;i++){
            if(a[i].getRuedas()==4 && a[i].getPuertas()==4 && a[i].getPasajeros()==4){
                System.out.println("El vehiculo " + i + " es un Coche");
            }else if(a[i].getRuedas()==2 && a[i].getPuertas()==0 && a[i].getPasajeros()==2){
                System.out.println("El vehiculo " + i + " es una Moto");
            }if(a[i].getRuedas()==0 && a[i].getPuertas()==0 && a[i].getPasajeros()>4){
                System.out.println("El vehiculo " + i + " es una Lancha");
            }else{
                System.out.println("Puede que haya ingresado numeros negativos o el vehiculo no se encuentra registrado en este programa");
             }*/
        }
        
    }
}