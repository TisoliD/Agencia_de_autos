package Vista.Catalogo;

import Objects.Vehiculo;

import java.util.ArrayList;

public class Catalogovehiculos{
    

    public void imprimirCatalagoV(ArrayList<Vehiculo> Vehiculos){
        for(int i=0; i<Vehiculos.size(); i++)
            System.out.println(Vehiculos.get(i));
      
    }

}