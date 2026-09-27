package com.yandex.div.json.templates;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.json.JsonTemplate;
import java.util.Map;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class InMemoryTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {

    @l
    private final Map<String, T> templatesMap = CollectionsKt.arrayMap();

    @Override // com.yandex.div.json.templates.TemplateProvider
    public /* synthetic */ EntityTemplate getOrThrow(String str, JSONObject jSONObject) {
        return a.a(this, str, jSONObject);
    }

    public final void put$div_data_release(@l String str, @l T t10) {
        this.templatesMap.put(str, t10);
    }

    public final void takeSnapshot$div_data_release(@l Map<String, T> map) {
        map.putAll(this.templatesMap);
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    @m
    public T get(@l String str) {
        return this.templatesMap.get(str);
    }
}
