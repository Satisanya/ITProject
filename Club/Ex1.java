public class Computer {
    private int number;
    private String gpu;
    private String cpu;

    public Computer(int number, String gpu, String cpu) {
        this.number = number;
        this.gpu = gpu;
        this.cpu = cpu;
    }
}

public class Client {
    private String fullname;
    private String passport;

    public Client(String fullname, String passport) {
        this.fullname = fullname;
        this.passport = passport;
    }
}

public class Rent {
    private Client clientId;
    private Computer copmuterId;
    private String time;

    public class Rent(Client clientId, Computer copmuterId, String time) {
        this.clientId = clientId;
        this.copmuterId = copmuterId;
        this.time = time;
    }
}

ArrayList<Rent> main() {
    ArrayList<Rent> dataBase = new ArrayList<>();

    Computer comp01 = new Computer(1, "Видеокарта: GeForce GTX 3060", "Процессор: i7-6700");
    Client clent01 = new Client( "Качаев Борис Фаридович", "1232 13131231");
    Rent rent01 = new Rent(clent01, comp01, "08.06.2022 с 12-00 до 20-00");
    dataBase.add(rent01);

    Computer comp01 = new Computer(2, "Видеокарта: GeForce GTX 1060", "Процессор: i7-6700K");
    Client clent01 = new Client( "Алексеев Иван Адольфович", "3566 25434525");
    Rent rent02 = new Rent(clent02, comp02, "10.06.2022 с 7-00 до 12-00");
    dataBase.add(rent02);

    return(dataBase);
}