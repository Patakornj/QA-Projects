package simplejavacalculatorTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static java.lang.Double.NaN;
import java.lang.Math;


import simplejavacalculator.Calculator;

class CalculatorTest {
	
	@Test
	void calculateBiNormalTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.0);
		Assertions.assertEquals(NaN, calculator.calculateBi(Calculator.BiOperatorModes.normal, 3.0));
    }
	
	@Test
	void calculateBiAddTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.add, 3.0);
		Assertions.assertEquals(5.5, calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.5));
	}
	
	@Test
	void calculateBiMinusTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.minus, 3.1415);
		Assertions.assertEquals(2.0415, calculator.calculateBi(Calculator.BiOperatorModes.normal, 1.1));
	}
	
	@Test
	void calculateBiMultiplyTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.multiply, 3.2);
		Assertions.assertEquals(6.4, calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.0));
	}
	
	@Test
	void calculateBiDivideTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.divide, 6.4);
		Assertions.assertEquals(3.2, calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.0));
	}
	
	@Test
	void calculateEqualTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.add, 6.4);
		calculator.calculateBi(Calculator.BiOperatorModes.add, 2.0);
		Assertions.assertEquals(11.4, calculator.calculateEqual(3.0));
	}
	
	@Test
	void resetTest() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.add, 6.4);
		Assertions.assertEquals(8.4, calculator.calculateBi(Calculator.BiOperatorModes.add, 2.0));
		Assertions.assertEquals(NaN, calculator.reset());		
	}
	
	@Test
	void CalculateMonoSquareTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(9.0, calculator.calculateMono(Calculator.MonoOperatorModes.square, 3.0));
	}
	
	@Test
	void CalculateMonoSquareRootTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(5.0, calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot, 25.0));
	}
	
	@Test
	void CalculateMonoOneDividedByTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(0.10, calculator.calculateMono(Calculator.MonoOperatorModes.oneDividedBy, 10.0));
	}
	
	@Test
	void CalculateMonoSinTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(0.009138395397176044, calculator.calculateMono(Calculator.MonoOperatorModes.sin, java.lang.Math.PI / 6), 0.0000000001);
	}
	
	@Test
	void CalculateMonoCosTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(0.9998329794591297, calculator.calculateMono(Calculator.MonoOperatorModes.cos, java.lang.Math.PI / 3), 0.0000000001);
	}
	
	@Test
	void CalculateMonoTanTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(0.013708642534394057, calculator.calculateMono(Calculator.MonoOperatorModes.tan, java.lang.Math.PI / 4), 0.0000000001);
	}
	
	@Test
	void CalculateMonoLogTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(2.0, calculator.calculateMono(Calculator.MonoOperatorModes.log, 100.0));
	}
	
	@Test
	void CalculateMonoRateTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(.75, calculator.calculateMono(Calculator.MonoOperatorModes.rate, 75.0));
	}
	
	@Test
	void CalculateMonoAbsTest() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(3.0, calculator.calculateMono(Calculator.MonoOperatorModes.abs, -3.0));
		Assertions.assertEquals(3.0, calculator.calculateMono(Calculator.MonoOperatorModes.abs, 3.0));
	}

	/**
	 * Our test
	 */
	//test 1
	@Test
	void SquareMono() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(25.0, calculator.calculateMono(Calculator.MonoOperatorModes.square, -5.0));

	//Derive test values
		Calculator calculator1 = new Calculator();
		Assertions.assertEquals(100.0, calculator1.calculateMono(Calculator.MonoOperatorModes.square, -10.0));

		Calculator calculator2 = new Calculator();
		Assertions.assertEquals(0.0, calculator2.calculateMono(Calculator.MonoOperatorModes.square, 0.0));

		Calculator calculator3 = new Calculator();
		Assertions.assertEquals(100.0, calculator3.calculateMono(Calculator.MonoOperatorModes.square, 10.0));

	}

	//test 2
	@Test
	void SquareRootMono() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(0.0, calculator.calculateMono(Calculator.MonoOperatorModes.squareRoot, 0.0));

	//Derive test values
		Calculator calculator1 = new Calculator();
		Assertions.assertEquals(10.0, calculator1.calculateMono(Calculator.MonoOperatorModes.squareRoot, 100.0));
	}

	//test 3
	@Test
	void MonoDividedByNum() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(-0.01, calculator.calculateMono(Calculator.MonoOperatorModes.oneDividedBy, -100.0));

	//Derive test values
		Calculator calculator1 = new Calculator();
		Assertions.assertEquals(0.1, calculator1.calculateMono(Calculator.MonoOperatorModes.oneDividedBy, 10.0));
	}

	//test 4
	@Test
	void MonoLog() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(-0.9030899869919435, calculator.calculateMono(Calculator.MonoOperatorModes.log, 0.125));
	//note that input of log can input only positive number

	//Derive test values
		Calculator calculator1 = new Calculator();
		Assertions.assertEquals(1, calculator1.calculateMono(Calculator.MonoOperatorModes.log, 10.0));
	}

	//test 5
	@Test
	void MonoRate() {
		Calculator calculator = new Calculator();
		Assertions.assertEquals(-0.30, calculator.calculateMono(Calculator.MonoOperatorModes.rate, -30.0));

	//Derive test values
		Calculator calculator1 = new Calculator();
		Assertions.assertEquals(0.80, calculator1.calculateMono(Calculator.MonoOperatorModes.rate, 80.0));
	}

	//test 6
	@Test
	void BiAdd() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.add, -10.0);
		Assertions.assertEquals(-12.0, calculator.calculateBi(Calculator.BiOperatorModes.normal, -2.0));

	//Derive test values
		Calculator calculator1 = new Calculator();
		calculator1.calculateBi(Calculator.BiOperatorModes.add, 8.0);
		Assertions.assertEquals(10.0, calculator1.calculateBi(Calculator.BiOperatorModes.normal, 2.0));
	}

	//test 7
	@Test
	void BiMinus() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.minus, 9.0);
		Assertions.assertEquals(10.0, calculator.calculateBi(Calculator.BiOperatorModes.normal, -1.0));

	//Derive test values
		Calculator calculator1 = new Calculator();
		calculator1.calculateBi(Calculator.BiOperatorModes.minus, 1.0);
		Assertions.assertEquals(0.0, calculator1.calculateBi(Calculator.BiOperatorModes.normal, 1.0));


	}

	//test 8
	@Test
	void BiMultiply() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.multiply, -5.0);
		Assertions.assertEquals(-10.0, calculator.calculateBi(Calculator.BiOperatorModes.normal, 2.0));

	//Derive test values
		Calculator calculator1 = new Calculator();
		calculator1.calculateBi(Calculator.BiOperatorModes.multiply, 0.0);
		Assertions.assertEquals(-0.0, calculator1.calculateBi(Calculator.BiOperatorModes.normal, -1.0));

		Calculator calculator2 = new Calculator();
		calculator2.calculateBi(Calculator.BiOperatorModes.multiply, 2.0);
		Assertions.assertEquals(10.0, calculator2.calculateBi(Calculator.BiOperatorModes.normal, 5.0));

	}

	//test 9
	@Test
	void BiDivide() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.divide, -9.0);
		Assertions.assertEquals(1.0, calculator.calculateBi(Calculator.BiOperatorModes.normal, -9.0));

	//Derive test values
		Calculator calculator1 = new Calculator();
		calculator1.calculateBi(Calculator.BiOperatorModes.divide, 3.0);
		Assertions.assertEquals(1.5, calculator1.calculateBi(Calculator.BiOperatorModes.normal, 2.0));
	}

	//test 10
	@Test
	void calculateBiPower() {
		Calculator calculator = new Calculator();
		calculator.calculateBi(Calculator.BiOperatorModes.xpowerofy, 3.0);
		Assertions.assertEquals(81.0, calculator.calculateBi(Calculator.BiOperatorModes.normal, 4.0));

	//Derive test values
		Calculator calculator1 = new Calculator();
		calculator1.calculateBi(Calculator.BiOperatorModes.xpowerofy, -2.0);
		Assertions.assertEquals(4.0, calculator1.calculateBi(Calculator.BiOperatorModes.normal, 2.0));

		Calculator calculator2 = new Calculator();
		calculator2.calculateBi(Calculator.BiOperatorModes.xpowerofy, 2.0);
		Assertions.assertEquals(0.25, calculator2.calculateBi(Calculator.BiOperatorModes.normal, -2.0));

		Calculator calculator3 = new Calculator();
		calculator3.calculateBi(Calculator.BiOperatorModes.xpowerofy, 2.0);
		Assertions.assertEquals(1.0, calculator3.calculateBi(Calculator.BiOperatorModes.normal, 0.0));

	}

}
