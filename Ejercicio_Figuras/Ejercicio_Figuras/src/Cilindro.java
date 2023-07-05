public class Cilindro extends Circulo{
    
    private double altura;
    
    public Cilindro(String nombre, double radio, double altura) {
        super(nombre, radio);
        this.altura = altura;
    }
    
    public double getAltura()
    {
        return altura;
    }
    @Override
    public double calcularArea()
    {
        return 2*this.getPi()*this.getRadio()*altura+2*this.getPi()*Math.pow(this.getRadio(), 2);
    }
    
    public double calcularVolumen(){
        return this.getPi()*Math.pow(this.getRadio(), 2)*altura;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"\nAltura: "+altura;
    }
    
}
