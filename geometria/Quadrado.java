public class Quadrado extends Geometria {
    private double lado1;
    
    public Quadrado(double lado1){
        this.lado1 = lado1;
    }

    public Quadrado(){
        
    }

    @Override
    public double calculaArea() {
        
        return this.lado1 * this.lado1;
    }
}