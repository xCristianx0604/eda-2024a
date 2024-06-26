import java.util.*;

public class ArrayInvertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nIngrese el tamaño del array:");
        int tamañoArray = sc.nextInt();
        System.out.println("Ingrese los valores del array:");
        int[] Array = new int[tamañoArray];
        // pasar los valores por teclado en el array
        for(int i = 0; i < tamañoArray; i++){
            Array[i] = sc.nextInt();
        }
        System.out.println("Array original:");
        imprimirMatriz(Array); // imprimir el array actual
        
        int[] ArrayInvertida = invertirArray(Array); // método para hallar el array invertido
        
        System.out.println("\nArray invertida:");
        imprimirMatriz(ArrayInvertida); // imprime el array invertido
        sc.close();
    }
    
    public static int[] invertirArray(int[] Array) {
        int[] ArrayInvertida = new int[Array.length]; // se crea el array invertido
        
        for (int i = 0; i < Array.length; i++) {
            ArrayInvertida[i] = Array[Array.length-1-i]; // se invierte el array
        }
        
        return ArrayInvertida;
    }
    
    public static void imprimirMatriz(int[] matriz) {
        for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i] + " ");
        }
        System.out.println();
    }
}

