package Vista.Catalogo;

import Objects.Pieza;

import java.util.ArrayList;

public class CatalogopiezasV {

    public void imprimirCatalagoV(ArrayList<Pieza> Piezas){
        for(int i=0; i<Piezas.size(); i++)
            System.out.println(Piezas.get(i).catalogoVendedor());
    }
}
