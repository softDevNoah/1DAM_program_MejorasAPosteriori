package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cesta {

    private List<Producto> productos;
    private double total;

    public Cesta() {
        this.productos = new ArrayList<>(10);
        total = 0;
    }

    public Cesta(List<Producto> productos) {
        this.productos = productos;
        setTotal();
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal() {

        for (Producto producto : productos) {

            total += producto.getPrecio();

        }
    }

    //public void
}
