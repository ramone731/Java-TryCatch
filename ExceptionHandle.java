package trycatch;
/**
 * ExceptionHandle
 */
public class ExceptionHandle {

	public static void main(String[] args) {
		
        System.out.println("Before Exception..");
		try
		{

			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[1]);
			int res = value1/value2;
			System.out.println(res);
			
		}
		
        catch(NullPointerException ex)
		{
			System.out.println("Handled by NullPointer");
			System.out.println(ex.toString());
		}
		
        catch(NumberFormatException ex2)
		{
			ex2.printStackTrace();
		}
		
        catch(ArithmeticException ex3)
		{
			System.out.println(ex3.toString());
		}
		
        catch(Exception e)
		{
			System.out.println(e);
		}
	
        finally
	{
		System.out.println("Program has done..!!!");
		
	}

	}

}
