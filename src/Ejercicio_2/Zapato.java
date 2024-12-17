package Ejercicio_2;

import java.util.Scanner;

public class Zapato {
	String color;
	int tamano;
	String marca;
	Categoria categoria;
	
	public Zapato(String color, int tamano, String marca, Categoria categoria) {
		super();
		this.color = color;
		this.tamano = tamano;
		this.marca = marca;
		this.categoria = categoria;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTamano() {
		return tamano;
	}

	public void setTamano(int tamano) {
		this.tamano = tamano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. datos: color,tamaño,marca,categoria");
		color = lee.next();
		tamano = lee.nextInt();
		marca = lee.next();
		categoria.leer();
	}

	@Override
	public String toString() {
		return "Zapato [color=" + color + ", tamano=" + tamano + ", marca=" + marca + ", categoria=" + categoria + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
