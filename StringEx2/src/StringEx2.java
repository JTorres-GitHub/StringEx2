import java.util.Scanner;

public class StringEx2 {
	public static String makeAbba(String strA, String strB){
		return strA + strB + strB + strA;
	}
	
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);
		String str1;
		String str2;
		
		System.out.println("Enter the first string: ");
		str1 = input.nextLine();
		
		System.out.println("Enter the second string: ");
		str2 = input.nextLine();
		
		System.out.println(makeAbba(str1, str2));
		
		input.close();
	}
}
