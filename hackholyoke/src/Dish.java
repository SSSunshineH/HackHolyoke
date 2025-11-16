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
    float posX; 
    public static final float vel = 5;  // velocity 
    int type; //type of dish
    int appearTime;
    private static final float Y = -50; 

    //set pos and vel
    public Dish(int type, int appearTime, float x) {
        this.type = type;
        this.appearTime = appearTime;
        this.posX = x;
        this.posY = Y;

    }

    // Update pos and vel each frame
    public void update(int frameCount) {
        if (this.appearTime <= frameCount)
        this.posY += vel; //position is updated by adding the velocity
    }

    /*  Check if drop has fallen below screen*/
    public boolean isOffScreen() {
        return this.posY > 500;
    }
}