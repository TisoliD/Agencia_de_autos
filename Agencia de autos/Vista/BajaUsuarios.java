package Vista;

import java.util.Scanner;
import Estructura.EstructuraUsuario;
import Modelo.BaseUsuarios;

public class BajaUsuarios{
    private EstructuraUsuario Usuario;
    private String tag_user, pass_user;
    private BaseUsuarios datosUsuarios;

    public EstructuraUsuario getUser(BaseUsuarios datosUsuarios,String tag,String pass) {
        this.datosUsuarios = datosUsuarios;
        return this.Usuario = datosUsuarios.verficarBajaUsuario(tag, pass);
    }

    public String getTag(){
        return this.tag_user;
    }
    
    public String getPass(){
        return this.pass_user;
    }
    public void mostrarUsuario(EstructuraUsuario Usuario){
        System.out.print("Usuario: ");
        System.out.println(Usuario.getTag());
        System.out.print("Nombre: ");
        System.out.println(Usuario.getName());
    }
    public BajaUsuarios(Scanner entry){
        
        String tag, pass;
        System.out.print("Tag: ");
        tag = entry.nextLine();
        tag = entry.nextLine();
        this.tag_user = tag;
        System.out.print("Password: ");
        pass = entry.nextLine();
        this.pass_user = pass;
    }
}