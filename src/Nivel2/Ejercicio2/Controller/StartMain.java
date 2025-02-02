package Nivel2.Ejercicio2.Controller;

import Nivel2.Ejercicio1.Controller.RunMain;
import Nivel2.Ejercicio1.Entities.Restaurant;
import Nivel2.Ejercicio2.Model.RestaurantComparator;

import java.util.*;

public class StartMain {
    public static void run() {
        List<Restaurant> restaurants = new ArrayList<>(RunMain.restaurants);

        Collections.sort(restaurants, new RestaurantComparator());

        System.out.println("\n Restaurantes ordenados por nombre y puntuación: ");
        for (Restaurant r : restaurants){
            System.out.println(r);
        }
    }
}