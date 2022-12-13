package googoodan.part2.extra;

import studyTemplate.Study;

import java.util.Scanner;

public class ExtraGooGoo implements Study {
    @Override
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        String input;

        System.out.println("계산하고 싶은 최대 단수는: ");
        number1 = sc.nextInt();
        sc.nextLine();

        ExtraGooGooFirst.calculate(number1);

        System.out.println("계산하고 싶은 최대 단 수와 최대 길이는: ");
        input = sc.nextLine();

        ExtraGooGooSecond.calcultate(input);
    }
}
