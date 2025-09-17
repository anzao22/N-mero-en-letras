import java.util.Scanner;

public class NumeroEnLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir un número entero entre 0 y 9
        System.out.print("Escriba un número entero entre 0 y 9: ");
        int numero = scanner.nextInt();

        // Escribir el número en letras
        String numeroEnLetras;
        switch (numero) {
            case 0:
                numeroEnLetras = "cero";
                break;
            case 1:
                numeroEnLetras = "uno";
                break;
            case 2:
                numeroEnLetras = "dos";
                break;
            case 3:
                numeroEnLetras = "tres";
                break;
            case 4:
                numeroEnLetras = "cuatro";
                break;
            case 5:
                numeroEnLetras = "cinco";
                break;
            case 6:
                numeroEnLetras = "seis";
                break;
            case 7:
                numeroEnLetras = "siete";
                break;
            case 8:
                numeroEnLetras = "ocho";
                break;
            case 9:
                numeroEnLetras = "nueve";
                break;
            default:
                numeroEnLetras = "Número fuera del rango válido";
                break;
        }

        System.out.println(+ numero + ":" + numeroEnLetras);

        scanner.close();
    }
}
