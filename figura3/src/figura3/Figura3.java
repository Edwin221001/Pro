package figura3;
    import java.util.Scanner;
public class Figura3 {
public static void main(String[] args) {

    int i,j;

        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Numero de filas");
        int n=teclado.nextInt();
        int y=n-1;
        System.out.println("Numero de columnas");
        int m=teclado.nextInt();
        String matriz [][]= new String [n][m];

        for( i=0;i<n;i++){
            for(j=0;j<m;j++){
                    matriz[i][j]=" ";  
                }    
             }
             //Filas
        for(i=0;i<m;i++){
            matriz[0][i]="*";
            matriz[n-1][i]="*";
        }
        //Columnas
        for(i=0;i<n;i++){
            matriz[i][0]="*";
            matriz[i][m-1]="*";
        }

        //Imprimir
        for(i=0; i<n;i++){
            for(j=0;j<m;j++){
              System.out.print(" [ " + matriz[i][j] + "  ] ");
            }
            System.out.println();
         }
    }
}

















