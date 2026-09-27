package com.yandex.div.json;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.templates.TemplateProvider;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class KeyWatchingTemplateProvider implements TemplateProvider<EntityTemplate<?>> {

    @l
    private final LinkedHashSet<String> _requestedKeys = new LinkedHashSet<>();

    @l
    private final TemplateProvider<EntityTemplate<?>> base;

    /* JADX WARN: Multi-variable type inference failed */
    public KeyWatchingTemplateProvider(@l TemplateProvider<? extends EntityTemplate<?>> templateProvider) {
        this.base = templateProvider;
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    @m
    public EntityTemplate<?> get(@l String str) {
        this._requestedKeys.add(str);
        return this.base.get(str);
    }

    @Override // com.yandex.div.json.templates.TemplateProvider
    public /* synthetic */ EntityTemplate getOrThrow(String str, JSONObject jSONObject) {
        return com.yandex.div.json.templates.a.a(this, str, jSONObject);
    }

    @l
    public final Set<String> getRequestedKeys() {
        return this._requestedKeys;
    }
}
