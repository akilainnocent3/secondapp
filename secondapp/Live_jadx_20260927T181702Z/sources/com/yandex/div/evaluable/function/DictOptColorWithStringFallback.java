package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
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
public abstract class DictOptColorWithStringFallback extends Function {

    @l
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @l
    private final EvaluableType resultType;

    public DictOptColorWithStringFallback() {
        EvaluableType evaluableType = EvaluableType.STRING;
        boolean z10 = false;
        int i10 = 2;
        x xVar = null;
        this.declaredArgs = h0.Q(new FunctionArgument(evaluableType, z10, i10, xVar), new FunctionArgument(EvaluableType.DICT, z10, i10, xVar), new FunctionArgument(evaluableType, true));
        this.resultType = EvaluableType.COLOR;
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
        Color colorSafeConvertToColor = ArrayFunctionsKt.safeConvertToColor(objEvaluateSafe$default instanceof String ? (String) objEvaluateSafe$default : null);
        if (colorSafeConvertToColor != null) {
            return colorSafeConvertToColor;
        }
        Color colorSafeConvertToColor2 = ArrayFunctionsKt.safeConvertToColor(str);
        if (colorSafeConvertToColor2 != null) {
            return colorSafeConvertToColor2;
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

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
