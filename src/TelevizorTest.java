public class TelevizorTest {
public static void main(String[] args) {
    Televizor tv = new Televizor(false);
    tv.showStatus();
    tv.turnOn();
    tv.showStatus();
    tv.turnOff();
    tv.showStatus();
    }
}
