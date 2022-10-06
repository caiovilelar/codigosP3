public class Triangulo extends Geometria {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(){
        
    }

    @Override
    public double calculaArea() {
        return (this.base * this.altura) / 2;
    }
}