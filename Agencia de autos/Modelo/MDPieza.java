package Modelo;

import java.util.ArrayList;
import Objects.Pieza;

public class MDPieza{
    



    private ArrayList<Pieza> Piezas= new ArrayList<Pieza>();


    public void alta(Pieza Pieza){
        this.Piezas.add(Pieza);
    }
    public ArrayList<Pieza> getPieza(){
        return this.Piezas;
    }
    public MDPieza(){
        Piezas.add(new Pieza("Carburador","2018","12AA","Ever AutoParts","Todos","Mexico",10,300));
        Piezas.add(new Pieza("Llantas","2018","12AA","Ever AutoParts","Todos","Mexico",100,999));
    }
    public Pieza buscarPieza(String nombre){
        for(int i=0; i<Piezas.size(); i++)
            if(Piezas.get(i).getNombre().equals(nombre))
                return Piezas.get(i);                    
        return null;
    }
}