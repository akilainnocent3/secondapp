package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import dr.e0;
import dr.w2;
import is.d;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.jvm.internal.m0;
import org.json.JSONException;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ArrayInteger extends ArrayFunction {
    public ArrayInteger() {
        super(EvaluableType.INTEGER);
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) throws JSONException {
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        Object objEvaluateArray = ArrayFunctionsKt.evaluateArray(getName(), args, isMethod());
        if (objEvaluateArray instanceof Integer) {
            return Long.valueOf(((Number) objEvaluateArray).intValue());
        }
        if (objEvaluateArray instanceof Long) {
            return objEvaluateArray;
        }
        if (objEvaluateArray instanceof BigInteger) {
            ArrayFunctionsKt.throwArrayException$default(getName(), args, EvaluableExceptionKt.REASON_INTEGER_OVERFLOW, false, 8, null);
            throw new e0();
        }
        if (objEvaluateArray instanceof BigDecimal) {
            ArrayFunctionsKt.throwArrayException$default(getName(), args, "Cannot convert value to integer.", false, 8, null);
            throw new e0();
        }
        if (!(objEvaluateArray instanceof Double)) {
            ArrayFunctionsKt.throwArrayWrongTypeException(getName(), args, getResultType(), objEvaluateArray, isMethod());
            return w2.f79517a;
        }
        Number number = (Number) objEvaluateArray;
        if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
            ArrayFunctionsKt.throwArrayException$default(getName(), args, EvaluableExceptionKt.REASON_INTEGER_OVERFLOW, false, 8, null);
            throw new e0();
        }
        long jM0 = d.M0(number.doubleValue());
        if (number.doubleValue() - jM0 == 0.0d) {
            return Long.valueOf(jM0);
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), args, "Cannot convert value to integer.", false, 8, null);
        throw new e0();
    }
}
