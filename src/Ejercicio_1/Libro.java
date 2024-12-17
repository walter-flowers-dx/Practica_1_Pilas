package Ejercicio_1;
import java.util.Scanner;

public class Libro {
	int nroPaginas;
	String titulo;
	String autor;
	int anoPublicacion;
	
	public Libro(int nroPaginas, String titulo, String autor, int anoPublicacion) {
		super();
		this.nroPaginas = nroPaginas;
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacion = anoPublicacion;
	}

	public int getNroPaginas() {
		return nroPaginas;
	}

	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacion() {
		return anoPublicacion;
	}

	public void setAnoPublicacion(int anoPublicacion) {
		this.anoPublicacion = anoPublicacion;
	}
	
	public void leer() {
		Scanner lee = new Scanner(System.in);
		System.out.println("Intr. Datos: nroPaginas,titulo,autor,anoPublicacion");
		nroPaginas = lee.nextInt();
		titulo = lee.next();
		autor = lee.next();
		anoPublicacion = lee.nextInt();
	}

	@Override
	public String toString() {
		return "Libro [nroPaginas=" + nroPaginas + ", titulo=" + titulo + ", autor=" + autor + ", anoPublicacion="
				+ anoPublicacion + "]";
	}
	
	public void mostrar() {
		System.out.println(toString());
	}
	
}
