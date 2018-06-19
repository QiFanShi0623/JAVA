package Practice.testing;

public class MutiArray {
    public static void main(String[] args) {

        int[][] list = new int[3][2];

        int[][] item = {{2, 5}
        , {10, 1}
        , {8, 2}};

        System.out.println(item[1].length);

        int[] sum = new int[item.length];

        for (int row = 0; row < item.length; row++) {
            for (int col = 0; col < item[row].length; col++) {

                sum[row]+=item[row][col];
            }

        }
        for (int iter : sum) {
            System.out.println(iter);
        }

    }
}
