
public class Uslovie6 {

    public static void main(String[] args) {
    	int rez= 0;
        int[] masiv = {23,54,7675,12,2,8,87,99,101,43};
        for (int i = 1; i<masiv.length-1; i++){
        	rez = rez + masiv[i];
        }
    	System.out.print("Summa = "+ rez); 
    }

}
