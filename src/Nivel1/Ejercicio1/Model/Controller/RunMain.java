package Nivel1.Ejercicio1.Model.Controller;

import Nivel1.Ejercicio1.Model.Month;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class RunMain {

    public static void run() {

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

        System.out.println("imprimimos el Array antes de añadir Agosto");
        for (Month month : months) {
            System.out.println(month);
        }

        months.add(7, new Month("Agosto"));

        System.out.println();

        for (Month month : months) {
            System.out.println(month);
        }

        System.out.println("duplicamos Agosto para hacer las pruebas");
        months.add(7, new Month("Agosto"));

        System.out.println();

        for (Month month : months) {
            System.out.println(month);
        }

        System.out.println("\n Transformamos el ArrayList en HashSet para evitar duplicados");

        HashSet<Month> monthSet = new HashSet<>(months);

        System.out.println("el Hash, este Agosto no se crea en el mismo, pero si en el Array");

        months.add(7, new Month("Agosto"));

        for (Month month : monthSet) {
            System.out.println(month);
        }

        System.out.println("Con el Iterator, vamos a ver la diferencia entre recorrer" +
                " el Array y el HashSet.");

        System.out.println("\nPrimero sale el Array con todos los elementos y después el HashSet sin duplicados:");

        Iterator<Month> iterator = months.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        Iterator<Month> iteratorHash = monthSet.iterator();

        while (iteratorHash.hasNext()) {
            System.out.println(iteratorHash.next());
        }
    }
}