package Nivel1.Ejercicio1.Main;

import Nivel1.Ejercicio1.Model.Month;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> months = new ArrayList<>();
        months.add(new Month("Enero"));
        months.add(new Month("Febrero"));
        months.add(new Month("Marzo"));
        months.add(new Month("Abril"));
        months.add(new Month("Mayo"));
        months.add(new Month("Junio"));
        months.add(new Month("Julio"));
        months.add(new Month("Septiembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Noviembre"));
        months.add(new Month("Diciembre"));

        //imprimimos lo que tenemos antes de añadir Agosto
        for (Month month : months) {
            System.out.println(month);
        }

        months.add(7, new Month("Agosto"));

        //imprimimos comprobando tras añadir Agosto
        for (Month month : months) {
            System.out.println(month);
        }


    }
}