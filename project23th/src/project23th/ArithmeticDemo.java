package project23th;
class Arithmetic
{
	int add(int a,int b)
	{
		int rem1=0,sum1=0,rem2=0,sum2=0,res;
		while(a!=0)
		{
			rem1=a%10;
			sum1+=rem1;
			a=a/10;
		}
		while(b!=0)
		{
			rem2=b%10;
			sum2+=rem2;
			b=b/10;
		}
		
		res=sum1*10+sum2;
		return(res);
	}
	
}
class Adder extends Arithmetic
{
	int display(int a,int b)
	{
		System.out.println("My Super class is :Arithmetic" );
		int c=super.add(a,b);
		return(c);
	}
}

public class ArithmeticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Adder obj=new Adder();
     int a=13,b=20;
     int c=obj.display(a,b);
    System.out.println(c+" "+a+" "+b);
    
	}

}
