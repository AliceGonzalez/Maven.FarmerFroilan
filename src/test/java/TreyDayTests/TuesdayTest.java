package TreyDayTests;

import com.zipcodewilmington.froilansfarm.Animals.Rapidash;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Food.EarCorn;
import com.zipcodewilmington.froilansfarm.Crop.Storage;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TuesdayTest {
    Storage storage;
    Tractor tractor;
    CropRow cropRow;
    EarCorn earCorn;
 //   Storage storage;
    Person froilan;
    Tomato tomato;
    Rapidash rapidash;
   // RuffletEgg ruffletEgg;
    @Before
    public void setup(){
        tractor = new Tractor();
        cropRow = new CropRow();
        earCorn = new EarCorn();
        storage = new Storage();
       rapidash = new Rapidash(null,null,null);
        froilan = new Person(null);
        tomato = new Tomato();
       // ruffletEgg = new RuffletEgg();
    }
//    On Tuesday, Froilan uses his Tractor to harvest each Crop in each CropRow.
@Test
public void firstRowPlanted() {


    tractor.harvest(cropRow);

    Assert.assertTrue(cropRow.hasBeenHarvested);
}

//    Riding each Horse in each Stable.
    @Test
    public void froilandRidesRapidashTest(){

        rapidash.addRider(froilan);

        Assert.assertTrue(rapidash.hasBeenRidden);
    }

//    Feeding each Horse 3 ear of Corn.
    @Test
public void froilanFeedsRapidash() {
        rapidash.eat(storage,earCorn,1);

    Integer expected = -1;
   Integer actual = storage.get(earCorn);

    Assert.assertEquals(expected, actual);
}
//    BREAKFAST: Froilan eats 1 EarCorn, 2 Tomato, and 5 Egg
    @Test
    public void froilanBreakfastEarCornTest() {

        froilan.eat(storage,earCorn,1);

        Integer expected = 1; // this is just a placeholder.
        Integer actual = storage.get(earCorn); // this will return a value for Togekiss eggs

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void froilanBreakfastTomatoTest() {
        froilan.eat(storage,tomato, 2);

        Integer expected = 2; // this is just a placeholder.
        Integer actual = storage.get(tomato); // this will return a value for Togekiss eggs

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void froilanBreakfastEggTest() {

        froilan.eat(storage, ruffletEgg, 5);

        Integer expected = 5; // this is just a placeholder.
        Integer actual = storage.get(ruffletEgg); // this will return a value for Togekiss eggs

        Assert.assertEquals(expected, actual);
    }
}
