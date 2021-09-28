package Modelo;

import Estructura.EstructuraUsuario;

import java.util.ArrayList;

public class BaseUsuarios{

    private ArrayList<EstructuraUsuario> usuarios = new ArrayList<EstructuraUsuario>();

    public BaseUsuarios(){
        usuarios.add(new EstructuraUsuario("root","1234","Admin",1));
        usuarios.add(new EstructuraUsuario("Wicho","1234","Luis",2));
    }
    
    public EstructuraUsuario Logeo(String tag, String pass){
        for(int i=0;i<usuarios.size();i++){
            if(usuarios.get(i).getTag().equals(tag) && usuarios.get(i).getPass().equals(pass))
                return usuarios.get(i);
        }
        return null;
    }
    public boolean existencia(String Tag){
        for(int i=0; i<this.usuarios.size(); i++){
            if(this.usuarios.get(i).getTag().equals(Tag)){
                return true;
            }
        }
        return false;
    }
    public EstructuraUsuario mostrarUsuario(String Tag){
        for(int i=0; i<this.usuarios.size(); i++){
            if(this.usuarios.get(i).getTag().equals(Tag)){
                return usuarios.get(i);
            }
        }
        return null;
    }
    public EstructuraUsuario verficarBajaUsuario(String Tag, String Password){
        for(int i=0; i<this.usuarios.size(); i++){
            if(this.usuarios.get(i).getTag().equals(Tag) && this.usuarios.get(i).getPass().equals(Password)){
                return usuarios.get(i);
            }
        }
        return null;
    }
    public void alta(EstructuraUsuario usuario){
        this.usuarios.add(usuario);
    }
    public void baja(EstructuraUsuario usuario){
        this.usuarios.remove(usuario);
    }
}