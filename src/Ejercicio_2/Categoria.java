package Ejercicio_2;
import java.util.Scanner;

public class Categoria {
	String nombre;
	String tipo;
	
	public Categoria(String nombre, String tipo) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: nombre, tipo");
		nombre = lee.next();
		tipo = lee.next();
	}

	@Override
	public String toString() {
		return "Categoria [nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	
	
}
