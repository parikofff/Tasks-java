import java.util.Arrays;
import java.util.Scanner;

///меняем  мин и мах числа местами
public class Mas2 {
    public static void main(String[] args) {
    	int n=8;
         int []masiv = new int [n];
         Scanner scan = new Scanner(System.in);
         for (int i=0;i<masiv.length;i++) {
        	 System.out.println("Введите число массива: "); 
        	 masiv[i] = scan.nextInt();
         }
        int masiv1 = masiv[0];

        int masiv2 = masiv[7];
        masiv[0]= masiv2;
        masiv[7]=masiv1;
        String rez = Arrays.toString(masiv);

            System.out.println("Масив:" +rez);
        }
    }
