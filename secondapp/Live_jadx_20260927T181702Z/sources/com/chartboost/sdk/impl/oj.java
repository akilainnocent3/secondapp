package com.chartboost.sdk.impl;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40383a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f40384b = new a();

        public a() {
            super("click", null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            if (xkVar != null) {
                xkVar.a(this);
            }
            a(fiVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 1811085104;
        }

        public String toString() {
            return "Click";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f40385b = new b();

        public b() {
            super("close", null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            oj.a(this, fiVar, androidContext, omManager, identity, null, null, 48, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 1811091360;
        }

        public String toString() {
            return "Close";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f40386b = new c();

        public c() {
            super("closeLinear", null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            oj.a(this, fiVar, androidContext, omManager, identity, null, null, 48, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 2126271205;
        }

        public String toString() {
            return "CloseLinear";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f40387b = new d();

        public d() {
            super(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE, null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            if (xkVar != null) {
                xkVar.a(this);
            }
            a(fiVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -848642415;
        }

        public String toString() {
            return "Complete";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f40388b = new e();

        public e() {
            super("creativeView", null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            oj.a(this, fiVar, androidContext, omManager, identity, null, null, 48, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return 141283404;
        }

        public String toString() {
            return "CreativeView";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f40389b = new f();

        public f() {
            super("error", null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            Map mapB;
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            Object obj = (fiVar == null || (mapB = fiVar.b()) == null) ? null : mapB.get("VAST_ERROR_CODE");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (xkVar != null) {
                xkVar.a(this);
            }
            a(fiVar, androidContext, omManager, identity, num, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1813119920;
        }

        public String toString() {
            return "Error";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f40390b = new g();

        public g() {
            super("firstQuartile", null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            if (xkVar != null) {
                xkVar.a(this);
            }
            a(fiVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public int hashCode() {
            return 1356419579;
        }

        public String toString() {
            return "FirstQuartile";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f40391b = new h();

        public h() {
            super("impression", null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            if (xkVar != null) {
                xkVar.a(this);
            }
            a(fiVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return 1160259937;
        }

        public String toString() {
            return "Impression";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class i extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f40392b = new i();

        public i() {
            super(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT, null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            if (xkVar != null) {
                xkVar.a(this);
            }
            a(fiVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public int hashCode() {
            return -1888032352;
        }

        public String toString() {
            return "Midpoint";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class j extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f40393b = new j();

        public j() {
            super("pause", null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            if (xkVar != null) {
                xkVar.a(this);
            }
            a(fiVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public int hashCode() {
            return 1822775198;
        }

        public String toString() {
            return "Pause";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class k extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40394b;

        public k(int i10) {
            super("progress" + i10, null);
            this.f40394b = i10;
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            oj.a(this, fiVar, androidContext, omManager, identity, null, null, 48, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f40394b == ((k) obj).f40394b;
        }

        public int hashCode() {
            return this.f40394b;
        }

        public String toString() {
            return "Progress(offsetSeconds=" + this.f40394b + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class l extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f40395b = new l();

        public l() {
            super("resume", null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            if (xkVar != null) {
                xkVar.a(this);
            }
            a(fiVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public int hashCode() {
            return 732351365;
        }

        public String toString() {
            return "Resume";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class m extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f40396b = new m();

        public m() {
            super("start", null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            Map mapB;
            Map mapB2;
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            Object obj = (fiVar == null || (mapB2 = fiVar.b()) == null) ? null : mapB2.get("duration");
            Float f10 = obj instanceof Float ? (Float) obj : null;
            float fFloatValue = f10 != null ? f10.floatValue() : 0.0f;
            if (fFloatValue < 1.0f) {
                fFloatValue = 30.0f;
            }
            Object obj2 = (fiVar == null || (mapB = fiVar.b()) == null) ? null : mapB.get("volume");
            Float f11 = obj2 instanceof Float ? (Float) obj2 : null;
            float fFloatValue2 = f11 != null ? f11.floatValue() : 1.0f;
            if (xkVar != null) {
                xkVar.a(fFloatValue, fFloatValue2);
            }
            a(fiVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public int hashCode() {
            return 1826092554;
        }

        public String toString() {
            return "Start";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class n extends oj {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final n f40397b = new n();

        public n() {
            super("thirdQuartile", null);
        }

        @Override // com.chartboost.sdk.impl.oj
        public void a(xk xkVar, fi fiVar, Context androidContext, be omManager, v2 identity) {
            kotlin.jvm.internal.m0.p(androidContext, "androidContext");
            kotlin.jvm.internal.m0.p(omManager, "omManager");
            kotlin.jvm.internal.m0.p(identity, "identity");
            if (xkVar != null) {
                xkVar.a(this);
            }
            a(fiVar, androidContext, omManager, identity, null, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public int hashCode() {
            return -541631054;
        }

        public String toString() {
            return "ThirdQuartile";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class o extends kotlin.jvm.internal.o0 implements ds.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Integer f40398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Integer f40399c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Integer num, Integer num2) {
            super(1);
            this.f40398b = num;
            this.f40399c = num2;
        }

        public final void a(vb macroContext) {
            kotlin.jvm.internal.m0.p(macroContext, "$this$macroContext");
            macroContext.a(this.f40398b);
            macroContext.b(this.f40399c);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((vb) obj);
            return dr.w2.f79517a;
        }
    }

    public oj(String str) {
        this.f40383a = str;
    }

    public abstract void a(xk xkVar, fi fiVar, Context context, be beVar, v2 v2Var);

    public /* synthetic */ oj(String str, kotlin.jvm.internal.x xVar) {
        this(str);
    }

    public final void a(fi fiVar, Context androidContext, be omManager, v2 identity, Integer num, Integer num2) {
        String strE;
        dr.w2 w2Var;
        kotlin.jvm.internal.m0.p(androidContext, "androidContext");
        kotlin.jvm.internal.m0.p(omManager, "omManager");
        kotlin.jvm.internal.m0.p(identity, "identity");
        if (fiVar == null || (strE = fiVar.e()) == null) {
            sb.a("Failed to fire tracking URL for event `" + this.f40383a + "`. URL is null in TrackingEvent.", (Throwable) null, 2, (Object) null);
            return;
        }
        String strA = xb.a(strE, xb.a(androidContext, omManager, identity, new o(num, num2)));
        f3 f3VarB = cj.f38470a.b();
        if (f3VarB != null) {
            f3VarB.a(new pj(strA));
            w2Var = dr.w2.f79517a;
        } else {
            w2Var = null;
        }
        if (w2Var == null) {
            sb.b("Failed to submit tracking request for " + strA + ". Network service is null.", (Throwable) null, 2, (Object) null);
        }
        sb.c("Tracking URL for event `" + this.f40383a + "` fired: " + strA + " (raw: " + strE + gi.j.f86771d, null, 2, null);
    }

    public static /* synthetic */ void a(oj ojVar, fi fiVar, Context context, be beVar, v2 v2Var, Integer num, Integer num2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fireTracker");
        }
        if ((i10 & 16) != 0) {
            num = null;
        }
        if ((i10 & 32) != 0) {
            num2 = null;
        }
        ojVar.a(fiVar, context, beVar, v2Var, num, num2);
    }

    public final String a() {
        return this.f40383a;
    }
}
