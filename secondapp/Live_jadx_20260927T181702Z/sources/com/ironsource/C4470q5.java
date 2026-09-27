package com.ironsource;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4470q5 implements Kb<String, com.ironsource.mediationsdk.d.a> {
    @Override // com.ironsource.Kb
    @oy.l
    public com.ironsource.mediationsdk.d.a a(@oy.l String input) throws JSONException {
        kotlin.jvm.internal.m0.p(input, "input");
        com.ironsource.mediationsdk.d.a aVarA = com.ironsource.mediationsdk.d.b().a(new JSONObject(input));
        kotlin.jvm.internal.m0.o(aVarA, "getInstance().getAuction…sponse(JSONObject(input))");
        return aVarA;
    }
}
