package primav5;
import static org.junit.Assert.*;

import org.junit.Test;

import primav5.PrimaV5;

public class PrimaV5Test {

	@Test
	public void testCheck() {
		PrimaV5.factorEdad(25);
		PrimaV5.factorEdad(17);
		PrimaV5.factorEdad(24);
		PrimaV5.factorEdad(26);
		PrimaV5.factorEdad(35);
		PrimaV5.factorEdad(36);
		PrimaV5.factorEdad(45);
		PrimaV5.factorEdad(46);
		PrimaV5.factorEdad(65);
		PrimaV5.factorEdad(66);
		PrimaV5.factorEdad(90);
		PrimaV5.factorEdad(91);
	}
		 
	@Test
	public void testCheck2() {			
		PrimaV5.calculoRCS(25, 25);
		PrimaV5.calculoRCS(25, 30);
		PrimaV5.calculoRCS(24, 29);
		PrimaV5.calculoRCS(25, 29);
		PrimaV5.calculoRCS(24, 30);
		PrimaV5.calculoRCS(24, 28);
		PrimaV5.calculoRCS(25, 28);
		PrimaV5.calculoRCS(35, 26);
		PrimaV5.calculoRCS(35, 25);
		PrimaV5.calculoRCS(45, 25);
		PrimaV5.calculoRCS(65, 26);

	}
		
	@Test
	public void test1Check3() {
		PrimaV5.calculoPrima(-5,30);
		PrimaV5.calculoPrima(-5,-1);
		PrimaV5.calculoPrima(17, 30);
		PrimaV5.calculoPrima(92, 30);
		PrimaV5.calculoPrima(30, 0);
		PrimaV5.calculoPrima(30, -1);
		PrimaV5.calculoPrima(30, 35);
		PrimaV5.calculoPrima(18, 29);
		PrimaV5.calculoPrima(24, 27);
		PrimaV5.calculoPrima(25, 27);
		PrimaV5.calculoPrima(34, 26);
		PrimaV5.calculoPrima(35, 25);
		PrimaV5.calculoPrima(44, 23);
		PrimaV5.calculoPrima(45, 23);
		PrimaV5.calculoPrima(64, 22);
		PrimaV5.calculoPrima(65, 25);
		PrimaV5.calculoPrima(90, 24);
		PrimaV5.calculoPrima(19, 29);
		PrimaV5.calculoPrima(26, 28);
		PrimaV5.calculoPrima(36, 27);
		PrimaV5.calculoPrima(46, 26);
		PrimaV5.calculoPrima(66, 25);
		PrimaV5.calculoPrima(91, 27);
		PrimaV5.calculoPrima(89, 30);
		PrimaV5.calculoPrima(23, 28);
		PrimaV5.calculoPrima(33, 24);
		PrimaV5.calculoPrima(43, 26);
		PrimaV5.calculoPrima(63, 26); 	
		PrimaV5.calculoPrima(30, 29);
		PrimaV5.calculoPrima(30, 0);
		PrimaV5.calculoPrima(30, 31);
		PrimaV5.calculoPrima(30, -1);
		PrimaV5.calculoPrima(-1, 29);
		PrimaV5.calculoPrima(-1, 0);
		PrimaV5.calculoPrima(-1, 31);
		PrimaV5.calculoPrima(16, 29);
		PrimaV5.calculoPrima(91, 29);
		PrimaV5.calculoPrima(91, 0);
		PrimaV5.calculoPrima(16, 31);
	}
		
	@Test
	public void test1Check4() {
		PrimaV5.isNumeric("A");
		PrimaV5.isNumeric("8");
	}
	 

}
