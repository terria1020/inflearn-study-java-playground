package googoodan.part2;

import studyTemplate.Study;

import java.util.Scanner;

public class MethodGooGoo implements Study {
    @Override
    public void main(String[] args) {
        int[] results;
        Scanner sc = new Scanner(System.in);

        System.out.println("구구단 중 출력할 단 수는: ");

        int number = sc.nextInt();
        showGoogoo(number);
    }

    //메소드 구현
    public int[] calculate(int number) {
        int[] results = new int[9];
        for (int i = 1; i < 10; i++) results[i - 1] = number * i;
        return results;
    }

    public void print(int[] results) {
        for (int i = 1; i < 10; i++) {
            System.out.println(results[0] + " * " + i + " = " + results[i - 1]);
        }
    }

    public void showGoogoo(int number) {
        if (number < 2) {
            System.out.println("입력한 값을 잘못 입력하였습니다.");
        }
        else if (number > 9) {
            System.out.println("입력한 값을 잘못 입력하였습니다.");
        }
        else {
            int[] results = calculate(number);
            print(results);
        }
    }
}
