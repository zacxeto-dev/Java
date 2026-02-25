package arsistema;

import utilidades.Alumno;
import utilidades.Util;

public class Registro {
    public static void main(String[] args) {
        Alumno alumno = new Alumno(
                "12.345.678",
                "raul",
                "chato padilla",
                87,
                1.70,
                123.33,
                false,
                1);

        verDatosAlumno(alumno);
    }

    private static void verDatosAlumno(Alumno alumno) {
        Util.encabezado("Datos del alumno", 45);
        System.out.println("Cédula: " + alumno.getCedula());
        var nombreCompleto = alumno.getNombre() + " " + alumno.getApellido();
        System.out.println("Nombre Completo: " + nombreCompleto.toUpperCase());
        System.out.printf("Edad: %d años %n", alumno.getEdad());
        System.out.printf("Altura: %.2f metros %n", alumno.getAltura());
        System.out.printf("Costo de la matricula: %.2f Dólares %n", alumno.getMatricula());
        System.out.println("sexo: " + obtenerSexo(alumno.isSexo()));
        System.out.println("Turno: " + obtenerTurno(alumno.getTurno()));
        Util.linea(45);
    }

    private static String obtenerTurno(int turno) {
        String resultado = switch (turno) {
            case 1 -> "Mañana";
            case 2 -> "Tarde";
            case 3 -> "Noche";
            default -> "No tiene turno";
        };

        return resultado;
    }

    private static String obtenerSexo(boolean sexo) {
        if (sexo) {
            return "Femenino";
        } else {
            return "Masculino";
        }
    }
}
