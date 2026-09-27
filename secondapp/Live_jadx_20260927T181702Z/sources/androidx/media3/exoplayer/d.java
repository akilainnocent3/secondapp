package androidx.media3.exoplayer;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import cj.v6;
import cj.x6;
import com.ironsource.C4235d4;
import d5.q3;
import e5.k4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import k.a0;
import k.h1;
import s5.j2;
import s5.s0;
import u4.c1;
import u4.y4;
import x4.b2;
import x4.d0;
import x4.m1;
import z5.w;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public class d implements i {
    public static final int A = 2000;
    public static final int B = 1000;
    public static final int C = -1;
    public static final boolean D = false;
    public static final boolean E = true;
    public static final int F = 0;
    public static final boolean G = false;
    public static final int H = 131072000;
    public static final int I = 19660800;
    public static final int J = 13107200;
    public static final int K = 131072;
    public static final int L = 131072;
    public static final int M = 131072;
    public static final int N = 26214400;
    public static final int O = 144310272;
    public static final int P = 13107200;
    public static final int Q = 210239488;
    public static final int R = 144179200;
    public static final v6<String> S = v6.G(C4235d4.i.f61404b, "content", "data", "android.resource", "rawresource", "asset");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f13766u = 50000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f13767v = 1000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f13768w = 50000;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f13769x = 50000;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f13770y = 1000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f13771z = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y4.d f13772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y4.b f13773c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z5.l f13774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13775e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f13776f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f13777g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f13778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f13779i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f13780j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f13781k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f13782l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f13783m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f13784n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f13785o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f13786p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f13787q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x6<String, Integer> f13788r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ConcurrentHashMap<k4, c> f13789s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f13790t;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<String, Integer> f13791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public z5.l f13792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13793c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f13794d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13797g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13798h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13799i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f13800j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f13801k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f13802l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f13803m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f13804n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f13805o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f13806p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @Nullable
        public Boolean f13807q;

        public a() {
            HashMap<String, Integer> map = new HashMap<>();
            this.f13791a = map;
            map.put(k4.f80223d.f80224a, Integer.valueOf(d.R));
            this.f13793c = 50000;
            this.f13794d = 1000;
            this.f13795e = 50000;
            this.f13796f = 50000;
            this.f13797g = 1000;
            this.f13798h = 1000;
            this.f13799i = 2000;
            this.f13800j = 1000;
            this.f13801k = -1;
            this.f13802l = false;
            this.f13803m = true;
            this.f13804n = 0;
            this.f13805o = false;
        }

        public d a() {
            l0.g0(!this.f13806p);
            this.f13806p = true;
            if (this.f13792b == null) {
                this.f13792b = new z5.l(true, 65536);
            }
            Boolean bool = this.f13807q;
            if (bool != null && bool.booleanValue()) {
                this.f13794d = this.f13793c;
                this.f13796f = this.f13795e;
                this.f13798h = this.f13797g;
                this.f13800j = this.f13799i;
                this.f13803m = this.f13802l;
            }
            return new d(this.f13792b, this.f13793c, this.f13794d, this.f13795e, this.f13796f, this.f13797g, this.f13798h, this.f13799i, this.f13800j, this.f13801k, this.f13802l, this.f13803m, this.f13804n, this.f13805o, this.f13791a);
        }

        @qj.a
        public a b(z5.l lVar) {
            l0.g0(!this.f13806p);
            this.f13792b = lVar;
            return this;
        }

        @qj.a
        public a c(int i10, boolean z10) {
            l0.g0(!this.f13806p);
            d.u(i10, 0, "backBufferDurationMs", "0");
            this.f13804n = i10;
            this.f13805o = z10;
            return this;
        }

        @qj.a
        public a d(int i10, int i11, int i12, int i13) {
            l0.g0(!this.f13806p);
            d.u(i12, 0, "bufferForPlaybackMs", "0");
            d.u(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
            d.u(i10, i12, "minBufferMs", "bufferForPlaybackMs");
            d.u(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            d.u(i11, i10, "maxBufferMs", "minBufferMs");
            this.f13793c = i10;
            this.f13795e = i11;
            this.f13797g = i12;
            this.f13799i = i13;
            this.f13794d = i10;
            this.f13796f = i11;
            this.f13798h = i12;
            this.f13800j = i13;
            if (this.f13807q == null) {
                this.f13807q = Boolean.TRUE;
            }
            return this;
        }

        @qj.a
        public a e(int i10, int i11, int i12, int i13) {
            l0.g0(!this.f13806p);
            d.u(i12, 0, "bufferForPlaybackMs", "0");
            d.u(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
            d.u(i10, i12, "minBufferMs", "bufferForPlaybackMs");
            d.u(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            d.u(i11, i10, "maxBufferMs", "minBufferMs");
            this.f13794d = i10;
            this.f13796f = i11;
            this.f13798h = i12;
            this.f13800j = i13;
            this.f13807q = Boolean.FALSE;
            return this;
        }

        @qj.a
        public a f(int i10, int i11, int i12, int i13) {
            l0.g0(!this.f13806p);
            d.u(i12, 0, "bufferForPlaybackMs", "0");
            d.u(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
            d.u(i10, i12, "minBufferMs", "bufferForPlaybackMs");
            d.u(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            d.u(i11, i10, "maxBufferMs", "minBufferMs");
            this.f13793c = i10;
            this.f13795e = i11;
            this.f13797g = i12;
            this.f13799i = i13;
            this.f13807q = Boolean.FALSE;
            return this;
        }

        @qj.a
        public a g(String str, int i10) {
            l0.g0(!this.f13806p);
            this.f13791a.put(str, Integer.valueOf(i10));
            return this;
        }

        @qj.a
        public a h(boolean z10) {
            l0.g0(!this.f13806p);
            this.f13802l = z10;
            this.f13803m = z10;
            if (this.f13807q == null) {
                this.f13807q = Boolean.TRUE;
            }
            return this;
        }

        @qj.a
        public a i(boolean z10) {
            l0.g0(!this.f13806p);
            this.f13803m = z10;
            this.f13807q = Boolean.FALSE;
            return this;
        }

        @qj.a
        public a j(boolean z10) {
            l0.g0(!this.f13806p);
            this.f13802l = z10;
            this.f13807q = Boolean.FALSE;
            return this;
        }

        @qj.a
        public a k(int i10) {
            l0.g0(!this.f13806p);
            this.f13801k = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class b implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @a0("this")
        public final HashMap<z5.a, k4> f13808a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @a0("this")
        public k4 f13809b;

        public b(k4 k4Var) {
            this.f13809b = k4Var;
        }

        @Override // z5.b
        public synchronized void a(@Nullable z5.b.a aVar) {
            d.this.f13774d.a(aVar);
            while (aVar != null) {
                c(aVar.a());
                aVar = aVar.next();
            }
        }

        @Override // z5.b
        public synchronized z5.a allocate() {
            z5.a aVarAllocate;
            aVarAllocate = d.this.f13774d.allocate();
            this.f13808a.put(aVarAllocate, this.f13809b);
            c cVar = (c) d.this.f13789s.get(this.f13809b);
            if (cVar != null) {
                cVar.c();
            }
            return aVarAllocate;
        }

        @Override // z5.b
        public synchronized void b(z5.a aVar) {
            d.this.f13774d.b(aVar);
            c(aVar);
        }

        @a0("this")
        public final void c(z5.a aVar) {
            c cVar = (c) d.this.f13789s.get((k4) l0.E(this.f13808a.remove(aVar)));
            if (cVar != null) {
                cVar.a();
            }
        }

        @Override // z5.w
        public synchronized void e(k4 k4Var) {
            this.f13809b = k4Var;
        }

        @Override // z5.b
        public synchronized int getIndividualAllocationLength() {
            return d.this.f13774d.getIndividualAllocationLength();
        }

        @Override // z5.w, z5.b
        public synchronized int getTotalBytesAllocated() {
            return d.this.F(this.f13809b);
        }

        @Override // z5.b
        public synchronized void trim() {
            d.this.f13774d.trim();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13811a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13813c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @a0("this")
        public int f13814d;

        public synchronized void a() {
            this.f13814d--;
        }

        public synchronized int b() {
            return this.f13814d;
        }

        public synchronized void c() {
            this.f13814d++;
        }
    }

    public d() {
        this(new z5.l(true, 65536), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, -1, false, true, 0, false);
    }

    public static int A(int i10, boolean z10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                if (z10) {
                    return I;
                }
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return N;
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static void u(int i10, int i11, String str, String str2) {
        l0.y(i10 >= i11, "%s cannot be less than %s", str, str2);
    }

    public final long B(boolean z10) {
        return z10 ? this.f13778h : this.f13777g;
    }

    public final long C(boolean z10) {
        return z10 ? this.f13776f : this.f13775e;
    }

    public final int D(k4 k4Var) {
        return ((c) l0.E(this.f13789s.get(k4Var))).f13813c;
    }

    public final int E(k4 k4Var) {
        Integer num = this.f13788r.get(k4Var.f80224a);
        return (num == null || num.intValue() == -1) ? this.f13783m : num.intValue();
    }

    public final int F(k4 k4Var) {
        return ((c) l0.E(this.f13789s.get(k4Var))).b() * this.f13774d.getIndividualAllocationLength();
    }

    public final boolean G(i.a aVar) {
        c1.h hVar = aVar.f14196b.w(aVar.f14196b.o(aVar.f14197c.f129489a, this.f13773c).f139111c, this.f13772b).f139132c.f138144b;
        if (hVar == null) {
            return false;
        }
        String scheme = hVar.f138245a.getScheme();
        return TextUtils.isEmpty(scheme) || S.contains(scheme);
    }

    public final boolean H(boolean z10) {
        return z10 ? this.f13785o : this.f13784n;
    }

    public final void I(k4 k4Var) {
        c cVar = this.f13789s.get(k4Var);
        if (cVar != null) {
            int i10 = cVar.f13811a - 1;
            cVar.f13811a = i10;
            if (i10 == 0) {
                this.f13789s.remove(k4Var);
                K();
            }
        }
    }

    public final void J(k4 k4Var) {
        c cVar = (c) l0.E(this.f13789s.get(k4Var));
        int iE = E(k4Var);
        if (iE == -1) {
            iE = 13107200;
        }
        cVar.f13813c = iE;
        cVar.f13812b = false;
    }

    public final void K() {
        if (this.f13789s.isEmpty()) {
            this.f13774d.c();
        } else {
            this.f13774d.d(x());
        }
    }

    @Override // androidx.media3.exoplayer.i
    public /* synthetic */ boolean a(long j10, long j11, float f10) {
        return q3.o(this, j10, j11, f10);
    }

    @Override // androidx.media3.exoplayer.i
    public /* synthetic */ boolean b(long j10, float f10, boolean z10, long j11) {
        return q3.r(this, j10, f10, z10, j11);
    }

    @Override // androidx.media3.exoplayer.i
    public /* synthetic */ boolean c(y4 y4Var, s0.b bVar, long j10, float f10, boolean z10, long j11) {
        return q3.t(this, y4Var, bVar, j10, f10, z10, j11);
    }

    @Override // androidx.media3.exoplayer.i
    public boolean d(k4 k4Var, y4 y4Var, s0.b bVar, long j10) {
        Iterator<c> it = this.f13789s.values().iterator();
        while (it.hasNext()) {
            if (it.next().f13812b) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.i
    public void e(i.a aVar, j2 j2Var, y5.w[] wVarArr) {
        int iE = E(aVar.f14195a);
        c cVar = (c) l0.E(this.f13789s.get(aVar.f14195a));
        if (iE == -1) {
            iE = v(aVar, wVarArr);
        }
        cVar.f13813c = iE;
        K();
    }

    @Override // androidx.media3.exoplayer.i
    public void f(k4 k4Var) {
        I(k4Var);
        if (this.f13789s.isEmpty()) {
            this.f13790t = -1L;
        }
    }

    @Override // androidx.media3.exoplayer.i
    public boolean g(i.a aVar) {
        k4 k4Var = aVar.f14195a;
        c cVar = (c) l0.E(this.f13789s.get(k4Var));
        boolean z10 = F(k4Var) >= D(k4Var);
        if (k4Var.equals(k4.f80223d)) {
            return !z10;
        }
        boolean zG = G(aVar);
        long jC = C(zG);
        long jB = B(zG);
        float f10 = aVar.f14200f;
        if (f10 > 1.0f) {
            jC = Math.min(b2.F0(jC, f10), jB);
        }
        long jMax = Math.max(jC, 500000L);
        long j10 = aVar.f14199e;
        if (j10 < jMax) {
            boolean z11 = H(zG) || !z10;
            cVar.f13812b = z11;
            if (!z11 && aVar.f14199e < 500000) {
                d0.n("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= jB || z10) {
            cVar.f13812b = false;
        }
        return cVar.f13812b;
    }

    @Override // androidx.media3.exoplayer.i
    public /* synthetic */ long getBackBufferDurationUs() {
        return q3.a(this);
    }

    @Override // androidx.media3.exoplayer.i
    public z5.b h(k4 k4Var) {
        return new b(k4Var);
    }

    @Override // androidx.media3.exoplayer.i
    public void i(k4 k4Var) {
        I(k4Var);
    }

    @Override // androidx.media3.exoplayer.i
    public boolean j(k4 k4Var) {
        return this.f13787q;
    }

    @Override // androidx.media3.exoplayer.i
    public /* synthetic */ void k(k4 k4Var, y4 y4Var, s0.b bVar, q[] qVarArr, j2 j2Var, y5.w[] wVarArr) {
        q3.j(this, k4Var, y4Var, bVar, qVarArr, j2Var, wVarArr);
    }

    @Override // androidx.media3.exoplayer.i
    public boolean l(i.a aVar) {
        boolean zG = G(aVar);
        long jM0 = b2.M0(aVar.f14199e, aVar.f14200f);
        long jY = aVar.f14202h ? y(zG) : z(zG);
        long j10 = aVar.f14203i;
        if (j10 != -9223372036854775807L) {
            jY = Math.min(j10 / 2, jY);
        }
        if (jY <= 0 || jM0 >= jY) {
            return true;
        }
        return !H(zG) && F(aVar.f14195a) >= D(aVar.f14195a);
    }

    @Override // androidx.media3.exoplayer.i
    public /* synthetic */ void m(q[] qVarArr, j2 j2Var, y5.w[] wVarArr) {
        q3.l(this, qVarArr, j2Var, wVarArr);
    }

    @Override // androidx.media3.exoplayer.i
    public void n(k4 k4Var) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f13790t;
        l0.h0(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f13790t = id2;
        c cVar = this.f13789s.get(k4Var);
        if (cVar == null) {
            this.f13789s.put(k4Var, new c());
        } else {
            cVar.f13811a++;
        }
        J(k4Var);
    }

    @Override // androidx.media3.exoplayer.i
    public /* synthetic */ void o(y4 y4Var, s0.b bVar, q[] qVarArr, j2 j2Var, y5.w[] wVarArr) {
        q3.k(this, y4Var, bVar, qVarArr, j2Var, wVarArr);
    }

    @Override // androidx.media3.exoplayer.i
    public /* synthetic */ void onPrepared() {
        q3.c(this);
    }

    @Override // androidx.media3.exoplayer.i
    public /* synthetic */ void onReleased() {
        q3.e(this);
    }

    @Override // androidx.media3.exoplayer.i
    public /* synthetic */ void onStopped() {
        q3.g(this);
    }

    @Override // androidx.media3.exoplayer.i
    public long p(k4 k4Var) {
        return this.f13786p;
    }

    @Override // androidx.media3.exoplayer.i
    public /* synthetic */ boolean retainBackBufferFromKeyframe() {
        return q3.m(this);
    }

    public int v(i.a aVar, y5.w[] wVarArr) {
        int iW = w(wVarArr);
        if (iW != -1) {
            return iW;
        }
        boolean zG = G(aVar);
        int iA = 0;
        for (y5.w wVar : wVarArr) {
            if (wVar != null) {
                iA += A(wVar.getTrackGroup().f138049c, zG);
            }
        }
        return b2.x(iA, 13107200, Q);
    }

    @Deprecated
    public int w(y5.w[] wVarArr) {
        return -1;
    }

    @h1
    public int x() {
        Iterator<c> it = this.f13789s.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += it.next().f13813c;
        }
        return i10;
    }

    public final long y(boolean z10) {
        return z10 ? this.f13782l : this.f13781k;
    }

    public final long z(boolean z10) {
        return z10 ? this.f13780j : this.f13779i;
    }

    public d(z5.l lVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, boolean z11, int i19, boolean z12, Map<String, Integer> map) {
        u(i14, 0, "bufferForPlaybackMs", "0");
        u(i15, 0, "bufferForPlaybackForLocalPlaybackMs", "0");
        u(i16, 0, "bufferForPlaybackAfterRebufferMs", "0");
        u(i17, 0, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", "0");
        u(i10, i14, "minBufferMs", "bufferForPlaybackMs");
        u(i11, i15, "minBufferForLocalPlaybackMs", "bufferForPlaybackForLocalPlaybackMs");
        u(i10, i16, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        u(i11, i17, "minBufferForLocalPlaybackMs", "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        u(i12, i10, "maxBufferMs", "minBufferMs");
        u(i13, i11, "maxBufferForLocalPlaybackMs", "minBufferForLocalPlaybackMs");
        u(i19, 0, "backBufferDurationMs", "0");
        this.f13772b = new y4.d();
        this.f13773c = new y4.b();
        this.f13774d = lVar;
        this.f13775e = b2.N1(i10);
        this.f13776f = b2.N1(i11);
        this.f13777g = b2.N1(i12);
        this.f13778h = b2.N1(i13);
        this.f13779i = b2.N1(i14);
        this.f13780j = b2.N1(i15);
        this.f13781k = b2.N1(i16);
        this.f13782l = b2.N1(i17);
        this.f13783m = i18;
        this.f13784n = z10;
        this.f13785o = z11;
        this.f13786p = b2.N1(i19);
        this.f13787q = z12;
        this.f13789s = new ConcurrentHashMap<>();
        this.f13788r = x6.m(map);
        this.f13790t = -1L;
    }

    public d(z5.l lVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z10, boolean z11, int i19, boolean z12) {
        this(lVar, i10, i11, i12, i13, i14, i15, i16, i17, i18, z10, z11, i19, z12, x6.y());
    }
}
