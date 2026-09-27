package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.Evaluable;
import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.EvaluationContext;
import com.yandex.div.evaluable.Function;
import com.yandex.div.evaluable.FunctionArgument;
import fr.g0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import org.json.JSONArray;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@s1({"SMAP\nDictFunctions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DictFunctions.kt\ncom/yandex/div/evaluable/function/GetValuesFromDict\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,781:1\n32#2,2:782\n*S KotlinDebug\n*F\n+ 1 DictFunctions.kt\ncom/yandex/div/evaluable/function/GetValuesFromDict\n*L\n753#1:782,2\n*E\n"})
public abstract class GetValuesFromDict extends Function {
    private final boolean isMethod;
    private final boolean isPure;

    @l
    private final List<FunctionArgument> declaredArgs = g0.l(new FunctionArgument(EvaluableType.DICT, false, 2, null));

    @l
    private final EvaluableType resultType = EvaluableType.ARRAY;

    @Override // com.yandex.div.evaluable.Function
    @l
    /* JADX INFO: renamed from: evaluate-ex6DHhM */
    public Object mo3249evaluateex6DHhM(@l EvaluationContext evaluationContext, @l Evaluable expressionContext, @l List<? extends Object> args) {
        m0.p(evaluationContext, "evaluationContext");
        m0.p(expressionContext, "expressionContext");
        m0.p(args, "args");
        Object obj = args.get(0);
        m0.n(obj, "null cannot be cast to non-null type org.json.JSONObject");
        JSONObject jSONObject = (JSONObject) obj;
        JSONArray jSONArray = new JSONArray();
        Iterator<String> itKeys = jSONObject.keys();
        m0.o(itKeys, "dict.keys()");
        while (itKeys.hasNext()) {
            jSONArray.put(jSONObject.get(itKeys.next()));
        }
        return jSONArray;
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
