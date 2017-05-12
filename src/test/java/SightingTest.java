import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.Arrays;

public class SightingTest{
    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void sighting_instatiatiesCorrectly_true(){
        Sighting testSighting = new Sighting("Job","Ngara");
        assertEquals(true, testSighting instanceof Sighting);
    }
}
