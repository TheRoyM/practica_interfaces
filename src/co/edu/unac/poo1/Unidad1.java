package co.edu.unac.poo1;

import co.edu.unac.poo1.acciones.Movimiento;

import java.util.*;

public class Unidad1 {
    public static void verDatosMapa(){
        Roedor roedor1 = new Roedor("Ardilla",14F,10);
        Roedor roedor2 = new Roedor("Hamster",14F,5);
        Roedor roedor3 = new Roedor("Raton",14F,113);

        List<Roedor> listaRoedores = new LinkedList<>();

        listaRoedores.add(roedor1);
        listaRoedores.add(roedor2);
        listaRoedores.add(roedor3);

         Map<String, Movimiento> mapaRoedores = new HashMap<>();
         mapaRoedores.put(roedor1.getNombre(),roedor1);
         mapaRoedores.put(roedor2.getNombre(),roedor2);
         mapaRoedores.put(roedor3.getNombre(),roedor3);

         List<Movimiento> listaRatones = new LinkedList<>(mapaRoedores.values());
        for (Movimiento raton: listaRatones){
            raton.verInformacion();
        }

        System.out.println("##############################");

    }
}
