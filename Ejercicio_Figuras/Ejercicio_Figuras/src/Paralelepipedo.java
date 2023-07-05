public class Paralelepipedo extends Rectangulo{
    
    private double altura;
    
    public Paralelepipedo(String nombre, double ancho, double largo, double altura) {
        super(nombre, ancho, largo);
        this.altura = altura;
    }
    
    public double getAltura()
    {
        return altura;
    }
    @Override
    public double calcularArea()
    {
        return 2*this.getAncho()*this.getLargo()+altura*(2*this.getAncho()+2*this.getLargo());
    }
    
    public double calcularVolumen()
    {
        return this.altura*this.getAncho()*this.getLargo();
    }
    @Override
    public String toString()
    {
        return super.toString()+"\nAltura: "+altura;
    }
}
