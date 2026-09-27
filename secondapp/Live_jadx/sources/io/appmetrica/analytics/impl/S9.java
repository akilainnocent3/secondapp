package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class S9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f96450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f96451c;

    public S9(JSONObject jSONObject) {
        this.f96449a = jSONObject.getString("name");
        this.f96451c = jSONObject.getBoolean("required");
        this.f96450b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && S9.class == obj.getClass()) {
            S9 s10 = (S9) obj;
            if (this.f96450b != s10.f96450b || this.f96451c != s10.f96451c) {
                return false;
            }
            String str = this.f96449a;
            String str2 = s10.f96449a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f96449a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.f96450b) * 31) + (this.f96451c ? 1 : 0);
    }

    public S9(String str, int i10, boolean z10) {
        this.f96449a = str;
        this.f96450b = i10;
        this.f96451c = z10;
    }
}
