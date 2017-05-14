import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.sql.Timestamp;
import java.util.Date;
import java.text.DateFormat;
import java.util.Timer;
import java.util.TimerTask;

public class EndangeredAnimalTest {
    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void endangeredAnimal_instantiatesCorrectly_true() {
        EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("Bubbles","cow");
        assertEquals(true, testEndangeredAnimal instanceof EndangeredAnimal);
       }
       @Test
       public void endangeredAnimal_instantiatesWithName_String() {
           EndangeredAnimal testEndangered = new EndangeredAnimal("Bubbles","cow");
           assertEquals("Bubbles", testEndangered.getName());
       }
}
