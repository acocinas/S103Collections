package Nivel1.Ejercicio1.Model;

public class Month {
    private String name;
    public Month(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
