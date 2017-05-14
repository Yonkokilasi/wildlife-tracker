import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class EndangeredAnimal extends Animal {
    private String health;
    private int age;


    public EndangeredAnimal(String name, String species) {
        this.name = name;
        this.species = species;
    }
    public static List<EndangeredAnimal> all(){
        String sql = "SELECT * FROM animals";
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(EndangeredAnimal.class);
        }
    }
    public static EndangeredAnimal find(int id) {
        try(Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM animals where id=:id";
            EndangeredAnimal animal = con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(EndangeredAnimal.class);
            return animal;
        }
    }


}
