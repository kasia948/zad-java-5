public class Televizor {
    boolean power;

    public Televizor(boolean power) {
        this.power = power;
    }

    void turnOn() {
        power = true;
    }

    void turnOff() {
        power = false;
    }

    void showStatus() {
        if (power ==false){
            System.out.println("TV is OFF");
        } else {
            System.out.println("TV is ON");
        }
    }
}
