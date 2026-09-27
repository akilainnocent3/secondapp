package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import dr.e0;
import fr.h0;
import is.d;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DictInteger extends Function {
    private final boolean isMethod;
    private final boolean isPure;

    @l
    private final List<FunctionArgument> declaredArgs = h0.Q(new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));

    @l
    private final EvaluableType resultType = EvaluableType.INTEGER;

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) {
        long jLongValue;
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        Object objEvaluate = DictFunctionsKt.evaluate(getName(), args, isMethod());
        if (objEvaluate instanceof Integer) {
            jLongValue = ((Number) objEvaluate).intValue();
        } else {
            if (!(objEvaluate instanceof Long)) {
                if (objEvaluate instanceof BigInteger) {
                    DictFunctionsKt.throwException(getName(), args, EvaluableExceptionKt.REASON_INTEGER_OVERFLOW, isMethod());
                    throw new e0();
                }
                if (objEvaluate instanceof BigDecimal) {
                    DictFunctionsKt.throwException(getName(), args, "Cannot convert value to integer.", isMethod());
                    throw new e0();
                }
                if (!(objEvaluate instanceof Double)) {
                    DictFunctionsKt.throwWrongTypeException(getName(), args, getResultType(), objEvaluate, isMethod());
                    throw new e0();
                }
                Number number = (Number) objEvaluate;
                if (number.doubleValue() < -9.223372036854776E18d || number.doubleValue() > 9.223372036854776E18d) {
                    DictFunctionsKt.throwException(getName(), args, EvaluableExceptionKt.REASON_INTEGER_OVERFLOW, isMethod());
                    throw new e0();
                }
                long jM0 = d.M0(number.doubleValue());
                if (number.doubleValue() - jM0 == 0.0d) {
                    return Long.valueOf(jM0);
                }
                DictFunctionsKt.throwException(getName(), args, "Cannot convert value to integer.", isMethod());
                throw new e0();
            }
            jLongValue = ((Number) objEvaluate).longValue();
        }
        return Long.valueOf(jLongValue);
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    public EvaluableType getResultType() {
        return this.resultType;
    }

    public boolean isMethod() {
        return this.isMethod;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
