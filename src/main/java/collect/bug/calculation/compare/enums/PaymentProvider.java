package collect.bug.calculation.compare.enums;

/**
 * @author wzq
 * Created on 2022-10-19
 */
public enum PaymentProvider {

    UNKNOW(0),
    PAYPAL(1),
    PAYONEER(2),
    ADYEN(3);



    private  int value;

    PaymentProvider(int value) {
        this.value = value;
    }


    public int getValue() {
        return value;
    }

}
