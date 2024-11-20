package report;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        //1. 사용자가 숫자를 입력 할 수 있도록 해야한다. Scanner기능 이용
        //1-1. 단, 이 숫자는 음수가 아닌 양수만 가능하며, 음수사용이 불가능함을 알려야 한다
        //1-2. 음수가 입력되었을 경우 다시 처음으로 돌아와 시작해야한다.
        //2. 사용자가 연산자를 입력 할 수 있도록 해야한다. Scanner기능 이용
        //2-1. 단, 연산자를 잘못 입력했을 경우 잘못되었음을 알려야 한다.
        //2-2. 잘못된 연산자가 입력되었을 경우 다시 처음으로 돌아와 시작해야 한다.
        //3. 사용자가 올바른 숫자와 연산자를 입력했을 경우 계산한 결과값이 나와야 한다.
        //3-1. 단, 나누기 연산에서 분모가 되는위치인 두번째 위치에 0이 입력될 경우 잘못되었음을 알려야 한다.
        //3-2. 분모자리에 0이 입력되었을 경우 다시 처음으로 돌아와 시작해야한다.
        //4. 사용자가 그만사용하길 원한다면 끝낼 수 있는 명령어가 필요하다.
        //연산의 종류는 아래의 4가지로 선정한다
        //a+b / a-b / a*b / a/b /


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
