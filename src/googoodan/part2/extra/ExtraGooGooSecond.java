package googoodan.part2.extra;

public class ExtraGooGooSecond {
    public static void calcultate(String input) {
        int[] bounds = getBounds(input);

        int column= bounds[0];
        int endNumber = bounds[1];

        for (int i = 2; i < column + 1; i++) {
            print(i, endNumber);
        }
    }

    public static void print(int column, int endNumber) {
        for (int i = 1; i < endNumber + 1; i++) {
            System.out.println(column + " * " + i + " = " + (column * i));
        }
    }

    public static int[] getBounds(String input) {
        String[] split = input.split(",");

        int[] bound = new int[2];
        bound[0] = Integer.parseInt(split[0]);
        bound[1] = Integer.parseInt(split[1]);

        return bound;
    }
}
