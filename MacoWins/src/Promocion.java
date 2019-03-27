
public class Promocion implements Estado{
	double descuento;
	public double getDescuento() {
		return descuento;
	}
	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}
	@Override
	public double precioFinal(double precioOriginal) {
		return precioOriginal - descuento;
	}
}
