package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import org.json.JSONArray;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class GetStoredArrayValue extends GetStoredComplexValue<JSONArray> {

    @l
    public static final GetStoredArrayValue INSTANCE = new GetStoredArrayValue();

    @l
    private static final String name = "getStoredArrayValue";

    @l
    private static final EvaluableType resultType = EvaluableType.ARRAY;

    private GetStoredArrayValue() {
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
