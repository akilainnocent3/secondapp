package com.yandex.div.internal.util;

import org.json.JSONArray;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class JsonArray extends JsonNode {

    @l
    private final JSONArray value;

    public JsonArray(@l JSONArray jSONArray) {
        super(null);
        this.value = jSONArray;
    }

    @Override // com.yandex.div.internal.util.JsonNode
    @l
    public String dump() {
        return this.value.toString();
    }

    @l
    public final JSONArray getValue() {
        return this.value;
    }
}
