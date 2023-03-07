package loops;

public class f {

	/*
	 *for/while/do while
	 *
	 * initialisation:     where to start
	 * condition checking: where to stop
	 *   
	 *       forward: <=end value
	 *       backward: >=end value
	 *       
	 * inc/dec :   difference btween 2 consecutive
	 * 
	 * 
	 * syntax:
	 * 
	 * initialisation
	 * while(condition)
	 * {
	 * statement
	 * inc/dec
	 * }
	 * 
	 * 1,2,3...10
	 * 
	 * even numbers : 10 to 20...     10,12,14,16,18,20 
	 * */
	public static void main(String[] args) {
		
		int i=10;
		while(i<=20)
		{
			System.out.println(i);
			i=i+2;
		}
		
		
		// 11,9,7,5,3,1
		
		int a=11;
		while(a>=1)
		{
			System.out.println(a);
			a=a-2;
		}
	}
}
