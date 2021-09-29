package Modelo;
import java.util.ArrayList;
import Objects.Usuario;

public class MDUsuario {

        private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
    
        public MDUsuario(){
            usuarios.add(new Usuario("root","1234","Admin","1569RE",1));
            usuarios.add(new Usuario("Wicho","1234","Luis","3453H",2));
        }
        
        public Usuario Logeo(String tag, String pass){
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
        public Usuario mostrarUsuario(String Tag){
            for(int i=0; i<this.usuarios.size(); i++){
                if(this.usuarios.get(i).getTag().equals(Tag)){
                    return usuarios.get(i);
                }
            }
            return null;
        }

        public ArrayList<Usuario> getUsuarios(){
            return this.usuarios;
        }

        public Usuario verficarBajaUsuario(String Tag, String Password){
            for(int i=0; i<this.usuarios.size(); i++){
                if(this.usuarios.get(i).getTag().equals(Tag) && this.usuarios.get(i).getPass().equals(Password)){
                    return usuarios.get(i);
                }
            }
            return null;
        }

        public void alta(Usuario usuario){
            this.usuarios.add(usuario);
        }

        public void baja(Usuario usuario){
            this.usuarios.remove(usuario);
        }
        
    
}
