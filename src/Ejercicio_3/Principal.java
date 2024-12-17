package Ejercicio_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {
        PilaPedidos pila = new PilaPedidos();

        Mesero mesero1 = new Mesero("Carlos", 6);
        Mesero mesero2 = new Mesero("Ana", 4);
        
        Categoria cat1 = new Categoria("Entradas", "Comida");
        Categoria cat2 = new Categoria("Postres", "Comida");
        Categoria cat3 = new Categoria("Bebidas", "Bebida");
        
        ArrayList<Plato> platos1 = new ArrayList<>();
        platos1.add(new Plato("Ensalada", 30.0, cat1));
        platos1.add(new Plato("Helado", 20.0, cat2));
        
        ArrayList<Plato> platos2 = new ArrayList<>();
        platos2.add(new Plato("Sopa", 25.0, cat1));
        platos2.add(new Plato("Vino", 50.0, cat3));
        
        Pedido pedido1 = new Pedido(1, platos1, 50.0, mesero1);
        Pedido pedido2 = new Pedido(2, platos2, 75.0, mesero2);
        
        pila.adi(pedido1);
        pila.adi(pedido2);
        
        System.out.println("*******************************************************************************************************");
        System.out.println("A) Mostrar todos los pedidos realizados en una mesa específica, agrupados por categoría de plato");
        mostrarPedidosPorMesaAgrupadosPorCategoria(pila, 1);
        
        System.out.println("*******************************************************************************************************");
        System.out.println("C) Mostrar el precio total del pedido más caro realizado por un mesero con más de 5 años de experiencia");
        mostrarPedidoMasCaroPorMeseroConExperiencia(pila, 5);
        
        System.out.println("*******************************************************************************************************");
        System.out.println("E) Filtrar los pedidos para mostrar solo aquellos que incluyen platos de una categoría específica");
        filtrarPedidosPorCategoria(pila, "Bebidas");
    }
	// E)
	public static void filtrarPedidosPorCategoria(PilaPedidos pila, String categoriaEspecifica) {
	    PilaPedidos aux = new PilaPedidos();
	    boolean hayPedidos = false;
	    while (!pila.esVacia()) {
	        Pedido pedido = pila.eli();
	        boolean contieneCategoria = false;

	        for (Plato plato : pedido.getArraylist()) {
	            if (plato.getCategoria().getNombre().equalsIgnoreCase(categoriaEspecifica)) {
	                contieneCategoria = true;
	                break;
	            }
	        }
	        if (contieneCategoria) {
	            hayPedidos = true;
	            pedido.mostrar();
	        }
	        aux.adi(pedido);
	    }
	    pila.vaciar(aux);

	    if (!hayPedidos) {
	        System.out.println("No se encontraron pedidos que incluyan platos de la categoría " + categoriaEspecifica);
	    }
	}

	
	
	// C)
	public static void mostrarPedidoMasCaroPorMeseroConExperiencia(PilaPedidos pila, int aniosExperiencia) {
	    PilaPedidos aux = new PilaPedidos();
	    double maxTotal = 0;
	    Pedido pedidoMasCaro = null;
	    while (!pila.esVacia()) {
	        Pedido pedido = pila.eli();
	        if (pedido.getMesero().getExperiencia() > aniosExperiencia && pedido.getTotal() > maxTotal) {
	            maxTotal = pedido.getTotal();
	            pedidoMasCaro = pedido;
	        }
	        aux.adi(pedido);
	    }
	    pila.vaciar(aux);
	    if (pedidoMasCaro != null) {
	        System.out.println("El pedido más caro realizado por un mesero con más de " + aniosExperiencia + " años de experiencia es:");
	        pedidoMasCaro.mostrar();
	    } else {
	        System.out.println("No se encontraron pedidos realizados por meseros con más de " + aniosExperiencia + " años de experiencia.");
	    }
	}

	
	// A)
	public static void mostrarPedidosPorMesaAgrupadosPorCategoria(PilaPedidos pila, int mesaEspecifica) {
	    PilaPedidos aux = new PilaPedidos();
	    boolean hayPedidos = false;
	    while (!pila.esVacia()) {
	        Pedido pedido = pila.eli();
	        if (pedido.getMesa() == mesaEspecifica) {
	            hayPedidos = true;
	            System.out.println("Pedido de la mesa " + mesaEspecifica + ":");
	            Map<String, List<Plato>> platosPorCategoria = new HashMap<>();
	            for (Plato plato : pedido.getArraylist()) {
	                String categoria = plato.getCategoria().getNombre();
	                platosPorCategoria.putIfAbsent(categoria, new ArrayList<>());
	                platosPorCategoria.get(categoria).add(plato);
	            }
	            for (Map.Entry<String, List<Plato>> entry : platosPorCategoria.entrySet()) {
	                System.out.println("Categoría: " + entry.getKey());
	                for (Plato plato : entry.getValue()) {
	                    System.out.println("   " + plato);
	                }
	            }
	        }
	        aux.adi(pedido);
	    }
	    pila.vaciar(aux);

	    if (!hayPedidos) {
	        System.out.println("No se encontraron pedidos para la mesa " + mesaEspecifica);
	    }
	}
	
	
}
