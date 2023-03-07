package extras;

public class l1 {
	public static void main(String[] args) {
		
	

	/*
	 * Lambda expression is a new and important feature of Java which was included in Java SE 8.
	 *  It provides a clear and concise way to represent one method interface using an expression.
	 *  It is very useful in collection library. It helps to iterate, filter and extract data from collection.

      The Lambda expression is used to provide the implementation of an interface
       which has functional interface. It saves a lot of code.
	 * 
	 * Java lambda expression is consisted of three components.

                1) Argument-list: It can be empty or non-empty as well.

                2) Arrow-token: It is used to link arguments-list and body of expression.

                3) Body: It contains expressions and statements for lambda expression.
	 * 
	 * 
	 * No Parameter Syntax

             () -> {  
                    //Body of no parameter lambda  
                    } 
                     
       One Parameter Syntax
       

            (p1) -> {  
                      //Body of single parameter lambda  
                     }  
                     
       Two Parameter Syntax

            (p1,p2) -> {  
                 //Body of multiple parameter lambda  
                       }  
	 * 
	 * */
	
	String n="dhivya"  ;
    
    //with lambda // no parameter  
    D1 d2=()->{  
        System.out.println("Hello "+ n);  
    };  
    // calling method of interface D1 using its interface instance 
    d2.pt(); 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  
    
    
    
    
 
    
 // Lambda expression with single parameter.  
    D2 s1=(side)->{  
        System.out.println("area of square is "+ side*side); 
    };  
   s1.square(40);  
   
   
   
    
    
 //Lambda expression with two parameter.  
    D3 ad1=(a, b)->(a+b);  
    System.out.println(ad1.add(10,20));  
      
    
}}
