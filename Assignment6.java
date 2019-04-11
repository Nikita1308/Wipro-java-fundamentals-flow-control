public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=Integer.parseInt(args[0]);
		String gen=args[1];

		if(age>=1 && age <=58)
		{
			if(gen.equals("F")) 
			{
				System.out.println("interest=8.2%");
			}
			else
				{
				System.out.println("Interest=8.4%");
				}
		}

		else //if(age>=59 && age<=100)
		{
			if(gen.equals("F"))
			{
				System.out.println("interest=9.2%");
			}
			else
			{
				System.out.println("Interest=10.5%");
			}
		}
	}

}
