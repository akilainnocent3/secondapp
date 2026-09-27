package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class ug {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public static final a f64280c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.m
    private final Double f64281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    private final Double f64282b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        @cs.o
        public final b a() {
            return new b();
        }

        @oy.l
        @cs.o
        public final ug b() {
            return a().a();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.m
        private Double f64283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        private Double f64284b;

        public final void a(@oy.m Double d10) {
            this.f64284b = d10;
        }

        public final void b(@oy.m Double d10) {
            this.f64283a = d10;
        }

        @oy.m
        public final Double c() {
            return this.f64283a;
        }

        @oy.l
        public final b a(double d10) {
            this.f64284b = Double.valueOf(d10);
            return this;
        }

        @oy.m
        public final Double b() {
            return this.f64284b;
        }

        @oy.l
        public final ug a() {
            return new ug(this, null);
        }

        @oy.l
        public final b b(double d10) {
            this.f64283a = Double.valueOf(d10);
            return this;
        }
    }

    public /* synthetic */ ug(b bVar, kotlin.jvm.internal.x xVar) {
        this(bVar);
    }

    @oy.l
    @cs.o
    public static final b a() {
        return f64280c.a();
    }

    @oy.l
    @cs.o
    public static final ug b() {
        return f64280c.b();
    }

    @oy.m
    public final Double c() {
        return this.f64282b;
    }

    @oy.m
    public final Double d() {
        return this.f64281a;
    }

    @oy.l
    public final String e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("ceiling", this.f64282b);
            jSONObject.put("floor", this.f64281a);
        } catch (JSONException e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.getMessage());
        }
        String string = jSONObject.toString();
        kotlin.jvm.internal.m0.o(string, "json.toString()");
        return string;
    }

    @oy.l
    public String toString() {
        return "WaterfallConfiguration" + e();
    }

    private ug(b bVar) {
        this.f64281a = bVar.c();
        this.f64282b = bVar.b();
    }
}
