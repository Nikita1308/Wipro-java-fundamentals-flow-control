import java.util.Scanner;
public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
				char c = s.next().charAt(0);
				switch(c)
				{
					case 'R':
						System.out.println("Red");
						break;
					case 'G':
						System.out.println("Green");
						break;
					case 'B':
						System.out.println("Blue");
						break;
					case 'Y':
						System.out.println("Yellow");
						break;
					case 'O':
						System.out.println("Orange");
						break;	
					case 'W':
						System.out.println("White");
						break;
					default:
						System.out.println("Invalid output");
				}
				
	}

}
