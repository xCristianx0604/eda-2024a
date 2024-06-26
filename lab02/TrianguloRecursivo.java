import java.util.*;
public class TrianguloRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a mi triangulito Recursivo");
        System.out.println("Ingrese la base del triangulito: ");
        int base = sc.nextInt();
        trianguloRecursivo(base);
        sc.close();
    }

    public static void trianguloRecursivo(int base) {
        imprimirTriangulo(base, 0);
    }

    public static void imprimirTriangulo(int base, int linea) {
        if (linea < base) {
            imprimirLinea(linea + 1);
            imprimirTriangulo(base, linea + 1);
        }
    }

    public static void imprimirLinea(int longitud) {
        if (longitud > 0) {
            imprimirLinea(longitud - 1);
            System.out.print("*");
        } else {
            System.out.println();
        }
    }
}

