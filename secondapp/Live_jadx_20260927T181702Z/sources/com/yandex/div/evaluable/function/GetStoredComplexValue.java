package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableExceptionKt;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import dr.e0;
import fr.g0;
import java.math.BigDecimal;
import java.util.List;
import kj.e;
import kotlin.jvm.internal.m0;
import org.json.JSONArray;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class GetStoredComplexValue<T> extends Function {

    @l
    private final List<FunctionArgument> declaredArgs = g0.l(new FunctionArgument(EvaluableType.STRING, false, 2, null));
    private final boolean isPure;

    private final Void throwWrongTypeException(String str, List<? extends Object> list, EvaluableType evaluableType, Object obj) {
        String simpleName;
        if (obj instanceof Integer ? true : obj instanceof Double ? true : obj instanceof BigDecimal) {
            simpleName = "Number";
        } else if (obj instanceof JSONObject) {
            simpleName = "Dict";
        } else {
            simpleName = obj instanceof JSONArray ? "Array" : obj.getClass().getSimpleName();
        }
        EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(str, list, "Incorrect value type: expected " + evaluableType.getTypeName$div_evaluable() + ", got " + simpleName + e.f102543c, null, 8, null);
        throw new e0();
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
        Object obj2 = evaluationContext.getStoredValueProvider().get((String) obj);
        if (obj2 != null) {
            return obj2;
        }
        EvaluableExceptionKt.throwExceptionOnFunctionEvaluationFailed$default(getName(), args, "Missing value.", null, 8, null);
        throw new e0();
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    public List<FunctionArgument> getDeclaredArgs() {
        return this.declaredArgs;
    }

    @Override // com.yandex.div.evaluable.Function
    public boolean isPure() {
        return this.isPure;
    }
}
