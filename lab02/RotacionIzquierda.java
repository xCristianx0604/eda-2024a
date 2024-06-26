import java.util.*;
public class RotacionIzquierda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nIngrese el tamaño del array:");
        int tamaño = sc.nextInt();
        System.out.println("Ingrese los valores del array:");
        int[] Array = new int[tamaño];
        
        for( int i = 0; i<tamaño;i++){
            Array[i] = sc.nextInt();  
        }
        System.out.println("Ingrese el tamaño de la rotacion: ");
        int d = sc.nextInt();
        System.out.println("Array Original:");
        ImprimirArray(Array);

        int[] ArrayRotadoIzquierda = RotarArrayIzquierda(Array,d);
        System.out.println("\nArrayRotadoIzquierda:");
        
        ImprimirArray(ArrayRotadoIzquierda);

        sc.close();
    }
    
    public static int[] RotarArrayIzquierda(int[] Array, int d){
        int[] ArrayRotadoIzquierda = new int[Array.length];
        for (int i = 0; i < Array.length; i++) {
            // Calcula la nueva posición rotada
            int nuevaPosicion = (i + Array.length - d) % Array.length; 
            ArrayRotadoIzquierda[nuevaPosicion] = Array[i];
        }
        return ArrayRotadoIzquierda;
    }
    
    public static void ImprimirArray(int[] Array) {
        for(int i=0; i<Array.length;i++)
            System.out.print(Array[i] + " ");
    }
}
