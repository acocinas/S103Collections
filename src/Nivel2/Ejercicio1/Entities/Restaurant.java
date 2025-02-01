package Nivel2.Ejercicio1.Entities;


import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Restaurant restaurant = (Restaurant) obj;
        return score == restaurant.score && Objects.equals(name, restaurant.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Restaurant " + name + ", puntuación= " + score ;
    }
}
