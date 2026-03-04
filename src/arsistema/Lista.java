package arsistema;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import utilidades.Util;

public class Lista {
    public static void main(String[] args) {
        // Declarar una Lista de Edades
        List<Integer> edades = new ArrayList<>(List.of(
                12,
                18,
                34,
                80,
                11,
                11,
                32,
                32,
                92,
                23,
                15,
                64,
                9,
                8,
                5));

        Util.linea(50);
        System.out.println("Cantidad de edades es " + edades.size());
        Util.linea(50);
        System.out.println("La tercera edad es " + edades.get(3));
        Util.linea(50);
        System.out.println("La quinta edad es " + edades.get(9));
        Util.linea(50);
        System.out.println("La ultima edad es " + edades.getLast());
        Util.linea(50);
        edades.add(34);
        edades.add(43);
        edades.addAll(List.of(14, 17, 12, 3, 3));
        System.out.println(edades);
        Util.linea(50);
        System.out.println("Cantidad de edades Actualizadas es " + edades.size());
        Util.linea(50);
        var porcionLista = edades.subList(3, 8);
        System.out.println("Ver porción de la Lista " + porcionLista);
        Util.linea(50);

        // Diferentes manera de leer la Listas 
        Util.encabezado("Leer la lista de edades (for i)", 50);
        for (int i = 0; i < edades.size(); i++) {
            System.out.printf("La edad %d es %d %n ", i, edades.get(i));
        }

        Util.encabezado("Leer la lista edades usando (forEach)", 50);
        for (Integer edad : edades) {
            System.out.println("La edad es " + edad);
        }

        Util.encabezado("Leer la lista de edades usando (String)", 50);
        edades
                .stream()
                .forEach((edad) -> System.out.println("La edad es " + edad));

        // Ordenado ascendente y Descendente
        Util.encabezado("Edades ordenadas ascendente", 50);
        edades
                .stream()
                .sorted()
                .forEach((edad) -> System.out.println("La edad es " + edad));

        Util.encabezado("Edades ordenadas descendente", 50);
        edades
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach((edad) -> System.out.println("La edad es " + edad));

        // Filtro de mayor y menor
        Util.encabezado("Ver los mayores de edad", 50);
        edades
                .stream()
                .filter((edad) -> edad >= 18)
                .forEach((edad) -> System.out.println("La edad es " + edad));

        Util.encabezado("Ver los menores de edad", 50);
        edades
                .stream()
                .filter((edad -> edad < 18))
                .forEach((edad) -> System.out.println("La edad es " + edad));

        // Edades unicas
        Util.encabezado("Ver edades únicas", 50);
        Set<Integer> edadesUnicas = new HashSet<>(edades);
        edadesUnicas
                .stream()
                .forEach((edad) -> System.out.println("La edad es " + edad));

    }

}
