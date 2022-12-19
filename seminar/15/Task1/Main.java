public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.sum2d(new String[][]{{"1", "a", "3"}, {"1", "2", "3"}}));
    }

    public int sum2d(String[][] arr) {
        int sum = 0;
        for (String[] strings: arr) {
            for (String string : strings) {
                int val = -1;
                try {
                    val = Integer.parseInt(string);
                } catch (NumberFormatException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
                sum += val;
            }
        }
        return sum;
    }
}
