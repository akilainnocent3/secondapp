package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Date;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class O {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final a f59650f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public static final String f59651g = "0";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public static final String f59652h = "0";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public static final String f59653i = "0";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public static final String f59654j = "0";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final O9 f59655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private W7 f59656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    private String f59657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    private EnumC4412n0 f59658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f59659e;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        private a() {
        }
    }

    public O(@oy.l O9 adInstance) {
        kotlin.jvm.internal.m0.p(adInstance, "adInstance");
        this.f59655a = adInstance;
        this.f59656b = W7.UnknownProvider;
        this.f59657c = "0";
        this.f59658d = EnumC4412n0.LOAD_REQUEST;
        this.f59659e = new Date().getTime() / 1000.0d;
    }

    @oy.l
    public final O9 a() {
        return this.f59655a;
    }

    @oy.l
    public final IronSource.a b() {
        if (this.f59655a.i()) {
            return IronSource.a.BANNER;
        }
        return this.f59655a.n() ? IronSource.a.REWARDED_VIDEO : IronSource.a.INTERSTITIAL;
    }

    @oy.l
    public final String c() {
        String strE = this.f59655a.e();
        kotlin.jvm.internal.m0.o(strE, "adInstance.id");
        return strE;
    }

    @oy.l
    public final O9 d() {
        return this.f59655a;
    }

    @oy.l
    public final W7 e() {
        return this.f59656b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o10 = (O) obj;
        return kotlin.jvm.internal.m0.g(c(), o10.c()) && kotlin.jvm.internal.m0.g(g(), o10.g()) && b() == o10.b() && kotlin.jvm.internal.m0.g(i(), o10.i()) && this.f59656b == o10.f59656b && kotlin.jvm.internal.m0.g(this.f59657c, o10.f59657c) && this.f59658d == o10.f59658d;
    }

    @oy.l
    public final EnumC4412n0 f() {
        return this.f59658d;
    }

    @oy.l
    public final String g() {
        String strC = this.f59655a.c();
        return strC == null ? "0" : strC;
    }

    @oy.l
    public final String h() {
        return this.f59657c;
    }

    public int hashCode() {
        return Objects.hash(c(), g(), b(), i(), this.f59656b, this.f59657c, this.f59658d, Double.valueOf(this.f59659e));
    }

    @oy.l
    public final String i() {
        String strG = this.f59655a.g();
        kotlin.jvm.internal.m0.o(strG, "adInstance.name");
        return strG;
    }

    public final double j() {
        return this.f59659e;
    }

    @oy.l
    public String toString() {
        String string = new JSONObject().put(com.ironsource.sdk.controller.f.b.f63771c, c()).put("advertiserBundleId", this.f59657c).put("adProvider", this.f59656b.ordinal()).put("adStatus", this.f59658d.ordinal()).put("lastStatusUpdateTimeStamp", (long) this.f59659e).put("adUnitId", g()).put("adFormat", b().toString()).put("instanceId", i()).toString();
        kotlin.jvm.internal.m0.o(string, "JSONObject()\n        .pu…ceId)\n        .toString()");
        return string;
    }

    @oy.l
    public final O a(@oy.l O9 adInstance) {
        kotlin.jvm.internal.m0.p(adInstance, "adInstance");
        return new O(adInstance);
    }

    public static /* synthetic */ O a(O o10, O9 o11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            o11 = o10.f59655a;
        }
        return o10.a(o11);
    }

    public final void a(@oy.l W7 w10) {
        kotlin.jvm.internal.m0.p(w10, "<set-?>");
        this.f59656b = w10;
    }

    public final void a(@oy.l String str) {
        kotlin.jvm.internal.m0.p(str, "<set-?>");
        this.f59657c = str;
    }

    public final void a(@oy.l EnumC4412n0 enumC4412n0) {
        kotlin.jvm.internal.m0.p(enumC4412n0, "<set-?>");
        this.f59658d = enumC4412n0;
    }

    public final void a(double d10) {
        this.f59659e = d10;
    }
}
