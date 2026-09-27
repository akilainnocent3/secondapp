package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.types.Color;
import dr.i1;
import dr.j1;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ArrayOptColorWithColorFallback extends ArrayOptFunction {
    public ArrayOptColorWithColorFallback() {
        super(EvaluableType.COLOR);
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) {
        Object objB;
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        Object objEvaluateSafe = ArrayFunctionsKt.evaluateSafe(getName(), args);
        Object obj = null;
        Color color = objEvaluateSafe instanceof Color ? (Color) objEvaluateSafe : null;
        if (color != null) {
            return color;
        }
        String str = objEvaluateSafe instanceof String ? (String) objEvaluateSafe : null;
        if (str != null) {
            try {
                i1.a aVar = i1.f79460c;
                objB = i1.b(Color.m3341boximpl(Color.Companion.m3351parseC4zCDoM(str)));
            } catch (Throwable th2) {
                i1.a aVar2 = i1.f79460c;
                objB = i1.b(j1.a(th2));
            }
            obj = (Color) (i1.i(objB) ? null : objB);
        }
        return obj == null ? args.get(2) : obj;
    }
}
