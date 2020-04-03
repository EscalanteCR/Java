
public class Canchas {
    private Estados estadaCancha;
    private int numeroCancha;
    
    
    
    public Canchas() {
        
    }
    public Canchas(int numeroCancha){
        setNumeroCancha(numeroCancha);
    }

    public Estados getEstadaCancha() {
        return estadaCancha;
    }

    public void setEstadaCancha(Estados estadaCancha) {
        this.estadaCancha = estadaCancha;
    }

    public int getNumeroCancha() {
        return numeroCancha;
    }
    
    public void setNumeroCancha(int numeroCancha) {
        if(!"".equals(numeroCancha)){
            this.numeroCancha = numeroCancha;
        }else{
            System.out.println("El numero de cancha no pueda estar vacío. ");
        }
        
    }   
    
}
