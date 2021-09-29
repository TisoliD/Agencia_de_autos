package Vista.Vendedor;
import java.util.Scanner;
public class MenuVenta {
    private Scanner sc;
    private int opcion;

    public MenuVenta(Scanner sc){        
        this.sc =  sc;
    }

    public int getOpcion(){
        return this.opcion;
    }

    public void show(){
        System.out.println("1) Piezas");
        System.out.println("2) Vehiculos");
        System.out.println("3) Salir");
        System.out.print("Opcion: ");
        opcion =  sc.nextInt();
    }

    public void setMsg(String msg){
        System.out.println(msg);
    }
}