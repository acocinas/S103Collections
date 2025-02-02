package Nivel2.Ejercicio1.Controller;

import Nivel2.Ejercicio1.Entities.Restaurant;

import java.util.*;

public class RunMain {
        public static final HashSet<Restaurant> restaurants = new HashSet<>();
    public static void run() {

        Restaurant r1 = new Restaurant("restaurante 1", 9);
        Restaurant r2 = new Restaurant("restaurante 2", 8);
        Restaurant r3 = new Restaurant("restaurante 3", 7);
        Restaurant r4 = new Restaurant("restaurante 4", 9);
        Restaurant r5 = new Restaurant("restaurante 1", 9);
        Restaurant r6 = new Restaurant("restaurante 2", 7);
        Restaurant r7 = new Restaurant("restaurante 1", 8);
        Restaurant r8 = new Restaurant("restaurante 5", 6);

        Collections.addAll(restaurants, r1, r2, r3, r4, r5, r6, r7, r8);

        System.out.println("Restaurantes guardados: ");
        for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}

