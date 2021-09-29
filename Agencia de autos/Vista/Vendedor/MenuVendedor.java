package Vista.Vendedor;
import java.util.Scanner;
public class MenuVendedor{

    private Scanner sc;
    private int opcion;

    public MenuVendedor(Scanner sc){        
        this.sc =  sc;
    }

    public int getOpcion(){
        return this.opcion;
    }

    public void show(){
        System.out.println("1) Ver catalogo piezas");
        System.out.println("2) Realizar una venta");
        System.out.println("3) Ver catalogo de vehiculos");
        System.out.println("4) Cerrar sesion");
        System.out.print("Opcion: ");
        opcion =  sc.nextInt();
    }

    public void setMsg(String msg){
        System.out.println(msg);
    }

}