package circle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        circleprg c = new circleprg(5);
        //Testing R1
        double expectedRadius=5;
        double actualRadius=c.getRadius();
        if(expectedRadius==actualRadius)
        {
        	System.out.println("R1:working");
        }
        else
        {
        	System.out.println("R1: Not working");
        	System.out.println("ExpectedRadius "+expectedRadius);
        	System.out.println("Actual Radius "+actualRadius);
        }
        //Testing R2
        double expectedArea = Math.PI*expectedRadius*expectedRadius;
        double actualArea=c.getArea();
        if(expectedArea==actualArea)
        {
        	System.out.println("R2:working");
        }
        else
        {
        	System.out.println("R2: Not working");
        	System.out.println("ExpectedArea "+expectedArea);
        	System.out.println("ActualArea "+actualArea);
        }
        double expectedCir =  Math.PI*expectedRadius*2;
        double actualCir=c.getCircumference();
        if(expectedCir==actualCir)
        {
        	System.out.println("R3:working");
        }
        else
        {
        	System.out.println("R3: Not working");
        	System.out.println("ExpectedCir "+expectedCir);
        	System.out.println("ActualCir "+actualCir);
        }
        double expectedDia = expectedRadius*2;
        double actualDia=c.getDiameter();
        if(expectedDia==actualDia)
        {
        	System.out.println("R4:working");
        }
        else
        {
        	System.out.println("R4: Not working");
        	System.out.println("ExpectedDia "+expectedDia);
        	System.out.println("ActualDia "+actualDia);
        }
	}  
	}
	// PROCESS FOR TESTING CODE
			// ----------------------------
			// 1. Read the requirements!
			// 2. Decide what to test!
					// R1:  Constructor sets radius
					// R2:  Areas calculates properly
					// R3:  Circufum calcuates properly
					// R4:  Diamemter calculates properly
			// 3. Make test cases
			//		// Test case = the thing you are trying to test
					// Working?
					// Expected Result  --> What SHOULD happen
					// Actual Result	--> What ACTUALLY happened
			
					// Test case:
					//		-- Working   (expected == actual)
					//		-- Not work	 (expected != actual)
			
			// 3.
			// 4.
			// 5. Debug
			// 6. 
			


