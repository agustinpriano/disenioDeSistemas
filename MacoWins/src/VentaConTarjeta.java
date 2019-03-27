
public class VentaConTarjeta extends Venta{
	int coeficienteTarjeta;
	int cantidadCuotas;
	public int getCoeficienteTarjeta() {
		return coeficienteTarjeta;
	}
	public void setCoeficienteTarjeta(int coeficienteTarjeta) {
		this.coeficienteTarjeta = coeficienteTarjeta;
	}
	public int getCantidadCuotas() {
		return cantidadCuotas;
	}
	public void setCantidadCuotas(int cantidadCuotas) {
		this.cantidadCuotas = cantidadCuotas;
	}
	
	@Override
	public double importe() {
		return coeficienteTarjeta * cantidadCuotas + 0.01 * super.importe() + super.importe();
	}
	
}
