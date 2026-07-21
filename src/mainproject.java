package ledsystem;
import ledsystem.SolidAnimation;
import java.awt.Color;

class Project1 {
    public static void main(String[] args) {
        LedStrip myStrip = new LedStrip(10);
        LedController controller = new LedController(10);
        SolidAnimation redAnimation = new SolidAnimation(Color.red);
        redAnimation.apply(myStrip);
        controller.addAnimation(redAnimation);
        controller.play();
    }
}
