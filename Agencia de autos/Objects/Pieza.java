package Objects;

public class Pieza {
    private String Nombre;
    private String Modelo;
    private String NumeroParte;
    private String Fabricante;
    private String Compatibilidad;
    private String Origen;
    private int Cantidad;
    private int PrecioUnidad;

    public String getNombre(){
        return this.Nombre;
    }
    public String getModelo(){
        return this.Modelo;
    }
    public String getNumeroParte(){
        return this.NumeroParte;
    }
    public String getFabricante(){
        return this.Fabricante;
    }
    public String getCompatibilidad(){
        return this.Compatibilidad;
    }
    public String getOrigen(){
        return this.Origen;
    }
    public int getCantidad(){
        return this.Cantidad;
    }
    public int getPrecio(){
        return this.PrecioUnidad;
    }

    public Pieza(String Nombre , String Modelo, String NumeroParte, String Fabricante , String Compatibilidad, String Origen, int Cantidad, int PrecioUnidad){
        this.Nombre = Nombre;
        this.Modelo = Modelo;
        this.NumeroParte = NumeroParte;
        this.Fabricante = Fabricante;
        this.Compatibilidad = Compatibilidad;
        this.Origen = Origen;
        this.Cantidad = Cantidad;
        this.PrecioUnidad = PrecioUnidad;

    }

    public void cantidadVenderPieza(int cantidad){
        this.Cantidad -= cantidad;
    }

    public String catalogoVendedor(){
        return this.Nombre + "   " + this.Cantidad + "   " + this.PrecioUnidad;
    }

    public String toString(){
        return this.Nombre + "    " + this.Modelo + "   " + this.NumeroParte + "   " + this.Fabricante + "   " + this.Compatibilidad + "   " + this.Origen + "   " + this.Cantidad + "   "+ this.PrecioUnidad;
    }
}
