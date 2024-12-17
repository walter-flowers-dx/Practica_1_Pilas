package Ejercicio_2;
import java.util.Arrays;
import java.util.Comparator;
public class Principal {

public static void main(String[] args) {
PilaZapato pila = new PilaZapato();

        Categoria cat1 = new Categoria("deportivos", "calzado");
        Categoria cat2 = new Categoria("casual", "calzado");

        pila.adi(new Zapato("negro", 42, "Nike", cat1));
        pila.adi(new Zapato("blanco", 40, "Adidas", cat1));
        pila.adi(new Zapato("rojo", 38, "Puma", cat2));
        pila.adi(new Zapato("azul", 44, "Reebok", cat1));

        System.out.println("Pila original:");
        pila.mostrar();
        
        System.out.println("=====================================================================================");
        System.out.println("A) Verificar que los zapatos están en orden según su tamaño dentro de cada categoría");
        verificarOrdenTamanoPorCategoria(pila);
        
        System.out.println("=====================================================================================");
        System.out.println("C) Ordenar los zapatos por marca en orden alfabético");
        ordenarPorMarca(pila);

        System.out.println("=====================================================================================");
        System.out.println("E) Contar cuántos zapatos en la pila pertenecen a la categoría 'deportivos'");
        contarZapatosDeportivos(pila);
	}
	
	//E)
	public static void contarZapatosDeportivos(PilaZapato pila) {
	    PilaZapato aux = new PilaZapato();
	    int contador = 0;

	    while (!pila.esVacia()) {
	        Zapato zapatoActual = pila.eli();
	        if (zapatoActual.getCategoria().getnombre().equalsIgnoreCase("deportivos")) {
	            contador++;
	        }
	        aux.adi(zapatoActual);
	    }
	    pila.vaciar(aux);
	    System.out.println("Cantidad de zapatos de la categoría 'deportivos': " + contador);
	}

	
	// C)
	public static void ordenarPorMarca(PilaZapato pila) {
	    int n = pila.nroElem();
	    Zapato[] zapatos = new Zapato[n];
	    for (int i = 0; i < n; i++) {
	        zapatos[i] = pila.eli();
	    }
	    Arrays.sort(zapatos, Comparator.comparing(Zapato::getMarca));
	    for (Zapato zapato : zapatos) {
	        pila.adi(zapato);
	    }
	    
	    System.out.println("Zapatos ordenados por marca en orden alfabético:");
	    pila.mostrar();
	}
	
	// A)
	public static void verificarOrdenTamanoPorCategoria(PilaZapato pila) {
	    PilaZapato aux = new PilaZapato();
	    boolean estaOrdenado = true;
	    Zapato zapatoAnterior = null;
	    while (!pila.esVacia()) {
	        Zapato zapatoActual = pila.eli();

	        if (zapatoAnterior != null && zapatoActual.getCategoria().getnombre().equals(zapatoAnterior.getCategoria().getnombre())) {
	            if (zapatoActual.getTamano() < zapatoAnterior.getTamano()) {
	                estaOrdenado = false;
	                break;
	            }
	        }

	        aux.adi(zapatoActual);
	        zapatoAnterior = zapatoActual;
	    }
	    pila.vaciar(aux);

	    if (estaOrdenado) {
	        System.out.println("Los zapatos están ordenados por tamaño dentro de cada categoría.");
	    } else {
	        System.out.println("Los zapatos NO están ordenados por tamaño dentro de cada categoría.");
	    }
	}
	
	


}
