import GaFr.GFGame;
import GaFr.GFStamp;
import GaFr.GFFont;
import GaFr.Gfx;
import GaFr.GFU;
import GaFr.GFM;
import GaFr.Easings;
import java.util.ArrayList;
import java.util.Iterator;

public class Game extends GFGame
{
  GFFont font = new GFFont("gafr/fonts/spleen/spleen-32x64.ffont.json");
  GFStamp Dish;
  ArrayList<Dish> dishes = new ArrayList<>();
  public static final int posX = 32;

  //load the image - 5 types of dishes
  GFStamp blackBowl= new GFStamp("assets/black bowl.png").rescale(0.15, 0.15);
  GFStamp blackPlate= new GFStamp("assets/black plate-pixel.png").rescale(0.15, 0.15);
  GFStamp whiteCup= new GFStamp("assets/black plate-pixel.png").rescale(0.15, 0.15);
  GFStamp whiteRoundPlate = new GFStamp("assets/white round plate.png").rescale(0.15, 0.15);
  GFStamp whiteSquarePlate = new GFStamp("assets/square plate.png").rescale(0.15, 0.15);
  

  @Override
  /*initialize the game */
  public void onStartup() {
    HEIGHT = 500;
    WIDTH = 800;


    //randomize and initialize new dishes of different types, and add to the arraylist
    for (int j =0; j < 10; j++){
      int typeDish = GFM.randint(1,5);
      switch (typeDish){
      case 1:
      dishes.add(new Dish(1));
      break;
      case 2:
      dishes.add(new Dish(2));
      break;
      case 3:
      dishes.add(new Dish(3));
      break;
      case 4:
      dishes.add(new Dish(4));
      break;
      case 5:
      dishes.add(new Dish(5));
      break;
    }
    }
    


    //reset();
  }





  @Override
  public void onDraw (int frameCount)
  {

    for (Dish dish : dishes){
      dish.update();
    }

    for (Dish dish : dishes){
      switch(dish.type){
      case 1:
      blackBowl.moveTo(dish.posY,posX).stamp();
      break;
      case 2:
      blackPlate.moveTo(dish.posY,posX).stamp();
      break;
      case 3:
      whiteCup.moveTo(dish.posY,posX).stamp();
      break;
      case 4:
      whiteRoundPlate.moveTo(dish.posY,posX).stamp();
      break;
      case 5:
      whiteSquarePlate.moveTo(dish.posY,posX).stamp();
      break;
      }
    }
  }
}
