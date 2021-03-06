// import org.junit.*;
// import static org.junit.Assert.*;
// import org.sql2o.*;
// import java.sql.Timestamp;
// import java.util.Date;
// import java.text.DateFormat;
// import java.util.Timer;
// import java.util.TimerTask;
//
// public class AnimalTest {
//     @Rule
//     public DatabaseRule database = new DatabaseRule();
//
//     @Test
//     public void animal_instantiatesCorrectly_true() {
//         Animal testAnimal = new Animal("Rob","Cow");
//         assertEquals(true, testAnimal instanceof Animal);
//     }
//     @Test
//     public void animal_instantiatesWithName_String(){
//         Animal testAnimal = new Animal("Rob","Cow");
//         assertEquals("Rob",testAnimal.getName());
//
//     }
//     @Test
//     public void animal_instantiatesWithSpecies_String(){
//         Animal testAnimal = new Animal("Rob","Cow");
//         assertEquals("Cow",testAnimal.getSpecies());
//     }
//     @Test
//     public void equals_returnsTrueIfNameAndSpeciesAreSame_true() {
//         Animal testAnimal =
//         new Animal("Rob","Cow");
//         Animal anotherAnimal = new Animal("Rob","Cow");
//         assertTrue(testAnimal.equals(anotherAnimal));
//     }
//     @Test
//     public void save_assignsIdToAnimal(){
//         Animal testAnimal = new Animal("Rob","Cow");
//         testAnimal.save();
//         Animal savedAnimal = Animal.all().get(0);
//         assertEquals(savedAnimal.getId(), testAnimal.getId());
//     }
//     @Test
//     public void all_returnsInstancesOfAnimal_true(){
//         Animal firstAnimal = new Animal("Rob","Cow");
//         firstAnimal.save();
//         Animal secondAnimal = new Animal("Kenny G","Glasses");
//         secondAnimal.save();
//         assertEquals(true,Animal.all().get(0).equals(firstAnimal));
//         assertEquals(true, Animal.all().get(1).equals(secondAnimal));
//     }
//     @Test
//     public void find_returnsAnimalsWithSameId_secondAnimal(){
//         Animal firstAnimal = new Animal("Rob","Cow");
//         firstAnimal.save();
//         Animal secondAnimal = new Animal("KennyG","Glasses");
//         secondAnimal.save();
//         assertEquals(Animal.find(secondAnimal.getId()),secondAnimal);
//     }
//     // @Test
//     // public void save_savesAnimalToDatabase_true(){
//     //     Animal testAnimal= new Animal("Rob","Cow");
//     //     testAnimal.save();
//     //     Animal savedAnimal = Animal.find(testAnimal.getId());
//     //     assertEquals(savedAnimal);
//     // }
//
// }
