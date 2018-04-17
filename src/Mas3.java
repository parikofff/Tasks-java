import java.util.Arrays;
import java.util.Scanner;

///с одного массива делаем два, и сортируем
public class Mas3 {
    public static void main(String[] args) {
         int []masiv = {12,143,43,33,44,55,3,6,7,9};
         int [] mas1= new int[5];
         int [] mas2= new int[5];      
         System.arraycopy(masiv, 0, mas1, 0, 5);
         System.arraycopy(masiv, 5, mas2, 0, 5);
         Arrays.sort(mas1); 
        String rez = Arrays.toString(mas1);
        Arrays.sort(mas2);
        String rez1 = Arrays.toString(mas2);
        System.out.println("Масив 1:" +rez);
        System.out.println("Масив 2:" +rez1);
        }
    }
