package Nivel1.Ejercicio2.Controller;

import java.util.*;

public class RunMain {
    public static void run() {

        List<Integer> list1 = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list1.add(i);
        }

        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();

        //Colocamos el iterator al final con list1.size()
        ListIterator<Integer> iterator = list1.listIterator(list1.size());

        //usamos hasPrevious para comprobar que hay un elemento anterior, y previous para moverlo.
        while (iterator.hasPrevious()){
            list2.add(iterator.previous());
        }
            System.out.println(list2);
    }
}