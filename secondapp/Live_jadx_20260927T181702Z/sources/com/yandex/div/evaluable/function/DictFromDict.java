package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import dr.e0;
import fr.h0;
import java.util.List;
import kotlin.jvm.internal.m0;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class DictFromDict extends Function {

    @l
    private final List<FunctionArgument> declaredArgs;
    private final boolean isMethod;
    private final boolean isPure;

    @l
    private final EvaluableType resultType;

    public DictFromDict() {
        EvaluableType evaluableType = EvaluableType.DICT;
        this.declaredArgs = h0.Q(new FunctionArgument(evaluableType, false, 2, null), new FunctionArgument(EvaluableType.STRING, true));
        this.resultType = evaluableType;
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) {
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        Object objEvaluate = DictFunctionsKt.evaluate(getName(), args, isMethod());
        JSONObject jSONObject = objEvaluate instanceof JSONObject ? (JSONObject) objEvaluate : null;
        if (jSONObject != null) {
            return jSONObject;
        }
        DictFunctionsKt.throwWrongTypeException(getName(), args, getResultType(), objEvaluate, isMethod());
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
