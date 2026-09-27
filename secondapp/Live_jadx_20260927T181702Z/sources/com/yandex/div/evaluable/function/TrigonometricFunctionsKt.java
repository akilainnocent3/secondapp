package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableExceptionKt;
import dr.e0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TrigonometricFunctionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object evaluateMathResult(double d10, String str, double d11) {
        if (!isValidTrigonometricResult$default(d10, 0.0d, 2, null)) {
            throwIncorrectMathValueException(str, d11);
        }
        return Double.valueOf(d10);
    }

    private static final boolean isValidTrigonometricResult(double d10, double d11) {
        return !Double.isNaN(d10) && Math.abs(d10) <= d11;
    }

    public static /* synthetic */ boolean isValidTrigonometricResult$default(double d10, double d11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d11 = 1.0E10d;
        }
        return isValidTrigonometricResult(d10, d11);
    }

    private static final void throwIncorrectMathValueException(String str, double d10) {
        EvaluableExceptionKt.throwExceptionOnEvaluationFailed$default(str + '(' + d10 + ')', toMathFunctionDisplayName(str) + " is undefined for the given value.", null, 4, null);
        throw new e0();
    }

    private static final String toMathFunctionDisplayName(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 98696) {
            if (iHashCode != 2988422) {
                if (iHashCode == 3003607 && str.equals("asin")) {
                    return "Arcsine";
                }
            } else if (str.equals("acos")) {
                return "Arccosine";
            }
        } else if (str.equals("cot")) {
            return "Cotangent";
        }
        return str;
    }
}
