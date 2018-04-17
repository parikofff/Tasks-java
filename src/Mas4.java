import java.util.Arrays;
import java.util.Scanner;

///с одного массива делаем два, и сортируем
public class Mas4 {
    public static void main(String[] args) {
         int []masiv = {12,-143,43,-33,44,55,3,6,7,9};
         double suma = 0;
       for (int i=0; i<masiv.length; i++) {
    	   suma += masiv[i];
    	   }
       double finsuma = suma/masiv.length;
        System.out.println("Среднее арифметическое:" +finsuma);
        }
    }
