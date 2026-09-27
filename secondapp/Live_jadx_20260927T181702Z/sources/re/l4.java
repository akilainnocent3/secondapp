package re;

import android.os.Bundle;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface l4 {
    public static final int A = 0;
    public static final int A0 = 14;
    public static final int B = 1;
    public static final int B0 = 15;
    public static final int C = 2;
    public static final int C0 = 16;
    public static final int D = 3;
    public static final int D0 = 17;
    public static final int E = 0;

    @Deprecated
    public static final int E0 = 18;
    public static final int F = 1;
    public static final int F0 = 18;
    public static final int G = 2;

    @Deprecated
    public static final int G0 = 19;
    public static final int H = 3;
    public static final int H0 = 19;
    public static final int I = 4;
    public static final int I0 = 31;
    public static final int J = 5;
    public static final int J0 = 20;
    public static final int K = 6;
    public static final int K0 = 21;
    public static final int L = 7;
    public static final int L0 = 22;
    public static final int M = 8;
    public static final int M0 = 23;
    public static final int N = 9;
    public static final int N0 = 24;
    public static final int O = 10;

    @Deprecated
    public static final int O0 = 25;
    public static final int P = 11;
    public static final int P0 = 33;
    public static final int Q = 12;

    @Deprecated
    public static final int Q0 = 26;
    public static final int R = 13;
    public static final int R0 = 34;
    public static final int S = 14;
    public static final int S0 = 27;
    public static final int T = 15;
    public static final int T0 = 28;
    public static final int U = 16;
    public static final int U0 = 29;
    public static final int V = 17;
    public static final int V0 = 30;
    public static final int W = 18;
    public static final int W0 = 32;
    public static final int X = 19;
    public static final int X0 = -1;
    public static final int Y = 20;
    public static final int Z = 21;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f125986a0 = 22;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f125987b0 = 23;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f125988c = 1;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f125989c0 = 24;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f125990d = 2;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f125991d0 = 25;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f125992e = 3;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final int f125993e0 = 26;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f125994f = 4;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f125995f0 = 27;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f125996g = 1;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final int f125997g0 = 28;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f125998h = 2;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int f125999h0 = 29;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f126000i = 3;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final int f126001i0 = 30;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f126002j = 4;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final int f126003j0 = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f126004k = 5;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f126005k0 = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f126006l = 6;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f126007l0 = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f126008m = 0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f126009m0 = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f126010n = 1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f126011n0 = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f126012o = 2;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    @Deprecated
    public static final int f126013o0 = 5;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f126014p = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f126015p0 = 6;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f126016q = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Deprecated
    public static final int f126017q0 = 6;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f126018r = 2;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f126019r0 = 7;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f126020s = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f126021s0 = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f126022t = 1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Deprecated
    public static final int f126023t0 = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f126024u = 2;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f126025u0 = 9;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f126026v = 3;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f126027v0 = 10;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f126028w = 4;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Deprecated
    public static final int f126029w0 = 10;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f126030x = 5;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f126031x0 = 11;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f126032y = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f126033y0 = 12;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f126034z = 1;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f126035z0 = 13;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements re.j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f126036c = new a().f();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f126037d = eh.o1.R0(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final re.j.a<c> f126038e = new re.j.a() { // from class: re.m4
            @Override // re.j.a
            public final j fromBundle(Bundle bundle) {
                return l4.c.f(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final eh.w f126039b;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int[] f126040b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final eh.w.b f126041a;

            @qj.a
            public a a(int i10) {
                this.f126041a.a(i10);
                return this;
            }

            @qj.a
            public a b(c cVar) {
                this.f126041a.b(cVar.f126039b);
                return this;
            }

            @qj.a
            public a c(int... iArr) {
                this.f126041a.c(iArr);
                return this;
            }

            @qj.a
            public a d() {
                this.f126041a.c(f126040b);
                return this;
            }

            @qj.a
            public a e(int i10, boolean z10) {
                this.f126041a.d(i10, z10);
                return this;
            }

            public c f() {
                return new c(this.f126041a.e());
            }

            @qj.a
            public a g(int i10) {
                this.f126041a.f(i10);
                return this;
            }

            @qj.a
            public a h(int... iArr) {
                this.f126041a.g(iArr);
                return this;
            }

            @qj.a
            public a i(int i10, boolean z10) {
                this.f126041a.h(i10, z10);
                return this;
            }

            public a() {
                this.f126041a = new eh.w.b();
            }

            public a(c cVar) {
                eh.w.b bVar = new eh.w.b();
                this.f126041a = bVar;
                bVar.b(cVar.f126039b);
            }
        }

        public static c f(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f126037d);
            if (integerArrayList == null) {
                return f126036c;
            }
            a aVar = new a();
            for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
                aVar.a(integerArrayList.get(i10).intValue());
            }
            return aVar.f();
        }

        public a c() {
            return new a();
        }

        public boolean d(int i10) {
            return this.f126039b.a(i10);
        }

        public boolean e(int... iArr) {
            return this.f126039b.b(iArr);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.f126039b.equals(((c) obj).f126039b);
            }
            return false;
        }

        public int g(int i10) {
            return this.f126039b.c(i10);
        }

        public int h() {
            return this.f126039b.d();
        }

        public int hashCode() {
            return this.f126039b.hashCode();
        }

        @Override // re.j
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i10 = 0; i10 < this.f126039b.d(); i10++) {
                arrayList.add(Integer.valueOf(this.f126039b.c(i10)));
            }
            bundle.putIntegerArrayList(f126037d, arrayList);
            return bundle;
        }

        public c(eh.w wVar) {
            this.f126039b = wVar;
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
        public final eh.w f126042a;

        public f(eh.w wVar) {
            this.f126042a = wVar;
        }

        public boolean a(int i10) {
            return this.f126042a.a(i10);
        }

        public boolean b(int... iArr) {
            return this.f126042a.b(iArr);
        }

        public int c(int i10) {
            return this.f126042a.c(i10);
        }

        public int d() {
            return this.f126042a.d();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.f126042a.equals(((f) obj).f126042a);
            }
            return false;
        }

        public int hashCode() {
            return this.f126042a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g {
        void E(og.f fVar);

        void K(long j10);

        void R(@Nullable x2 x2Var, int i10);

        void T(te.e eVar);

        void V(yg.c0 c0Var);

        void Y(l4 l4Var, f fVar);

        void c(int i10);

        void c0(h3 h3Var);

        void f0(q qVar);

        void i0(@Nullable h4 h4Var);

        void k0(c cVar);

        void m0(h3 h3Var);

        void n(int i10, boolean z10);

        @Deprecated
        void onCues(List<og.b> list);

        void onIsLoadingChanged(boolean z10);

        void onIsPlayingChanged(boolean z10);

        @Deprecated
        void onLoadingChanged(boolean z10);

        void onPlayWhenReadyChanged(boolean z10, int i10);

        void onPlaybackStateChanged(int i10);

        void onPlaybackSuppressionReasonChanged(int i10);

        void onPlayerError(h4 h4Var);

        @Deprecated
        void onPlayerStateChanged(boolean z10, int i10);

        @Deprecated
        void onPositionDiscontinuity(int i10);

        void onPositionDiscontinuity(k kVar, k kVar2, int i10);

        void onRenderedFirstFrame();

        void onRepeatModeChanged(int i10);

        void onShuffleModeEnabledChanged(boolean z10);

        void onSkipSilenceEnabledChanged(boolean z10);

        void onSurfaceSizeChanged(int i10, int i11);

        void onTimelineChanged(y7 y7Var, int i10);

        void onVolumeChanged(float f10);

        void q(k4 k4Var);

        void q0(d8 d8Var);

        void r(fh.b0 b0Var);

        void t(long j10);

        void y(Metadata metadata);

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
    public static final class k implements re.j {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f126043l = eh.o1.R0(0);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f126044m = eh.o1.R0(1);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f126045n = eh.o1.R0(2);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f126046o = eh.o1.R0(3);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f126047p = eh.o1.R0(4);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f126048q = eh.o1.R0(5);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f126049r = eh.o1.R0(6);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final re.j.a<k> f126050s = new re.j.a() { // from class: re.o4
            @Override // re.j.a
            public final j fromBundle(Bundle bundle) {
                return l4.k.b(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Object f126051b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public final int f126052c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f126053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final x2 f126054e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Object f126055f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f126056g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f126057h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f126058i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f126059j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f126060k;

        @Deprecated
        public k(@Nullable Object obj, int i10, @Nullable Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this(obj, i10, x2.f127019k, obj2, i11, j10, j11, i12, i13);
        }

        public static k b(Bundle bundle) {
            int i10 = bundle.getInt(f126043l, 0);
            Bundle bundle2 = bundle.getBundle(f126044m);
            return new k(null, i10, bundle2 == null ? null : (x2) x2.f127026r.fromBundle(bundle2), null, bundle.getInt(f126045n, 0), bundle.getLong(f126046o, 0L), bundle.getLong(f126047p, 0L), bundle.getInt(f126048q, -1), bundle.getInt(f126049r, -1));
        }

        public Bundle c(boolean z10, boolean z11) {
            Bundle bundle = new Bundle();
            bundle.putInt(f126043l, z11 ? this.f126053d : 0);
            x2 x2Var = this.f126054e;
            if (x2Var != null && z10) {
                bundle.putBundle(f126044m, x2Var.toBundle());
            }
            bundle.putInt(f126045n, z11 ? this.f126056g : 0);
            bundle.putLong(f126046o, z10 ? this.f126057h : 0L);
            bundle.putLong(f126047p, z10 ? this.f126058i : 0L);
            bundle.putInt(f126048q, z10 ? this.f126059j : -1);
            bundle.putInt(f126049r, z10 ? this.f126060k : -1);
            return bundle;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && k.class == obj.getClass()) {
                k kVar = (k) obj;
                if (this.f126053d == kVar.f126053d && this.f126056g == kVar.f126056g && this.f126057h == kVar.f126057h && this.f126058i == kVar.f126058i && this.f126059j == kVar.f126059j && this.f126060k == kVar.f126060k && zi.f0.a(this.f126051b, kVar.f126051b) && zi.f0.a(this.f126055f, kVar.f126055f) && zi.f0.a(this.f126054e, kVar.f126054e)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return zi.f0.b(this.f126051b, Integer.valueOf(this.f126053d), this.f126054e, this.f126055f, Integer.valueOf(this.f126056g), Long.valueOf(this.f126057h), Long.valueOf(this.f126058i), Integer.valueOf(this.f126059j), Integer.valueOf(this.f126060k));
        }

        @Override // re.j
        public Bundle toBundle() {
            return c(true, true);
        }

        public k(@Nullable Object obj, int i10, @Nullable x2 x2Var, @Nullable Object obj2, int i11, long j10, long j11, int i12, int i13) {
            this.f126051b = obj;
            this.f126052c = i10;
            this.f126053d = i10;
            this.f126054e = x2Var;
            this.f126055f = obj2;
            this.f126056g = i11;
            this.f126057h = j10;
            this.f126058i = j11;
            this.f126059j = i12;
            this.f126060k = i13;
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

    void D(List<x2> list, int i10, long j10);

    long E();

    @Nullable
    x2 E0();

    h3 F();

    void G(int i10, int i11);

    int G0();

    long H();

    void I();

    void J(List<x2> list);

    void K(boolean z10, int i10);

    int L();

    boolean L0();

    void M();

    Looper M0();

    eh.y0 N();

    void O(int i10);

    void P();

    void S(int i10);

    int T();

    int V();

    void W();

    c X();

    void Y(@k.e0(from = 0) int i10, int i11);

    @Deprecated
    boolean Y0();

    boolean Z();

    @Deprecated
    boolean Z0();

    @Nullable
    h4 a();

    void a0(int i10, List<x2> list);

    void a1(x2 x2Var);

    te.e b();

    int b0();

    @Deprecated
    void b1();

    void c(k4 k4Var);

    void c0(int i10, int i11, int i12);

    void c1(g gVar);

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(@Nullable Surface surface);

    void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

    void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

    void clearVideoTextureView(@Nullable TextureView textureView);

    void d0(List<x2> list);

    void d1(yg.c0 c0Var);

    void e(@k.w(from = 0.0d, fromInclusive = false) float f10);

    void e0();

    void e1(g gVar);

    h3 f0();

    @Deprecated
    void g(boolean z10);

    long g0();

    @Deprecated
    void g1();

    @k.e0(from = 0, to = 100)
    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    @Nullable
    Object getCurrentManifest();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    y7 getCurrentTimeline();

    @Deprecated
    int getCurrentWindowIndex();

    q getDeviceInfo();

    long getDuration();

    @Deprecated
    int getNextWindowIndex();

    boolean getPlayWhenReady();

    k4 getPlaybackParameters();

    int getPlaybackState();

    @Deprecated
    int getPreviousWindowIndex();

    int getRepeatMode();

    boolean getShuffleModeEnabled();

    @k.w(from = 0.0d, to = 1.0d)
    float getVolume();

    @Deprecated
    void h();

    void h1(int i10, x2 x2Var);

    @Deprecated
    boolean hasNext();

    @Deprecated
    boolean hasPrevious();

    @k.e0(from = 0)
    int i();

    void i1(x2 x2Var);

    @Deprecated
    boolean isCurrentWindowDynamic();

    @Deprecated
    boolean isCurrentWindowSeekable();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    boolean j();

    @Deprecated
    void k();

    boolean k0();

    void k1(x2 x2Var, long j10);

    void l(int i10, int i11, List<x2> list);

    og.f m();

    void m1(x2 x2Var, boolean z10);

    fh.b0 n();

    @Deprecated
    void next();

    @Deprecated
    void o(@k.e0(from = 0) int i10);

    boolean o0(int i10);

    long p();

    void pause();

    void play();

    void prepare();

    @Deprecated
    void previous();

    void q(List<x2> list, boolean z10);

    void r(int i10);

    void release();

    void s(int i10, int i11);

    x2 s0(int i10);

    @Deprecated
    boolean s1();

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

    void v1(int i10, x2 x2Var);

    d8 w();

    void w1(h3 h3Var);

    boolean x();

    yg.c0 y();

    boolean y0();
}
