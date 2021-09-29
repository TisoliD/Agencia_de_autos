package Controlador;

import java.util.Scanner;
import Vista.Administrador.MenuAdmin;
import Vista.Administrador.AltaUsuarios;
import Vista.Administrador.BajaUsuarios;
import Vista.Administrador.ListadoUsuarios;
import Modelo.MDUsuario;



public class CtrlAdmin {
    private Scanner entry;
    private MDUsuario datosUsuarios;

    public CtrlAdmin(Scanner entry, MDUsuario datosUsuarios) {
        this.entry = entry;
        this.datosUsuarios = datosUsuarios;
        MenuAdmin adminMenu = new MenuAdmin(entry);
        do{
            adminMenu.show();
            boolean existencia;
            switch(adminMenu.getOpcion()){
                case 1:
                    AltaUsuarios alta = new AltaUsuarios(entry);
                    existencia = datosUsuarios.existencia(alta.getTag());
                    if (existencia){
                        System.out.println("Usuario existente");
                    }
                    else{
                        datosUsuarios.alta(alta.getUser());
                        adminMenu.setMessageln("Se ha agregado exitosamente a: ");
                        System.out.println(datosUsuarios.mostrarUsuario(alta.getTag()));
                    }
                    break;
                case 2:
                    BajaUsuarios baja = new BajaUsuarios(entry);
                    existencia = datosUsuarios.existencia(baja.getTag());
                    if (existencia){
                        adminMenu.setMessageln("Se ha borrado exitosamente a: ");
                        System.out.println(datosUsuarios.mostrarUsuario(baja.getTag()));
                        datosUsuarios.baja(baja.getUser(datosUsuarios,baja.getTag(),baja.getPass()));
                    }
                    else{
                        System.out.println("Usuario inexistente");
                    }
                    break;
                case 3://Listado de usuarios
                    ListadoUsuarios mostrarUsuarios = new ListadoUsuarios();
                    mostrarUsuarios.imprimirUsuarios(datosUsuarios.getUsuarios());
                    break;
                case 4:
                    break;
                default:
                    adminMenu.setMessageln("Opcion no disponible");
            }
        }while(adminMenu.getOpcion()!=4);
    }
}
