package Vehicle;
import com.zipcodewilmington.froilansfarm.Person.Pilot;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CropDusterTest
{
    CropDuster cropDuster;
    Pilot pilot;

    @Before
    public void setup(){
        cropDuster = new CropDuster();
        pilot = new Pilot("Froilan");
    }
    @Test
    public void inheritanceTest(){
        Assert.assertNotNull(cropDuster);}
    @Test
    public void addPilotTest(){
        cropDuster.addPilot(pilot);
        Assert.assertTrue(cropDuster.hasBeenRidden());
    }
    @Test
    public void fly(){
        cropDuster.fly();
        String noise = cropDuster.makeNoise();
        Assert.assertEquals("Vroom", noise);
    }
    @Test
    public void makeNoiseTest(){
        cropDuster.fly();
        String noise = cropDuster.makeNoise();
        Assert.assertEquals("Vroom", noise);
    }
    @Test
    public void addRider(){
        cropDuster.addRider(pilot);
        Assert.assertTrue(cropDuster.hasRidder());
    }
    @Test
    public void removeRider(){
        cropDuster.addRider(pilot);
        Assert.assertTrue(cropDuster.haspilot);
    }
}
