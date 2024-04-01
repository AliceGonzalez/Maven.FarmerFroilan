package GenericsTest;
import com.zipcodewilmington.froilansfarm.Crop.CropRow;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CropRowTest {
    @Test

    public void testCropRow(){
        CropRow croprow = new CropRow();
        Assert.assertTrue(croprow instanceof Crop);
    }
     @Test
    public void testAddCrop(){
        CropRow cropRow = new CropRow();
        Crop crop = new crop();
        CropRow.addCrop(expected);
        Crop actual = cropRow.getRow()<>;
        Assert.assertEquals(actual, expected);


     }
     @Test
     public void testGetPlanted(){

     }

     @Test
    public void testBeenFertalized(){

     }

     @Test
    public void testBeenPlanted(){

     }

     @Test
    public void testBeenHarvested(){

     }

     @Test
    public void testFertilizedRow(){

     }

     @Test
    public void testHarvestRow(){

     }

     @Test
    public void testRowEmpty(){

     }



}
