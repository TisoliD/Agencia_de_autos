package Vista.Administrador;


import java.util.Scanner;
import Objects.Usuario;
import Modelo.MDUsuario;


public class BajaUsuarios{
    private Usuario Usuario;
    private String tag_user, pass_user;
    private MDUsuario datosUsuarios;

    public Usuario getUser(MDUsuario datosUsuarios,String tag,String pass) {
        this.datosUsuarios = datosUsuarios;
        return this.Usuario = datosUsuarios.verficarBajaUsuario(tag, pass);
    }

    public String getTag(){
        return this.tag_user;
    }
    
    public String getPass(){
        return this.pass_user;
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
