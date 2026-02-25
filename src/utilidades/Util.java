package utilidades;

import java.util.Scanner;

public class Util {
    public static Scanner teclado = new Scanner(System.in);

    private static String centrar(String texto, int largo) {
        int relleno = (largo - texto.length()) / 2;
        String textoCentrado = " ".repeat(relleno) + texto;
        return textoCentrado;
    }

    public static void linea(int largo) {
        System.out.println("═".repeat(largo));
    }

    public static void encabezado(String titulo, int largo) {
        linea(largo);
        System.out.println(centrar(titulo.toUpperCase(), largo));
        linea(largo);
    }

    public static int leerNumeroEntero(String msj) {
        int numero = 0;
        while (true) {
            try {
                System.out.print(msj + ": ");
                numero = teclado.nextInt();
                return numero;

            } catch (Exception e) {
                System.out.println("Debes escribir un Numero Entero...");
                teclado.next();
            }
        }
    }

    public static String LeerTexto(String msj) {
        String texto = "";
        System.out.print(msj + ": ");
        texto = teclado.next();
        return texto;
    }
}
