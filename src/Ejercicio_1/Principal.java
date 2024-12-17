package Ejercicio_1;

import java.util.Arrays;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {
        PilaLibros p = new PilaLibros();

        Libro l1 = new Libro(650, "La Divina Comedia", "Homero", 1500);
        Libro l2 = new Libro(1000, "Cien Años de Soledad", "Gabriel García Márquez", 1967);
        Libro l3 = new Libro(100, "Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
        Libro l4 = new Libro(120, "Moby Dick", "Herman Melville", 1851);
        Libro l5 = new Libro(780, "El Gran Gatsby", "F. Scott Fitzgerald", 1925);

        p.adi(l1);
        p.adi(l2);
        p.adi(l3);
        p.adi(l4);
        p.adi(l5);

        System.out.println("Pila original:");
        p.mostrar();

        System.out.println("*****************************************************************");

        System.out.println("a) Determinar cuántos libros tienen más de 500 páginas");
        cantdLibrosConMasPaginas(p);

        System.out.println("*****************************************************************");

        System.out.println("c) Ordenar la pila por el año de publicación en orden ascendente");
        ordenarPilaPorAnoPublicacion(p);

        System.out.println("Pila ordenada por año de publicación:");
        p.mostrar();
    }

    static void ordenarPilaPorAnoPublicacion(PilaLibros pila) {
        int n = pila.nroElem();
        Libro[] libros = new Libro[n];
        for (int i = 0; i < n; i++) {
            libros[i] = pila.eli();
        }
        Arrays.sort(libros, Comparator.comparingInt(Libro::getAnoPublicacion));
        for (Libro libro : libros) {
            pila.adi(libro);
        }
    }

    static void cantdLibrosConMasPaginas(PilaLibros pila) {
        int cont = 0;
        PilaLibros aux = new PilaLibros();
        
        while (!pila.esVacia()) {
            Libro l = pila.eli();
            if (l.getNroPaginas() > 500) {
                cont++;
            }
            aux.adi(l);  
        }
        pila.vaciar(aux);
        System.out.println("Cantidad de libros con más de 500 páginas: " + cont);
    }
}

