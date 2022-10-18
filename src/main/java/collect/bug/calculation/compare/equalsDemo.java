package collect.bug.calculation.compare;

import org.junit.jupiter.api.Test;

import collect.bug.calculation.compare.enums.PaymentMethod;
import collect.bug.calculation.compare.enums.PaymentProvider;

/**
 * @author wzq
 * Created on 2022-10-19
 */
public class equalsDemo {

    @Test
    public void  equalsBug(){

        if (PaymentMethod.ADYEN.equals(PaymentProvider.ADYEN)){
            System.out.println("because of  PaymentMethod.ADYEN and PaymentProvider.ADYEN  Never equal ,so this part never execution ");
        }else {
            System.out.println("This part must be executed");
        }

    }
}
