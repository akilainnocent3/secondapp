package u4;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface u1 {
    public static final int A = 3;
    public static final int A0 = 9;
    public static final int B = 4;
    public static final int B0 = 10;
    public static final int C = 5;

    @x4.m1
    @Deprecated
    public static final int C0 = 10;
    public static final int D = 6;
    public static final int D0 = 11;
    public static final int E = 0;
    public static final int E0 = 12;
    public static final int F = 1;
    public static final int F0 = 13;
    public static final int G = 0;
    public static final int G0 = 14;
    public static final int H = 1;
    public static final int H0 = 15;
    public static final int I = 2;
    public static final int I0 = 16;
    public static final int J = 3;
    public static final int J0 = 17;
    public static final int K = 0;

    @Deprecated
    public static final int K0 = 18;
    public static final int L = 1;
    public static final int L0 = 18;
    public static final int M = 2;

    @Deprecated
    public static final int M0 = 19;
    public static final int N = 3;
    public static final int N0 = 19;
    public static final int O = 4;
    public static final int O0 = 31;
    public static final int P = 5;
    public static final int P0 = 20;
    public static final int Q = 6;
    public static final int Q0 = 21;
    public static final int R = 7;
    public static final int R0 = 22;
    public static final int S = 8;
    public static final int S0 = 23;
    public static final int T = 9;
    public static final int T0 = 24;
    public static final int U = 10;

    @Deprecated
    public static final int U0 = 25;
    public static final int V = 11;
    public static final int V0 = 33;
    public static final int W = 12;

    @Deprecated
    public static final int W0 = 26;
    public static final int X = 13;
    public static final int X0 = 34;
    public static final int Y = 14;
    public static final int Y0 = 35;
    public static final int Z = 15;
    public static final int Z0 = 27;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f138968a0 = 16;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final int f138969a1 = 28;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f138970b0 = 17;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final int f138971b1 = 29;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f138972c0 = 18;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final int f138973c1 = 30;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f138974d0 = 19;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final int f138975d1 = 32;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f138976e0 = 20;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final int f138977e1 = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f138978f = 1;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f138979f0 = 21;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f138980g = 2;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f138981g0 = 22;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f138982h = 3;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f138983h0 = 23;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f138984i = 4;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f138985i0 = 24;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f138986j = 1;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f138987j0 = 25;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f138988k = 2;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f138989k0 = 26;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f138990l = 3;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f138991l0 = 27;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f138992m = 4;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f138993m0 = 28;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f138994n = 5;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f138995n0 = 29;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f138996o = 6;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f138997o0 = 30;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f138998p = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f138999p0 = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f139000q = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f139001q0 = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final int f139002r = 2;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f139003r0 = 3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f139004s = 3;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f139005s0 = 4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f139006t = 4;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f139007t0 = 5;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f139008u = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @x4.m1
    @Deprecated
    public static final int f139009u0 = 5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f139010v = 1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f139011v0 = 6;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f139012w = 2;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @x4.m1
    @Deprecated
    public static final int f139013w0 = 6;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f139014x = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f139015x0 = 7;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f139016y = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f139017y0 = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f139018z = 2;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @x4.m1
    @Deprecated
    public static final int f139019z0 = 8;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f139020b = new a().f();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f139021c = x4.b2.k1(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f139022a;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        @x4.m1
        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int[] f139023b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 35, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final l0.b f139024a;

            @qj.a
            public a a(int i10) {
                this.f139024a.a(i10);
                return this;
            }

            @qj.a
            public a b(c cVar) {
                this.f139024a.b(cVar.f139022a);
                return this;
            }

            @qj.a
            public a c(int... iArr) {
                this.f139024a.c(iArr);
                return this;
            }

            @qj.a
            public a d() {
                this.f139024a.c(f139023b);
                return this;
            }

            @qj.a
            public a e(int i10, boolean z10) {
                this.f139024a.d(i10, z10);
                return this;
            }

            public c f() {
                return new c(this.f139024a.e());
            }

            @qj.a
            public a g(int i10) {
                this.f139024a.f(i10);
                return this;
            }

            @qj.a
            public a h(int... iArr) {
                this.f139024a.g(iArr);
                return this;
            }

            @qj.a
            public a i(int i10, boolean z10) {
                this.f139024a.h(i10, z10);
                return this;
            }

            public a() {
                this.f139024a = new l0.b();
            }

            public a(c cVar) {
                l0.b bVar = new l0.b();
                this.f139024a = bVar;
                bVar.b(cVar.f139022a);
            }
        }

        @x4.m1
        public static c e(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f139021c);
            if (integerArrayList == null) {
                return f139020b;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.f();
        }

        @x4.m1
        public a b() {
            return new a();
        }

        public boolean c(int i10) {
            return this.f139022a.a(i10);
        }

        public boolean d(int... iArr) {
            return this.f139022a.c(iArr);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f139022a.equals(((c) obj).f139022a);
            }
            return false;
        }

        public int f(int i10) {
            return this.f139022a.d(i10);
        }

        public int g() {
            return this.f139022a.e();
        }

        @x4.m1
        public Bundle h() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < this.f139022a.e(); i10++) {
                arrayList.add(Integer.valueOf(this.f139022a.d(i10)));
            }
            bundle.putIntegerArrayList(f139021c, arrayList);
            return bundle;
        }

        public int hashCode() {
            return this.f139022a.hashCode();
        }

        public c(l0 l0Var) {
            this.f139022a = l0Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f139025a;

        @x4.m1
        public f(l0 l0Var) {
            this.f139025a = l0Var;
        }

        public boolean a(int i10) {
            return this.f139025a.a(i10);
        }

        public boolean b(f fVar) {
            return this.f139025a.b(fVar.f139025a);
        }

        public boolean c(int... iArr) {
            return this.f139025a.c(iArr);
        }

        public int d(int i10) {
            return this.f139025a.d(i10);
        }

        public int e() {
            return this.f139025a.e();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f139025a.equals(((f) obj).f139025a);
            }
            return false;
        }

        public int hashCode() {
            return this.f139025a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g {
        @x4.m1
        void C(k1 k1Var);

        void J(s1 s1Var);

        void K(long j10);

        void M(u1 u1Var, f fVar);

        void P(i1 i1Var);

        void Q(u4.i iVar);

        void b0(c cVar);

        @x4.m1
        void c(int i10);

        void d0(d5 d5Var);

        void g0(@Nullable r1 r1Var);

        void j0(@Nullable c1 c1Var, int i10);

        void n(int i10, boolean z10);

        void o0(g0 g0Var);

        @x4.m1
        @Deprecated
        void onCues(List<w4.a> list);

        void onIsLoadingChanged(boolean z10);

        void onIsPlayingChanged(boolean z10);

        @x4.m1
        @Deprecated
        void onLoadingChanged(boolean z10);

        void onPlayWhenReadyChanged(boolean z10, int i10);

        void onPlaybackStateChanged(int i10);

        void onPlaybackSuppressionReasonChanged(int i10);

        void onPlayerError(r1 r1Var);

        @x4.m1
        @Deprecated
        void onPlayerStateChanged(boolean z10, int i10);

        @x4.m1
        @Deprecated
        void onPositionDiscontinuity(int i10);

        void onPositionDiscontinuity(k kVar, k kVar2, int i10);

        void onRenderedFirstFrame();

        void onRepeatModeChanged(int i10);

        void onShuffleModeEnabledChanged(boolean z10);

        void onSkipSilenceEnabledChanged(boolean z10);

        void onSurfaceSizeChanged(int i10, int i11);

        void onTimelineChanged(y4 y4Var, int i10);

        void onTracksChanged(h5 h5Var);

        void onVideoSizeChanged(o5 o5Var);

        void onVolumeChanged(float f10);

        void t(long j10);

        void u0(i1 i1Var);

        void v(w4.e eVar);

        void z(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface i {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface j {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class k {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @k.h1
        public static final String f139026k = x4.b2.k1(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f139027l = x4.b2.k1(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @k.h1
        public static final String f139028m = x4.b2.k1(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @k.h1
        public static final String f139029n = x4.b2.k1(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @k.h1
        public static final String f139030o = x4.b2.k1(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f139031p = x4.b2.k1(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f139032q = x4.b2.k1(6);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Object f139033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x4.m1
        @Deprecated
        public final int f139034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f139035c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        @x4.m1
        public final c1 f139036d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Object f139037e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f139038f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f139039g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f139040h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f139041i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f139042j;

        @x4.m1
        @Deprecated
        public k(@Nullable Object obj, int i10, @Nullable Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this(obj, i10, c1.f138136j, obj2, i11, j10, j11, i12, i13);
        }

        @x4.m1
        @Deprecated
        public static k c(Bundle bundle) {
            return d(bundle, 9);
        }

        @x4.m1
        public static k d(Bundle bundle, int i10) {
            int iMax = Math.max(0, bundle.getInt(f139026k, 0));
            Bundle bundle2 = bundle.getBundle(f139027l);
            return new k(null, iMax, bundle2 == null ? null : c1.c(bundle2, i10), null, Math.max(0, bundle.getInt(f139028m, 0)), bundle.getLong(f139029n, 0L), bundle.getLong(f139030o, 0L), bundle.getInt(f139031p, -1), bundle.getInt(f139032q, -1));
        }

        @x4.m1
        public boolean a(k kVar) {
            return this.f139035c == kVar.f139035c && this.f139038f == kVar.f139038f && this.f139039g == kVar.f139039g && this.f139040h == kVar.f139040h && this.f139041i == kVar.f139041i && this.f139042j == kVar.f139042j && Objects.equals(this.f139036d, kVar.f139036d);
        }

        @x4.m1
        public k b(boolean z10, boolean z11) {
            if (z10 && z11) {
                return this;
            }
            return new k(this.f139033a, z11 ? this.f139035c : 0, z10 ? this.f139036d : null, this.f139037e, z11 ? this.f139038f : 0, z10 ? this.f139039g : 0L, z10 ? this.f139040h : 0L, z10 ? this.f139041i : -1, z10 ? this.f139042j : -1);
        }

        @x4.m1
        @Deprecated
        public Bundle e() {
            return f(Integer.MAX_VALUE);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && k.class == obj.getClass()) {
                k kVar = (k) obj;
                if (a(kVar) && Objects.equals(this.f139033a, kVar.f139033a) && Objects.equals(this.f139037e, kVar.f139037e)) {
                    return true;
                }
            }
            return false;
        }

        @x4.m1
        public Bundle f(int i10) {
            Bundle bundle = new Bundle();
            if (i10 < 3 || this.f139035c != 0) {
                bundle.putInt(f139026k, this.f139035c);
            }
            c1 c1Var = this.f139036d;
            if (c1Var != null) {
                bundle.putBundle(f139027l, c1Var.g(i10));
            }
            if (i10 < 3 || this.f139038f != 0) {
                bundle.putInt(f139028m, this.f139038f);
            }
            if (i10 < 3 || this.f139039g != 0) {
                bundle.putLong(f139029n, this.f139039g);
            }
            if (i10 < 3 || this.f139040h != 0) {
                bundle.putLong(f139030o, this.f139040h);
            }
            int i11 = this.f139041i;
            if (i11 != -1) {
                bundle.putInt(f139031p, i11);
            }
            int i12 = this.f139042j;
            if (i12 != -1) {
                bundle.putInt(f139032q, i12);
            }
            return bundle;
        }

        public int hashCode() {
            return Objects.hash(this.f139033a, Integer.valueOf(this.f139035c), this.f139036d, this.f139037e, Integer.valueOf(this.f139038f), Long.valueOf(this.f139039g), Long.valueOf(this.f139040h), Integer.valueOf(this.f139041i), Integer.valueOf(this.f139042j));
        }

        public String toString() {
            String str = "mediaItem=" + this.f139035c + ", period=" + this.f139038f + ", pos=" + this.f139039g;
            if (this.f139041i == -1) {
                return str;
            }
            return str + ", contentPos=" + this.f139040h + ", adGroup=" + this.f139041i + ", ad=" + this.f139042j;
        }

        @x4.m1
        public k(@Nullable Object obj, int i10, @Nullable c1 c1Var, @Nullable Object obj2, int i11, long j10, long j11, int i12, int i13) {
            zi.l0.d(i10 >= 0);
            zi.l0.d(i11 >= 0);
            this.f139033a = obj;
            this.f139034b = i10;
            this.f139035c = i10;
            this.f139036d = c1Var;
            this.f139037e = obj2;
            this.f139038f = i11;
            this.f139039g = j10;
            this.f139040h = j11;
            this.f139041i = i12;
            this.f139042j = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface l {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface m {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface n {
    }

    long A();

    long B();

    long C();

    boolean C0();

    void D(List<c1> list, int i10, long j10);

    long E();

    @Nullable
    c1 E0();

    i1 F();

    void G(int i10, int i11);

    int G0();

    long H();

    void I();

    void J(List<c1> list);

    void K(boolean z10, int i10);

    int L();

    boolean L0();

    void M();

    Looper M0();

    @x4.m1
    x4.y0 N();

    void N0(int i10, c1 c1Var);

    void O(int i10);

    void P();

    void P0(c1 c1Var);

    void Q0(c1 c1Var, boolean z10);

    void R0(c1 c1Var);

    void S(int i10);

    void S0(c1 c1Var, long j10);

    int T();

    void T0(d5 d5Var);

    void U0(i1 i1Var);

    int V();

    void W();

    void W0(u4.i iVar, boolean z10);

    c X();

    void Y(@k.e0(from = 0) int i10, int i11);

    @x4.m1
    @Deprecated
    boolean Y0();

    boolean Z();

    void Z0(g gVar);

    @Nullable
    r1 a();

    void a0(int i10, List<c1> list);

    void a1(g gVar);

    u4.i b();

    int b0();

    void c(s1 s1Var);

    void c0(int i10, int i11, int i12);

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(@Nullable Surface surface);

    void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void clearVideoTextureView(@Nullable TextureView textureView);

    void d0(List<c1> list);

    void e(@k.w(from = 0.0d, fromInclusive = false) float f10);

    void e0();

    i1 f0();

    @Deprecated
    void g(boolean z10);

    long g0();

    @x4.m1
    int getAudioSessionId();

    @k.e0(from = 0, to = 100)
    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    @Nullable
    @x4.m1
    Object getCurrentManifest();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    y4 getCurrentTimeline();

    @x4.m1
    @Deprecated
    int getCurrentWindowIndex();

    g0 getDeviceInfo();

    long getDuration();

    @x4.m1
    @Deprecated
    int getNextWindowIndex();

    boolean getPlayWhenReady();

    s1 getPlaybackParameters();

    int getPlaybackState();

    @x4.m1
    @Deprecated
    int getPreviousWindowIndex();

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    @k.w(from = 0.0d, to = 1.0d)
    float getVolume();

    @Deprecated
    void h();

    @k.e0(from = 0)
    int i();

    @x4.m1
    @Deprecated
    boolean isCurrentWindowDynamic();

    @x4.m1
    @Deprecated
    boolean isCurrentWindowSeekable();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    boolean j();

    @Deprecated
    void k();

    boolean k0();

    void l(int i10, int i11, List<c1> list);

    void l0();

    w4.e m();

    o5 n();

    @Deprecated
    void o(@k.e0(from = 0) int i10);

    boolean o0(int i10);

    long p();

    void pause();

    void play();

    void prepare();

    void q(List<c1> list, boolean z10);

    void r(int i10);

    void r0();

    void release();

    void s(int i10, int i11);

    c1 s0(int i10);

    void seekTo(int i10, long j10);

    void seekTo(long j10);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int i10);

    void setPlayWhenReady(boolean z10);

    void setRepeatMode(int i10);

    void setShuffleModeEnabled(boolean z10);

    void setVideoSurface(@Nullable Surface surface);

    void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void setVideoTextureView(@Nullable TextureView textureView);

    void setVolume(@k.w(from = 0.0d, to = 1.0d) float f10);

    void stop();

    void u();

    void v(int i10, c1 c1Var);

    h5 w();

    boolean x();

    d5 y();

    boolean y0();
}
