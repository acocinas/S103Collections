package Nivel1.Ejercicio1.Model;

public class Month {

    private String name;

    public Month(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    //Sobreescribiendo los métodos para eliminar en el HashSet en caso
    //que hubiera datos duplicados en el ArrayList
    //no se hace el import en la clase porque se usa en el RunMain
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Month month = (Month) obj;
        return name.equals(month.name);
    }

    @Override
    public int hashCode() {

        return name.hashCode(); // Usa el hash del atributo 'name'
    }
}
