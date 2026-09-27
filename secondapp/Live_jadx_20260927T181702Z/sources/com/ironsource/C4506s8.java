package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.s8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4506s8 implements InterfaceC4489r8, InterfaceC4489r8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private JSONObject f63573a = new JSONObject();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private JSONObject f63574b = new JSONObject();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private JSONObject f63575c = new JSONObject();

    private final Object e(String str) {
        if (this.f63575c.has(str)) {
            return this.f63575c.get(str);
        }
        if (this.f63574b.has(str)) {
            return this.f63574b.get(str);
        }
        if (this.f63573a.has(str)) {
            return this.f63573a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4489r8
    @oy.m
    public JSONObject a(@oy.l String configKey) {
        kotlin.jvm.internal.m0.p(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof JSONObject) {
            return (JSONObject) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4489r8
    @oy.m
    public Integer b(@oy.l String configKey) {
        kotlin.jvm.internal.m0.p(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof Integer) {
            return (Integer) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4489r8
    @oy.m
    public Boolean c(@oy.l String configKey) {
        kotlin.jvm.internal.m0.p(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof Boolean) {
            return (Boolean) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4489r8
    @oy.m
    public String d(@oy.l String configKey) {
        kotlin.jvm.internal.m0.p(configKey, "configKey");
        Object objE = e(configKey);
        if (objE instanceof String) {
            return (String) objE;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4489r8.a
    public void a(@oy.l JSONObject controllerConfig) {
        kotlin.jvm.internal.m0.p(controllerConfig, "controllerConfig");
        this.f63573a = controllerConfig;
        JSONObject jSONObjectOptJSONObject = controllerConfig.optJSONObject(C4235d4.a.f61283b);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        this.f63574b = jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = this.f63573a.optJSONObject(C4235d4.a.f61284c);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        this.f63575c = jSONObjectOptJSONObject2;
    }
}
