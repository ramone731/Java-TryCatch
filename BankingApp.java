package trycatch;
/**
 * BankingApp
 */

public class BankingApp {

   //Declaring an exception by method to throws it...
   public void deposit(float deposit) throws Exception {

    if (deposit > 5000) 
    {
        //Throws an exception inside method... creating an instance of class (Exception
        throw new Exception ("Trying to deposit more than limit...");
    }

    else
    {
        System.out.println("Money Deposited");
    }

   }

   public void withdraw(float withdraw) throws NumberFormatException {

    if (withdraw > 5000){

        //Throwing an exception inside method... creating an instance of class (Exception)
        throw new NumberFormatException("Trying to deposit more than limit...");
    }
    
    else {

        System.out.println("Money Deposited Successfully");
     }
    }
   

   //Main
    public static void main(String[] args) {

        BankingApp obj = new BankingApp();
		try {
			obj.deposit(400);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		obj.withdraw(5000);

        
        
    }
}
