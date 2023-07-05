import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List <Figura> miLista = new ArrayList<>();
        int opcion = 0;
        int indice = 0;
        do
        {
            vaciar();
            opcion = genPrincipal(sc);
            switch(opcion)
            {
                case 1:
                    do {
                        vaciar();
                        opcion = genMenuAgregar(sc);
                        vaciar();
                        agregarFigura(sc, opcion, miLista);
                    } while(opcion != 11);
                    break;
                case 2:
                    do
                    {
                        vaciar();
                        if(!miLista.isEmpty())
                        {
                            opcion = imprimirFiguras(sc,miLista,indice);
                        }
                        else
                        {
                            System.out.println("No hay objetos en la lista");
                            opcion = 3;
                            sc.nextLine();
                        }
                        indice = darIndice(opcion, indice, miLista);
                    } while(opcion !=3);
                    break;
            }
        } while(opcion != 0);
    }
    
    private static int genPrincipal(Scanner sc)
    {
        System.out.println("1. Crear figura\n2. Ver figuras\n0. Salir");
        System.out.print("Ingrese la opcion: ");
        return Integer.parseInt(sc.nextLine());
    }
    private static int genMenuAgregar(Scanner sc)
    {
        System.out.println("Figura 2D\n \n1. Circulo\n2. Rectangulo\n3. Triangulo\n4. Cuadrado\n \nFigura 3D\n \n5. Cono\n6. Cilindro\n7. Paralelepipedo\n8. Tetraedro\n9. Esfera \n10. Cubo\n11. Regresar");
        System.out.print("\nIngrese la opcion: ");
        return Integer.parseInt(sc.nextLine());
    }

    private static void vaciar()
    {
        for (int clear = 0; clear < 1000; clear++) {
            System.out.println("\b");
        }
    }

    private static void agregarFigura(Scanner sc, int opcion, List miLista)
    {
        double radio;
        double lado;
        double altura;
        double ancho;
        double largo;
        switch(opcion)
        {
            case 1:
                System.out.print("Ingrese el radio: ");
                radio = Double.parseDouble(sc.nextLine());
                miLista.add(new Circulo("Circulo", radio));
                break;
            case 2:
                System.out.print("Ingrese el ancho: ");
                ancho = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese el largo: ");
                largo = Double.parseDouble(sc.nextLine());
                miLista.add(new Rectangulo("Rectangulo", ancho, largo));
                break;
            case 3:
                double a, b, c;
                System.out.print("Ingrese el lado A: ");
                a = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese el lado B: ");
                b = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese el lado C: ");
                c = Double.parseDouble(sc.nextLine());
                miLista.add(new Triangulo("Triangulo", a,b,c));
                break;
            case 4:
                System.out.print("Ingrese el lado: ");
                lado = Double.parseDouble(sc.nextLine());
                miLista.add(new Cuadrado("Cuadrado", lado));
                break;

            case 5:
                System.out.print("Ingrese el radio: ");
                radio = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese la altura: ");
                altura = Double.parseDouble(sc.nextLine());
                miLista.add(new Cono("Cono", radio, altura));
                break;
            case 6:
                System.out.print("Ingrese el radio: ");
                radio = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese la altura: ");
                altura = Double.parseDouble(sc.nextLine());
                miLista.add(new Cilindro("Cilindro", radio, altura));
                break;
            case 7:
                System.out.print("Ingrese el ancho: ");
                ancho = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese el largo: ");
                largo = Double.parseDouble(sc.nextLine());
                System.out.print("Ingrese la altura: ");
                altura = Double.parseDouble(sc.nextLine());
                miLista.add(new Paralelepipedo("Paralelepipedo", ancho, largo, altura));
                break;
            case 8:
                double arista;
                System.out.print("Ingrese la arista: ");
                arista = Double.parseDouble(sc.nextLine());
                miLista.add(new Tetraedro("Tetraedro", arista));
                break;
            case 9:
                System.out.print("Ingrese el radio: ");
                radio = Double.parseDouble(sc.nextLine());
                miLista.add(new Esfera("Esfera", radio));
                break;
            case 10:
                System.out.print("Ingrese el lado: ");
                lado = Double.parseDouble(sc.nextLine());
                miLista.add(new Cubo("Cubo", lado));
                break;

        }
    }
    private static int imprimirFiguras(Scanner sc, List<Figura> miLista, int indice)
    {
        Figura miFigura = miLista.get(indice);
        if(miFigura instanceof Circulo)
        {
            if (miFigura instanceof Cilindro) {
                Cilindro cilin = (Cilindro) miFigura;
                System.out.println(cilin + "\nArea: " + cilin.calcularArea() + "\nVolumen: " + cilin.calcularVolumen());
            }
            else if (miFigura instanceof Cono) {
                Cono cono = (Cono) miFigura;
                System.out.println(cono + "\nArea: " + cono.calcularArea() + "\nVolumen: " + cono.calcularVolumen());
            }
            else if (miFigura instanceof Esfera) {
                Esfera esfera = (Esfera) miFigura;
                System.out.println(esfera +"\nPerimetro:" + esfera.calcularPerimetro() + "\nArea: " + esfera.calcularArea() + "\nVolumen: " + esfera.calcularVolumen());

            }
            else
            {
                Circulo miCirculo = (Circulo)miFigura;
                System.out.println(miCirculo+"\nPerimetro: "+miCirculo.calcularPerimetro()+"\nArea: "+miCirculo.calcularArea());
            }
        }
        else if(miFigura instanceof Rectangulo)
        {
            if (miFigura instanceof Paralelepipedo) {
                Paralelepipedo lele = (Paralelepipedo) miFigura;
                System.out.println(lele + "\nArea: " + lele.calcularArea() + "\nVolumen: " + lele.calcularVolumen());
            }
            else {
                Rectangulo rect = (Rectangulo) miFigura;
                System.out.println(rect + "\nPerimetro: " + rect.calcularPerimetro() + "\nArea: " + rect.calcularArea());
            }
        }
        else if(miFigura instanceof Triangulo)
        {
            if (miFigura instanceof Tetraedro) {
                Tetraedro tetra = (Tetraedro) miFigura;
                System.out.println(tetra + "\nArea: " + tetra.calcularArea() + "\nVolumen: " + tetra.calcularVolumen());
            }
            else
            {
                Triangulo trian = (Triangulo)miFigura;
                System.out.println(trian+"\nPerimetro: "+trian.calcularPerimetro()+"\nArea: "+trian.calcularArea());
            }
        } else if (miFigura instanceof Cuadrado)
        {
            if (miFigura instanceof Cubo){
                Cubo cubo= (Cubo) miFigura;
                System.out.println(cubo + "\nPerimetro: " + cubo.calcularPerimetro() + "\nArea: " + cubo.calcularArea());
            }
            else
            {
                Cuadrado cuadrado= (Cuadrado) miFigura;
                System.out.println(cuadrado + "\nPerimetro: " + cuadrado.calcularPerimetro() + "\nArea: " + cuadrado.calcularArea());
            }

        }
        System.out.println("\n1. Anterior\n2. Siguiente\n3. Regresar\n");
        System.out.print("Ingrese una opcion: ");
        int opcion = Integer.parseInt(sc.nextLine());
        return opcion;
    }
    
    private static int darIndice(int opcion, int indice, List miLista)
    {
        switch(opcion)
        {
            case 1:
                if (indice - 1 >= 0) {
                    indice -= 1;
                }
                break;
            case 2:
                if (indice + 1 < miLista.size()) {
                    indice += 1;
                }
                break;
        }
        return indice;
    }
}
