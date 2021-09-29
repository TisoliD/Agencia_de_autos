package Vista.Vendedor;
import java.util.Scanner;
import Objects.Vehiculo;
import Modelo.MDVehiculo;

public class VentaVehiculo {
    private Vehiculo vehiculo;
    private String numserie;

    public Vehiculo getVehiculo(MDVehiculo mdvehiculo) {
        this.vehiculo = mdvehiculo.buscarVehiculo(numserie);
        return this.vehiculo;
    }

    public VentaVehiculo(Scanner entry){
        String numserie;
        System.out.println("Numero de serie: ");
        numserie = entry.nextLine();
        numserie = entry.nextLine();
        this.numserie = numserie;
    }
}
