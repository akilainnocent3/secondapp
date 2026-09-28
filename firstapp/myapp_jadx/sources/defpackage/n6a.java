package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public final class n6a {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final float G;
    public final float H;
    public final float I;
    public final float J;
    public final float K;
    public final float L;
    public final float M;
    public final float N;
    public final float O;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final g7f f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;
    public final Float o;
    public final float p;
    public final float q;
    public final float r;
    public final float s;
    public final Float t;
    public final float u;
    public final float v;
    public final float w;
    public final float x;
    public final float y;
    public final float z;

    public n6a(float f, float f2, float f3, float f4, float f5, g7f g7fVar, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, Float f14, float f15, float f16, float f17, float f18, Float f19, float f20, float f21, float f22, float f23, float f24, float f25, float f26, float f27, float f28, float f29, float f30, float f31, float f32, float f33, float f34, float f35, float f36, float f37, float f38, float f39, float f40) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = g7fVar;
        this.g = f6;
        this.h = f7;
        this.i = f8;
        this.j = f9;
        this.k = f10;
        this.l = f11;
        this.m = f12;
        this.n = f13;
        this.o = f14;
        this.p = f15;
        this.q = f16;
        this.r = f17;
        this.s = f18;
        this.t = f19;
        this.u = f20;
        this.v = f21;
        this.w = f22;
        this.x = f23;
        this.y = f24;
        this.z = f25;
        this.A = f26;
        this.B = f27;
        this.C = f28;
        this.D = f29;
        this.E = f30;
        this.F = f31;
        this.G = f32;
        this.H = f33;
        this.I = f34;
        this.J = f35;
        this.K = f36;
        this.L = f37;
        this.M = f38;
        this.N = f39;
        this.O = f40;
    }

    public static n6a a(n6a n6aVar, float f, float f2, float f3, g7f g7fVar, float f4, float f5, float f6, Float f7, float f8, float f9, float f10, float f11, Float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, int i, int i2) {
        return new n6a((i & 1) != 0 ? n6aVar.a : f, n6aVar.b, n6aVar.c, (i & 16) != 0 ? n6aVar.d : f2, (i & 32) != 0 ? n6aVar.e : f3, (i & 64) != 0 ? n6aVar.f : g7fVar, (i & 128) != 0 ? n6aVar.g : f4, (i & 256) != 0 ? n6aVar.h : f5, (i & 512) != 0 ? n6aVar.i : 0.0f, n6aVar.j, (i & 2048) != 0 ? n6aVar.k : 0.8f, n6aVar.l, n6aVar.m, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? n6aVar.n : f6, (32768 & i) != 0 ? n6aVar.o : f7, (65536 & i) != 0 ? n6aVar.p : f8, (131072 & i) != 0 ? n6aVar.q : f9, (262144 & i) != 0 ? n6aVar.r : f10, (524288 & i) != 0 ? n6aVar.s : f11, (1048576 & i) != 0 ? n6aVar.t : f12, (2097152 & i) != 0 ? n6aVar.u : f13, (4194304 & i) != 0 ? n6aVar.v : 8.0f, (8388608 & i) != 0 ? n6aVar.w : 8.0f, n6aVar.x, (i & 33554432) != 0 ? n6aVar.y : 12.0f, (i & 67108864) != 0 ? n6aVar.z : 10.0f, (i & 134217728) != 0 ? n6aVar.A : 8.0f, (i & 268435456) != 0 ? n6aVar.B : f14, (i & 536870912) != 0 ? n6aVar.C : f15, (i & 1073741824) != 0 ? n6aVar.D : f16, (i & Integer.MIN_VALUE) != 0 ? n6aVar.E : 0.85714287f, (i2 & 1) != 0 ? n6aVar.F : 0.8333333f, (i2 & 2) != 0 ? n6aVar.G : 0.875f, (i2 & 4) != 0 ? n6aVar.H : f17, (i2 & 8) != 0 ? n6aVar.I : f18, (i2 & 16) != 0 ? n6aVar.J : f19, (i2 & 32) != 0 ? n6aVar.K : f20, (i2 & 64) != 0 ? n6aVar.L : f21, (i2 & 128) != 0 ? n6aVar.M : f22, (i2 & 256) != 0 ? n6aVar.N : 0.8333333f, (i2 & 512) != 0 ? n6aVar.O : 0.6666667f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6a)) {
            return false;
        }
        n6a n6aVar = (n6a) obj;
        return Float.compare(this.a, n6aVar.a) == 0 && Float.compare(this.b, n6aVar.b) == 0 && g7f.b(this.c, n6aVar.c) && Float.compare(this.d, n6aVar.d) == 0 && g7f.b(this.e, n6aVar.e) && Intrinsics.g(this.f, n6aVar.f) && g7f.b(this.g, n6aVar.g) && g7f.b(this.h, n6aVar.h) && g7f.b(this.i, n6aVar.i) && g7f.b(this.j, n6aVar.j) && Float.compare(this.k, n6aVar.k) == 0 && Float.compare(this.l, n6aVar.l) == 0 && Float.compare(this.m, n6aVar.m) == 0 && Float.compare(this.n, n6aVar.n) == 0 && Intrinsics.g(this.o, n6aVar.o) && Float.compare(this.p, n6aVar.p) == 0 && Float.compare(this.q, n6aVar.q) == 0 && Float.compare(this.r, n6aVar.r) == 0 && Float.compare(this.s, n6aVar.s) == 0 && Intrinsics.g(this.t, n6aVar.t) && g7f.b(this.u, n6aVar.u) && g7f.b(this.v, n6aVar.v) && g7f.b(this.w, n6aVar.w) && g7f.b(this.x, n6aVar.x) && g7f.b(this.y, n6aVar.y) && g7f.b(this.z, n6aVar.z) && g7f.b(this.A, n6aVar.A) && g7f.b(this.B, n6aVar.B) && Float.compare(this.C, n6aVar.C) == 0 && Float.compare(this.D, n6aVar.D) == 0 && Float.compare(this.E, n6aVar.E) == 0 && Float.compare(this.F, n6aVar.F) == 0 && Float.compare(this.G, n6aVar.G) == 0 && Float.compare(this.H, n6aVar.H) == 0 && Float.compare(this.I, n6aVar.I) == 0 && Float.compare(this.J, n6aVar.J) == 0 && Float.compare(this.K, n6aVar.K) == 0 && Float.compare(this.L, n6aVar.L) == 0 && Float.compare(this.M, n6aVar.M) == 0 && Float.compare(this.N, n6aVar.N) == 0 && Float.compare(this.O, n6aVar.O) == 0;
    }

    public final int hashCode() {
        int iA = tvh.a(this.e, tvh.a(this.d, tvh.a(this.c, tvh.a(this.b, Float.hashCode(this.a) * 31, 961), 31), 31), 31);
        g7f g7fVar = this.f;
        int iA2 = tvh.a(this.n, tvh.a(this.m, tvh.a(this.l, tvh.a(this.k, tvh.a(this.j, tvh.a(this.i, tvh.a(this.h, tvh.a(this.g, (iA + (g7fVar == null ? 0 : Float.hashCode(g7fVar.a))) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        Float f = this.o;
        int iA3 = tvh.a(this.s, tvh.a(this.r, tvh.a(this.q, tvh.a(this.p, (iA2 + (f == null ? 0 : f.hashCode())) * 31, 31), 31), 31), 31);
        Float f2 = this.t;
        return Float.hashCode(this.O) + tvh.a(this.N, tvh.a(this.M, tvh.a(this.L, tvh.a(this.K, tvh.a(this.J, tvh.a(this.I, tvh.a(this.H, tvh.a(this.G, tvh.a(this.F, tvh.a(this.E, tvh.a(this.D, tvh.a(this.C, tvh.a(this.B, tvh.a(this.A, tvh.a(this.z, tvh.a(this.y, tvh.a(this.x, tvh.a(this.w, tvh.a(this.v, tvh.a(this.u, (iA3 + (f2 != null ? f2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strC = g7f.c(this.c);
        String strC2 = g7f.c(this.e);
        String strC3 = g7f.c(this.g);
        String strC4 = g7f.c(this.h);
        String strC5 = g7f.c(this.i);
        String strC6 = g7f.c(this.j);
        String strC7 = g7f.c(this.u);
        String strC8 = g7f.c(this.v);
        String strC9 = g7f.c(this.w);
        String strC10 = g7f.c(this.x);
        String strC11 = g7f.c(this.y);
        String strC12 = g7f.c(this.z);
        String strC13 = g7f.c(this.A);
        String strC14 = g7f.c(this.B);
        StringBuilder sb = new StringBuilder("ComposeBetContainerLayoutPercentages(topSpacerWeight=");
        sb.append(this.a);
        sb.append(", autoBetRowWeight=");
        sb.append(this.b);
        sb.append(", autoControlsTopPadding=null, autoControlsSpacerWidth=");
        sb.append(strC);
        sb.append(", autoControlsTextScale=");
        sb.append(this.d);
        sb.append(", autoToggleHeight=");
        sb.append(strC2);
        sb.append(", autoToggleWidth=");
        sb.append(this.f);
        sb.append(", autoCashoutValueBoxWidth=");
        hxa.c(sb, strC3, ", autoCashoutValueBoxMinHeight=", strC4, ", autoCashoutValueBoxHorizontalPadding=");
        hxa.c(sb, strC5, ", autoCashoutEditBoxSpacerWidth=", strC6, ", autoCashoutValueTextScale=");
        ew7.b(sb, this.k, ", minMaxRowWeight=", this.l, ", stakeBetRowWeight=");
        ew7.b(sb, this.m, ", bottomSpacerWeight=", this.n, ", contentHorizontalPaddingPercent=");
        sb.append(this.o);
        sb.append(", stakeSelectorWeight=");
        sb.append(this.p);
        sb.append(xOgHBQVl.HjXPw);
        ew7.b(sb, this.q, ", stakeAmountRowWeight=", this.r, ", stakeChipsRowWeight=");
        sb.append(this.s);
        sb.append(", stakeVerticalSpacerWeight=");
        sb.append(this.t);
        sb.append(", outerCornerRadius=");
        hxa.c(sb, strC7, ", amountCornerRadius=", strC8, ", chipCornerRadius=");
        hxa.c(sb, strC9, ", plusMinusCornerRadius=", strC10, ", betButtonCornerRadius=");
        hxa.c(sb, strC11, ", waitingButtonCornerRadius=", strC12, ", confirmationButtonCornerRadius=");
        hxa.c(sb, strC13, ", giftIconSize=", strC14, ", plusMinusHeightFraction=");
        ew7.b(sb, this.C, ", plusMinusIconWidthFraction=", this.D, ", stakeAmountTextScale=");
        ew7.b(sb, this.E, ", chipTextScale=", this.F, ", minMaxTextScale=");
        ew7.b(sb, this.G, ", betButtonTextScale=", this.H, ", betButtonCurrencyTextScale=");
        ew7.b(sb, this.I, ", betButtonAmountTextScale=", this.J, ", cashoutTitleTextScale=");
        ew7.b(sb, this.K, ", cashoutCurrencyTextScale=", this.L, ", cashoutAmountTextScale=");
        ew7.b(sb, this.M, ", waitingTextScale=", this.N, ", confirmationTextScale=");
        return wi1.a(this.O, ")", sb);
    }

    public n6a() {
        this(0.1f, 0.28f, 25.0f, 1.0f, 16.0f, null, 55.0f, 26.0f, 6.0f, 15.0f, 1.0f, 0.15f, 0.55f, 0.08f, null, 0.55f, 0.45f, 0.55f, 0.35f, null, 16.0f, 8.0f, 10.0f, 6.0f, 16.0f, 16.0f, 8.0f, 22.0f, 1.0f, 0.6f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f);
    }
}
