package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String n, String d) {
		this.nombre = n;
		this.direccion = d;
		this.productos = new ArrayList<>();
	}
	
	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public Double getPrecioTotal() {
		Double sumaTotal = 0.0;
		for(Producto producto : productos) {
			sumaTotal += producto.getPrecio();
		}
	return sumaTotal;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
}
