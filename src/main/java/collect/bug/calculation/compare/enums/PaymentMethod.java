package collect.bug.calculation.compare.enums;

/**
 * @author wzq
 * Created on 2022-10-19
 */


public enum PaymentMethod {
    UNKNOW(0),
    PAYPAL(1),
    PAYONEER(2),
    ADYEN(3);



    public int getValue(){
        return this.value;
    }

    private int value;

    private PaymentMethod (int value){
        this.value = value;
    }


}
