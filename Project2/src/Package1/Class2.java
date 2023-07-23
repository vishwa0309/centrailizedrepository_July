package Package1;
public class Class2 
{
	public int sum(int a,int b) 
	{
	int c;
	c=a+b;
	return c;
	}
	public int sum1(int c, int d) 
	{
	int e;
	e=c+d;
	return e;
	}
	public int sub(int e, int f)
	{
	int g;
	g=e-f;
	return g;
	}
	public int mul(int g, int h)
	{
	int i;
	i=g*h;
	return i;
	}
	public void div(int i, int j)
	{
	int k;
	k=i/j;
	System.out.println("Final Result is: "+k);
	}
	public static void main(String[] args) 
	{
		Class2 obj1=new Class2();
		int sum_result =obj1.sum(10,2);
		int sum1_result1=obj1.sum(sum_result,2);
		int sub_result=obj1.sub(sum1_result1,2);
		int mul_result=obj1.mul(sub_result, 2);
		obj1.div(mul_result, 2);
	}
}
