package googoodan.part2;

import studyTemplate.Study;

import java.util.Scanner;

public class NormalGooGoo implements Study {
    @Override
    public void main(String[] args) {

        //2단
        System.out.println("2 * 1 = " + (2 * 1));
        System.out.println("2 * 2 = " + (2 * 2));
        System.out.println("2 * 3 = " + (2 * 3));
        System.out.println("2 * 4 = " + (2 * 4));
        System.out.println("2 * 5 = " + (2 * 5));
        System.out.println("2 * 6 = " + (2 * 6));
        System.out.println("2 * 7 = " + (2 * 7));
        System.out.println("2 * 8 = " + (2 * 8));
        System.out.println("2 * 9 = " + (2 * 9));

        //3단
        System.out.println("3 * 1 = " + (3 * 1));
        System.out.println("3 * 2 = " + (3 * 2));
        System.out.println("3 * 3 = " + (3 * 3));
        System.out.println("3 * 4 = " + (3 * 4));
        System.out.println("3 * 5 = " + (3 * 5));
        System.out.println("3 * 6 = " + (3 * 6));
        System.out.println("3 * 7 = " + (3 * 7));
        System.out.println("3 * 8 = " + (3 * 8));
        System.out.println("3 * 9 = " + (3 * 9));

        //4단
        int result = 4 * 1;
        System.out.println("4 * 1 = " + result);
        result = 4 * 2;
        System.out.println("4 * 2 = " + result);
        result = 4 * 3;
        System.out.println("4 * 3 = " + result);
        result = 4 * 4;
        System.out.println("4 * 4 = " + result);
        result = 4 * 5;
        System.out.println("4 * 5 = " + result);
        result = 4 * 6;
        System.out.println("4 * 6 = " + result);
        result = 4 * 7;
        System.out.println("4 * 7 = " + result);
        result = 4 * 8;
        System.out.println("4 * 8 = " + result);
        result = 4 * 9;
        System.out.println("4 * 9 = " + result);

        //입력 및 출력 (5를 입력받는다고 가정)
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
