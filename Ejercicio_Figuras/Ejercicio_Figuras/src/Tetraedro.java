public class Tetraedro extends Triangulo{
    private double arista;

    public Tetraedro(String nombre, double arista) {
        super(nombre, arista, arista, arista);
        this.arista = arista;
    }
    
    public double getArista()
    {
        return arista;
    }
    
    @Override
    public double calcularArea()
    {
        return Math.pow(arista, 2)*1.73205; //raiz(3)= 1.73205
    }
    
    public double calcularVolumen()
    {
        return Math.pow(arista, 3)*0.117851; // raiz(2)/12 = 0.117851
    }

    public double calcularPerimetro(){
        return arista*3;
    }
    
    @Override
    public String toString()
    {
        return "\nNombre: "+this.getNombre()+"\nArista: "+arista +"\nPerimetro: "+calcularPerimetro();
    }
}
