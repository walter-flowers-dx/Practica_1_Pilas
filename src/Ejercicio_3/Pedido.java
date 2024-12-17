package Ejercicio_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
	int mesa; 
	ArrayList<Plato> arraylist = new ArrayList<>(); 
	Double total; 
	Mesero mesero;
	
	public Pedido(int mesa, ArrayList<Plato> arraylist, Double total, Mesero mesero) {
		super();
		this.mesa = mesa;
		this.arraylist = arraylist;
		this.total = total;
		this.mesero = mesero;
	}

	public int getMesa() {
		return mesa;
	}

	public void setMesa(int mesa) {
		this.mesa = mesa;
	}

	public ArrayList<Plato> getArraylist() {
		return arraylist;
	}

	public void setArraylist(ArrayList<Plato> arraylist) {
		this.arraylist = arraylist;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Mesero getMesero() {
		return mesero;
	}

	public void setMesero(Mesero mesero) {
		this.mesero = mesero;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: mesa,plato,total,mesero");
		mesa = lee.nextInt();
		total = lee.nextDouble();
		mesero.leer();
	}
	
	@Override
	public String toString() {
		return "Pedido [mesa=" + mesa + ", arraylist=" + arraylist + ", total=" + total + ", mesero=" + mesero + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
}
