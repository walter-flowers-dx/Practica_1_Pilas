package Ejercicio_3;

import java.util.Scanner;

public class Plato {
	String nombre;
	double precio;
	Categoria categoria;
	
	public Plato(String nombre, double precio, Categoria categoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: nombre,precio,categoria");
		nombre = lee.next();
		precio = lee.nextDouble();
		categoria.leer();
	}

	@Override
	public String toString() {
		return "Plato [nombre=" + nombre + ", precio=" + precio + ", categoria=" + categoria + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
