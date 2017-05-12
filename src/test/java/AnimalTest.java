import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class AnimalTest {
    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void animal_instantiatesCorrectly_true() {
        Animal testAnimal = new Animal("Rob","Cow");
        assertEquals(true, testAnimal instanceof Animal);
    }
    @Test
    public void animal_instantiatesWithName_String(){
        Animal testAnimal = new Animal("Rob","Cow");
        assertEquals("Rob",testAnimal.getName());

    }
    

}
