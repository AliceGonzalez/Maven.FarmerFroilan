package FoodTest;
import com.zipcodewilmington.froilansfarm.Crop.Storage;
import com.zipcodewilmington.froilansfarm.Food.Watermelon;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WatermelonTest
{
    @Test
    public void testToString()
    {
        Watermelon watermelon = new Watermelon();
        Assert.assertTrue(watermelon.toString().equals("Watermelon"));
    }
    @Test
    public void testHasBeenHarvested()
    {

        Watermelon watermelon = new Watermelon();
        Assert.assertTrue(watermelon.hasBeenHarvested());
    }
    @Test
    public void testHasBeenFertilized()
    {
        Watermelon watermelon = new Watermelon();
        Assert.assertTrue(watermelon.hasBeenFertilized());

        //Given
        Person person = new Person(null);
        Storage storage = new Storage();

        //When
        storage.put(watermelon, 1);
        person.eat(watermelon);

        //Then
        Integer expected = 0;
        Integer actual = storage.get(watermelon);

        Assert.assertEquals(expected, actual);

    }
//    @Test
//    public void isInstanceOfTest()
//    {
//        Watermelon watermelon = new Watermelon();
//        assertTrue(watermelon instanceof Edible);
//    }
//    @Test
//    public void eatTest()
//    {
//        //Given
//        Person person = new Person();
//        Watermelon watermelon = new Watermelon();
//        Storage storage = new Storage();
//
//        //When
//        storage.add(watermelon, 1);
//        person.eat(watermelon);
//
//        //Then
//        Integer expected = 0;
//        Integer actual = storage.getValue;
//
//        Assert.assertEquals(expected, actual);
//    }
}
