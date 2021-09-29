package Vista.Administrador;

import java.util.Scanner;

public class MenuAdmin {
   
    private Scanner entry;
    private int opcion;

    public MenuAdmin(Scanner entry){        
        this.entry =  entry;
    }

    public int getOpcion(){
        return this.opcion;
    }

    public void show(){
        System.out.println("1) Alta de Usuarios");
        System.out.println("2) Baja de Usuarios");
        System.out.println("3) Mostrar Usuarios");
        System.out.println("4) Cerrar Sesion");
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

