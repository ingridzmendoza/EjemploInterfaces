// Practica interfaces
public class testClass implements Aritmeticos{

    public static void main(String[] args) {

        //instancia anonima
        System.out.println("Suma: " + new testClass().suma(1,6));
        System.out.println("Resta: " + new testClass().resta(1,6));

        System.out.println("Producto: " + new testClass().producto(1,6));
        System.out.println("Division: " + new testClass().resta(6,1));
    }

    //declarar para poder implementar
    public int suma(int x, int y){
        return x+y;
    }

    public int resta(int x, int y){
        return x-y;
    }

    public int producto(int x, int y){
        return x*y;
    }

    public int division(int x, int y){
        return x/y;
    }
}

interface Aritmeticos{
    public int suma(int x, int y); //no tiene cuerpo por ser abstracto

    public int resta(int x, int y);

    public int producto(int x, int y);
    public int division(int x, int y);
}


/*
interfaz>> clase cuyos todos sus metodos son abstractos


    Ejemplo de recursividad porque un metodo se esta llamando a asi mismo
    System.out.println(Aritmeticos.resta(0,Aritmeticos.resta(5,-8)));
*/