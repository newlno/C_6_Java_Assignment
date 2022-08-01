<<<<<<< HEAD
import javax.swing.*;
import java.util.UUID;

public class Bus extends Transport {

    public Bus(UUID number, String state, int price, int gas, int speed, int speedChange, int maxPassenger, int nowPassenger, int changePassenger) {
        super(number, state, price, gas, speed, speedChange, maxPassenger, nowPassenger, changePassenger);
    }
    public void changePassenger(int x){
        if (x>30){
            JOptionPane.showMessageDialog(null, "최대 승객 수 초과", "C반 6조 Spring 과제", JOptionPane.ERROR_MESSAGE);
        } else {
            this.maxPassenger = 30;
            this.price = 1000;
            this.nowPassenger = x;
            this.maxPassenger -= x;
            if (nowPassenger > 0){
                price *= x;
        }
        }
    }
    public void changeGas(int x) throws InterruptedException {
        if (gas+x <= 10){
            this.gas += x;
            this.state = "차고지행";
            System.out.println("현재 기름 "+gas);
            Thread.sleep(200);
            System.out.println("현재 상태 "+state);
            JOptionPane.showMessageDialog(null, "주유 필요", "C반 6조 Spring 과제", JOptionPane.ERROR_MESSAGE);
        } else {
            this.gas += x;
        }
    }
    public void changeState(int x){
            if (x == 1) {
                this.state = "운행";
            } else if (x == 2) {
                this.state = "운행중";
            } else if (x == 3) {
                this.state = "차고지행";
            }
    }
}

=======
public class Bus extends pTP {

    public Bus(int number, int fuel, int velocity, int changeVelocity, int max, int pessengersNum) {
        super(number, fuel, velocity, changeVelocity, max, pessengersNum);

    }

    public Bus(int pessengersNum) {
        super(pessengersNum);

    }

}
>>>>>>> 4de858b1da47f65f7d2a6f59f4e06ea6636a134a
