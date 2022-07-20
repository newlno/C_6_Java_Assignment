import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) throws InterruptedException {
        busScenario busScenario = new busScenario(UUID.randomUUID(), "운행", 1000, 100, 0, 0, 30, 0, 0);
        taxiScenario taxiScenario = new taxiScenario(UUID.randomUUID(), "일반", 0, 100, 0, 0, 4, 0, 0, null, 1, 3000, 1000, 0);
        Scanner scanner = new Scanner(System.in);
        JOptionPane alert = new JOptionPane();
        String chooseScenario;

        System.out.println("안녕하세요");
        Thread.sleep(600);
        System.out.println("C반 6조 Spring 과제 시나리오 입니다.");
        Thread.sleep(600);
        System.out.println("확인하고 싶은 시나리오를 입력해주세요.");
        Thread.sleep(600);
        System.out.println("빈 칸을 입력하시면 종료됩니다.");
        Thread.sleep(600);

        while (true) {
            System.out.println("버스 시나리오 = bus");
            System.out.println("택시 시나리오 = taxi");
            chooseScenario = scanner.nextLine();
            switch (chooseScenario) {
                case "bus":
                    System.out.println("버스 시나리오 입니다.");
                    Thread.sleep(600);
                    busScenario.bScenario();
                    break;
                case "taxi":
                    System.out.println("버스 시나리오 입니다.");
                    Thread.sleep(600);
                    taxiScenario.tScenario();
                    break;
                case "":
                    System.out.println("실행을 종료합니다.");
                    Thread.sleep(600);
                    taxiScenario.tScenario();
                    break;
            }
            break;
        }
    }
}

