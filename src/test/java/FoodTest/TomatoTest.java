package FoodTest;

import com.zipcodewilmington.froilansfarm.Crop.Storage;
import com.zipcodewilmington.froilansfarm.Food.Edible;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
//import com.zipcodewilmington.froilansfarm.crops.edibles.Tomato;
//import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Person.Person;
import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class TomatoTest
{
    @Test
    public void isInstanceOfTest()
    {
        Tomato tomato = new Tomato();
        assertTrue(tomato instanceof Edible);
    }
    @Test
    public void eatTest()
    {
        //Given
        Person person = new Person(null);
        Tomato tomato = new Tomato();
        Storage storage = new Storage();

        //When
        storage.put(tomato, 1);
        person.eat(tomato);

        //Then
        Integer expected = 0;
        Integer actual = storage.get(tomato);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getEaten()
    {

    }
//    public void testEatenInitialized()
//    {
//        Tomato tomato = new Tomato();
//        assertFalse(tomato.isEaten(), "The 'eaten' should be initialized as false.");
//    }
//
//    @Test
//    public void testSetEatenProperty()
//    {
//        Tomato tomato = new Tomato();
//        tomato.setEaten(true);
//        assertTrue(tomato.isEaten(), "The 'eaten' should be initialized as true.");
//    }
//
//    @Test
//    public void testEatenProperty()
//    {
//        Tomato tomato = new Tomato();
//        assertFalse(tomato.isEaten(), "The 'eaten' should be initialized as false.");
//    }
}
