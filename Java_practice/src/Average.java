public class Average 
{
	public static void main(String[]args)

	{
		double num[]= {5.5,10.1,11,12.8,56.9,2.5};
		double result;
		result=0;
		for(int i=0;i<6;++i)
			result=result + num[i]; //adding all the values
		System.out.print(result/6); // dividing by 6
		}
	
}