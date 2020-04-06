package pkgpublic;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Public {
    public static void main(String[] args) {    
         Scanner entrada;
         entrada = new Scanner(System.in);       
        int arreglo[], y, aux;
        y = Integer.parseInt(JOptionPane.showInputDialog("Cuantos numero quiere ordenar"));
        arreglo = new int[y]; 
        for (int i = 0; i < y; i++) {
            System.out.print((i + 1) + "er Numero");

            arreglo[i] = entrada.nextInt();
        }     
        for (int i = 0; i < (y - 1); i++) {

            for (int h = 0; h < (y - 1); h++) {

                if (arreglo[h] > arreglo[h + 1]) {

                    aux = arreglo[h];

                    arreglo[h] = arreglo[h + 1];

                    arreglo[h + 1] = aux;
                }
            }
        }             
        System.out.print("\n De mayor a menor\n");
        for (int i = (y - 1); i >= 0; i--) {
            System.out.print(arreglo[i] + " , ");
        }
        System.out.println("");
    }
}
