package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5521ya {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f98670a;

    static {
        HashSet hashSet = new HashSet();
        f98670a = hashSet;
        hashSet.add("get_ad");
        hashSet.add(lk.e.f104689g);
        hashSet.add("report_ad");
        hashSet.add("startup");
        hashSet.add("diagnostic");
    }

    public static ArrayList a(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                return AbstractC5095hb.a(jSONObjectOptJSONObject.getJSONArray("urls"));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
