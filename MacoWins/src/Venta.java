import java.util.Date;
import java.util.ArrayList;

public class Venta {
	ArrayList<Item> items = new ArrayList<>();
	Date fecha;
	public ArrayList<Item> getItems() {
		return items;
	}
	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public double importe() {
		double precioTotal = 0;
		for(Item item : items) {
			precioTotal+=item.importe();
		}
		return precioTotal;
	}
	public boolean esDeFecha(Date unaFecha) {
		return fecha == unaFecha;
	}
	
}
