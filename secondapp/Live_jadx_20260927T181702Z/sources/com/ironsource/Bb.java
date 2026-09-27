package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Bb {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f58496c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final String f58497d = "revenue";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final String f58498e = "precision";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f58499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f58500b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @cs.o
        @oy.m
        public final Bb a(@oy.l JSONObject json) {
            kotlin.jvm.internal.m0.p(json, "json");
            try {
                double d10 = json.getDouble("revenue");
                String precision = json.getString("precision");
                kotlin.jvm.internal.m0.o(precision, "precision");
                return new Bb(d10, precision);
            } catch (Exception e10) {
                C4485r4.d().a(e10);
                C4581wf.a(e10);
                return null;
            }
        }

        private a() {
        }
    }

    public Bb(double d10, @oy.l String precision) {
        kotlin.jvm.internal.m0.p(precision, "precision");
        this.f58499a = d10;
        this.f58500b = precision;
    }

    public final double a() {
        return this.f58499a;
    }

    @oy.l
    public final String b() {
        return this.f58500b;
    }

    @oy.l
    public final String c() {
        return this.f58500b;
    }

    public final double d() {
        return this.f58499a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bb)) {
            return false;
        }
        Bb bb2 = (Bb) obj;
        return Double.compare(this.f58499a, bb2.f58499a) == 0 && kotlin.jvm.internal.m0.g(this.f58500b, bb2.f58500b);
    }

    public int hashCode() {
        return (f0.i.a(this.f58499a) * 31) + this.f58500b.hashCode();
    }

    @oy.l
    public String toString() {
        return "LoadArmData(revenue=" + this.f58499a + ", precision=" + this.f58500b + gi.j.f86771d;
    }

    @oy.l
    public final Bb a(double d10, @oy.l String precision) {
        kotlin.jvm.internal.m0.p(precision, "precision");
        return new Bb(d10, precision);
    }

    public static /* synthetic */ Bb a(Bb bb2, double d10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = bb2.f58499a;
        }
        if ((i10 & 2) != 0) {
            str = bb2.f58500b;
        }
        return bb2.a(d10, str);
    }

    @cs.o
    @oy.m
    public static final Bb a(@oy.l JSONObject jSONObject) {
        return f58496c.a(jSONObject);
    }
}
