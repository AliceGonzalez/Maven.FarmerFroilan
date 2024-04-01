package CropTest;
import com.zipcodewilmington.froilansfarm.Food.Apple;
import org.junit.Assert;
import org.junit.Test;

public class AppleTreeTest {

    @Test
    public void testInheritance(){
        Apple apple = new Apple();
        Assert.assertTrue(apple instanceof Crop);
    }
}
