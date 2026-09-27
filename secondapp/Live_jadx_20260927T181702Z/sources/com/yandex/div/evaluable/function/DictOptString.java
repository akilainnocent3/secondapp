package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import fr.h0;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DictOptString extends Function {

    @l
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @l
    private final EvaluableType resultType;

    public DictOptString() {
        EvaluableType evaluableType = EvaluableType.STRING;
        boolean z10 = false;
        int i10 = 2;
        x xVar = null;
        this.declaredArgs = h0.Q(new FunctionArgument(evaluableType, z10, i10, xVar), new FunctionArgument(EvaluableType.DICT, z10, i10, xVar), new FunctionArgument(evaluableType, true));
        this.resultType = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) {
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        Object obj = args.get(0);
        m0.n(obj, "null cannot be cast to non-null type kotlin.String");
        String str = (String) obj;
        Object objEvaluateSafe$default = DictFunctionsKt.evaluateSafe$default(args, str, false, 4, null);
        String str2 = objEvaluateSafe$default instanceof String ? (String) objEvaluateSafe$default : null;
        return str2 == null ? str : str2;
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

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
