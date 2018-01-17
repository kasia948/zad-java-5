public class Televizor {
    boolean power=true;

    public Televizor(boolean power) {
        this.power = power;
    }

    void turnOn() {
        power = true;
        System.out.println("TV is on");
    }

    void turnOff() {
        power = false;
        System.out.println("TV is off");
    }

        void showStatus () {
            power = false;
            System.out.println("Tv is off");
        }
}
