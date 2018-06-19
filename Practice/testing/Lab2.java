package Practice;

import java.util.Scanner;

public class Lab2{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] list = {2,5,7,8,10,11};

        int shift = scan.nextInt();

        for (int i = 1 ; i <= shift; i++){

            for (int j = list.length-1; j > 0 ; j--){

                int temp = list[j];
                list[j] = list[j-1];
                list[j-1] = temp;
            }

            for (int iter : list){
                System.out.print(iter + " ");
            }
            System.out.println();
        }







    }

}