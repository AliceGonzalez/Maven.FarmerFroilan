package ShelterTest;
import Shelter.FarmHouse;
import com.zipcodewilmington.froilansfarm.Animals.Bulbasaur;
import com.zipcodewilmington.froilansfarm.Animals.Charizard;
import com.zipcodewilmington.froilansfarm.Person.Person;
import com.zipcodewilmington.froilansfarm.Shelter.Shelter;
import org.junit.Assert;
import org.junit.Test;

public class FarmHouseTest {

  @Test
  public void farmHouseIsShelter() {
    Shelter<Person> farmHouse = new Shelter();

    Object Person;
    Assert.assertTrue(Person instanceof Shelter);
  }
  @Test
    public void addPerson() {
      Shelter<Person> farmHouse = new Shelter();
      Person p = new Person(null);

      farmHouse.add(p);

      Integer actual = 1;
      Integer expected = farmHouse.size();

      Assert.assertEquals(expected, actual);
    }


    @Test
    public void removePerson() {
      Shelter<Person> farmHouse = new Shelter();
      Person p = new Person(null);

      farmHouse.add(p);
      farmHouse.remove(p);

      Integer expected = 0;
      Integer actual = farmHouse.size();

      Assert.assertEquals(expected, actual);
    }
    @Test
    public void getMembers() {
      Shelter<Person> farmHouse = new Shelter();
      Person p = new Person(null);

      farmHouse.add(p);

      String expected = "p";
      String actual = farmHouse.toString();
    }
  }