
public class Assignment12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-13;
		boolean flag=true;
		for(int i=2; i<num/2+1;i++)
		{
			if(num%i==0)
			{
			flag=false;
			break;
			}
		}
		if(num==0||num==1||num<1)flag=false;
		
		if(flag)
			System.out.print(num +" is prime");
		else
			System.out.print(num +" is not prime");

	}

}
