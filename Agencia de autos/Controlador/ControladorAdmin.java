package Controlador;

import java.util.Scanner;

import Vista.AdminMenu;
import Vista.AltaUsuarios;
import Vista.BajaUsuarios;
import Modelo.BaseUsuarios;

public class ControladorAdmin{

    private Scanner entry;
    private BaseUsuarios datosUsuarios;

    public ControladorAdmin(Scanner entry, BaseUsuarios datosUsuarios) {
        this.entry = entry;
        this.datosUsuarios = datosUsuarios;
        AdminMenu adminMenu = new AdminMenu(entry);
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
                case 3:
                    break;
                default:
                    adminMenu.setMessageln("Opcion no disponible");
            }
        }while(adminMenu.getOpcion()!=3);
    }
}