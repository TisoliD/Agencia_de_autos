package Vista;

import java.util.Scanner;

public class AdminMenu{
    private Scanner entry;
    private int opcion;

    public AdminMenu(Scanner entry){        
        this.entry =  entry;
    }

    public int getOpcion(){
        return this.opcion;
    }

    public void show(){
        System.out.println("1) Alta de Usuarios");
        System.out.println("2) Baja de Usuarios");
        System.out.println("3) Cerrar Sesion");
        System.out.print("Opcion: ");
        opcion =  entry.nextInt();
    }

    public void setMessage(String message){
        System.out.print(message);
    }
    public void setMessageln(String message){
        System.out.println(message);
    }
}