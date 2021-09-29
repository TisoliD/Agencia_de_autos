package Vista.Vendedor;

import java.util.Scanner;
import Objects.Pieza;
import Modelo.MDPieza;

public class VentaPieza {
    private Pieza piezas;
    private String nombre;
    private int cantidad;

    public Pieza getPieza(MDPieza mdpieza){
        this.piezas = mdpieza.buscarPieza(nombre);
        return this.piezas;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public VentaPieza(Scanner entry){
        String nombre;
        int Cantidad;
        System.out.println("Nombre de la pieza: ");
        nombre = entry.nextLine();
        nombre = entry.nextLine();
        this.nombre = nombre;
        System.out.println("Cantidad: ");
        Cantidad = entry.nextInt();
        this.cantidad = Cantidad;
    }
}
