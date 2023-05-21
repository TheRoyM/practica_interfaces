package co.edu.unac.poo1;

import co.edu.unac.poo1.acciones.Movimiento;
import co.edu.unac.poo1.raton.Raton;

import java.util.*;

public class Unidad1 {
    public static void verDatosMapa(){
        //Creo 4 instancias de tipo movimiento clase canino
        Canino canino1 = new Canino("Pitbull",14F,10);
        Canino canino2 = new Canino("Doberman",14F,5);
        Canino canino3 = new Canino("Chihuahua",14F,113);
        Canino canino4 = new Canino("Labrador",50F,13);

        //creó la lista
        List<Canino> listaCaninos = new LinkedList<>();
        //añado a la lista
        listaCaninos.add(canino1);
        listaCaninos.add(canino2);
        listaCaninos.add(canino3);
        listaCaninos.add(canino4);

        //Creó el mapa
        Map<String, Canino> mapaCaninos = new HashMap<>();
        mapaCaninos.put(canino1.getNombre(), canino1);
        mapaCaninos.put(canino2.getNombre(), canino2);
        mapaCaninos.put(canino3.getNombre(), canino3);
        mapaCaninos.put(canino4.getNombre(), canino4);
        //odenamiento del mapa
        List<Canino> listaOrdenada = new LinkedList<>(mapaCaninos.values());
         listaOrdenada.sort(Comparator.comparing(Canino::getNombre));
        for (Movimiento canino: listaOrdenada){
            canino.verInformacion();
        }

        System.out.println("##############################");
        // Creó 4 instancias de tipo Raton clase Roedor
        Roedor roedor1 = new Roedor("Ardilla",12,020F);
        Roedor roedor2 = new Roedor("Hamster",2,05F);
        Roedor roedor3 = new Roedor("Ratón",11,020F);
        Roedor roedor4 = new Roedor("Castor",22,090F);

        //Creó  la lista
        List<Roedor> listaRoedores = new LinkedList<>();
        listaRoedores.add(roedor1);
        listaRoedores.add(roedor2);
        listaRoedores.add(roedor3);
        listaRoedores.add(roedor4);

        //Creó el mapa
        Map<String, Roedor> mapaRoedores = new HashMap<>();
        mapaRoedores.put(roedor1.getNombre(), roedor1);
        mapaRoedores.put(roedor2.getNombre(), roedor2);
        mapaRoedores.put(roedor3.getNombre(), roedor3);
        mapaRoedores.put(roedor4.getNombre(), roedor4);

        //odenamiento del mapa
        List<Roedor> listaOrdenada2 = new LinkedList<>(mapaRoedores.values());
        listaOrdenada2.sort(Comparator.comparing(Roedor::getNombre));
        for (Raton roedores: listaOrdenada2){
            roedores.verInformacion();
        }


    }
}
