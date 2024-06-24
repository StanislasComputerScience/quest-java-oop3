//Eagle.java
public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    // décoller
    @Override
    public void takeOff() {
        this.flying = true;
        System.out.println("Hawkeye takes off in the sky.");
    }

    // monter
    @Override
    public void ascend(int altitude) {
        this.altitude += altitude;
        System.out.printf("Hawkeye flies upward, altitude: %d%n", this.altitude);

    }

    // descendre
    @Override
    public void descend(int altitude) {
        this.altitude -= altitude;
        System.out.printf("Hawkeye flies downward, altitude: %d%n", this.altitude);
    }

    // @Override
    // public void descend(int altitude) {
    // this.altitude -= altitude;
    // System.out.println("Hawkeye flies downward, altitude: %d", );
    // }

    // atterrir
    @Override
    public void land() {
        if (!isFlying()) {
            System.out.println("Hawkeye has been still on the ground.");
        } else if (this.altitude <= 1) {
            System.out.println("Hawkeye lands on the ground.");
            this.altitude = 0;
        } else {
            System.out.printf("Hawkeye is too high, it can't land, altitude : %d%n", this.altitude);
        }
    }

    // @Override
    // public void land() {
    // if (altitude > 1) {
    // System.out.println("Hawkeye is too high, it can't land.");
    // } else {
    // this.flying = false;
    // System.out.println("Hawkeye lands on the ground.");
    // }
    // }

    @Override
    public void glide() {
        System.out.println("glides into the air.");
    }

}
