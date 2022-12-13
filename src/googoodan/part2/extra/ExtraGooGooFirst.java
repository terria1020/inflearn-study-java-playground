package googoodan.part2.extra;

import studyTemplate.Study;

public class ExtraGooGooFirst {
    public static void calculate(int number) {
        for (int i = 2; i < number + 1; i++) {
            print(i, number);
        }
    }

    public static void print(int index, int number) {
        for (int i = 1; i < number + 1; i++) {
            System.out.println(index  + " * " + i + " = " + (index * i));
        }
    }
}
