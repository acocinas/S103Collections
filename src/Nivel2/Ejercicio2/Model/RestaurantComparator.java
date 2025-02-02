package Nivel2.Ejercicio2.Model;

import Nivel2.Ejercicio1.Entities.Restaurant;
import Nivel2.Ejercicio2.Controller.StartMain;

import java.util.Comparator;

public class RestaurantComparator implements Comparator<Restaurant> {

    @Override
    public int compare(Restaurant r1, Restaurant r2) {
        int nameComparison = r1.getName().compareTo(r2.getName());
        if (nameComparison == 0){
            return Integer.compare(r2.getScore(), r1.getScore());
        }
        return nameComparison;
    }
}
