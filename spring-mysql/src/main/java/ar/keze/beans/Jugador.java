package ar.keze.beans;

public class Jugador {

	private int id;
	private Equipo equipo;
	private Camiseta camiseta;
	private String nombre;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Equipo getEquipo() {
		return equipo;
	}
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}
	public Camiseta getCamiseta() {
		return camiseta;
	}
	public void setCamiseta(Camiseta camiseta) {
		this.camiseta = camiseta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Jugador [id=" + id + ", equipo=" + equipo + ", camiseta=" + camiseta + ", nombre=" + nombre + "]";
	}

	
	
	
}
