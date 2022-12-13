package googoodan.part2;

import studyTemplate.Study;

import java.util.Scanner;

public class ClassGooGoo implements Study {
    @Override
    public void main(String[] args) {
        int[] results;
        Scanner sc = new Scanner(System.in);

        System.out.println("구구단 중 출력할 단 수는: ");

        int number = sc.nextInt();

        GooGooDan.showGoogoo(number);
    }
}
