package Ejercicio_2;

import java.util.Scanner;

public class PilaZapato extends VectorZapato{
	private int tope;
	public PilaZapato() {
		this.tope = -1;
	}
	public boolean esVacia() {
		if(this.tope == -1) {
			return true; //pila vacia
		}
		else {
			return false; //pila no es vacia
		}
	}
	
	public boolean esLlena() {
		if(this.tope == max) {
			return true; //pila llena
		}
		else {
			return false;  //pila no es llena
		}
	}
	
	public void adi (Zapato elem) {
		if(!esLlena()) { //si la pila no es llena --> ! es negacion
			this.tope++;    //incrementa en una unidad tope = tope +1
			this.v[this.tope] = elem;
		}
		else {
			System.out.println("Pila llena!!!");
		}
	}
	
	public Zapato eli() {
		Zapato elem = new Zapato("",0,"",null);
		if(!esVacia()) { //si la pila no esta vacia
			elem = this.v[this.tope];
			this.tope--;  //decrementa en una unidad
		}
		else {
			System.out.println("Pila es vacia!!!");
			
		}
		return elem;
	}
	
	public void mostrar() {
		PilaZapato aux = new PilaZapato();
		System.out.println("Datos de la pila:");
		while(!esVacia()) {
			Zapato elem= new Zapato("",0,"",null);
			elem = eli();
			System.out.println(elem);
			aux.adi(elem);
		}
		vaciar(aux);
	}
	
	public void vaciar(PilaZapato p) {
		while(!p.esVacia()) { //mientras la pila p NO es vacia
			this.adi(p.eli());
		}
	}
	
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca datos: ");
		for(int i = 1;i<=n;i++) {
			Zapato elem= new Zapato("",0,"",null);
			elem.leer();
			this.adi(elem);
		}
	}
	
	public int nroElem() {
		return tope + 1;
	}
}
