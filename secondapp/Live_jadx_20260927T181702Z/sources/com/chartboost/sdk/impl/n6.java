package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class n6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f40112c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40114b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final n6 a(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new n6(jSONObject.getInt("w"), jSONObject.getInt("h"));
            }
            return null;
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public n6(int i10, int i11) {
        this.f40113a = i10;
        this.f40114b = i11;
    }

    public final int a() {
        return this.f40114b;
    }

    public final int b() {
        return this.f40113a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        return this.f40113a == n6Var.f40113a && this.f40114b == n6Var.f40114b;
    }

    public int hashCode() {
        return (this.f40113a * 31) + this.f40114b;
    }

    public String toString() {
        return "Dimensions(width=" + this.f40113a + ", height=" + this.f40114b + gi.j.f86771d;
    }
}
