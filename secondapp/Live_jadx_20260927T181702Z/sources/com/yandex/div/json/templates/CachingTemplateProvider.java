package com.yandex.div.json.templates;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.JsonTemplate;
import java.util.Map;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class CachingTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {

    @l
    private final InMemoryTemplateProvider<T> cacheProvider;

    @l
    private TemplateProvider<? extends T> fallbackProvider;

    public CachingTemplateProvider(@l InMemoryTemplateProvider<T> inMemoryTemplateProvider, @l TemplateProvider<? extends T> templateProvider) {
        this.cacheProvider = inMemoryTemplateProvider;
        this.fallbackProvider = templateProvider;
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    public /* synthetic */ EntityTemplate getOrThrow(String str, JSONObject jSONObject) {
        return a.a(this, str, jSONObject);
    }

    public void putAll(@l Map<String, ? extends T> map) {
        for (Map.Entry<String, ? extends T> entry : map.entrySet()) {
            this.cacheProvider.put$div_data_release(entry.getKey(), entry.getValue());
        }
    }

    public void takeSnapshot(@l Map<String, T> map) {
        this.cacheProvider.takeSnapshot$div_data_release(map);
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    @m
    public T get(@l String str) {
        T t10 = (T) this.cacheProvider.get(str);
        if (t10 != null) {
            return t10;
        }
        T t11 = (T) this.fallbackProvider.get(str);
        if (t11 == null) {
            return null;
        }
        this.cacheProvider.put$div_data_release(str, t11);
        return t11;
    }
}
