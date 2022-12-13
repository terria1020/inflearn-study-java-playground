package googoodan.part2;

import studyTemplate.Study;

import java.util.Scanner;

public class NormalGooGoo implements Study {
    @Override
    public void main(String[] args) {

        int i = 1;

        //입력 및 출력
        //System.out.println("구구단 중 출력할 단 수는: ");
        //Scanner sc = new Scanner(System.in);

        //int number = sc.nextInt();
        int number = 6;

        //6단, 반복문의 사용
        while (i < 10) {
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        }

        number = 7;

        //7단
        for (i = 1; i < 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
