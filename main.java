import java.util.Scanner;
import java.util.UUID;
import javax.swing.JOptionPane;
// 18버전 사용
public class main {
    public static void main(String[] args) throws InterruptedException {
        busScenario busScenario = new busScenario(UUID.randomUUID(), "운행", 1000, 100, 0, 0, 30, 0, 0);
        taxiScenario taxiScenario = new taxiScenario(UUID.randomUUID(), "일반", 0, 100, 0, 0, 4, 0, 0, null, 1, 3000, 1000, 0);
        Scanner scanner = new Scanner(System.in);
        JOptionPane alert = new JOptionPane();
        int chooseScenario;

        System.out.println("안녕하세요");
        Thread.sleep(600);
        System.out.println("C반 6조 Spring 과제 시나리오 입니다.");
        Thread.sleep(600);
        System.out.println("확인하고 싶은 시나리오 번호를 입력해주세요.");
        Thread.sleep(600);

        while (true) {
            try {
                System.out.println("1. 버스 시나리오");
                System.out.println("2. 택시 시나리오");
                System.out.println("3. 종료하기");
                String input = scanner.nextLine();
                chooseScenario = Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            if (chooseScenario==1) {
                System.out.println("버스 시나리오 입니다.");
                Thread.sleep(600);
                busScenario.bScenario();
                break;
            } else if (chooseScenario==2) {
                System.out.println("택시 시나리오 입니다.");
                Thread.sleep(600);
                taxiScenario.tScenario();
                break;
            } else if (chooseScenario==3) {
                System.out.println("실행을 종료합니다.");
                Thread.sleep(600);
                break;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
        System.out.println("시나리오를 종료합니다.");
    }
}

