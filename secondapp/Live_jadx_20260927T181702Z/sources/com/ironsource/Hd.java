package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final String f59205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final Integer f59206b;

    public Hd(@oy.l JSONObject features, @oy.l String nameKey, @oy.l String amountKey) {
        kotlin.jvm.internal.m0.p(features, "features");
        kotlin.jvm.internal.m0.p(nameKey, "nameKey");
        kotlin.jvm.internal.m0.p(amountKey, "amountKey");
        this.f59205a = features.has(nameKey) ? features.getString(nameKey) : null;
        this.f59206b = features.has(amountKey) ? Integer.valueOf(features.getInt(amountKey)) : null;
    }

    @oy.m
    public final Integer a() {
        return this.f59206b;
    }

    @oy.m
    public final String b() {
        return this.f59205a;
    }
}
