package ledsystem;
import ledsystem.utils.StopWatch;
import java.awt.*;

class LedController {
    private final LedStrip strip;
    private Animation animation;
    private final StopWatch sw = new StopWatch();

    public LedController (int stripLength)  {
        this.strip = new LedStrip(stripLength);
        this.sw.start();
    }

    public void addAnimation(Animation animation){
        this.animation = animation;
    }

    public void play(){
        boolean isColorA = true;
        double targetTime = 2.0;

        while (this.animation != null){
            if (sw.get() >= targetTime) {
                if (isColorA) {
                    this.animation = new ledsystem.SolidAnimation(Color.RED);
                } else {
                    this.animation = new ledsystem.SolidAnimation(Color.GREEN);
                }

                this.animation.apply(strip);
                isColorA = !isColorA;
                targetTime += 2.0;
            }
        }
    }
}


