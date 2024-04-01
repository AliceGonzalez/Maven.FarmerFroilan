package PersonTest;

import com.zipcodewilmington.froilansfarm.Person.Person;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static java.lang.Character.getName;

public class PersonTest {
    Person person;
    @Before
    public void setup(){
        person = new Person("");
    }
    @Test
    public void testInheritance() {
        Assert.assertNotNull(person);
    }

    @Test
    public void addTest(){
        String expectedPerson = "Dave";
        person.add(person);
        String actualPerson = getName(Integer.parseInt("Dave"));
        Assert.assertTrue(expectedPerson, Boolean.parseBoolean(actualPerson));
    }

    @Test
    public void setNameTest(){;
        String expectedName = "froilanda";
        person.add(person);
        person.setName();
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void getNameTest(){
        String expectedName = "Froilan";
        person.setName();
        String actualName = person.getName();
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void eatTest(){
        person.add(person);
        person.eat();
        Assert.assertTrue(person.eat());
    }

}
