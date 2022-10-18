package collect.bug.calculation;


import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

/**
 * @author wzq
 * Created on 2022-10-08
 */
public class calculationDemo {
    /**
     * Loss of precision in floating point calculations
     */
    @Test
    public void test() {
        System.out.println(1D - 0.42D); // 0.5800000000000001
        System.out.println(1.015D * 100); // 101.49999999999999
        System.out.println(new BigDecimal(1.0D).subtract(new BigDecimal(0.42D))); // 0.580000000000000015543122344752191565930843353271484375
        System.out.println(new BigDecimal(1.015D).multiply(new BigDecimal(100))); // 101.4999999999999902300373832986224442720413208007812500
        System.out.println(new BigDecimal("1.0").subtract(new BigDecimal("0.42"))); // 0.58
        System.out.println(new BigDecimal("1.015").multiply(new BigDecimal("100"))); // 101.500
    }


    /**
     *
     * follow the rules
     *
     * 1、Amount calculation using double or float types is not allowed.
     * 2、The amount is stored in the smallest currency unit, integer type.
     * 3、BigDecimal is required for floating-point operations and for dividing amounts.
     * 4、For complex amount calculation scenarios, a check mechanism is required.
     * 5、In the external interface, long type is used to represent the amount or balance field, floating point is not allowed.
     * 6、The amount calculation logic should be converged on the back-end and not allowed to be implemented on the front-end.
     *
     */
}
