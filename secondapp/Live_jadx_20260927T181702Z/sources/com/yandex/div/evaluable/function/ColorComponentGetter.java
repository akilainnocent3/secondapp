package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import fr.g0;
import fr.r0;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ColorComponentGetter extends Function {

    @l
    private final ds.l<Color, Integer> componentGetter;

    @l
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @l
    private final EvaluableType resultType;

    /* JADX WARN: Multi-variable type inference failed */
    public ColorComponentGetter(@l ds.l<? super Color, Integer> componentGetter) {
        m0.p(componentGetter, "componentGetter");
        this.componentGetter = componentGetter;
        this.declaredArgs = g0.l(new FunctionArgument(EvaluableType.COLOR, false, 2, null));
        this.resultType = EvaluableType.NUMBER;
        this.isPure = true;
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) {
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        ds.l<Color, Integer> lVar = this.componentGetter;
        Object objG2 = r0.G2(args);
        m0.n(objG2, "null cannot be cast to non-null type com.yandex.div.evaluable.types.Color");
        return Double.valueOf(ColorFunctionsKt.toColorFloatComponentValue(lVar.invoke((Color) objG2).intValue()));
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
