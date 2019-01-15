package ar.keze.beans;

public class Camiseta {

	private int id;
	private Marca Marca;
	private String numero;
	
	public int getId() { 
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Marca getMarca() {
		return Marca;
	}
	public void setMarca(Marca marca) {
		Marca = marca;
	}
	@Override
	public String toString() {
		return "Camiseta [id=" + id + ", Marca=" + Marca + ", numero=" + numero + "]";
	}
	
	
	
}
