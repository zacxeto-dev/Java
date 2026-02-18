// monitor MSI G241V E2

package arsistema;

import utilidades.Util;

public class Sumar {
    public static void main(String[] args) throws Exception {
        // Definir varibles
        int numero1 = 0;
        int numero2 = 0;
        int suma = 0;

        Util.encabezado("Sumar numeros", 36);

        numero1 = Util.leerNumeroEntero("Ingresa el primer numero");
        numero2 = Util.leerNumeroEntero("Ingresa el segundo numero");

        suma = numero1 + numero2;

        Util.linea(36);
        System.out.println("la Suma es " + suma);
        Util.linea(36);
    }
}