package figura4;
import java.util.Scanner;
public class Figura4 {
    public static void main(String[] args) {
    int i,j;
        Scanner teclado;
        teclado = new Scanner(System.in);
        System.out.println("Numero de Filas");
        int n=teclado.nextInt();
        System.out.println("Numero de Columnas");
        int m=teclado.nextInt();
        String matriz [][]= new String [n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
               matriz[i][j]="o";
            }
        }

         //Numeros 1
         for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if((i==0) && (j>0) && (j<6)){
                    matriz[i][j]="1"; 
                }
                if((i==1) && (j>1) && (j<5)){
                    matriz[i][j]="1"; 
                }
                if((i==2) && (j>2) && (j<4)){
                    matriz[i][j]="1"; 
                }
            }
        }

        //Numero 3
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if((i==6) && (j>0) && (j<6)){
                    matriz[i][j]="3"; 
                }
                if((i==5) && (j>1) && (j<5)){
                    matriz[i][j]="3"; 
                }
                if((i==4) && (j>2) && (j<4)){
                    matriz[i][j]="3"; 
                }
            }
        }

            //Numero 2
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if((j==6) && (i>0) && (i<6)){
                    matriz[i][j]="2"; 
                }
                if((j==5) && (i>1) && (i<5)){
                    matriz[i][j]="2"; 
                }
                if((j==4) && (i>2) && (i<4)){
                    matriz[i][j]="2"; 
                }
            }
        }

         //Numero 4
         for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if((j==0) && (i>0) && (i<6)){
                    matriz[i][j]="4"; 
                }
                if((j==1) && (i>1) && (i<5)){
                    matriz[i][j]="4"; 
                }
                if((j==2) && (i>2) && (i<4)){
                    matriz[i][j]="4"; 
                }
            }
        }



        //Numero 0
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(i==j){
                    matriz[i][j]="0";
                }
                if((i+j)==(n-1)){
                    matriz[i][j]="0";
                }
            }
        }
       ///Imprimir Matriz
       for(i=0; i<n;i++){
        for(j=0;j<m;j++){
          System.out.print(" [ " + matriz[i][j] + "  ] ");
        }
        System.out.println();
     }

    }
}












