import java.util.Arrays;

public class Uslovie7 {

    public static void main(String[] args) {
      int[] masiv = {23,54,7675,12,2,8,87,99,101,43};
      Arrays.sort(masiv);
      int rez1 = masiv[0];
      int rez2 = masiv[9];
    	System.out.println("Min = "+ rez1); 
    	System.out.println("Max = "+ rez2); 
    }
}
