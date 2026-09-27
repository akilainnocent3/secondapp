package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class GetStoredDictValue extends GetStoredComplexValue<JSONObject> {

    @l
    public static final GetStoredDictValue INSTANCE = new GetStoredDictValue();

    @l
    private static final String name = "getStoredDictValue";

    @l
    private static final EvaluableType resultType = EvaluableType.DICT;

    private GetStoredDictValue() {
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    public String getName() {
        return name;
    }

    @Override // com.yandex.div.evaluable.Function
    @l
    public EvaluableType getResultType() {
        return resultType;
    }
}
