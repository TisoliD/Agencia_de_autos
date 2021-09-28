package Controlador;

import java.util.Scanner;

import Vista.Login;
import Estructura.EstructuraUsuario;
import Modelo.BaseUsuarios;

public class ControladorLogin{
    private Scanner entry = new Scanner(System.in);
    private Login login = new Login(entry);
    private BaseUsuarios datosUsuarios = new BaseUsuarios();

    public ControladorLogin(){
        do{
            login.show();
            EstructuraUsuario usuario = datosUsuarios.Logeo(login.getTag(),login.getPass());
            if(usuario!=null){
                login.setMessage("Bienvenido ");
                login.setMessageln(usuario.getTag());
                switch(usuario.getLevel()){
                    case 1://Administrador
                        new ControladorAdmin(entry, datosUsuarios);
                        break;
                    case 2://Vendedor
                        break;
                    case 3://Cliente
                        break;
                    case 4://Asesor
                        break;
                    case 5://Mecanico
                        break;
                    case 6://Encargado de inventario
                        break;
                }
            }else{
                login.setMessageln("----------------Pruebe denuevo----------------");
            }
        }while(true);
    }
}
