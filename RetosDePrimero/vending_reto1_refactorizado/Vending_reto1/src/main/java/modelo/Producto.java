package modelo;

public class Producto {

    private String nombre;
    private double precio;
    private Categoria tipo;

    public Producto(String nombre, double precio, Categoria tipo){
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getTipo() {
        return tipo;
    }

    public void setTipo(Categoria tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto=> nombre: " + nombre +
                          ", precio: " + precio +
                          "€, tipo: " + tipo +
                          ".\n";
    }

}
