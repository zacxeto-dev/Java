package arsistema;

import java.util.HashMap;
import java.util.Map;

import utilidades.Util;

public class Empleado {
    public static void main(String[] args) {
        //Declarar un mapa de empleado
        Map<String, Object> empleado = new HashMap<>();
        empleado.put("cedula", "12.345.678");
        empleado.put("nombre", "Armando");
        empleado.put("apellido", "Casas");
        empleado.put("edad", 30);
        empleado.put("altura", 1.72);
        empleado.put("sueldo", 2000.00);

        Util.encabezado("Ver datos del empleado", 50);
        for (Map.Entry <String, Object> entrada : empleado.entrySet()) {
            System.out.println(entrada.getKey().toUpperCase() + ": " + entrada.getValue());
        }
    }
}
