// monitor MSI G241V E2

package arsistema;

public class Sumar {
    public static void main(String[] args) throws Exception {
        encabezado("Sumar numeros", 36);
        encabezado("Estos es una prueba", 46);
        encabezado("Bienvenidos a la programación", 56);
    }

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
