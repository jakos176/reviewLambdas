package bifunctionlambda;

import java.util.function.BiFunction;

public class Calculator {
    public String calculator(BiFunction<Integer, Integer, String> bi, Integer i1, Integer i2) {
        return bi.apply(i1, i2);
    }
}
