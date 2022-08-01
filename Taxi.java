<<<<<<< HEAD
import javax.swing.*;
import java.util.UUID;



public class Taxi extends Transport {
    String destination;
    int distance;
    int minDistance;
    int distancePrice;
    int totalPrice;

    public Taxi(UUID number, String state, int price, int gas, int speed, int speedChange, int maxPassenger, int nowPassenger, int changePassenger, String destination, int distance, int minDistance, int distancePrice, int totalPrice) {
        super(number, state, price, gas, speed, speedChange, maxPassenger, nowPassenger, changePassenger);
        this.destination = destination;
        this.distance = distance;
        this.minDistance = minDistance;
        this.distancePrice = distancePrice;
        this.totalPrice = totalPrice;
    }

    public void changePassenger(int a,String b,int c) throws InterruptedException {
        //2 서울역 2
        if (a>4){
            JOptionPane.showMessageDialog(null, "최대 승객 수 초과", "C반 6조 Spring 과제", JOptionPane.ERROR_MESSAGE);
        } else {
            this.price = 0;
            this.maxPassenger = 4;
            this.nowPassenger = a;
            this.maxPassenger -= a;
            this.destination = b;
            this.distance = c;
            if (distance < 10){
                if (nowPassenger > 0){
                    price = minDistance + (distancePrice * (distance-1));
                    state = "운행중";
                    System.out.println("현재 승객 "+nowPassenger+"명");
                    Thread.sleep(400);
                    System.out.println("잔여 탑승가능 승객 "+maxPassenger+"명");
                    Thread.sleep(400);
                    System.out.println("기본 요금은 "+minDistance+"원");
                    Thread.sleep(400);
                    System.out.println("목적지는 "+destination);
                    Thread.sleep(400);
                    System.out.println("목적지까지 거리는 "+distance+"km");
                    Thread.sleep(400);
                    System.out.println("지불하실 요금은 "+price+"원");
                }
            } else {
                if (nowPassenger > 0){
                    price = minDistance + 10000 + (distancePrice * ((distance-10)-1));
                    state = "운행중";
                    System.out.println("현재 승객 "+nowPassenger+"명");
                    Thread.sleep(400);
                    System.out.println("잔여 탑승가능 승객 "+maxPassenger+"명");
                    Thread.sleep(400);
                    System.out.println("기본 요금은 "+minDistance+"원");
                    Thread.sleep(400);
                    System.out.println("목적지는 "+destination);
                    Thread.sleep(400);
                    System.out.println("목적지까지 거리는 "+distance+"km");
                    Thread.sleep(400);
                    System.out.println("지불하실 요금은 "+price+"원");

                }
            }
        }
    }
    public void changeGas(int x){
        if (gas+x <= 10){
            this.gas += x;
            this.state = "운행 불가";
        } else {
            this.gas += x;
        }
    }
    public void payment() throws InterruptedException {
        if (gas <= 0){
            totalPrice += price;
            this.state = "운행 불가";
            System.out.println("현재 기름 "+gas);
            Thread.sleep(400);
            System.out.println("현재 상태 "+state);
            Thread.sleep(400);
            System.out.println("누적 요금 "+totalPrice);
            Thread.sleep(400);
            JOptionPane.showMessageDialog(null, "주유 필요", "C반 6조 Spring 과제", JOptionPane.ERROR_MESSAGE);
        } else {
            totalPrice += price;
            this.price = 0;
            this.state = "일반";
        }
    }
}

=======
public class Taxi extends pTP {


    public Taxi( ) {


    }

}
>>>>>>> 4de858b1da47f65f7d2a6f59f4e06ea6636a134a
