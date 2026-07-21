package ledsystem;

import java.awt.Color;

class Project1 {
    public static void main(String[] args) {
        LedStrip myStrip = new LedStrip(10);
        ledsystem.SolidAnimation redAnimation = new ledsystem.SolidAnimation(Color.RED);
        redAnimation.apply(myStrip);
    }
}
