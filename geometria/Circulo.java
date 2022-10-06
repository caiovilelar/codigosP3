public class Circulo extends Geometria {
    private double raio; 

    public Circulo(double raio){
        this.raio = raio;
    }

    public Circulo(){
        
    }
   
    @Override
    public double calculaArea() {
        
        return Math.PI*Math.pow(this.raio,2);
    }
}