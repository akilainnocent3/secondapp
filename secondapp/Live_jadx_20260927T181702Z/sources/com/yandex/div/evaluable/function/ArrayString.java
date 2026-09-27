package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import dr.w2;
import java.util.List;
import kotlin.jvm.internal.m0;
import org.json.JSONException;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ArrayString extends ArrayFunction {
    public ArrayString() {
        super(EvaluableType.STRING);
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) throws JSONException {
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        Object objEvaluateArray = ArrayFunctionsKt.evaluateArray(getName(), args, isMethod());
        String str = objEvaluateArray instanceof String ? (String) objEvaluateArray : null;
        if (str != null) {
            return str;
        }
        ArrayFunctionsKt.throwArrayWrongTypeException(getName(), args, getResultType(), objEvaluateArray, isMethod());
        return w2.f79517a;
    }
}
