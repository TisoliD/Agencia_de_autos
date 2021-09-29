package Vista.Administrador;
import java.util.ArrayList;
import Objects.Usuario;

public class ListadoUsuarios {

    public void imprimirUsuarios(ArrayList<Usuario> usuarios){
        for(int i=0; i<usuarios.size(); i++)
            System.out.println(usuarios.get(i));
      
    }
}
