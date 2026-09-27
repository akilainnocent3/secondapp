package com.yandex.div.internal.util;

import org.json.JSONObject;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class JsonObject extends JsonNode {

    @l
    private final JSONObject value;

    public JsonObject(@l JSONObject jSONObject) {
        super(null);
        this.value = jSONObject;
    }

    @Override // com.yandex.div.internal.util.JsonNode
    @l
    public String dump() {
        return this.value.toString();
    }

    @l
    public final JSONObject getValue() {
        return this.value;
    }
}
