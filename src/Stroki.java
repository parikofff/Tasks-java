import java.util.Scanner;
public class Stroki {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.print("Введи первую строку: ");
		String s1 = scan.nextLine();
		 System.out.print("Введи вторую строку: ");
		String s2 = scan.nextLine();
		 System.out.print("Введи третью строку: ");
		String s3 = scan.nextLine();
		System.out.println("Получилось в примере №1: "+(s1+s3));
		System.out.println("Получилось в примере №2: "+(s3+s2+s1));
		System.out.println("Получилось в примере №3: "+(s1+s2+s3));		
	}
}
