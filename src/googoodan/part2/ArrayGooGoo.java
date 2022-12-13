package googoodan.part2;

import studyTemplate.Study;

import java.util.Scanner;

public class ArrayGooGoo implements Study {
    @Override
    public void main(String[] args) {
        int[] results = new int[9];

        Scanner sc = new Scanner(System.in);

        System.out.println("구구단 중 출력할 단 수는: ");

        int number = sc.nextInt();

        if (number < 2) {
            System.out.println("입력한 값을 잘못 입력하였습니다.");
        }
        else if (number > 9) {
            System.out.println("입력한 값을 잘못 입력하였습니다.");
        }
        else {
            for (int i = 1; i < 10; i++) {
                results[i - 1] = number * i;
            }

            for (int i = 1; i < 10; i++) {
                System.out.println(number + " * " + i + " = " + results[i - 1]);
            }
        }
    }
}
