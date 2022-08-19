import java.util.Scanner;
	class AssignmentOne{
		
		public void checkPalindrome(){
			Scanner sc = new Scanner(System.in);   
		    System.out.println("Enter a number to check if it is a Palindrome");  
		    int userInput = sc.nextInt(); 
		      
		    int remainder;
		    int reverse = 0;
		    int temp;    
		      
		    temp=userInput;    
		      
		      while(userInput > 0){    
		          remainder = userInput % 10; 
		          reverse = (reverse * 10) + remainder;    
		          userInput = userInput / 10;          
		      } 
		      if(temp == reverse){    
		    	  System.out.println("This is a Palindrome Number ");    
		    } else {    
		    	  System.out.println("This is not a Palindrome Number");
		    }
}
		
		public void printPattern() {
			Scanner sc = new Scanner(System.in);	
			System.out.println("Enter the number to Print Pattern of Stars --> ");	
			int userInput = sc.nextInt();
			        
			for (int outer = userInput; outer >= 1; outer--){
				for (int inner = outer; inner >= 1; inner--){
				System.out.print("*");}
			System.out.println();}
}

		public void checkPrimeNumber() { 
	    	Scanner sc = new Scanner(System.in);		
			
	    	System.out.println("Enter the Number to check whether its a 'Prime Number' :");		
			int userInput = sc.nextInt();		
			boolean isPrime = true;
		    
		    for (int a = 2; a <= userInput / 2; ++a) {
		    if (userInput % a == 0){
		        isPrime = false; break; }
		    } if (isPrime == true) {
		      System.out.println(userInput + " = Is a Prime Number.");
		    } else {
		      System.out.println(userInput + " = Is not a Prime Number.");
		    }
}
		
        public void printFibonacciSeries() {
        	Scanner sc = new Scanner(System.in);		
			
	    	System.out.println("Enter the Number to Print Fibonacci Series");		
			int userInput = sc.nextInt();
			
        	int next, first = 0, second = 1;
        	System.out.println("Fibonacci Series till " + userInput + " terms:");

            for (int i = 1; i <= userInput; ++i) {
            System.out.print(first + ", ");
            
            next = first + second;
            first = second;
            second = next;            
            }
}
		
		    public static void main (String[] args) {
		    	
		    	AssignmentOne obj = new AssignmentOne();
		    	int choice;       
		    	Scanner sc = new Scanner(System.in);                
                        
                do {
                	System.out.println();
                	System.out.println();
                	System.out.println("Enter your choice from below list.\n" + 
                	"Enter 1 --> Find Palindrome of Number.\n" + 
                	"Enter 2 --> Print Star Pattern for a given no.\n" + 
                	"Enter 3 --> Check whether the no is a  Prime Number.\n" + 
                	"Enter 4 --> Print Fibonacci Series.\n" + "--> Enter 0 to Exit.\n");
                	System.out.println();
 
                	choice = sc.nextInt();
                	switch (choice) {
 
                	case 0:choice = 0; break; 
                	case 1:{obj.checkPalindrome();} break;
                 	case 2:{obj.printPattern();} break;
                 	case 3:{obj.checkPrimeNumber();}break;
                 	case 4:{obj.printFibonacciSeries();}break;
                 	default:System.out.println("Invalid choice. Enter a Valid No.\n");
                	}
                 	} while (choice != 0);
                		System.out.println("Exited Successfully!!!");
                		sc.close();
	} 
}
	

