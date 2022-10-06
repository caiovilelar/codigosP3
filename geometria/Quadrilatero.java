public class Quadrilatero extends Geometria {
    private double lado1;
    private double lado2;
    
    public Quadrilatero(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Quadrilatero(){
        
    }

    @Override
    public double calculaArea() {
        
        return this.lado1 * this.lado2;
    }
}