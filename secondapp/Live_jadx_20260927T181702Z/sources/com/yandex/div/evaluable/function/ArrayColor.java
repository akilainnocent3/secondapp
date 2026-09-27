package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Color;
import dr.e0;
import dr.i1;
import dr.j1;
import dr.w2;
import java.util.List;
import kotlin.jvm.internal.m0;
import org.json.JSONException;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ArrayColor extends ArrayFunction {
    public ArrayColor() {
        super(EvaluableType.COLOR);
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) throws JSONException {
        Object objB;
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        Object objEvaluateArray = ArrayFunctionsKt.evaluateArray(getName(), args, isMethod());
        if (objEvaluateArray instanceof Color) {
            return objEvaluateArray;
        }
        if (!(objEvaluateArray instanceof String)) {
            ArrayFunctionsKt.throwArrayWrongTypeException(getName(), args, getResultType(), objEvaluateArray, isMethod());
            return w2.f79517a;
        }
        try {
            i1.a aVar = i1.f79460c;
            objB = i1.b(Color.m3341boximpl(Color.Companion.m3351parseC4zCDoM((String) objEvaluateArray)));
        } catch (Throwable th2) {
            i1.a aVar2 = i1.f79460c;
            objB = i1.b(j1.a(th2));
        }
        if (i1.e(objB) == null) {
            return objB;
        }
        ArrayFunctionsKt.throwArrayException$default(getName(), args, EvaluableExceptionKt.REASON_CONVERT_TO_COLOR, false, 8, null);
        throw new e0();
    }
}
