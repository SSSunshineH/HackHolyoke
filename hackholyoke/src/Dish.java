import GaFr.GFGame;
import GaFr.GFStamp;
import GaFr.GFTexture;
import GaFr.GFKey;
import GaFr.GFFont;
import GaFr.Gfx;
import GaFr.GFU;
import GaFr.GFM;


public class Dish {
    float posY;  // current position
    public static final float vel = 5;  // velocity 
    int type; //type of dish
    //float size = 1.2f;


    // set a gravity that is constantly downward
    //static final Vector Gravity = Vector.rect(0, 0.15f);

    //static final Vector GRAVITY = Vector.rect(0, 0.2f);

    //set pos and vel
    public Dish(int type) {
        this.type = type;

    }

    // Update pos and vel each frame
    public void update() {
        this.posY += vel; //position is updated by adding the velocity
    }

    /*  Check if drop has fallen below screen
    public boolean isOffScreen(float height) {
        return pos.y > height + 50;
    }*/
}
