import java.util.Arrays;

public class Uslovie5 {

    public static void main(String[] args) {

        int[] masiv = new int[101];
        for (int i = 0, j = masiv.length - 1; i <= masiv.length - 1 && j >=0; i++, j--){
        	masiv[i] = j;
            
        }
        String rez = Arrays.toString(masiv);
        System.out.print("Массив с числами: "+ rez);
  
     
    }

}
