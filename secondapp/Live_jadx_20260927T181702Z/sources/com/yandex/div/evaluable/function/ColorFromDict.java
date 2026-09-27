package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import dr.e0;
import dr.i1;
import dr.j1;
import fr.h0;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ColorFromDict extends Function {
    private final boolean isMethod;
    private final boolean isPure;

    @l
    private final List<FunctionArgument> declaredArgs = h0.Q(new FunctionArgument(EvaluableType.DICT, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));

    @l
    private final EvaluableType resultType = EvaluableType.COLOR;

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) {
        Object objB;
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        Object objEvaluate = DictFunctionsKt.evaluate(getName(), args, isMethod());
        if (!(objEvaluate instanceof String)) {
            DictFunctionsKt.throwWrongTypeException(getName(), args, getResultType(), objEvaluate, isMethod());
            throw new e0();
        }
        try {
            i1.a aVar = i1.f79460c;
            objB = i1.b(Color.m3341boximpl(Color.Companion.m3351parseC4zCDoM((String) objEvaluate)));
        } catch (Throwable th2) {
            i1.a aVar2 = i1.f79460c;
            objB = i1.b(j1.a(th2));
        }
        if (i1.e(objB) == null) {
            return objB;
        }
        DictFunctionsKt.throwDictException(getName(), args, EvaluableExceptionKt.REASON_CONVERT_TO_COLOR);
        throw new e0();
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
