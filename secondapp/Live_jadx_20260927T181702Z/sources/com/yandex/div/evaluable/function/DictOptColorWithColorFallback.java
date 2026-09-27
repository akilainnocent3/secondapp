package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import fr.h0;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DictOptColorWithColorFallback extends Function {

    @l
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @l
    private final EvaluableType resultType;

    public DictOptColorWithColorFallback() {
        EvaluableType evaluableType = EvaluableType.COLOR;
        boolean z10 = false;
        int i10 = 2;
        x xVar = null;
        this.declaredArgs = h0.Q(new FunctionArgument(evaluableType, z10, i10, xVar), new FunctionArgument(EvaluableType.DICT, z10, i10, xVar), new FunctionArgument(EvaluableType.STRING, true));
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
        m0.n(obj, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        int iM3349unboximpl = ((Color) obj).m3349unboximpl();
        Object objEvaluateSafe$default = DictFunctionsKt.evaluateSafe$default(args, Color.m3341boximpl(iM3349unboximpl), false, 4, null);
        Color colorSafeConvertToColor = ArrayFunctionsKt.safeConvertToColor(objEvaluateSafe$default instanceof String ? (String) objEvaluateSafe$default : null);
        return colorSafeConvertToColor == null ? Color.m3341boximpl(iM3349unboximpl) : colorSafeConvertToColor;
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
