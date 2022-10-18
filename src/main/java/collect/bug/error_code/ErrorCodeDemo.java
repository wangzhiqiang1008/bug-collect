package collect.bug.error_code;

/**
 * @author wzq
 * Created on 2022-10-08
 *
 *【Attention】 The error code handling logic is most commonly used when interfacing with three-party channels (Paypal, Payoneer, WeChat, Alipay, etc.) and in cross-system interface calls.
 *
 */
public class ErrorCodeDemo {

    private static String CODE = "RESPONSE_CODE";
    private static String SUCCESS_CODE = "SUCCESS_CODE"; //Codes are a clear determination of success
    private static String FAIL_CODE = "FAIL_CODE";  //Codes are a clear determination of fail
    private static String PROCESSING_CODE = "PROCESS_CODE"; //Codes are a clear determination of processing
    private static String UNKNOW_CODE = "UNKNOW_CODE";

    /**
     *
     * 1、The documentation of the interface provided upstream needs to clearly state what the error code means and what
     * business status it represents. Explain what can be considered as success, failure or in process.
     *
     * 2、When interfacing to downstream or three-party channel interfaces, error codes must be divided into success,
     * failure and unknown by interface dimension. The logic of the return code must be changed carefully and must be
     * confirmed by the upstream and downstream parties.
     * 		▪ Be cautious of setting success for receipt operations
     *      ▪ Be cautious about setting failed operations for outgoing payments
     * 		▪ Clarify the difference between communication error codes and business error codes
     *
     * 3、If the external response contains multiple states (communication results, processing results), it is necessary
     * to clarify which state, or combination of states, is to be used.
     *
     * 4、The error code processing logic needs to be compatible with the addition of new error codes (considered to be
     * in process) and the monitoring and alerting mechanism needs to be used to detect such cases and ensure that
     * they can be followed up in a timely manner.
     *
     *
     */
    public static void  dealRequestCode(){

        //follow the rules   Pseudocode

        if(CODE.equals(SUCCESS_CODE)){
          //  Successful logic handling ;
        } else if(CODE.equals(FAIL_CODE)){
           // Failure logic handling ;
        } else if(CODE.equals(PROCESSING_CODE)){
           //  In-process logic processing ;
        } else {
            //  Alert alarms, where an error code is found that does not match the expectation, alerting human intervention to follow up;
            //  In-process logic processing ;
        }

    }

}
