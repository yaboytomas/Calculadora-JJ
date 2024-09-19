import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Instancias
        Calculadora calculadora = new Calculadora();


        System.out.println("");
        System.out.println("--------------------");
        System.out.println("     Calculadora    ");
        System.out.println("--------------------");

        //Sumar dos numeros enteros
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        int b = scanner.nextInt();
        System.out.println("La suma de los numeros enteros es: " + calculadora.sumarInt(a, b));
        System.out.println("--------------------");

        //Sumar dos numeros decimales
        System.out.println("");
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Ingrese el primer numero decimal: ");
        double c = scanner2.nextDouble();
        System.out.println("Ingrese el segundo numero decimal: ");
        double d = scanner2.nextDouble();
        System.out.println("La suma de los numeros decimales es: " + calculadora.sumarDouble(c, d));
        System.out.println("--------------------");

        //Sumar dos cadenas de texto
        System.out.println("");
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Ingrese la primera cadena de texto: ");
        String e = scanner3.nextLine();
        System.out.println("Ingrese la segunda cadena de texto: ");
        String f = scanner3.nextLine();
        System.out.println("La suma de las cadenas de texto es: " + calculadora.sumarString(e, f));
        System.out.println("--------------------");

        System.out.println(" Adios ! ");
        System.out.println("--------------------");


























    }
}