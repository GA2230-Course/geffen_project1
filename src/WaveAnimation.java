package ledsystem;

import java.awt.Color;
import java.util.Random;

public class WaveAnimation implements Animation {
    private boolean hasRun = false;

    @Override
    public void apply(LedStrip strip) {
        if (hasRun == false) {
            Random r = new Random();

            Color c1 = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));
            Color c2 = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));

            int red = (c1.getRed() + c2.getRed()) / 2;
            int green = (c1.getGreen() + c2.getGreen()) / 2;
            int blue = (c1.getBlue() + c2.getBlue()) / 2;
            Color cMixed = new Color(red, green, blue);

            try {
                strip.setColor(0, c1);
                Thread.sleep(1000);

                strip.setColor(0, c2);
                Thread.sleep(1000);

                strip.setColor(0, cMixed);
                hasRun = true;
            } catch (Exception e) {}
        }
    }
}
