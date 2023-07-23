package Package1;
public class Class3 
{
	public int div(int a, int b)
	{
	int c;
	c=a/b;
	return c;
	}
	public int sub(int c, int d)
	{
	int e;
	e=c-d;
	return e;
	}
	public int sum(int e, int f)
	{
	int g;
	g=e+f;
	return g;
	}
	public int sub1(int g, int h)
	{
	int i;
	i=g-h;
	return i;
	}
	public void mul(int i, int j)
	{
	int k;
	k=i*j;
	System.out.println("Final Result is: "+k);
	}
	public static void main(String[] args) 
	{
		Class3 ref1=new Class3();
		int div_result=ref1.div(10, 2);
		int sub_result=ref1.sub(div_result, 2);
		int sum_result=ref1.sum(sub_result, 2);
		int sub1_result=ref1.sub(sum_result, 2);
		ref1.mul(sub1_result, 2);		
	}
}

