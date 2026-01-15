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
                    System.out.println("this is error");

            }

            System.out.println("계산 기록 :" + calculator.getResultCollection());

            System.out.println("가장 오래된 기록을 삭제하시겠습니까? Y or N(Press Any key)");
            String remove  = sc.next();

            if (remove.equals("Y")) {
                calculator.removeResult();
                System.out.println("수정후 기록 :" + calculator.getResultCollection());

            }

            System.out.println("연산을 종료하려면 exit를 작성하십시요 / 계속 진행하려면 아무키나 누르시오");
            workContinue = sc.next();
        }

        System.out.println("연산을 종료합니다");
    }

}
