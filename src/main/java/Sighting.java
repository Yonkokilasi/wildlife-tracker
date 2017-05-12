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

    public Sighting( String rangername, String location){
        this.rangername = rangername;
        this.location = location;
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
}
