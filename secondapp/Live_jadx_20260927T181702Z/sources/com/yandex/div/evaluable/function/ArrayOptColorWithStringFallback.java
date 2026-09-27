package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import dr.e0;
import fr.h0;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ArrayOptColorWithStringFallback extends ArrayOptFunction {

    @l
    private final List<FunctionArgument> declaredArgs;

    public ArrayOptColorWithStringFallback() {
        super(EvaluableType.COLOR);
        boolean z10 = false;
        int i10 = 2;
        x xVar = null;
        this.declaredArgs = h0.Q(new FunctionArgument(EvaluableType.ARRAY, z10, i10, xVar), new FunctionArgument(EvaluableType.INTEGER, z10, i10, xVar), new FunctionArgument(EvaluableType.STRING, z10, i10, xVar));
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) {
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        Object objEvaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), args);
        Color colorSafeConvertToColor = ArrayFunctionsKt.safeConvertToColor(objEvaluateSafe instanceof String ? (String) objEvaluateSafe : null);
        if (colorSafeConvertToColor != null) {
            return colorSafeConvertToColor;
        }
        Object obj = args.get(2);
        m0.n(obj, "null cannot be cast to non-null type kotlin.String");
        Color colorSafeConvertToColor2 = ArrayFunctionsKt.safeConvertToColor((String) obj);
        if (colorSafeConvertToColor2 != null) {
            return colorSafeConvertToColor2;
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), args, EvaluableExceptionKt.REASON_CONVERT_TO_COLOR, false, 8, null);
        throw new e0();
    }

    @Override // com.yandex.div.evaluable.function.ArrayOptFunction, com.yandex.div.evaluable.Function
    @l
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }
}
