package googoodan.part2;

import studyTemplate.Study;

import java.util.Scanner;

public class NormalGooGoo implements Study {
    @Override
    public void main(String[] args) {

        //입력 및 출력
        System.out.println("구구단 중 출력할 단 수는: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println("사용자가 입력한 값: " + number);

        if (number < 2) {
            System.out.println("입력한 값을 잘못 입력하였습니다.");
        }
        else if (number > 9) {
            System.out.println("입력한 값을 잘못 입력하였습니다.");
        }
        else {
            for (int i = 1; i < 10; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }
}
