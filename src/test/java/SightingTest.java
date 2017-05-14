// import org.junit.*;
// import static org.junit.Assert.*;
// import org.sql2o.*;
// import java.util.Arrays;
//
// public class SightingTest{
//     @Rule
//     public DatabaseRule database = new DatabaseRule();
//
//     @Test
//     public void sighting_instatiatiesCorrectly_true(){
//         Sighting testSighting = new Sighting("Job","place");
//         assertEquals(true, testSighting instanceof Sighting);
//     }
//     @Test
//     public void sighting_instantiatesWithRangername_Bob() {
//         Sighting testSighting = new Sighting("Bob","place");
//         assertEquals("Bob",testSighting.getName());
//     }
//     @Test
//     public void sighting_instantiatesWithLocation_place() {
//         Sighting testSighting = new Sighting("Bob","place");
//         assertEquals("place",testSighting.getLocation());
//     }
//     @Test
//     public void equals_returnsTrueIfNameAndLocationAreSame_true(){
//         Sighting firstSighting = new Sighting("Bob","Ngara");
//         Sighting anotherSighting = new Sighting("Bob","Ngara");
//         assertTrue(firstSighting.equals(anotherSighting));
//     }
//     @Test
//     public void save_insertsObjectIntoDatabase_Sighting() {
//         Sighting testSighting = new Sighting("Bob","Ngara");
//         testSighting.save();
//         assertTrue(Sighting.all().get(0).equals(testSighting));
//     }
// }
