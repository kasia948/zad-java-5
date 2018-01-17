public class Device {
    String code;
    String producer;
    String type;
    double price;


    public Device(String c, String p, String t, double pr) {
        this.code = c;
        this.producer = p;
        this.type = t;
        this.price = pr;
    }

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }
    void getInfo() {
        System.out.println("Kod: "+code + ", producent: " + producer + ", typ: " + type + ", cena: " + price);
    }
}

