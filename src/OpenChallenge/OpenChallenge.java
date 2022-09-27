package OpenChallenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OpenChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean control = true;
        int count = 0;
        int trial;

        // 게임 시작
        while (control) {
            Referee referee = new Referee();
            referee.setNum();
            System.out.println("수를 결정하였습니다. 맞추어 보세요\n0~99");

            do {
                count++;
                // 수 입력
                while (true) {
                    System.out.print(count + ">>");
                    try {
                        trial = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("다시 입력하세요..");
                        scanner.next();
                    }
                }

                // 판단
                if (referee.judge(trial) == 1) {
                    System.out.println("더 높게");
                } else if (referee.judge(trial) == -1) {
                    System.out.println("더 낮게");
                } else {
                    System.out.println("맞았습니다.");

                    // 재시작 질문
                    while (true) {
                        System.out.print("다시하시겠습니까(y/n)>>");
                        char again = scanner.next().charAt(0);
                        if (again == 'y') {
                            count = 0;
                            break;
                        } else if (again == 'n') {
                            count = 0;
                            control = false;
                            break;
                        } else {
                            System.out.println("다시 입력해주세요..");
                        }
                    }
                }
            } while (count != 0);
        }
    }
}
