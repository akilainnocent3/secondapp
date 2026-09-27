package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.util.b1;
import com.fyber.inneractive.sdk.util.c1;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f44497a = 50;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f44498b = 50;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f44499c = null;

    @Override // com.fyber.inneractive.sdk.util.b1
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        c1.a(jSONObject, "pausePct", this.f44497a);
        c1.a(jSONObject, "playPct", this.f44498b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.f44499c;
        if (set != null) {
            for (Vendor vendor : set) {
                if (vendor != null) {
                    jSONArray.put(vendor);
                }
            }
        }
        c1.a(jSONObject, "vendor", jSONArray);
        return jSONObject;
    }
}
