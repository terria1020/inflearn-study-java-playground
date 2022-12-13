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

        System.out.println(number + " * 1 = " + (number * 1));
        System.out.println(number + " * 2 = " + (number * 2));
        System.out.println(number + " * 3 = " + (number * 3));
        System.out.println(number + " * 4 = " + (number * 4));
        System.out.println(number + " * 5 = " + (number * 5));
        System.out.println(number + " * 6 = " + (number * 6));
        System.out.println(number + " * 7 = " + (number * 7));
        System.out.println(number + " * 8 = " + (number * 8));
        System.out.println(number + " * 9 = " + (number * 9));
    }
}
