import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;
import java.util.Timer;
import java.util.TimerTask;

public abstract class Animal {
    public String name;
    public int id;
    public String species;


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


}
