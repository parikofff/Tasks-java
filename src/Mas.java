import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Mas {
	public static void main(String[] args)throws 
	 NumberFormatException, IOException { {
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		int [] line = {8,2,105,4,5,6,7,8,9,10};
		Arrays.sort(line);
		String line1 = Arrays.toString(line) ;
		System.out.println(line1);

	      for (int i = 0; i<line.length; i++){
		      System.out.println("¬ведите числа дл€ массива: ");
	      
	    	   i = d.read();}
	    	 //int line = Integer.parseInt(d.readLine());
	    	  // i = Integer.parseInt(d.readLine());}
			//String line2 = Arrays.toString(i) ;
			//System.out.println(line2);
	    	 }
	}
}
