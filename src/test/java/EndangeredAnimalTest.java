// import org.junit.*;
// import static org.junit.Assert.*;
// import org.sql2o.*;
// import java.sql.Timestamp;
// import java.util.Date;
// import java.text.DateFormat;
// import java.util.Timer;
// import java.util.TimerTask;
//
// public class EndangeredAnimalTest {
//     @Rule
//     public DatabaseRule database = new DatabaseRule();
//
//     @Test
//     public void endangeredAnimal_instantiatesCorrectly_true() {
//         EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("Bubbles","cow");
//         assertEquals(true, testEndangeredAnimal instanceof EndangeredAnimal);
//        }
//        @Test
//        public void endangeredAnimal_instantiatesWithName_String() {
//            EndangeredAnimal testEndangered = new EndangeredAnimal("Bubbles","cow");
//            assertEquals("Bubbles", testEndangered.getName());
//        }
//        @Test
//        public void endangeredAnimal_instantiatesWithSpecies_String(){
//            EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("Rob","Cow");
//            assertEquals("Cow",testEndangeredAnimal.getSpecies());
//        }
//        @Test
//        public void equals_returnsTrueIfNameAndSpeciesAreSame_true() {
//            EndangeredAnimal testEndangeredAnimal =
//            new EndangeredAnimal("Rob","Cow");
//            EndangeredAnimal anotherEndangeredAnimal = new EndangeredAnimal("Rob","Cow");
//            assertTrue(testEndangeredAnimal.equals(anotherEndangeredAnimal));
//        }
//        @Test
//        public void save_assignsIdToAnimal(){
//            EndangeredAnimal testEndangeredAnimal = new EndangeredAnimal("Rob","Cow");
//            testEndangeredAnimal.save();
//            EndangeredAnimal savedEndangeredAnimal = EndangeredAnimal.all().get(0);
//            assertEquals(savedEndangeredAnimal.getId(), testEndangeredAnimal.getId());
//        }
//        @Test
//        public void all_returnsInstancesOfAnimal_true(){
//            EndangeredAnimal firstEndangeredAnimal = new EndangeredAnimal("Rob","Cow");
//            firstEndangeredAnimal.save();
//            EndangeredAnimal secondEndangeredAnimal = new EndangeredAnimal("Kenny G","Glasses");
//            secondEndangeredAnimal.save();
//            assertEquals(true,EndangeredAnimal.all().get(0).equals(firstEndangeredAnimal));
//            assertEquals(true, EndangeredAnimal.all().get(1).equals(secondEndangeredAnimal));
//        }
//        @Test
//        public void find_returnsEndangeredAnimalsWithSameId_secondEndangeredAnimal(){
//            EndangeredAnimal firstEndangeredAnimal = new EndangeredAnimal("Rob","Cow");
//            firstEndangeredAnimal.save();
//            EndangeredAnimal secondEndangeredAnimal = new EndangeredAnimal("KennyG","Glasses");
//            secondEndangeredAnimal.save();
//            assertEquals(EndangeredAnimal.find(secondEndangeredAnimal.getId()),secondEndangeredAnimal);
//        }
//     //    @Test
//     //    public void save_savesEndangeredAnimalToDatabase_true(){
//     //        EndangeredAnimal testEndangeredAnimal= new EndangeredAnimal("Rob","Cow");
//     //        testEndangeredAnimal.save();
//        //
//     //        EndangeredAnimal savedEndangeredAnimal = EndangeredAnimal.find(testEndangeredAnimal.getId());
//     //        assertEquals(savedEndangeredAnimal);
//     //    }
// }
