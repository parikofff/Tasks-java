//Написать функцию, которая принимает в качестве аргументов
//одну строку X, целое число Y и число с плавающей точкой Z и
//возвращает как результат строку в виде S = x + y + z.

public class Metod2 {
	public static void main(String[] args) {
		String x = "Строка";
		int y = 123;
		double z = 3.33333;
		String S;
		S = method3(x,y,z);
       System.out.println(S);
	}
      
	private static String method3(String x,int y,double z) {
		//String str = x + y + z;
		String str = x + "+" +String.valueOf(y)+"+"+String.valueOf(z);
	return str;
    }
}
