package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Url;
import dr.e0;
import fr.h0;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ArrayOptUrlWithStringFallback extends ArrayOptFunction {

    @l
    private final List<FunctionArgument> declaredArgs;

    public ArrayOptUrlWithStringFallback() {
        super(EvaluableType.URL);
        this.declaredArgs = h0.Q(new FunctionArgument(EvaluableType.ARRAY, false, 2, null), new FunctionArgument(EvaluableType.INTEGER, false, 2, null), new FunctionArgument(EvaluableType.STRING, false, 2, null));
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) {
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        Object objEvaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), args);
        String strSafeConvertToUrl = ArrayFunctionsKt.safeConvertToUrl(objEvaluateSafe instanceof String ? (String) objEvaluateSafe : null);
        if (strSafeConvertToUrl != null) {
            return Url.m3353boximpl(strSafeConvertToUrl);
        }
        Object obj = args.get(2);
        m0.n(obj, "null cannot be cast to non-null type kotlin.String");
        String strSafeConvertToUrl2 = ArrayFunctionsKt.safeConvertToUrl((String) obj);
        if (strSafeConvertToUrl2 != null) {
            return Url.m3353boximpl(strSafeConvertToUrl2);
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), args, EvaluableExceptionKt.REASON_CONVERT_TO_URL, false, 8, null);
        throw new e0();
    }

    @Override // com.yandex.div.evaluable.function.ArrayOptFunction, com.yandex.div.evaluable.Function
    @l
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }
}
