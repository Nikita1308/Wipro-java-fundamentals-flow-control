import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		char ch= sc.next().charAt(0);
		
		if(Character.isLowerCase(ch))
			System.out.println(ch + "->" + Character.toUpperCase(ch));
		else
			System.out.println(ch + "->" + Character.toLowerCase(ch));	
	}
}