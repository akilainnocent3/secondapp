package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.f9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4276f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final ArrayList<String> f61775a = new ArrayList<>(new C4258e9().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final S6 f61776b = new S6();

    @oy.l
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f61776b.a(this.f61775a);
        kotlin.jvm.internal.m0.o(jSONObjectA, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return jSONObjectA;
    }
}
