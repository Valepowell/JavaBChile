public class Algoritmos {

    // Método que retorna true si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método que retorna true si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método que retorna un String al revés
    public static String stringEnReversa(String texto) {
        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }

    // Método que retorna true si el texto es palíndromo
    public static boolean esPalindromo(String texto) {
        String reverso = stringEnReversa(texto);
        return texto.equalsIgnoreCase(reverso);
    }

    // Método que imprime la secuencia FizzBuzz
    public static void secuenciaFizzBuzz(int numero) {
        for (int i = 1; i <= numero; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
 // --- MAIN PARA PROBAR TODO ---
    public static void main(String[] args) {

        System.out.println("¿24 es par?: " + esPar(24));
        System.out.println("¿57 es primo?: " + esPrimo(57));

        String texto = "holamundo";
        System.out.println("Reversa de '" + texto + "': " + stringEnReversa(texto));

        String palabra = "ana";
        System.out.println("¿'ana' es palíndromo?: " + esPalindromo(palabra));

        System.out.println("\nSecuencia FizzBuzz hasta 15:");
        secuenciaFizzBuzz(17);
    }
}



