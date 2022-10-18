package collect.bug.npe;

/**
 * npe 常见bug
 * @author
 * Created on 2022-04-09
 */

public class NpeDemo {

    public static void main(String[] args) {
        npeDemo1();
    }

    /**
     * 非空参数的函数调用存在空值传递
     * This method call passes a null value for a non-null method parameter.
     * Either the parameter is annotated as a parameter that should always be non-null,
     * or analysis has shown that it will always be dereferenced.
     */
    private static void npeDemo1() {
        System.out.print("11111");
    }

}
