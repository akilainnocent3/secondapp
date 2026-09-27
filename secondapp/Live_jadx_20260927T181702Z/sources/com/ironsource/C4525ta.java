package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ta, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4525ta implements Me<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Me<String> f64160a;

    public C4525ta(@oy.l Me<String> serverResponse) {
        kotlin.jvm.internal.m0.p(serverResponse, "serverResponse");
        this.f64160a = serverResponse;
    }

    @Override // com.ironsource.Me
    @oy.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return new JSONObject(this.f64160a.a());
    }
}
