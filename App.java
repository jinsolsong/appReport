package report;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String end = "";

        while (!end.equals("exit")) //end가 exit라면 종료 그렇지 않다면 진행이라는 조건 작성
        {
            System.out.println("첫 번째 숫자를 입력하세요");
            int firstNumber = sc.nextInt();

            if (firstNumber < 0) {
                System.out.println("음수는 사용할 수 없어요~");
                continue;
            }

            System.out.println("사칙연산 기호를 입력하세요");
            char symbol = sc.next().charAt(0);

            switch(symbol){
                case('+'):break;
                case('-'):break;
                case('*'):break;
                case('/'):break;
                default:
                    System.out.println("연산자를 확인하세요!!");
                    continue;
            }

            System.out.println("두 번째 숫자를 입력하세요");
            int secondNumber = sc.nextInt();
            if (secondNumber < 0) {
                System.out.println("음수는 사용할 수 없어요~");
                continue;
            }
            System.out.println("결과");

            if (symbol == '+') {
                System.out.println(firstNumber + secondNumber);
            } else if (symbol == '-') {
                System.out.println(firstNumber - secondNumber);
            } else if (symbol == '*') {
                System.out.println(firstNumber * secondNumber);
            } else if (symbol == '/') {
                if (secondNumber != 0) {
                    System.out.println(firstNumber / secondNumber);
                } else {
                    System.out.println("분모에는 \"0\"이 입력될 수 없습니다.");
                    continue;
                }

            }
            System.out.println("끝내고 싶으면 \"exit\"를 입력해주세요.\n 계속하시려면 아무거나 입력해 주세요!");
            end = sc.next();
        }

    }
}
