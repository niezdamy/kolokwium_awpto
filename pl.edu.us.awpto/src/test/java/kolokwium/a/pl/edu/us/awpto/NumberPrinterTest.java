package kolokwium.a.pl.edu.us.awpto;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class NumberPrinterTest
{
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	  
	@Test
	 public void printNumbers() {
		
	    exception.expect(RuntimeException.class);
	    exception.expectMessage("limit must be >= 1");
	    
	    NumberPrinter tester = new NumberPrinter(null, null);
	    tester.printNumbers(0);
	 	
	 }
}