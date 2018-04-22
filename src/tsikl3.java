
public class tsikl3 {

	public static void main(String[] args) {
	int[] x = new int[28];
	for (int i=0;i<x.length;i++) {
		x[i] =i*635;	
		
		switch (i) {
		case 0:
		case 14:
		case 27:
		System.out.println(x[i]);
		}
	}

	}

}
