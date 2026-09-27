package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class wo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f58044a = new ConcurrentHashMap();

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.f58044a.entrySet()) {
                jSONObject.put(String.valueOf(Ef.a((Df) entry.getKey())), ((vo) entry.getValue()).a());
            }
            return jSONObject;
        } catch (Exception e10) {
            dr.i0 i0Var = P9.f55304a;
            P9.a(new L2(e10));
            return new JSONObject();
        }
    }
}
