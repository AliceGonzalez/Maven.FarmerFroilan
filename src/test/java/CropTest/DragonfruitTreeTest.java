package CropTest;
import com.zipcodewilmington.froilansfarm.Animals.Squirtle;
import com.zipcodewilmington.froilansfarm.Crop.*;
import com.zipcodewilmington.froilansfarm.Food.Dragonfruit;
import com.zipcodewilmington.froilansfarm.Vehicle.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle.Tractor;
import org.junit.Assert;
import org.junit.Test;

public class DragonfruitTreeTest {



    @Test
    public void testInheritance(){
        DragonfruitTree dragonfruitTree = new DragonfruitTree();
        Assert.assertTrue(dragonfruitTree instanceof Crop);
    }

    @Test
    public void testYield1(){
        CropRow<DragonfruitTree> cr = new CropRow<>();
        Storage str= new Storage();
        CropDuster cd = new CropDuster();
        Tractor t = new Tractor();
        Squirtle sqr = new Squirtle(null,null,null);


        Assert.assertTrue(dragonfruitTree.yield(cr,str));
    }

    @Test
    public void testBeenHarvested() {
        Crop crop = new DragonfruitTree();
        DragonfruitTree dragonFruitTree = new DragonfruitTree();
        Tractor tractor = new Tractor();

        tractor.harvest(dragonFruitTree);

        Assert.assertTrue(dragonFruitTree.hasBeenHarvested());
    }

    @Test
    public void testHarvest() {
        Crop crop = new DragonfruitTree();
        DragonfruitTree dragonFruitTree = new DragonfruitTree();
        Tractor tractor = new Tractor();

        tractor.harvest(dragonFruitTree);

        Assert.assertTrue(dragonFruitTree.hasBeenHarvested());
    }

    @Test
    public void testFertilize(){
        Crop crop = new DragonfruitTree();
        DragonfruitTree dragonFruitTree = new DragonfruitTree();
        CropRow<DragonfruitTree> rowOne = new CropRow<>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(dragonFruitTree.hasBeenFertilized());
    }

    @Test
    public void testBeenFertilized(){
        Crop crop = new DragonfruitTree();
        DragonfruitTree dragonFruitTree = new DragonfruitTree();
        CropRow<DragonfruitTree> rowOne = new CropRow<>();
        CropDuster cropDuster = new CropDuster();

        cropDuster.fertilize(rowOne);

        Assert.assertTrue(dragonFruitTree.hasBeenFertilized());
    }


//    @Test
//    public void testHarvest(){
//        Crop crop = new DragonfruitTree();
//        Assert.assertFalse(crop.hasBeenHarvested());
//
//        crop.harvest();
//        Assert.assertTrue(crop.hasBeenHarvested());
//    }
//
//
//    @Test
//    public void testHasBeenHarvested() {
//        Crop crop = new DragonfruitTree();
//        Assert.assertFalse(crop.hasBeenHarvested());
//
//        crop.harvest();
//        Assert.assertTrue(crop.hasBeenHarvested());
//    }
//
//    @Test
//    public void testFertilize(){
//        Crop crop = new DragonfruitTree();
//        Assert.assertFalse(crop.hasBeenFertilized());
//
//        crop.fertilize();
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }
//
//
//    @Test
//    public void testHasBeenFertilized() {
//        Crop crop = new DragonfruitTree();
//        Assert.assertFalse(crop.hasBeenFertilized());
//
//        crop.fertilize();
//        Assert.assertTrue(crop.hasBeenFertilized());
//    }
}
