package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import com.yandex.div.evaluable.types.Color;
import dr.e0;
import ds.p;
import fr.h0;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class ColorComponentSetter extends Function {

    @l
    private final p<Color, Double, Color> componentSetter;

    @l
    private final List<FunctionArgument> declaredArgs;
    private final boolean isPure;

    @l
    private final EvaluableType resultType;

    /* JADX WARN: Multi-variable type inference failed */
    public ColorComponentSetter(@l p<? super Color, ? super Double, Color> componentSetter) {
        m0.p(componentSetter, "componentSetter");
        this.componentSetter = componentSetter;
        EvaluableType evaluableType = EvaluableType.COLOR;
        this.declaredArgs = h0.Q(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.NUMBER, false, 2, null));
        this.resultType = evaluableType;
        this.isPure = true;
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
        Object obj2 = args.get(1);
        m0.n(obj2, "null cannot be cast to non-null type kotlin.Double");
        Double d10 = (Double) obj2;
        d10.doubleValue();
        try {
            return Color.m3341boximpl(this.componentSetter.invoke(Color.m3341boximpl(iM3349unboximpl), d10).m3349unboximpl());
        } catch (IllegalArgumentException unused) {
            EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), h0.Q(Color.m3348toStringimpl(iM3349unboximpl), d10), EvaluableExceptionKt.REASON_OUT_OF_RANGE, null, 8, null);
            throw new e0();
        }
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
