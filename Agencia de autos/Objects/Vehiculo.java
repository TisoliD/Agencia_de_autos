package Objects;

public class Vehiculo {

    private String Marca;
    private String Modelo;
    private String Color;
    private String NumSerie;
    private String TipoTransmision;
    private int Año;
    private int Precio;
    private int Cantidad;

    public String getMarca(){
        return this.Marca;
    }
    public String getModelo(){
        return this.Modelo;
    }
    public String getColor(){
        return this.Color;
    }
    public String getNumSerie(){
        return this.NumSerie;
    }
    public String getNumMotor(){
        return this.TipoTransmision;
    }
    public int getAño(){
        return this.Año;
    }
    public int getPrecio(){
        return this.Precio;
    }
    public int getCantidad(){
        return this.Cantidad;
    }

    public Vehiculo(String Marca , String Modelo, String Color, String NumSerie , String TipoTransmision,int Año, int Precio, int Cantidad){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.NumSerie = NumSerie;
        this.TipoTransmision = TipoTransmision;
        this.Año = Año;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
    }

    public void cantidadVenderVehiculo(){
        this.Cantidad--;
    }

    public String toString(){
        return this.Marca + "    " + this.Modelo + "   " + this.Color + "   " + this.NumSerie + "   " + this.TipoTransmision + "   " + this.Año + "   " + this.Precio + "  " + this.Cantidad;
    }
}
