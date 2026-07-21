package ledsystem;

import ledsystem.utils.StopWatch;

import java.awt.*;

public class BlinkAnimation implements Animation {
    private final StopWatch sw = new StopWatch();
    private boolean isColorA = true;
    private double targetTime = 2.0;

    public BlinkAnimation() {
        this.sw.start(); // מפעילים את השעון ברגע שהאנימציה נוצרת
    }

    @Override
    public void apply(LedStrip strip) {
        // כאן זז כל המנגנון של ה-2 שניות
        if (sw.get() >= targetTime) {
            Color nextColor;
            if (isColorA) {
                nextColor = Color.RED;
            } else {
                nextColor = Color.GREEN;
            }

            // צובעים את כל הלדים בסטריפ בצבע שנבחר
            for (int i = 0; i < strip.getLength(); i++) {
                strip.setColor(i, nextColor);
            }

            isColorA = !isColorA;
            targetTime += 2.0;
        }
    }
}
