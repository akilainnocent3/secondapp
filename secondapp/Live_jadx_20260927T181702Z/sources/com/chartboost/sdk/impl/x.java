package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41400c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f41401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f41402b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final x a(JSONObject jsonObject) throws JSONException {
            kotlin.jvm.internal.m0.p(jsonObject, "jsonObject");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("renderables");
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                qf.a aVar = qf.f40578p;
                JSONObject jSONObject = jSONArray.getJSONObject(i10);
                kotlin.jvm.internal.m0.o(jSONObject, "getJSONObject(...)");
                arrayList.add(aVar.a(jSONObject));
            }
            y.a aVar2 = y.f41595m;
            JSONObject jSONObject2 = jsonObject.getJSONObject("config");
            kotlin.jvm.internal.m0.o(jSONObject2, "getJSONObject(...)");
            String string = jsonObject.getString("auction_id");
            kotlin.jvm.internal.m0.o(string, "getString(...)");
            return new x(arrayList, aVar2.a(jSONObject2, string));
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public x(List renderables, y admConfig) {
        kotlin.jvm.internal.m0.p(renderables, "renderables");
        kotlin.jvm.internal.m0.p(admConfig, "admConfig");
        this.f41401a = renderables;
        this.f41402b = admConfig;
    }

    public final y a() {
        return this.f41402b;
    }

    public final List b() {
        return this.f41401a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return kotlin.jvm.internal.m0.g(this.f41401a, xVar.f41401a) && kotlin.jvm.internal.m0.g(this.f41402b, xVar.f41402b);
    }

    public int hashCode() {
        return (this.f41401a.hashCode() * 31) + this.f41402b.hashCode();
    }

    public String toString() {
        return "AdMarkup(renderables=" + this.f41401a + ", admConfig=" + this.f41402b + gi.j.f86771d;
    }
}
