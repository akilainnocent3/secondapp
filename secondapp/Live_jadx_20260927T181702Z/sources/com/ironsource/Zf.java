package com.ironsource;

import android.content.Context;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.s1({"SMAP\nTokenProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenProvider.kt\ncom/ironsource/environment/token/TokenProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
public final class Zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final String[] f60485a = Yf.f60383a.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final S6 f60486b = new S6();

    @oy.l
    @dr.o(level = dr.q.WARNING, message = "Use the new method getToken(context: Context)")
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = this.f60486b.a(this.f60485a);
        kotlin.jvm.internal.m0.o(jSONObjectA, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(jSONObjectA);
    }

    @oy.l
    public final JSONObject a(@oy.l Context context) {
        kotlin.jvm.internal.m0.p(context, "context");
        JSONObject jSONObjectA = this.f60486b.a(context, this.f60485a);
        kotlin.jvm.internal.m0.o(jSONObjectA, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(jSONObjectA);
    }

    private final JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectB = T6.b(jSONObject.optJSONObject(Q6.f59911u));
        if (jSONObjectB != null) {
            jSONObject.put(Q6.f59911u, jSONObjectB);
        }
        return jSONObject;
    }
}
