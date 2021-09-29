package Vista.Administrador;

import java.util.Scanner;
import Objects.Usuario;

public class AltaUsuarios {
    private Usuario Usuario;
    private String tag_user;

    public Usuario getUser(){
        return this.Usuario;
    }

    public String getTag(){
        return this.tag_user;
    }

    public AltaUsuarios(Scanner entry){
        String name;
        String pass;
        String tag;
        String dni;
        int level;

        System.out.print("Nombre: ");
        name = entry.nextLine();
        name = entry.nextLine();
        System.out.print("Password: ");
        pass = entry.nextLine();
        System.out.print("Tag: ");
        tag = entry.nextLine();
        this.tag_user = tag;
        System.out.print("Dni: ");
        dni = entry.nextLine();
        System.out.print("Nivel de acceso: ");
        level = entry.nextInt();
        this.Usuario = new Usuario(tag, pass, name, dni, level);
    }
}
