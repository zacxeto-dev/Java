package utilidades;

public class Util {

    public static String centrar(String texto, int largo) {
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
}
