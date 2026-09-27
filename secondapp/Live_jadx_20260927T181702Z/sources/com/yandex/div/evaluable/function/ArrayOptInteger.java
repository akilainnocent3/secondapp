package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ArrayOptInteger extends ArrayOptFunction {
    public ArrayOptInteger() {
        super(EvaluableType.INTEGER);
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) {
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        Object objEvaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), args);
        if (objEvaluateSafe instanceof Integer) {
            return Long.valueOf(((Number) objEvaluateSafe).intValue());
        }
        return objEvaluateSafe instanceof Long ? objEvaluateSafe : args.get(2);
    }
}
