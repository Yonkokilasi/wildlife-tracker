import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class Animal {
    public String name;
    public int id;
    public String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }
    public String getName(){
        return name;
    }
    public String getSpecies(){
        return species;
    }
    public int getId(){
        return id;
    }
    @Override
    public boolean equals(Object otherAnimal){
        if(!(otherAnimal instanceof Animal)) {
            return false;
        } else {
            Animal newAnimal = (Animal)
            otherAnimal;
            return this.getName().equals(newAnimal.getName()) && this.getSpecies().equals(newAnimal.getSpecies());
        }
    }
    public void save(){
        try(Connection con = DB.sql2o.open()) {
            String sql = "INSERT INTO animals (name,species) VALUES (:name,:species)";
            this.id = (int)
            con.createQuery(sql, true)
            .addParameter("name",this.name)
            .addParameter("species",this.species)
            .executeUpdate()
            .getKey();
        }
    }

    public static List<Animal> all(){
        String sql = "SELECT * FROM animals";
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Animal.class);
        }
    }
    public static Animal find(int id) {
        try(Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM animals where id=:id";
            Animal animal = con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(Animal.class);
            return animal;
        }
    }


}
