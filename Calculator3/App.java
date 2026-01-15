package Calculator3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        String workContinue = "";
        while (!workContinue.equals("exit")) {

            // 값 입력받기1(첫번째 숫자) * sc1으로 명명
            Scanner sc1 = new Scanner(System.in);
            System.out.println("연산할 첫번째 숫자를 입력해주세요");
            int first = sc1.nextInt();

            // 값 입력받기2(두번째 숫자) * sc3으로 명명
            Scanner sc2 = new Scanner(System.in);
            System.out.println("연산할 두번째 숫자를 입력해주세요");
            int second = sc1.nextInt();

            // 값 입력받기3(연산자) * sc2으로 명명
            Scanner sc3 = new Scanner(System.in);
            System.out.println("연산할 부호를 입력해주세요(+,-,*,/)");
            char cal = sc3.next().charAt(0);


            switch (cal) {
                case '+':
                    System.out.println((first + second));
                    break;

                case '-':
                    System.out.println((first - second));
                    break;

                case '*':
                    System.out.println((first * second));
                    break;

                case '/':
                    if(second == 0) {
                        System.out.println("0으로 나눌 수 없습니다. 0이상의 양의 정수를 입력해주세요");
                    } else {
                        System.out.println((first / second));
                    }
                    break;

                default:
                    System.out.println("잘못된 연산자입니다. 연산자를 올바르게 입력해주세요(+,-,*,/)");

            }

            Scanner sc4 = new Scanner(System.in);
            System.out.println("연산을 종료하려면 exit를 작성하십시요(아무키나 누르면 연산을 계속 진행합니다)");
            workContinue = sc4.next();
        }

        System.out.println("연산을 종료합니다");
    }
}
