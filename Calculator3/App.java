package Calculator3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String workContinue = "";
        while (!workContinue.equals("exit")) {



            System.out.println("연산할 첫번째 숫자를 입력해주세요");
            int first = sc.nextInt();

            System.out.println("연산할 두번째 숫자를 입력해주세요");
            int second = sc.nextInt();

            System.out.println("연산할 부호를 입력해주세요(+,-,*,/)");
            char cal = sc.next().charAt(0);


            switch (cal) {
                case '+':
                    System.out.println(calculator.sum(first, second));
                    break;

                case '-':
                    System.out.println(calculator.sub(first, second));
                    break;

                case '*':
                    System.out.println(calculator.mul(first, second));
                    break;

                case '/':
                    System.out.println(calculator.div(first, second));
                    break;

                default:
                    System.out.println("잘못된 연산자입니다. 연산자를 올바르게 입력해주세요(+,-,*,/)");

            }

            System.out.println("계산 기록 :" + Calculator.getResultCollection());



            System.out.println("연산을 종료하려면 exit를 작성하십시요 / 계속 진행하려면 아무키나 누르시오");
            workContinue = sc.next();
        }

        System.out.println("연산을 종료합니다");
    }

}
