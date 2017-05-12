import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class Animal {
    private String name;
    private int id;
    private String species;

    public Animal(String name, String species) {
    this.name = name;
    this.species = species;
    }
    public String getName(){
        return name;
    }
}
