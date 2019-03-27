import java.util.ArrayList;
import java.util.Date;

public class Negocio {
	ArrayList<Venta> ventas = new ArrayList<>();

	public ArrayList<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<Venta> ventas) {
		this.ventas = ventas;
	}
	
	public double gananciasDe(Date unDia) {
		double precioDeUnDia=0;
		for(Venta venta : ventas) {
			if(venta.esDeFecha(unDia)) {
				precioDeUnDia+=venta.importe();
			}
		}
		return precioDeUnDia;
	}
	
}
