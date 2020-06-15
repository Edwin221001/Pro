public class Vehiculo{
    int opt;
    int ruedas;
    int matricula;
    int puertas;
    int pasajeros;
    
    public Vehiculo(int ruedas,int matricula,int puertas,int pasajeros){
        this.opt=opt;
        this.ruedas=ruedas;
        this.matricula=matricula;
        this.puertas=puertas;
        this.pasajeros=pasajeros;
    }
    public int getRuedas(){
        return ruedas;
    }
    public void setRuedas(int ruedas){
        this.ruedas=ruedas;
    }
    public int getMatricula(){
        return matricula;
    }
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
    public int getPuertas(){
        return puertas;
    }
    public void setPuertas( int puertas){
        this.puertas=puertas;        
    }
    public int getPasajeros(){
        return pasajeros;
    }
    public void setPasajeros(int pasajeros){
        this.pasajeros=pasajeros;
    }
}