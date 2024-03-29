package Bank.Bank;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorApp {
@Test(priority=1)
@Parameters({"a","b"})
public void testAdd(String sa, String sb) {
	CalculatorAp app=new CalculatorAp();
	int a=Integer.parseInt(sa);
	int b=Integer.parseInt(sb);
	int actual=app.addMethod(a,b);
	int expected=a+b;
    Assert.assertEquals(actual, expected);
	
}
@Test(priority=0)
public void testSub() {
	CalculatorAp app=new CalculatorAp();
	int actual=app.subMethod(19,7);
	int expected=12;
    Assert.assertEquals(actual, expected);
	
}
}
