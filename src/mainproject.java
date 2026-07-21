package ledsystem;

import java.awt.Color;

class Project1 {

    public static void main(String[] args) {
        LedController controller = new LedController(10);

        BlinkAnimation blinkAnimation = new BlinkAnimation();


        controller.addAnimation(blinkAnimation);
        controller.play();
    }
}

