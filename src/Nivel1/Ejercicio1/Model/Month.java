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

    //Sobre escribiendo los métodos para eliminar en el HashSet en caso
    //que hubiera datos duplicados en el ArrayList
    //no se hace el import en la clase porque se usa en el main
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Mismo objeto en memoria
        if (obj == null || getClass() != obj.getClass()) return false;
        Month month = (Month) obj;
        return name.equals(month.name); // Comparación por contenido
    }

    @Override
    public int hashCode() {
        return name.hashCode(); // Usa el hash del atributo 'name'
    }
}
