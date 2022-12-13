package googoodan.part2;

public class GooGooDan {
    public static int[] calculate(int number) {
        int[] results = new int[9];
        for (int i = 1; i < 10; i++) results[i - 1] = number * i;
        return results;
    }

    public static void print(int[] results) {
        for (int i = 1; i < 10; i++) {
            System.out.println(results[0] + " * " + i + " = " + results[i - 1]);
        }
    }

    public static void showGoogoo(int number) {
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
