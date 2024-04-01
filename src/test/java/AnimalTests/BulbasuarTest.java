package AnimalTests;
import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Animals.Bulbasaur;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import org.junit.Assert;
import org.junit.Test;


public class BulbasuarTest {
    @Test
    public void constructorTest() {
        String name = "Bulbasaur";
        String type = "Grass";
        Double id = 0.0001;

        Bulbasaur bulbasaur = new Bulbasaur(name, type, id);

        String retrievedName = bulbasaur.getName();
        String retrievedType = bulbasaur.getType();
        Double retrievedId = bulbasaur.getId();

        Assert.assertEquals(name, retrievedName);
        Assert.assertEquals(type, retrievedType);
        Assert.assertEquals(id, retrievedId);
    }
    @Test
    public void testSetName() {

        Bulbasaur bulbasaur = new Bulbasaur(null, null, null);
        String expected = "Bulbasaur";

        bulbasaur.setName(expected);
        String actual = bulbasaur.getName();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetType() {

        Bulbasaur bulbasaur = new Bulbasaur(null, null, null);
        String expected = "Grass";

        bulbasaur.setType(expected);
        String actual = bulbasaur.getType();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetId() {

        Bulbasaur bulbasaur = new Bulbasaur(null, null, null);
        Double expected = 0.0001;

        bulbasaur.setId(expected);
        Double actual = bulbasaur.getId();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInstanceOfAnimal() {
        Bulbasaur bulbasaur = new Bulbasaur(null, null, null);
        Assert.assertTrue(bulbasaur instanceof Animal);
    }
    @Test
    public void makeNoiseTest() {
        Bulbasaur bulbasaur = new Bulbasaur(null, null, null);
        String expected = "BULBASAUR!!!";
        String actual = bulbasaur.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void nurtureCropRowTest() {
        Bulbasaur bulbasaur = new Bulbasaur(null, null, null);
        CropRow cr =  new CropRow();
        bulbasaur.nurture(cr);
        Assert.assertTrue(cr.hasBeenNurtured);
    }

}
