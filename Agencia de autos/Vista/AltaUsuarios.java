package Vista;

import java.util.Scanner;
import Estructura.EstructuraUsuario;

public class AltaUsuarios{
    private EstructuraUsuario Usuario;
    private String tag_user;

    public EstructuraUsuario getUser(){
        return this.Usuario;
    }

    public String getTag(){
        return this.tag_user;
    }

    public void mostrarUsuario(EstructuraUsuario Usuario){
        System.out.print("Usuario: ");
        System.out.println(Usuario.getTag());
        System.out.print("Nombre: ");
        System.out.println(Usuario.getName());
    }

    public AltaUsuarios(Scanner entry){
        String tag,pass,name;
        int level;
        System.out.print("Nombre: ");
        name = entry.nextLine();
        name = entry.nextLine();
        System.out.print("Password: ");
        pass = entry.nextLine();
        System.out.print("Tag: ");
        tag = entry.nextLine();
        this.tag_user = tag;
        System.out.print("Nivel de acceso: ");
        level = entry.nextInt();
        this.Usuario = new EstructuraUsuario(tag, pass, name, level);
    }
}