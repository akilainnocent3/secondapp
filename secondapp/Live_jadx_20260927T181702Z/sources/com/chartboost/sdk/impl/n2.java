package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f40068d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n6 f40069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final n6 f40070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final n6 f40071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final n2 f40072h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n6 f40073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n6 f40074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n6 f40075c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public a() {
        }

        public final n2 a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            n6.a aVar = n6.f40112c;
            n6 n6VarA = aVar.a(jSONObject.optJSONObject("margin"));
            if (n6VarA == null) {
                n6VarA = n2.f40069e;
            }
            n6 n6VarA2 = aVar.a(jSONObject.optJSONObject("padding"));
            if (n6VarA2 == null) {
                n6VarA2 = n2.f40070f;
            }
            n6 n6VarA3 = aVar.a(jSONObject.optJSONObject("size"));
            if (n6VarA3 == null) {
                n6VarA3 = n2.f40071g;
            }
            return new n2(n6VarA, n6VarA2, n6VarA3);
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public final n2 a() {
            return n2.f40072h;
        }
    }

    static {
        n6 n6Var = new n6(0, 0);
        f40069e = n6Var;
        n6 n6Var2 = new n6(8, 8);
        f40070f = n6Var2;
        n6 n6Var3 = new n6(28, 28);
        f40071g = n6Var3;
        f40072h = new n2(n6Var, n6Var2, n6Var3);
    }

    public n2(n6 margin, n6 padding, n6 size) {
        kotlin.jvm.internal.m0.p(margin, "margin");
        kotlin.jvm.internal.m0.p(padding, "padding");
        kotlin.jvm.internal.m0.p(size, "size");
        this.f40073a = margin;
        this.f40074b = padding;
        this.f40075c = size;
    }

    public final n6 e() {
        return this.f40073a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return kotlin.jvm.internal.m0.g(this.f40073a, n2Var.f40073a) && kotlin.jvm.internal.m0.g(this.f40074b, n2Var.f40074b) && kotlin.jvm.internal.m0.g(this.f40075c, n2Var.f40075c);
    }

    public final n6 f() {
        return this.f40074b;
    }

    public final n6 g() {
        return this.f40075c;
    }

    public int hashCode() {
        return (((this.f40073a.hashCode() * 31) + this.f40074b.hashCode()) * 31) + this.f40075c.hashCode();
    }

    public String toString() {
        return "ButtonAttributes(margin=" + this.f40073a + ", padding=" + this.f40074b + ", size=" + this.f40075c + gi.j.f86771d;
    }
}
