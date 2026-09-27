package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final JSONObject f59850a;

    public Q5(@oy.m JSONObject jSONObject) {
        this.f59850a = jSONObject;
    }

    @oy.m
    public final Boolean a(@oy.l String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        JSONObject jSONObject = this.f59850a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof Boolean) {
            return (Boolean) objOpt;
        }
        return null;
    }

    @oy.m
    public final Integer b(@oy.l String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        JSONObject jSONObject = this.f59850a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof Integer) {
            return (Integer) objOpt;
        }
        return null;
    }

    @oy.m
    public final String c(@oy.l String key) {
        kotlin.jvm.internal.m0.p(key, "key");
        JSONObject jSONObject = this.f59850a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        return null;
    }
}
