public class Cono extends Circulo{
    private double altura;
    private double generatriz;
    
    public Cono(String nombre, double radio, double altura)
    {
        super(nombre, radio);
        this.altura = altura;
        this.generatriz = calcularGeneratriz();
    }
    
    public double getAltura()
    {
        return altura;
    }
    
    public double getGeneratriz()
    {
        return generatriz;
    }
    
    private double calcularGeneratriz()
    {
        return Math.sqrt(Math.pow(altura,2)+Math.pow(this.getRadio(), 2));
    }
    @Override
    public double calcularArea()
    {
        return this.getPi()*this.getRadio()*generatriz+this.getPi()*Math.pow(this.getRadio(), 2);
    }
    
    public double calcularVolumen()
    {
        return altura*Math.pow(this.getRadio(), 2)*this.getPi()*1/3;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+"\nAltura: "+altura;
    }
}
