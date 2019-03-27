
public class Prenda {
	double precioBase;
	Estado estado;
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public double precio() {
		return estado.precioFinal(precioBase);
	}
	
}
