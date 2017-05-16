import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class Sighting {
    private String rangername;
    private int id;
    private String location;
    private int animalId;

    public Sighting( String rangername, String location, int animalId){
        this.rangername = rangername;
        this.location = location;
        this.animalId = animalId;
    }
    public String getName() {
        return rangername;
    }
    public String getLocation() {
        return location;
    }
    public int getId(){
        return id;
    }
    public int getAnimalId() {
        return animalId;
    }
    @Override
    public boolean equals(Object otherSighting){
        if(!(otherSighting instanceof Sighting)) {
            return false;
        } else {
            Sighting newSighting = (Sighting) otherSighting;
            return this.getName().equals(newSighting.getName()) &&
            this.getLocation().equals(newSighting.getLocation());
        }
    }
    public void save() {
        try(Connection con= DB.sql2o.open()) {
            String sql = "INSERT INTO sightings (rangername,location) VALUES (:rangername, :location)";
            this.id = (int)
            con.createQuery(sql, true)
            .addParameter("rangername",this.rangername)
            .addParameter("location",this.location)
            .addParameter("animalId", this.animalId)
            .executeUpdate()
            .getKey();
        }
    }
    public static List<Sighting> all() {
        String sql = "SELECT * FROM sightings";
        try(Connection con = DB.sql2o.open()) {
            return con.createQuery(sql).executeAndFetch(Sighting.class);
        }
    }
    public static Sighting find(int id) {
        try(Connection con =DB.sql2o.open()) {
            String sql = "SELECT * FROM sightings WHERE id=:id";
            Sighting sighting = con.createQuery(sql).addParameter("id",id).executeAndFetchFirst(Sighting.class);
            return sighting;
        }
    }
    public void delete() {
        try(Connection con = DB.sql2o.open()){
            String sql = "DELETE FROM sightings WHERE id=:id;";
            con.createQuery(sql).addParameter("id",id).executeUpdate();
        }
    }

}
