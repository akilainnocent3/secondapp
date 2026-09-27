package com.ironsource;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class M5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final ArrayList<String> f59477a = new ArrayList<>(new L5().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final S6 f59478b = new S6();

    @oy.l
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f59478b.a(this.f59477a);
        kotlin.jvm.internal.m0.o(jSONObjectA, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return jSONObjectA;
    }
}
