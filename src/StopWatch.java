package ledsystem.utils;

public class StopWatch {
    private long startTime = 0;
    private boolean running = false;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.running = false;
    }

    public double get() {
        if (!running) {
            return 0.0;
        }
        long elapsed = System.currentTimeMillis() - startTime;
        return elapsed / 1000;
    }
}
