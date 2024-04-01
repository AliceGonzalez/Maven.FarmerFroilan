package Vehicle;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.AirCraft;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class AircraftTest {
    AirCraft airCraft;
    Pilot pilot;
    CropRow cropRow;

    @Before
    public void setup(){
        airCraft = new AirCraft();
        pilot = new Pilot("Froilan");
        cropRow = new CropRow();
    }

    @Test
    public void testInheritance(){
        Assert.assertNotNull(airCraft);
    }
    @Test
    public void addPilotTest(){
        airCraft.addPilot(pilot);
        Assert.assertTrue(airCraft.hasBeenRidden());
    }
    @Test
    public void flyTest(){
        airCraft.fly();
        String noise = airCraft.makeNoise();
        Assert.assertEquals("Vroom", noise);
    }
    @Test
    public void makeNoiseTest(){
        airCraft.fly();
        String noise = airCraft.makeNoise();
        Assert.assertEquals("Vroom", noise);
    }
    @Test
    public void addRiderTest(){
        airCraft.addRider();
        Assert.assertTrue(airCraft.hasRidder());
    }
    @Test
    public void removeRiderTest(){
        airCraft.addRider(pilot);
        airCraft.removeRider();
        Assert.assertFalse(airCraft.haspilot);
    }
    @Test
    public void fertilizeTest(){
        airCraft.addRider(pilot);
        airCraft.fertilize(cropRow);
        Assert.assertTrue(cropRow.hasBeenFertalized);
    }
}

