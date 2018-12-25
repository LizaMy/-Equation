package Test;

import Equation.Equation;
import org.junit.*;

import static junit.framework.TestCase.fail;

public class TestEquation {

    @Test
        public void QuadraticEquationOne() {
           Equation test = new Equation(5,0,0);
           double[] n = {0};

            Assert.assertArrayEquals(n, test.QuadraticEquation(), 0.000001);
        }
    @Test
    public void QuadraticEquationTwo() {
        Equation test = new Equation(2,-4,0);
        double[] expected = {2,0};
        Assert.assertArrayEquals(expected, test.QuadraticEquation(), 0.000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void QuadraticEquationTree() throws IllegalArgumentException  {
        Equation test = new Equation(0,54,-9465);
        double[] expected = null;
        fail();
        //Assert.assertArrayEquals(expected,test.QuadraticEquation(),0.000001);
    }

    @Test
    public void QuadraticEquationFour() {
        Equation test = new Equation(1,1,1);
        double[] expected = new double[0];
        Assert.assertArrayEquals(expected,test.QuadraticEquation(),0.000001);
    }
}
