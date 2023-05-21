package co.edu.unac.poo1;

import co.edu.unac.poo1.acciones.Movimiento;

import java.util.*;

public class Unidad1 {
    public static void verDatosMapa(){
        Canino canino1 = new Canino("Pitbull",14F,10);
        Canino canino2 = new Canino("Doberman",14F,5);
        Canino canino3 = new Canino("Chihuahua",14F,113);
        Canino canino4 = new Canino("Labrador",50F,13);

        List<Canino> listaCaninos = new LinkedList<>();

        listaCaninos.add(canino1);
        listaCaninos.add(canino2);
        listaCaninos.add(canino3);
        listaCaninos.add(canino4);

         Map<String, Movimiento> mapaCaninos = new HashMap<>();
        mapaCaninos.put(canino1.getNombre(), canino1);
        mapaCaninos.put(canino2.getNombre(), canino2);
        mapaCaninos.put(canino3.getNombre(), canino3);

         List<Movimiento> listCaninos = new LinkedList<>(mapaCaninos.values());
        for (Movimiento canino: listCaninos){
            canino.verInformacion();
        }

        System.out.println("##############################");


    }
}
