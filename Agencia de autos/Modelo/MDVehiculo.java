package Modelo;

import java.util.ArrayList;
import Objects.Vehiculo;

public class MDVehiculo {
    



    private ArrayList<Vehiculo> Vehiculos= new ArrayList<Vehiculo>();


    public void alta(Vehiculo Vehiculo){
        this.Vehiculos.add(Vehiculo);
    
    }


    public ArrayList<Vehiculo> getVehiculos(){
        return this.Vehiculos;
    }

    public MDVehiculo(){
        Vehiculos.add(new Vehiculo("ford","Todo terreno","negro","1281564","Automatica",2020,23,10));
        Vehiculos.add(new Vehiculo("mazda","Ecologico","negro","1281564","Automatica",2021,23,5));
        Vehiculos.add(new Vehiculo("chebrolet","Familiar","negro","1281564","Automatica",2000,23,1));
    }

    public Vehiculo buscarVehiculo(String numserie){
        for(int i= 0; i<Vehiculos.size(); i++){
            if(Vehiculos.get(i).getNumSerie().equals(numserie))
                return Vehiculos.get(i);
        }
        return null;
    }
}
