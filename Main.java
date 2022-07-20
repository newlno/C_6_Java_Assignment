
public class Main {
    public static void main(String[] args) {
/*
pTP bus1= new Bus(0);
pTP bus2= new Bus(0);

System.out.println("number:"+bus1.number);
System.out.println("number:"+bus2.number);


    addP(bus1,2);
    minusFeul(bus1,50);
    change(bus1);
    plusFeul(bus1,10);
    change(bus1);
    addP(bus1,45);
    addP(bus1,5);
    minusFeul(bus1,55);
    */
        /////////////////////////////////// taxi
        pTP taxi1 = new Taxi();
        pTP taxi2 = new Taxi();


        System.out.println("number:" + taxi1.number);
        System.out.println("number:" + taxi2.number);
        add(taxi1, 2, "Seoul", 2);// 손님의 도착 정보
        fuelminus(taxi1, 80);// 기름 감소
        paid(taxi1);// 손님 지불
        print(taxi1);// 상황 출력
        check(taxi1);// 기름 충분할지 체크
        add(taxi1, 5, "", 0);
        add(taxi1, 3, "Guro-Digital station", 12);// 손님의 도착지 정보
        fuelminus(taxi1, 20);// 기름 감소
        paid(taxi1);// 손님 지불
        print(taxi1);// 상황 출력
        check(taxi1);// 기름 충분할지 체크

    }

    // bus func
    private static void addP(pTP a, int n) {

        a.pessengersNum += n;
        a.remainSeats -= n;
        if (a.remainSeats < 0) {
            a.pessengersNum -= n;
            a.remainSeats += n;


            return;
        }
        a.count = (n * 1000);
        System.out.println(a.pessengersNum);
        System.out.println(a.remainSeats);
        System.out.println(a.count);
    }

    private static void minusFeul(pTP a, int n) {

        a.fuel -= n;
        if (a.fuel < 10) {
            System.out.println("need fuels");
            return;
        }

        System.out.println(a.fuel);
    }

    private static void plusFeul(pTP a, int n) {
        a.fuel += n;


        System.out.println(a.states);
        System.out.println(a.fuel);
    }

    private static void change(pTP a) {
        if (a.states.equals("run")) {
            a.states = "off";
        } else {
            a.states = "run";
            a.pessengersNum = 0;
            a.remainSeats = a.max;
        }

    }

    public static void add(pTP taxi, int n, String s, int k) {
        if (n > 4) {
            System.out.println("alert!!!!");
            return;
        }
        if (!taxi.states.equals("available"))
            return;

        taxi.states = "NO";
        taxi.destination = s;
        taxi.distance = k;// 거리
        taxi.pessengersNum += n;
        taxi.remainSeats = taxi.max - n;
        if (taxi.distance > taxi.standarizeDistance)
            taxi.total = taxi.standarizeFee + (taxi.addFee * (taxi.distance - taxi.standarizeDistance));
        taxi.fee += taxi.total;
        System.out.println();
        System.out.println(taxi.pessengersNum);
        System.out.println(taxi.remainSeats);
        System.out.println(taxi.standarizeFee);
        System.out.println(taxi.destination);
        System.out.println(taxi.distance + "km");
        System.out.println(taxi.total);
        System.out.println(taxi.states);
        taxi.pessengersNum = 0;
        taxi.remainSeats = 4;
        taxi.total = taxi.standarizeFee;
    }

    public static void fuelminus(pTP taxi, int n) {
        taxi.fuel -= n;

    }

    public static void print(pTP taxi) {
        System.out.println("------------------------");
        System.out.println(taxi.fuel);
        System.out.println(taxi.states);
        System.out.println(taxi.fee);
    }

    public static void check(pTP taxi) {
        if (taxi.fuel < 10) {
            System.out.println("alert!!!");
        }
    }

    public static void paid(pTP taxi) {
        taxi.states = "available";
    }

}
