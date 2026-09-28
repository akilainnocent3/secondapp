package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.d;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import defpackage.bjs;
import defpackage.bkg0;
import defpackage.br10;
import defpackage.c150;
import defpackage.cdl;
import defpackage.cft;
import defpackage.co10;
import defpackage.d850;
import defpackage.e5d;
import defpackage.ekv;
import defpackage.eo10;
import defpackage.eoa;
import defpackage.f850;
import defpackage.fm20;
import defpackage.fqe0;
import defpackage.fw1;
import defpackage.gyg;
import defpackage.h32;
import defpackage.hxg;
import defpackage.i42;
import defpackage.i5d;
import defpackage.ib5;
import defpackage.iuh;
import defpackage.j00;
import defpackage.jrh0;
import defpackage.kxg;
import defpackage.lgh0;
import defpackage.ljg0;
import defpackage.lxg;
import defpackage.ly0;
import defpackage.mi8;
import defpackage.mxg;
import defpackage.n3i0;
import defpackage.nad;
import defpackage.njv;
import defpackage.nkv;
import defpackage.nyg;
import defpackage.o4c;
import defpackage.ojv;
import defpackage.oyg;
import defpackage.pcn;
import defpackage.pid;
import defpackage.pxg;
import defpackage.q480;
import defpackage.qjv;
import defpackage.qxf0;
import defpackage.r21;
import defpackage.r7n;
import defpackage.rjg0;
import defpackage.rwg;
import defpackage.s4i0;
import defpackage.so10;
import defpackage.sp10;
import defpackage.t5i0;
import defpackage.tb90;
import defpackage.tcn;
import defpackage.tjg0;
import defpackage.tx5;
import defpackage.ujg0;
import defpackage.uov;
import defpackage.v26;
import defpackage.v5i0;
import defpackage.vs1;
import defpackage.vw90;
import defpackage.wce;
import defpackage.xwi0;
import defpackage.xz;
import defpackage.yf3;
import defpackage.z6j0;
import defpackage.zr70;
import defpackage.ztu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i42 implements ExoPlayer {
    public final b A;
    public final androidx.media3.exoplayer.a B;
    public final xwi0 C;
    public final z6j0 D;
    public final long E;
    public final vs1<Integer> F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public tcn<Integer> M;
    public final zr70 N;
    public final q480 O;
    public tb90 P;
    public final ExoPlayer.c Q;
    public so10.a R;
    public qjv S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public SphericalGLSurfaceView W;
    public boolean X;
    public TextureView Y;
    public final int Z;
    public vw90 a0;
    public final ujg0 b;
    public r21 b0;
    public final so10.a c;
    public float c0;
    public final eoa d = new eoa();
    public boolean d0;
    public final Context e;
    public o4c e0;
    public final d f;
    public final boolean f0;
    public final k[] g;
    public boolean g0;
    public final k[] h;
    public final int h0;
    public final tjg0 i;
    public boolean i0;
    public final cdl j;
    public v5i0 j0;
    public final kxg k;
    public qjv k0;
    public final e l;
    public co10 l0;
    public final bjs<so10.c> m;
    public int m0;
    public final CopyOnWriteArraySet<ExoPlayer.a> n;
    public long n0;
    public final qxf0.b o;
    public final ArrayList p;
    public final boolean q;
    public final ekv.a r;
    public final xz s;
    public final Looper t;
    public final fw1 u;
    public final long v;
    public final long w;
    public final long x;
    public final fqe0 y;
    public final a z;

    public final class a implements t5i0, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.b, androidx.media3.exoplayer.a.b, ExoPlayer.a {
        public a() {
        }

        @Override // defpackage.t5i0
        public final void a(final v5i0 v5i0Var) {
            d dVar = d.this;
            dVar.j0 = v5i0Var;
            dVar.m.f(25, new bjs.a() { // from class: fyg
                @Override // bjs.a
                public final void invoke(Object obj) {
                    ((so10.c) obj).a(v5i0Var);
                }
            });
        }

        @Override // defpackage.t5i0
        public final void b(e5d e5dVar) {
            d.this.s.b(e5dVar);
        }

        @Override // defpackage.t5i0
        public final void c(androidx.media3.common.a aVar, i5d i5dVar) {
            d.this.s.c(aVar, i5dVar);
        }

        @Override // defpackage.t5i0
        public final void d(String str) {
            d.this.s.d(str);
        }

        @Override // defpackage.t5i0
        public final void e(long j, String str, long j2) {
            d.this.s.e(j, str, j2);
        }

        @Override // defpackage.t5i0
        public final void f(Exception exc) {
            d.this.s.f(exc);
        }

        @Override // defpackage.t5i0
        public final void g(int i, long j) {
            d.this.s.g(i, j);
        }

        @Override // defpackage.t5i0
        public final void h(e5d e5dVar) {
            d.this.s.h(e5dVar);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.b
        public final void i(Surface surface) {
            d.this.L0(surface);
        }

        @Override // defpackage.t5i0
        public final void j(int i, long j) {
            d.this.s.j(i, j);
        }

        @Override // defpackage.t5i0
        public final void k(Object obj, long j) {
            d dVar = d.this;
            dVar.s.k(obj, j);
            if (dVar.T == obj) {
                dVar.m.f(26, new gyg());
            }
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public final void l() {
            d.this.R0();
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.b
        public final void m() {
            d.this.L0(null);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Surface surface = new Surface(surfaceTexture);
            d dVar = d.this;
            dVar.L0(surface);
            dVar.U = surface;
            dVar.E0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            d dVar = d.this;
            dVar.L0(null);
            dVar.E0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            d.this.E0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            d.this.E0(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            d dVar = d.this;
            if (dVar.X) {
                dVar.L0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            d dVar = d.this;
            if (dVar.X) {
                dVar.L0(null);
            }
            dVar.E0(0, 0);
        }
    }

    public static final class b implements s4i0, v26, j.b {
        public s4i0 a;
        public v26 b;
        public s4i0 c;
        public v26 d;

        @Override // defpackage.v26
        public final void c(float[] fArr, long j) {
            v26 v26Var = this.d;
            if (v26Var != null) {
                v26Var.c(fArr, j);
            }
            v26 v26Var2 = this.b;
            if (v26Var2 != null) {
                v26Var2.c(fArr, j);
            }
        }

        @Override // defpackage.v26
        public final void d() {
            v26 v26Var = this.d;
            if (v26Var != null) {
                v26Var.d();
            }
            v26 v26Var2 = this.b;
            if (v26Var2 != null) {
                v26Var2.d();
            }
        }

        @Override // defpackage.s4i0
        public final void k(long j, long j2, androidx.media3.common.a aVar, MediaFormat mediaFormat) {
            s4i0 s4i0Var = this.c;
            if (s4i0Var != null) {
                s4i0Var.k(j, j2, aVar, mediaFormat);
            }
            s4i0 s4i0Var2 = this.a;
            if (s4i0Var2 != null) {
                s4i0Var2.k(j, j2, aVar, mediaFormat);
            }
        }

        @Override // androidx.media3.exoplayer.j.b
        public final void m(int i, Object obj) {
            if (i == 7) {
                this.a = (s4i0) obj;
                return;
            }
            if (i == 8) {
                this.b = (v26) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.c = null;
                this.d = null;
            } else {
                this.c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.d = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    public static final class c implements nkv {
        public final Object a;
        public qxf0 b;

        public c(Object obj, ztu ztuVar) {
            this.a = obj;
            this.b = ztuVar.o;
        }

        @Override // defpackage.nkv
        public final Object a() {
            return this.a;
        }

        @Override // defpackage.nkv
        public final qxf0 b() {
            return this.b;
        }
    }

    static {
        ojv.a("media3.exoplayer");
    }

    public d(ExoPlayer.b bVar) {
        try {
            cft.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + jrh0.a + "]");
            Context context = bVar.a;
            Looper looper = bVar.i;
            fqe0 fqe0Var = bVar.b;
            this.e = context.getApplicationContext();
            bVar.h.getClass();
            this.s = new nad(fqe0Var);
            this.h0 = bVar.j;
            this.b0 = bVar.k;
            this.Z = bVar.l;
            this.d0 = false;
            this.E = bVar.u;
            a aVar = new a();
            this.z = aVar;
            this.A = new b();
            Handler handler = new Handler(looper);
            f850 f850Var = (f850) bVar.c.get();
            k[] kVarArrA = f850Var.a(handler, aVar, aVar, aVar, aVar);
            this.g = kVarArrA;
            ly0.f(kVarArrA.length > 0);
            this.h = new k[kVarArrA.length];
            int i = 0;
            while (true) {
                k[] kVarArr = this.h;
                if (i >= kVarArr.length) {
                    break;
                }
                f850Var.b(this.g[i]);
                kVarArr[i] = null;
                i++;
            }
            this.i = bVar.e.get();
            this.r = bVar.d.get();
            this.u = bVar.g.get();
            this.q = bVar.m;
            this.O = bVar.n;
            this.v = bVar.p;
            this.w = bVar.q;
            this.x = bVar.r;
            this.N = bVar.o;
            this.t = looper;
            this.y = fqe0Var;
            this.f = this;
            this.m = new bjs<>(looper, fqe0Var, new bjs.b() { // from class: jxg
                @Override // bjs.b
                public final void a(Object obj, iuh iuhVar) {
                    ((so10.c) obj).I(this.a.f, new so10.b(iuhVar));
                }
            });
            this.n = new CopyOnWriteArraySet<>();
            this.p = new ArrayList();
            this.P = new tb90.a();
            this.Q = ExoPlayer.c.a;
            k[] kVarArr2 = this.g;
            this.b = new ujg0(new d850[kVarArr2.length], new oyg[kVarArr2.length], bkg0.b, null);
            this.o = new qxf0.b();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i2 = 0; i2 < 20; i2++) {
                int i3 = iArr[i2];
                ly0.f(!false);
                sparseBooleanArray.append(i3, true);
            }
            tjg0 tjg0Var = this.i;
            tjg0Var.getClass();
            if (tjg0Var instanceof pid) {
                ly0.f(!false);
                sparseBooleanArray.append(29, true);
            }
            ly0.f(!false);
            iuh iuhVar = new iuh(sparseBooleanArray);
            this.c = new so10.a(iuhVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i4 = 0; i4 < iuhVar.a.size(); i4++) {
                int iA = iuhVar.a(i4);
                ly0.f(!false);
                sparseBooleanArray2.append(iA, true);
            }
            ly0.f(!false);
            sparseBooleanArray2.append(4, true);
            ly0.f(!false);
            sparseBooleanArray2.append(10, true);
            ly0.f(!false);
            this.R = new so10.a(new iuh(sparseBooleanArray2));
            this.j = this.y.c(this.t, null);
            kxg kxgVar = new kxg(this);
            this.k = kxgVar;
            this.l0 = co10.k(this.b);
            this.s.o(this.f, this.t);
            final sp10 sp10Var = new sp10(bVar.x);
            e eVar = new e(this.e, this.g, this.h, this.i, this.b, bVar.f.get(), this.u, this.G, this.H, this.s, this.O, bVar.s, bVar.t, this.t, this.y, kxgVar, sp10Var, this.Q, this.A);
            cdl cdlVar = eVar.v;
            this.l = eVar;
            Looper looper2 = eVar.y;
            this.c0 = 1.0f;
            this.G = 0;
            qjv qjvVar = qjv.B;
            this.S = qjvVar;
            this.k0 = qjvVar;
            this.m0 = -1;
            this.e0 = o4c.c;
            this.f0 = true;
            D(this.s);
            this.u.d(new Handler(this.t), this.s);
            this.n.add(this.z);
            if (Build.VERSION.SDK_INT >= 31) {
                final Context context2 = this.e;
                final boolean z = bVar.v;
                this.y.c(eVar.y, null).i(new Runnable() { // from class: byg
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context3 = context2;
                        boolean z2 = z;
                        d dVar = this;
                        sp10 sp10Var2 = sp10Var;
                        yjv yjvVarH = yjv.h(context3);
                        if (yjvVarH == null) {
                            cft.g("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z2) {
                            dVar.s.Z(yjvVarH);
                        }
                        LogSessionId logSessionIdR = yjvVarH.r();
                        synchronized (sp10Var2) {
                            sp10.a aVar2 = sp10Var2.b;
                            aVar2.getClass();
                            aVar2.a(logSessionIdR);
                        }
                    }
                });
            }
            vs1<Integer> vs1Var = new vs1<>(0, looper2, this.t, this.y, new lxg(this));
            this.F = vs1Var;
            vs1Var.a(new Runnable() { // from class: nxg
                /* JADX WARN: Type inference failed for: r2v5, types: [T, java.lang.Integer, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar = this.a;
                    final vs1<Integer> vs1Var2 = dVar.F;
                    Context context3 = dVar.e;
                    String str = jrh0.a;
                    final ?? ValueOf = Integer.valueOf(g31.b(context3).generateAudioSessionId());
                    vs1Var2.e = ValueOf;
                    Runnable runnable = new Runnable() { // from class: ss1
                        @Override // java.lang.Runnable
                        public final void run() {
                            vs1 vs1Var3 = vs1Var2;
                            if (vs1Var3.f == 0) {
                                vs1Var3.b(ValueOf);
                            }
                        }
                    };
                    cdl cdlVar2 = vs1Var2.b;
                    if (cdlVar2.f().getThread().isAlive()) {
                        cdlVar2.i(runnable);
                    }
                }
            });
            androidx.media3.exoplayer.a aVar2 = new androidx.media3.exoplayer.a(bVar.a, looper2, bVar.i, this.z, this.y);
            this.B = aVar2;
            aVar2.a();
            fqe0 fqe0Var2 = this.y;
            xwi0 xwi0Var = new xwi0();
            context.getApplicationContext();
            fqe0Var2.c(looper2, null);
            this.C = xwi0Var;
            fqe0 fqe0Var3 = this.y;
            z6j0 z6j0Var = new z6j0();
            context.getApplicationContext();
            fqe0Var3.c(looper2, null);
            this.D = z6j0Var;
            int i5 = wce.c;
            this.j0 = v5i0.d;
            this.a0 = vw90.c;
            cdlVar.e(38, this.N).b();
            cdlVar.b(this.b0, 31, 0, 0).b();
            G0(1, 3, this.b0);
            G0(2, 4, Integer.valueOf(this.Z));
            G0(2, 5, 0);
            G0(1, 9, Boolean.valueOf(this.d0));
            G0(6, 8, this.A);
            G0(-1, 16, Integer.valueOf(this.h0));
        } finally {
            this.d.c();
        }
    }

    public static long A0(co10 co10Var) {
        qxf0.c cVar = new qxf0.c();
        qxf0.b bVar = new qxf0.b();
        co10Var.a.g(co10Var.b.a, bVar);
        long j = co10Var.c;
        return j == -9223372036854775807L ? co10Var.a.m(bVar.c, cVar, 0L).k : bVar.e + j;
    }

    public static co10 B0(co10 co10Var, int i) {
        co10 co10VarH = co10Var.h(i);
        return (i == 1 || i == 4) ? co10VarH.b(false) : co10VarH;
    }

    @Override // defpackage.so10
    public final boolean B() {
        S0();
        return this.l0.l;
    }

    @Override // defpackage.so10
    public final void C(final boolean z) {
        S0();
        if (this.H != z) {
            this.H = z;
            this.l.v.g(12, z ? 1 : 0, 0).b();
            bjs.a<so10.c> aVar = new bjs.a() { // from class: qxg
                @Override // bjs.a
                public final void invoke(Object obj) {
                    ((so10.c) obj).u(z);
                }
            };
            bjs<so10.c> bjsVar = this.m;
            bjsVar.c(9, aVar);
            O0();
            bjsVar.b();
        }
    }

    public final co10 C0(co10 co10Var, qxf0 qxf0Var, Pair<Object, Long> pair) {
        List<uov> list;
        ly0.b(qxf0Var.p() || pair != null);
        qxf0 qxf0Var2 = co10Var.a;
        long jV0 = v0(co10Var);
        co10 co10VarJ = co10Var.j(qxf0Var);
        if (qxf0Var.p()) {
            ekv.b bVar = co10.u;
            long jO = jrh0.O(this.n0);
            ljg0 ljg0Var = ljg0.d;
            ujg0 ujg0Var = this.b;
            pcn.b bVar2 = pcn.b;
            co10 co10VarC = co10VarJ.d(bVar, jO, jO, jO, 0L, ljg0Var, ujg0Var, c150.e).c(bVar);
            co10VarC.q = co10VarC.s;
            return co10VarC;
        }
        Object obj = co10VarJ.b.a;
        String str = jrh0.a;
        boolean zEquals = obj.equals(pair.first);
        ekv.b bVar3 = !zEquals ? new ekv.b(pair.first) : co10VarJ.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jO2 = jrh0.O(jV0);
        if (!qxf0Var2.p()) {
            jO2 -= qxf0Var2.g(obj, this.o).e;
        }
        if (!zEquals || jLongValue < jO2) {
            ekv.b bVar4 = bVar3;
            ly0.f(!bVar4.b());
            ljg0 ljg0Var2 = !zEquals ? ljg0.d : co10VarJ.h;
            ujg0 ujg0Var2 = !zEquals ? this.b : co10VarJ.i;
            if (zEquals) {
                list = co10VarJ.j;
            } else {
                pcn.b bVar5 = pcn.b;
                list = c150.e;
            }
            co10 co10VarC2 = co10VarJ.d(bVar4, jLongValue, jLongValue, jLongValue, 0L, ljg0Var2, ujg0Var2, list).c(bVar4);
            co10VarC2.q = jLongValue;
            return co10VarC2;
        }
        if (jLongValue != jO2) {
            ekv.b bVar6 = bVar3;
            ly0.f(!bVar6.b());
            long jMax = Math.max(0L, co10VarJ.r - (jLongValue - jO2));
            long j = co10VarJ.q;
            if (co10VarJ.k.equals(co10VarJ.b)) {
                j = jLongValue + jMax;
            }
            co10 co10VarD = co10VarJ.d(bVar6, jLongValue, jLongValue, jLongValue, jMax, co10VarJ.h, co10VarJ.i, co10VarJ.j);
            co10VarD.q = j;
            return co10VarD;
        }
        int iB = qxf0Var.b(co10VarJ.k.a);
        if (iB != -1 && qxf0Var.f(iB, this.o, false).c == qxf0Var.g(bVar3.a, this.o).c) {
            return co10VarJ;
        }
        qxf0Var.g(bVar3.a, this.o);
        boolean zB = bVar3.b();
        qxf0.b bVar7 = this.o;
        long jA = zB ? bVar7.a(bVar3.b, bVar3.c) : bVar7.d;
        ekv.b bVar8 = bVar3;
        co10 co10VarC3 = co10VarJ.d(bVar8, co10VarJ.s, co10VarJ.s, co10VarJ.d, jA - co10VarJ.s, co10VarJ.h, co10VarJ.i, co10VarJ.j).c(bVar8);
        co10VarC3.q = jA;
        return co10VarC3;
    }

    @Override // defpackage.so10
    public final void D(so10.c cVar) {
        cVar.getClass();
        this.m.a(cVar);
    }

    public final Pair<Object, Long> D0(qxf0 qxf0Var, int i, long j) {
        if (qxf0Var.p()) {
            this.m0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.n0 = j;
            return null;
        }
        qxf0.c cVar = this.a;
        if (i == -1 || i >= qxf0Var.o()) {
            i = qxf0Var.a(this.H);
            j = jrh0.Z(qxf0Var.m(i, cVar, 0L).k);
        }
        return qxf0Var.i(cVar, this.o, i, jrh0.O(j));
    }

    public final void E0(final int i, final int i2) {
        vw90 vw90Var = this.a0;
        if (i == vw90Var.a && i2 == vw90Var.b) {
            return;
        }
        this.a0 = new vw90(i, i2);
        this.m.f(24, new bjs.a() { // from class: gxg
            @Override // bjs.a
            public final void invoke(Object obj) {
                ((so10.c) obj).K(i, i2);
            }
        });
        G0(2, 14, new vw90(i, i2));
    }

    @Override // defpackage.so10
    public final int F() {
        S0();
        if (this.l0.a.p()) {
            return 0;
        }
        co10 co10Var = this.l0;
        return co10Var.a.b(co10Var.b.a);
    }

    public final void F0() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.W;
        a aVar = this.z;
        if (sphericalGLSurfaceView != null) {
            j jVarU0 = u0(this.A);
            ly0.f(!jVarU0.f);
            jVarU0.c = 10000;
            ly0.f(!jVarU0.f);
            jVarU0.d = null;
            jVarU0.b();
            this.W.a.remove(aVar);
            this.W = null;
        }
        TextureView textureView = this.Y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != aVar) {
                cft.g("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Y.setSurfaceTextureListener(null);
            }
            this.Y = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(aVar);
            this.V = null;
        }
    }

    @Override // defpackage.so10
    public final void G(TextureView textureView) {
        S0();
        if (textureView == null || textureView != this.Y) {
            return;
        }
        s0();
    }

    public final void G0(int i, int i2, Object obj) {
        for (k kVar : this.g) {
            if (i == -1 || kVar.q() == i) {
                j jVarU0 = u0(kVar);
                ly0.f(!jVarU0.f);
                jVarU0.c = i2;
                ly0.f(!jVarU0.f);
                jVarU0.d = obj;
                jVarU0.b();
            }
        }
        for (k kVar2 : this.h) {
            if (kVar2 != null && (i == -1 || kVar2.q() == i)) {
                j jVarU1 = u0(kVar2);
                ly0.f(!jVarU1.f);
                jVarU1.c = i2;
                ly0.f(!jVarU1.f);
                jVarU1.d = obj;
                jVarU1.b();
            }
        }
    }

    @Override // defpackage.so10
    public final v5i0 H() {
        S0();
        return this.j0;
    }

    public final void H0(r21 r21Var) {
        S0();
        if (this.i0) {
            return;
        }
        boolean zEquals = Objects.equals(this.b0, r21Var);
        bjs<so10.c> bjsVar = this.m;
        if (!zEquals) {
            this.b0 = r21Var;
            G0(1, 3, r21Var);
            bjsVar.c(20, new mi8(r21Var));
        }
        this.l.v.b(this.b0, 31, 1, 0).b();
        bjsVar.b();
    }

    @Override // defpackage.so10
    public final int I() {
        S0();
        if (g()) {
            return this.l0.b.c;
        }
        return -1;
    }

    public final void I0(h32 h32Var) {
        S0();
        List<ekv> listSingletonList = Collections.singletonList(h32Var);
        S0();
        J0(listSingletonList, true);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void J(j00 j00Var) {
        S0();
        j00Var.getClass();
        this.s.m(j00Var);
    }

    public final void J0(List<ekv> list, boolean z) {
        S0();
        int iX0 = x0(this.l0);
        long jE0 = e0();
        this.I++;
        ArrayList arrayList = this.p;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = size - 1; i >= 0; i--) {
                arrayList.remove(i);
            }
            this.P = this.P.a(size);
        }
        ArrayList arrayListQ0 = q0(0, list);
        br10 br10Var = new br10(arrayList, this.P);
        boolean zP = br10Var.p();
        int i2 = br10Var.e;
        if (!zP && -1 >= i2) {
            throw new r7n();
        }
        if (z) {
            iX0 = br10Var.a(this.H);
            jE0 = -9223372036854775807L;
        }
        co10 co10VarC0 = C0(this.l0, br10Var, D0(br10Var, iX0, jE0));
        int i3 = co10VarC0.e;
        if (iX0 != -1 && i3 != 1) {
            i3 = (br10Var.p() || iX0 >= i2) ? 4 : 2;
        }
        co10 co10VarB0 = B0(co10VarC0, i3);
        this.l.v.e(17, new e.b(arrayListQ0, this.P, iX0, jrh0.O(jE0))).b();
        Q0(co10VarB0, 0, (this.l0.b.a.equals(co10VarB0.b.a) || this.l0.a.p()) ? false : true, 4, w0(co10VarB0), -1, false);
    }

    public final void K0(SurfaceHolder surfaceHolder) {
        this.X = false;
        this.V = surfaceHolder;
        surfaceHolder.addCallback(this.z);
        Surface surface = this.V.getSurface();
        if (surface == null || !surface.isValid()) {
            E0(0, 0);
        } else {
            Rect surfaceFrame = this.V.getSurfaceFrame();
            E0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.so10
    public final void L(float f) {
        S0();
        final float fH = jrh0.h(f, 0.0f, 1.0f);
        if (this.c0 == fH) {
            return;
        }
        this.c0 = fH;
        this.l.v.e(32, Float.valueOf(fH)).b();
        this.m.f(22, new bjs.a() { // from class: oxg
            @Override // bjs.a
            public final void invoke(Object obj) {
                ((so10.c) obj).R(fH);
            }
        });
    }

    public final void L0(Object obj) {
        Object obj2 = this.T;
        boolean zB = true;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        long j = z ? this.E : -9223372036854775807L;
        e eVar = this.l;
        if (!eVar.X && eVar.y.getThread().isAlive()) {
            eoa eoaVar = new eoa(eVar.F);
            eVar.v.e(30, new Pair(obj, eoaVar)).b();
            if (j != -9223372036854775807L) {
                zB = eoaVar.b(j);
            }
        }
        if (z) {
            Object obj3 = this.T;
            Surface surface = this.U;
            if (obj3 == surface) {
                surface.release();
                this.U = null;
            }
        }
        this.T = obj;
        if (zB) {
            return;
        }
        N0(new rwg(2, new nyg("Detaching surface timed out."), 1003));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void M(j00 j00Var) {
        j00Var.getClass();
        this.s.Z(j00Var);
    }

    public final void M0() {
        S0();
        N0(null);
        pcn.b bVar = pcn.b;
        c150 c150Var = c150.e;
        long j = this.l0.s;
        this.e0 = new o4c(c150Var);
    }

    @Override // defpackage.so10
    public final long N() {
        S0();
        return this.w;
    }

    public final void N0(rwg rwgVar) {
        co10 co10Var = this.l0;
        co10 co10VarC = co10Var.c(co10Var.b);
        co10VarC.q = co10VarC.s;
        co10VarC.r = 0L;
        co10 co10VarB0 = B0(co10VarC, 1);
        if (rwgVar != null) {
            co10VarB0 = co10VarB0.f(rwgVar);
        }
        this.I++;
        this.l.v.c(6).b();
        Q0(co10VarB0, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.so10
    public final long O() {
        S0();
        return v0(this.l0);
    }

    public final void O0() {
        so10.a aVar = this.R;
        String str = jrh0.a;
        d dVar = this.f;
        boolean zG = dVar.g();
        boolean zL0 = dVar.l0();
        boolean zH0 = dVar.h0();
        boolean zQ = dVar.q();
        boolean zK0 = dVar.k0();
        boolean zJ0 = dVar.j0();
        boolean zP = dVar.v().p();
        iuh.a aVar2 = new iuh.a();
        iuh iuhVar = this.c.a;
        boolean z = false;
        for (int i = 0; i < iuhVar.a.size(); i++) {
            aVar2.a(iuhVar.a(i));
        }
        if (!zG) {
            aVar2.a(4);
        }
        if (zL0 && !zG) {
            aVar2.a(5);
        }
        if (zH0 && !zG) {
            aVar2.a(6);
        }
        if (!zP && (zH0 || !zK0 || zL0) && !zG) {
            aVar2.a(7);
        }
        if (zQ && !zG) {
            aVar2.a(8);
        }
        if (!zP && (zQ || (zK0 && zJ0)) && !zG) {
            aVar2.a(9);
        }
        if (!zG) {
            aVar2.a(10);
        }
        if (zL0 && !zG) {
            aVar2.a(11);
        }
        if (zL0 && !zG) {
            z = true;
        }
        if (z) {
            aVar2.a(12);
        }
        so10.a aVar3 = new so10.a(aVar2.b());
        this.R = aVar3;
        if (aVar3.equals(aVar)) {
            return;
        }
        this.m.c(13, new bjs.a() { // from class: rxg
            @Override // bjs.a
            public final void invoke(Object obj) {
                ((so10.c) obj).g0(this.a.R);
            }
        });
    }

    @Override // defpackage.so10
    public final int P() {
        S0();
        return this.l0.e;
    }

    public final void P0(int i, boolean z) {
        int i2;
        if (this.L) {
            i2 = 4;
        } else {
            i2 = (this.l0.n != 1 || z) ? 0 : 1;
        }
        co10 co10VarA = this.l0;
        if (co10VarA.l == z && co10VarA.n == i2 && co10VarA.m == i) {
            return;
        }
        this.I++;
        if (co10VarA.p) {
            co10VarA = co10VarA.a();
        }
        co10 co10VarE = co10VarA.e(i, i2, z);
        this.l.v.g(1, z ? 1 : 0, i | (i2 << 4)).b();
        Q0(co10VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void Q0(final co10 co10Var, final int i, boolean z, final int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        final njv njvVar;
        int i5;
        Object obj;
        njv njvVar2;
        Object obj2;
        int i6;
        long j2;
        long j3;
        long jA0;
        long jA1;
        Object obj3;
        njv njvVar3;
        Object obj4;
        int i7;
        co10 co10Var2 = this.l0;
        this.l0 = co10Var;
        boolean zEquals = co10Var2.a.equals(co10Var.a);
        qxf0.c cVar = this.a;
        qxf0.b bVar = this.o;
        qxf0 qxf0Var = co10Var2.a;
        ekv.b bVar2 = co10Var2.b;
        qxf0 qxf0Var2 = co10Var.a;
        ekv.b bVar3 = co10Var.b;
        if (qxf0Var2.p() && qxf0Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (qxf0Var2.p() != qxf0Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!qxf0Var.m(qxf0Var.g(bVar2.a, bVar).c, cVar, 0L).a.equals(qxf0Var2.m(qxf0Var2.g(bVar3.a, bVar).c, cVar, 0L).a)) {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    fm20.a();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        } else if (z && i2 == 0 && bVar2.d < bVar3.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            njvVar = co10Var.a.p() ? null : co10Var.a.m(co10Var.a.g(co10Var.b.a, this.o).c, this.a, 0L).b;
            this.k0 = qjv.B;
        } else {
            njvVar = null;
        }
        if (zBooleanValue || !co10Var2.j.equals(co10Var.j)) {
            qjv.a aVarA = this.k0.a();
            List<uov> list = co10Var.j;
            for (int i8 = 0; i8 < list.size(); i8++) {
                uov uovVar = list.get(i8);
                int i9 = 0;
                while (true) {
                    uov.a[] aVarArr = uovVar.a;
                    if (i9 < aVarArr.length) {
                        aVarArr[i9].b(aVarA);
                        i9++;
                    }
                }
            }
            this.k0 = new qjv(aVarA);
        }
        qjv qjvVarR0 = r0();
        boolean zEquals2 = qjvVarR0.equals(this.S);
        this.S = qjvVarR0;
        boolean z3 = co10Var2.l != co10Var.l;
        boolean z4 = co10Var2.e != co10Var.e;
        if (z4 || z3) {
            R0();
        }
        boolean z5 = co10Var2.g != co10Var.g;
        if (!zEquals) {
            this.m.c(0, new bjs.a() { // from class: bxg
                @Override // bjs.a
                public final void invoke(Object obj5) {
                    qxf0 qxf0Var3 = co10Var.a;
                    ((so10.c) obj5).A(i);
                }
            });
        }
        if (z) {
            qxf0.b bVar4 = new qxf0.b();
            if (co10Var2.a.p()) {
                i5 = i3;
                obj = null;
                njvVar2 = null;
                obj2 = null;
                i6 = -1;
            } else {
                Object obj5 = co10Var2.b.a;
                co10Var2.a.g(obj5, bVar4);
                int i10 = bVar4.c;
                int iB = co10Var2.a.b(obj5);
                obj = co10Var2.a.m(i10, this.a, 0L).a;
                njvVar2 = this.a.b;
                obj2 = obj5;
                i5 = i10;
                i6 = iB;
            }
            ekv.b bVar5 = co10Var2.b;
            if (i2 == 0) {
                boolean zB = bVar5.b();
                ekv.b bVar6 = co10Var2.b;
                if (zB) {
                    jA0 = bVar4.a(bVar6.b, bVar6.c);
                    jA1 = A0(co10Var2);
                } else {
                    if (bVar6.e != -1) {
                        jA0 = A0(this.l0);
                    } else {
                        j2 = bVar4.e;
                        j3 = bVar4.d;
                        jA0 = j2 + j3;
                    }
                    jA1 = jA0;
                }
            } else if (bVar5.b()) {
                jA0 = co10Var2.s;
                jA1 = A0(co10Var2);
            } else {
                j2 = bVar4.e;
                j3 = co10Var2.s;
                jA0 = j2 + j3;
                jA1 = jA0;
            }
            long jZ = jrh0.Z(jA0);
            long jZ2 = jrh0.Z(jA1);
            ekv.b bVar7 = co10Var2.b;
            final so10.d dVar = new so10.d(obj, i5, njvVar2, obj2, i6, jZ, jZ2, bVar7.b, bVar7.c);
            qxf0.c cVar2 = this.a;
            int iU = U();
            if (this.l0.a.p()) {
                obj3 = null;
                njvVar3 = null;
                obj4 = null;
                i7 = -1;
            } else {
                co10 co10Var3 = this.l0;
                Object obj6 = co10Var3.b.a;
                co10Var3.a.g(obj6, this.o);
                int iB2 = this.l0.a.b(obj6);
                Object obj7 = this.l0.a.m(iU, cVar2, 0L).a;
                njvVar3 = cVar2.b;
                i7 = iB2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jZ3 = jrh0.Z(j);
            long jZ4 = this.l0.b.b() ? jrh0.Z(A0(this.l0)) : jZ3;
            ekv.b bVar8 = this.l0.b;
            final so10.d dVar2 = new so10.d(obj3, iU, njvVar3, obj4, i7, jZ3, jZ4, bVar8.b, bVar8.c);
            this.m.c(11, new bjs.a() { // from class: xxg
                @Override // bjs.a
                public final void invoke(Object obj8) {
                    ((so10.c) obj8).z(i2, dVar, dVar2);
                }
            });
        } else {
            zBooleanValue = zBooleanValue;
            zEquals2 = zEquals2;
            z4 = z4;
        }
        if (zBooleanValue) {
            this.m.c(1, new bjs.a() { // from class: yxg
                @Override // bjs.a
                public final void invoke(Object obj8) {
                    ((so10.c) obj8).J(njvVar, iIntValue);
                }
            });
        }
        if (co10Var2.f != co10Var.f) {
            this.m.c(10, new yf3(co10Var));
            if (co10Var.f != null) {
                this.m.c(10, new bjs.a() { // from class: zxg
                    @Override // bjs.a
                    public final void invoke(Object obj8) {
                        ((so10.c) obj8).i(co10Var.f);
                    }
                });
            }
        }
        ujg0 ujg0Var = co10Var2.i;
        ujg0 ujg0Var2 = co10Var.i;
        if (ujg0Var != ujg0Var2) {
            this.i.c(ujg0Var2.e);
            this.m.c(2, new bjs.a() { // from class: ayg
                @Override // bjs.a
                public final void invoke(Object obj8) {
                    ((so10.c) obj8).X(co10Var.i.d);
                }
            });
        }
        if (!zEquals2) {
            final qjv qjvVar = this.S;
            this.m.c(14, new bjs.a() { // from class: cxg
                @Override // bjs.a
                public final void invoke(Object obj8) {
                    ((so10.c) obj8).a0(qjvVar);
                }
            });
        }
        if (z5) {
            this.m.c(3, new bjs.a() { // from class: dxg
                @Override // bjs.a
                public final void invoke(Object obj8) {
                    ((so10.c) obj8).P(co10Var.g);
                }
            });
        }
        if (z4 || z3) {
            this.m.c(-1, new bjs.a() { // from class: exg
                @Override // bjs.a
                public final void invoke(Object obj8) {
                    co10 co10Var4 = co10Var;
                    ((so10.c) obj8).d0(co10Var4.e, co10Var4.l);
                }
            });
        }
        if (z4) {
            this.m.c(4, new bjs.a() { // from class: fxg
                @Override // bjs.a
                public final void invoke(Object obj8) {
                    ((so10.c) obj8).q(co10Var.e);
                }
            });
        }
        if (z3 || co10Var2.m != co10Var.m) {
            this.m.c(5, new mxg(co10Var));
        }
        if (co10Var2.n != co10Var.n) {
            this.m.c(6, new bjs.a() { // from class: uxg
                @Override // bjs.a
                public final void invoke(Object obj8) {
                    ((so10.c) obj8).l(co10Var.n);
                }
            });
        }
        if (co10Var2.m() != co10Var.m()) {
            this.m.c(7, new bjs.a() { // from class: vxg
                @Override // bjs.a
                public final void invoke(Object obj8) {
                    ((so10.c) obj8).j0(co10Var.m());
                }
            });
        }
        if (!co10Var2.o.equals(co10Var.o)) {
            this.m.c(12, new bjs.a() { // from class: wxg
                @Override // bjs.a
                public final void invoke(Object obj8) {
                    ((so10.c) obj8).f0(co10Var.o);
                }
            });
        }
        O0();
        this.m.b();
        if (co10Var2.p != co10Var.p) {
            Iterator<ExoPlayer.a> it = this.n.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
        }
    }

    @Override // defpackage.so10
    /* JADX INFO: renamed from: R */
    public final rwg b() {
        S0();
        return this.l0.f;
    }

    public final void R0() {
        int iP = P();
        z6j0 z6j0Var = this.D;
        xwi0 xwi0Var = this.C;
        boolean z = false;
        if (iP != 1) {
            if (iP == 2 || iP == 3) {
                S0();
                boolean z2 = this.l0.p;
                if (B() && !z2) {
                    z = true;
                }
                xwi0Var.a(z);
                z6j0Var.a(B());
                return;
            }
            if (iP != 4) {
                fm20.a();
                return;
            }
        }
        xwi0Var.a(false);
        z6j0Var.a(false);
    }

    public final void S0() {
        this.d.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = jrh0.a;
            Locale locale = Locale.US;
            String strA = tx5.a("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f0) {
                ib5.a(strA);
            } else {
                cft.h("ExoPlayerImpl", strA, this.g0 ? null : new IllegalStateException());
                this.g0 = true;
            }
        }
    }

    @Override // defpackage.so10
    public final int U() {
        S0();
        int iX0 = x0(this.l0);
        if (iX0 == -1) {
            return 0;
        }
        return iX0;
    }

    @Override // defpackage.so10
    public final void V(final int i) {
        S0();
        if (this.G != i) {
            this.G = i;
            this.l.v.g(11, i, 0).b();
            bjs.a<so10.c> aVar = new bjs.a() { // from class: ixg
                @Override // bjs.a
                public final void invoke(Object obj) {
                    ((so10.c) obj).c0(i);
                }
            };
            bjs<so10.c> bjsVar = this.m;
            bjsVar.c(8, aVar);
            O0();
            bjsVar.b();
        }
    }

    @Override // defpackage.so10
    public final void W(so10.c cVar) {
        S0();
        cVar.getClass();
        this.m.e(cVar);
    }

    @Override // defpackage.so10
    public final void X(SurfaceView surfaceView) {
        S0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        S0();
        if (holder == null || holder != this.V) {
            return;
        }
        s0();
    }

    @Override // defpackage.so10
    public final int Y() {
        S0();
        return this.G;
    }

    @Override // defpackage.so10
    public final boolean Z() {
        S0();
        return this.H;
    }

    @Override // defpackage.so10
    public final long a0() {
        S0();
        if (this.l0.a.p()) {
            return this.n0;
        }
        co10 co10Var = this.l0;
        long j = 0;
        if (co10Var.k.d != co10Var.b.d) {
            return jrh0.Z(co10Var.a.m(U(), this.a, 0L).l);
        }
        long j2 = co10Var.q;
        if (this.l0.k.b()) {
            co10 co10Var2 = this.l0;
            co10Var2.a.g(co10Var2.k.a, this.o).d(this.l0.k.b);
        } else {
            j = j2;
        }
        co10 co10Var3 = this.l0;
        qxf0 qxf0Var = co10Var3.a;
        Object obj = co10Var3.k.a;
        qxf0.b bVar = this.o;
        qxf0Var.g(obj, bVar);
        return jrh0.Z(j + bVar.e);
    }

    @Override // defpackage.so10
    public final eo10 c() {
        S0();
        return this.l0.o;
    }

    @Override // defpackage.so10
    public final void d() {
        S0();
        co10 co10Var = this.l0;
        if (co10Var.e != 1) {
            return;
        }
        co10 co10VarF = co10Var.f(null);
        co10 co10VarB0 = B0(co10VarF, co10VarF.a.p() ? 4 : 2);
        this.I++;
        this.l.v.c(29).b();
        Q0(co10VarB0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.so10
    public final qjv d0() {
        S0();
        return this.S;
    }

    @Override // defpackage.so10
    public final void e(eo10 eo10Var) {
        S0();
        if (this.l0.o.equals(eo10Var)) {
            return;
        }
        co10 co10VarG = this.l0.g(eo10Var);
        this.I++;
        this.l.v.e(4, eo10Var).b();
        Q0(co10VarG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // defpackage.so10
    public final long e0() {
        S0();
        return jrh0.Z(w0(this.l0));
    }

    @Override // defpackage.so10
    public final long f0() {
        S0();
        return this.v;
    }

    @Override // defpackage.so10
    public final boolean g() {
        S0();
        return this.l0.b.b();
    }

    @Override // defpackage.so10
    public final long h() {
        S0();
        return jrh0.Z(this.l0.r);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        S0();
        return this.L;
    }

    @Override // defpackage.so10
    public final void k(SurfaceView surfaceView) {
        S0();
        if (surfaceView instanceof n3i0) {
            F0();
            L0(surfaceView);
            K0(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof SphericalGLSurfaceView;
        a aVar = this.z;
        if (z) {
            F0();
            this.W = (SphericalGLSurfaceView) surfaceView;
            j jVarU0 = u0(this.A);
            ly0.f(!jVarU0.f);
            jVarU0.c = 10000;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.W;
            ly0.f(true ^ jVarU0.f);
            jVarU0.d = sphericalGLSurfaceView;
            jVarU0.b();
            this.W.a.add(aVar);
            L0(this.W.getVideoSurface());
            K0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        S0();
        if (holder == null) {
            s0();
            return;
        }
        F0();
        this.X = true;
        this.V = holder;
        holder.addCallback(aVar);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            L0(null);
            E0(0, 0);
        } else {
            L0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            E0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // defpackage.so10
    public final void l(final rjg0 rjg0Var) {
        rjg0 rjg0VarA;
        S0();
        tjg0 tjg0Var = this.i;
        tjg0Var.getClass();
        if (tjg0Var instanceof pid) {
            rjg0 rjg0VarX = x();
            if (this.L) {
                this.M = rjg0Var.u;
                tcn<Integer> tcnVar = this.N.a;
                rjg0.b bVarA = rjg0Var.a();
                lgh0 it = tcnVar.iterator();
                while (it.hasNext()) {
                    bVarA.j(((Integer) it.next()).intValue(), true);
                }
                rjg0VarA = bVarA.a();
            } else {
                rjg0VarA = rjg0Var;
            }
            if (!rjg0VarA.equals(tjg0Var.a())) {
                tjg0Var.g(rjg0VarA);
            }
            if (rjg0VarX.equals(rjg0Var)) {
                return;
            }
            this.m.f(19, new bjs.a() { // from class: txg
                @Override // bjs.a
                public final void invoke(Object obj) {
                    ((so10.c) obj).O(rjg0Var);
                }
            });
        }
    }

    @Override // defpackage.i42
    public final void m0(int i, long j, boolean z) {
        S0();
        if (i == -1) {
            return;
        }
        ly0.b(i >= 0);
        qxf0 qxf0Var = this.l0.a;
        if (qxf0Var.p() || i < qxf0Var.o()) {
            this.s.s();
            this.I++;
            if (g()) {
                cft.g("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                e.C0064e c0064e = new e.C0064e(this.l0);
                c0064e.a(1);
                d dVar = this.k.a;
                dVar.j.i(new pxg(dVar, c0064e));
                return;
            }
            co10 co10VarH = this.l0;
            int i2 = co10VarH.e;
            if (i2 == 3 || (i2 == 4 && !qxf0Var.p())) {
                co10VarH = this.l0.h(2);
            }
            int iU = U();
            co10 co10VarC0 = C0(co10VarH, qxf0Var, D0(qxf0Var, i, j));
            this.l.v.e(3, new e.g(qxf0Var, i, jrh0.O(j))).b();
            Q0(co10VarC0, 0, true, 1, w0(co10VarC0), iU, z);
        }
    }

    @Override // defpackage.so10
    public final void n(boolean z) {
        S0();
        P0(1, z);
    }

    @Override // defpackage.so10
    public final bkg0 p() {
        S0();
        return this.l0.i.d;
    }

    public final ArrayList q0(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            i.c cVar = new i.c((ekv) list.get(i2), this.q);
            arrayList.add(cVar);
            c cVar2 = new c(cVar.b, cVar.a);
            this.p.add(i2 + i, cVar2);
        }
        this.P = this.P.g(i, arrayList.size());
        return arrayList;
    }

    @Override // defpackage.so10
    public final o4c r() {
        S0();
        return this.e0;
    }

    public final qjv r0() {
        qxf0 qxf0VarV = v();
        if (qxf0VarV.p()) {
            return this.k0;
        }
        njv njvVar = qxf0VarV.m(U(), this.a, 0L).b;
        qjv.a aVarA = this.k0.a();
        qjv qjvVar = njvVar.d;
        if (qjvVar != null) {
            pcn<String> pcnVar = qjvVar.A;
            byte[] bArr = qjvVar.f;
            CharSequence charSequence = qjvVar.a;
            if (charSequence != null) {
                aVarA.a = charSequence;
            }
            CharSequence charSequence2 = qjvVar.b;
            if (charSequence2 != null) {
                aVarA.b = charSequence2;
            }
            CharSequence charSequence3 = qjvVar.c;
            if (charSequence3 != null) {
                aVarA.c = charSequence3;
            }
            CharSequence charSequence4 = qjvVar.d;
            if (charSequence4 != null) {
                aVarA.d = charSequence4;
            }
            CharSequence charSequence5 = qjvVar.e;
            if (charSequence5 != null) {
                aVarA.e = charSequence5;
            }
            if (bArr != null) {
                Integer num = qjvVar.g;
                aVarA.f = bArr == null ? null : (byte[]) bArr.clone();
                aVarA.g = num;
            }
            Integer num2 = qjvVar.h;
            if (num2 != null) {
                aVarA.h = num2;
            }
            Integer num3 = qjvVar.i;
            if (num3 != null) {
                aVarA.i = num3;
            }
            Integer num4 = qjvVar.j;
            if (num4 != null) {
                aVarA.j = num4;
            }
            Boolean bool = qjvVar.k;
            if (bool != null) {
                aVarA.k = bool;
            }
            Integer num5 = qjvVar.l;
            if (num5 != null) {
                aVarA.l = num5;
            }
            Integer num6 = qjvVar.m;
            if (num6 != null) {
                aVarA.l = num6;
            }
            Integer num7 = qjvVar.n;
            if (num7 != null) {
                aVarA.m = num7;
            }
            Integer num8 = qjvVar.o;
            if (num8 != null) {
                aVarA.n = num8;
            }
            Integer num9 = qjvVar.p;
            if (num9 != null) {
                aVarA.o = num9;
            }
            Integer num10 = qjvVar.q;
            if (num10 != null) {
                aVarA.p = num10;
            }
            Integer num11 = qjvVar.r;
            if (num11 != null) {
                aVarA.q = num11;
            }
            CharSequence charSequence6 = qjvVar.s;
            if (charSequence6 != null) {
                aVarA.r = charSequence6;
            }
            CharSequence charSequence7 = qjvVar.t;
            if (charSequence7 != null) {
                aVarA.s = charSequence7;
            }
            CharSequence charSequence8 = qjvVar.u;
            if (charSequence8 != null) {
                aVarA.t = charSequence8;
            }
            Integer num12 = qjvVar.v;
            if (num12 != null) {
                aVarA.u = num12;
            }
            Integer num13 = qjvVar.w;
            if (num13 != null) {
                aVarA.v = num13;
            }
            CharSequence charSequence9 = qjvVar.x;
            if (charSequence9 != null) {
                aVarA.w = charSequence9;
            }
            CharSequence charSequence10 = qjvVar.y;
            if (charSequence10 != null) {
                aVarA.x = charSequence10;
            }
            Integer num14 = qjvVar.z;
            if (num14 != null) {
                aVarA.y = num14;
            }
            if (!pcnVar.isEmpty()) {
                aVarA.z = pcn.j(pcnVar);
            }
        }
        return new qjv(aVarA);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void release() {
        String str;
        boolean zB;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.8.0] [");
        sb.append(jrh0.a);
        sb.append("] [");
        HashSet<String> hashSet = ojv.a;
        synchronized (ojv.class) {
            str = ojv.b;
        }
        sb.append(str);
        sb.append("]");
        cft.e("ExoPlayerImpl", sb.toString());
        S0();
        this.B.a();
        this.C.a(false);
        this.D.a(false);
        e eVar = this.l;
        if (eVar.X || !eVar.y.getThread().isAlive()) {
            zB = true;
        } else {
            eVar.X = true;
            eoa eoaVar = new eoa(eVar.F);
            eVar.v.e(7, eoaVar).b();
            zB = eoaVar.b(eVar.K);
        }
        if (!zB) {
            this.m.f(10, new hxg());
        }
        this.m.d();
        this.j.d();
        this.u.e(this.s);
        co10 co10VarA = this.l0;
        if (co10VarA.p) {
            co10VarA = co10VarA.a();
            this.l0 = co10VarA;
        }
        co10 co10VarB0 = B0(co10VarA, 1);
        this.l0 = co10VarB0;
        co10 co10VarC = co10VarB0.c(co10VarB0.b);
        this.l0 = co10VarC;
        co10VarC.q = co10VarC.s;
        this.l0.r = 0L;
        this.s.release();
        F0();
        Surface surface = this.U;
        if (surface != null) {
            surface.release();
            this.U = null;
        }
        this.e0 = o4c.c;
        this.i0 = true;
    }

    @Override // defpackage.so10
    public final int s() {
        S0();
        if (g()) {
            return this.l0.b.b;
        }
        return -1;
    }

    public final void s0() {
        S0();
        F0();
        L0(null);
        E0(0, 0);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        S0();
        G0(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        rjg0 rjg0VarA;
        S0();
        if (z == this.L) {
            return;
        }
        this.L = z;
        zr70 zr70Var = this.N;
        if (!zr70Var.a.isEmpty()) {
            tjg0 tjg0Var = this.i;
            tjg0Var.getClass();
            if (tjg0Var instanceof pid) {
                rjg0 rjg0VarA2 = tjg0Var.a();
                if (z) {
                    this.M = rjg0VarA2.u;
                    tcn<Integer> tcnVar = zr70Var.a;
                    rjg0.b bVarA = rjg0VarA2.a();
                    lgh0 it = tcnVar.iterator();
                    while (it.hasNext()) {
                        bVarA.j(((Integer) it.next()).intValue(), true);
                    }
                    rjg0VarA = bVarA.a();
                } else {
                    rjg0VarA = rjg0VarA2.a().d(this.M).a();
                    this.M = null;
                }
                if (!rjg0VarA.equals(rjg0VarA2)) {
                    tjg0Var.g(rjg0VarA);
                }
            }
        }
        this.l.v.e(36, Boolean.valueOf(z)).b();
        co10 co10Var = this.l0;
        P0(co10Var.m, co10Var.l);
    }

    public final ArrayList t0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.r.b((njv) list.get(i)));
        }
        return arrayList;
    }

    @Override // defpackage.so10
    public final int u() {
        S0();
        return this.l0.n;
    }

    public final j u0(j.b bVar) {
        int iX0 = x0(this.l0);
        qxf0 qxf0Var = this.l0.a;
        if (iX0 == -1) {
            iX0 = 0;
        }
        fqe0 fqe0Var = this.y;
        e eVar = this.l;
        return new j(eVar, bVar, qxf0Var, iX0, fqe0Var, eVar.y);
    }

    @Override // defpackage.so10
    public final qxf0 v() {
        S0();
        return this.l0.a;
    }

    public final long v0(co10 co10Var) {
        ekv.b bVar = co10Var.b;
        long j = co10Var.c;
        qxf0 qxf0Var = co10Var.a;
        if (!bVar.b()) {
            return jrh0.Z(w0(co10Var));
        }
        Object obj = co10Var.b.a;
        qxf0.b bVar2 = this.o;
        qxf0Var.g(obj, bVar2);
        if (j == -9223372036854775807L) {
            return jrh0.Z(qxf0Var.m(x0(co10Var), this.a, 0L).k);
        }
        return jrh0.Z(j) + jrh0.Z(bVar2.e);
    }

    @Override // defpackage.so10
    public final Looper w() {
        return this.t;
    }

    public final long w0(co10 co10Var) {
        if (co10Var.a.p()) {
            return jrh0.O(this.n0);
        }
        long jL = co10Var.p ? co10Var.l() : co10Var.s;
        if (co10Var.b.b()) {
            return jL;
        }
        qxf0 qxf0Var = co10Var.a;
        Object obj = co10Var.b.a;
        qxf0.b bVar = this.o;
        qxf0Var.g(obj, bVar);
        return jL + bVar.e;
    }

    @Override // defpackage.so10
    public final rjg0 x() {
        S0();
        rjg0 rjg0VarA = this.i.a();
        return this.L ? rjg0VarA.a().d(this.M).a() : rjg0VarA;
    }

    public final int x0(co10 co10Var) {
        return co10Var.a.p() ? this.m0 : co10Var.a.g(co10Var.b.a, this.o).c;
    }

    public final long y0() {
        S0();
        if (!g()) {
            return E();
        }
        co10 co10Var = this.l0;
        ekv.b bVar = co10Var.b;
        qxf0 qxf0Var = co10Var.a;
        Object obj = bVar.a;
        qxf0.b bVar2 = this.o;
        qxf0Var.g(obj, bVar2);
        return jrh0.Z(bVar2.a(bVar.b, bVar.c));
    }

    @Override // defpackage.so10
    public final void z(TextureView textureView) {
        S0();
        if (textureView == null) {
            s0();
            return;
        }
        F0();
        this.Y = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            cft.g("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            L0(null);
            E0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            L0(surface);
            this.U = surface;
            E0(textureView.getWidth(), textureView.getHeight());
        }
    }

    public final Pair z0(qxf0 qxf0Var, br10 br10Var, int i, long j) {
        if (qxf0Var.p() || br10Var.p()) {
            boolean z = !qxf0Var.p() && br10Var.p();
            return D0(br10Var, z ? -1 : i, z ? -9223372036854775807L : j);
        }
        qxf0.b bVar = this.o;
        long jO = jrh0.O(j);
        qxf0.c cVar = this.a;
        Pair<Object, Long> pairI = qxf0Var.i(cVar, bVar, i, jO);
        Object obj = pairI.first;
        if (br10Var.b(obj) != -1) {
            return pairI;
        }
        int iS = e.S(cVar, this.o, this.G, this.H, obj, qxf0Var, br10Var);
        if (iS == -1) {
            return D0(br10Var, -1, -9223372036854775807L);
        }
        br10Var.m(iS, cVar, 0L);
        return D0(br10Var, iS, jrh0.Z(cVar.k));
    }
}
