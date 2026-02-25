/* monitor MSI G241V E2   
  "extension pack for java" para iniciar para a crear un proyecto en java */

package arsistema;

import java.util.Arrays;

import utilidades.Util;

public class Sumar {
    public static void main(String[] args) throws Exception {
        // Definir varibles
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;
        int numero4 = 0;
        int suma = 0;
        String repuesta = "";

        while (true) {
            Util.encabezado("Sumar numeros", 36);

            numero1 = Util.leerNumeroEntero("Ingresa el primer numero");
            numero2 = Util.leerNumeroEntero("Ingresa el segundo numero");
            numero3 = Util.leerNumeroEntero("Ingresa el tercer numero");
            numero4 = Util.leerNumeroEntero("Ingresa el cuarto numero");

            suma = calcularSuma(numero1, numero2, numero3, numero4);

            Util.linea(36);
            System.out.println("la Suma es " + suma);
            Util.linea(36);
            repuesta = Util.LeerTexto("Desea continuar si o no ?");

            if (repuesta.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

    public static int calcularSuma(int... numeros) {
        return Arrays.stream(numeros).sum();
    }
}