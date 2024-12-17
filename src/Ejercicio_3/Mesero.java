package Ejercicio_3;

import java.util.Scanner;

public class Mesero {
	String nombre;
	int experiencia;
	
	public Mesero(String nombre, int experiencia) {
		super();
		this.nombre = nombre;
		this.experiencia = experiencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. datos: nombre, experiencia");
		nombre = lee.next();
		experiencia = lee.nextInt();
	}

	@Override
	public String toString() {
		return "Mesero [nombre=" + nombre + ", experiencia=" + experiencia + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
