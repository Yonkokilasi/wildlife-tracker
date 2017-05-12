import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.Arrays;

public class SightingTest{
    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void sighting_instatiatiesCorrectly_true(){
        Sighting testSighting = new Sighting("Job","place");
        assertEquals(true, testSighting instanceof Sighting);
    }
    @Test
    public void sighting_instantiatesWithRangername_Bob() {
        Sighting testSighting = new Sighting("Bob","place");
        assertEquals("Bob",testSighting.getName());
    }
    @Test
    public void sighting_instantiatesWithLocation_place() {
        Sighting testSighting = new Sighting("Bob","place");
        assertEquals("place",testSighting.getLocation());
    }
}
