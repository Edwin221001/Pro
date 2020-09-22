package pila;
public class IntroPila {    
    int vectorPila[];
    int cima;    
    public IntroPila(int tamaño){
        vectorPila = new int[tamaño];
        cima=0;
    }        
        //Metodo insertar
        public void  Insertar(int dato){
            vectorPila[cima] = dato;
            cima++;
        }        
        public int Eliminar(){
            int eliminar = 0;
            if (cima==0){
                System.out.println("La pila esta vacia");
            }else{
                eliminar = vectorPila[cima];
                cima--;
            }
            return eliminar;                       
        }
        public boolean vacio(){
         if (cima==0){
             return true;
         }else{
             return false;
         }
        }        
public int Tamaño(){
    return vectorPila.length ;
	}
}
                
            
        
    

