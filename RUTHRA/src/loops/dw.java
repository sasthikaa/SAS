package loops;

public class dw {

	public static void main(String[] args) {
		
		/*/*
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
	 * syntax:
	 * 
	 * initialisation
	 * do
	 * {
	 * statemet
	 * inc/dec
	 * }
	 * while(condition);
	 * 
	 * 10 , 9, 8,...1
	 * 
	 * 1,2...10
	 */
		
		int i=10;
		do
		{
			System.out.println(i);
			i=i-1;
		}while(i>=1);
	}
}
