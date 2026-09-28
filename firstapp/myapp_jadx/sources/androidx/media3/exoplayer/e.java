package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.common.a;
import androidx.media3.exoplayer.e;
import androidx.media3.exoplayer.j;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.core.model.patron.KYCBannerItem;
import defpackage.a31;
import defpackage.ae2;
import defpackage.akv;
import defpackage.ar10;
import defpackage.bkv;
import defpackage.br10;
import defpackage.c150;
import defpackage.cdl;
import defpackage.cft;
import defpackage.co10;
import defpackage.d850;
import defpackage.do10;
import defpackage.dqc;
import defpackage.e850;
import defpackage.ekv;
import defpackage.eo10;
import defpackage.eoa;
import defpackage.fqe0;
import defpackage.fw1;
import defpackage.gqv;
import defpackage.h08;
import defpackage.ib5;
import defpackage.jqe0;
import defpackage.jrh0;
import defpackage.kxg;
import defpackage.lef;
import defpackage.ljg0;
import defpackage.lvd0;
import defpackage.ly0;
import defpackage.lyg;
import defpackage.njv;
import defpackage.oyg;
import defpackage.pcn;
import defpackage.pxg;
import defpackage.q480;
import defpackage.qxf0;
import defpackage.r21;
import defpackage.rs60;
import defpackage.rwg;
import defpackage.s4i0;
import defpackage.sp10;
import defpackage.ssz;
import defpackage.tb90;
import defpackage.tdd;
import defpackage.tf;
import defpackage.tjg0;
import defpackage.uiv;
import defpackage.ujg0;
import defpackage.uov;
import defpackage.vrs;
import defpackage.vs7;
import defpackage.xc80;
import defpackage.xz;
import defpackage.zad;
import defpackage.zdd;
import defpackage.zjv;
import defpackage.zr70;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Handler.Callback, zjv.a, j.a, s4i0 {
    public static final long u0 = jrh0.Z(10000);
    public final qxf0.b A;
    public final long B;
    public final boolean C;
    public final zdd D;
    public final ArrayList<d> E;
    public final vs7 F;
    public final kxg G;
    public final h H;
    public final i I;
    public final vrs J;
    public final long K;
    public final sp10 L;
    public final xz M;
    public final cdl N;
    public final boolean O;
    public final a31 P;
    public q480 Q;
    public boolean S;
    public boolean T;
    public g U;
    public co10 V;
    public C0064e W;
    public boolean X;
    public boolean Z;
    public final e850[] a;
    public boolean a0;
    public final l[] b;
    public final boolean[] c;
    public boolean c0;
    public final tjg0 d;
    public int d0;
    public final ujg0 e;
    public boolean e0;
    public final androidx.media3.exoplayer.f f;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public final fw1 i;
    public int i0;
    public g j0;
    public long k0;
    public long l0;
    public int m0;
    public boolean n0;
    public rwg o0;
    public ExoPlayer.c q0;
    public boolean s0;
    public final cdl v;
    public final do10 w;
    public final Looper y;
    public final qxf0.c z;
    public long r0 = -9223372036854775807L;
    public boolean Y = false;
    public float t0 = 1.0f;
    public zr70 R = zr70.b;
    public long p0 = -9223372036854775807L;
    public long b0 = -9223372036854775807L;

    public class a implements k.a {
        public a() {
        }

        @Override // androidx.media3.exoplayer.k.a
        public final void a() {
            e.this.g0 = true;
        }

        @Override // androidx.media3.exoplayer.k.a
        public final void b() {
            e eVar = e.this;
            if (eVar.S) {
                eVar.R.getClass();
            } else if (!eVar.h0) {
                return;
            }
            eVar.v.k(2);
        }
    }

    public static final class b {
        public final ArrayList a;
        public final tb90 b;
        public final int c;
        public final long d;

        public b(ArrayList arrayList, tb90 tb90Var, int i, long j) {
            this.a = arrayList;
            this.b = tb90Var;
            this.c = i;
            this.d = j;
        }
    }

    public static class c {
    }

    public static final class d implements Comparable<d> {
        @Override // java.lang.Comparable
        public final int compareTo(d dVar) {
            dVar.getClass();
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.e$e, reason: collision with other inner class name */
    public static final class C0064e {
        public boolean a;
        public co10 b;
        public int c;
        public boolean d;
        public int e;

        public C0064e(co10 co10Var) {
            this.b = co10Var;
        }

        public final void a(int i) {
            this.a |= i > 0;
            this.c += i;
        }
    }

    public static final class f {
        public final ekv.b a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public f(ekv.b bVar, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.a = bVar;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    public static final class g {
        public final qxf0 a;
        public final int b;
        public final long c;

        public g(qxf0 qxf0Var, int i, long j) {
            this.a = qxf0Var;
            this.b = i;
            this.c = j;
        }
    }

    public e(Context context, k[] kVarArr, k[] kVarArr2, tjg0 tjg0Var, ujg0 ujg0Var, androidx.media3.exoplayer.f fVar, fw1 fw1Var, int i, boolean z, xz xzVar, q480 q480Var, tdd tddVar, long j, Looper looper, fqe0 fqe0Var, kxg kxgVar, sp10 sp10Var, ExoPlayer.c cVar, final s4i0 s4i0Var) {
        Looper looper2;
        this.G = kxgVar;
        this.d = tjg0Var;
        this.e = ujg0Var;
        this.f = fVar;
        this.i = fw1Var;
        this.d0 = i;
        this.e0 = z;
        this.Q = q480Var;
        this.J = tddVar;
        this.K = j;
        boolean z2 = false;
        this.F = fqe0Var;
        this.L = sp10Var;
        this.q0 = cVar;
        this.M = xzVar;
        this.B = fVar.c();
        this.C = fVar.b();
        qxf0.a aVar = qxf0.a;
        co10 co10VarK = co10.k(ujg0Var);
        this.V = co10VarK;
        this.W = new C0064e(co10VarK);
        this.b = new l[kVarArr.length];
        this.c = new boolean[kVarArr.length];
        l.a aVarB = tjg0Var.b();
        this.a = new e850[kVarArr.length];
        boolean z3 = false;
        for (int i2 = 0; i2 < kVarArr.length; i2++) {
            kVarArr[i2].t(i2, sp10Var, fqe0Var);
            this.b[i2] = kVarArr[i2].u();
            if (aVarB != null) {
                androidx.media3.exoplayer.b bVar = (androidx.media3.exoplayer.b) this.b[i2];
                synchronized (bVar.a) {
                    bVar.G = aVarB;
                }
            }
            k kVar = kVarArr2[i2];
            if (kVar != null) {
                kVar.t(i2, sp10Var, fqe0Var);
                z3 = true;
            }
            this.a[i2] = new e850(kVarArr[i2], kVarArr2[i2], i2);
        }
        this.O = z3;
        this.D = new zdd(this, fqe0Var);
        this.E = new ArrayList<>();
        this.z = new qxf0.c();
        this.A = new qxf0.b();
        ly0.f(tjg0Var.a == null);
        tjg0Var.a = this;
        tjg0Var.b = fw1Var;
        this.n0 = true;
        jqe0 jqe0VarC = fqe0Var.c(looper, null);
        this.N = jqe0VarC;
        this.H = new h(xzVar, jqe0VarC, new lyg(this), cVar);
        this.I = new i(this, xzVar, jqe0VarC, sp10Var);
        do10 do10Var = new do10();
        this.w = do10Var;
        synchronized (do10Var.a) {
            try {
                looper2 = do10Var.b;
                if (looper2 == null) {
                    if (do10Var.d == 0 && do10Var.c == null) {
                        z2 = true;
                    }
                    ly0.f(z2);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    do10Var.c = handlerThread;
                    handlerThread.start();
                    looper2 = do10Var.c.getLooper();
                    do10Var.b = looper2;
                }
                do10Var.d++;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.y = looper2;
        jqe0 jqe0VarC2 = fqe0Var.c(looper2, this);
        this.v = jqe0VarC2;
        this.P = new a31(context, looper2, this);
        jqe0VarC2.e(35, new s4i0() { // from class: myg
            @Override // defpackage.s4i0
            public final void k(long j2, long j3, a aVar2, MediaFormat mediaFormat) {
                s4i0Var.k(j2, j3, aVar2, mediaFormat);
                this.a.k(j2, j3, aVar2, mediaFormat);
            }
        }).b();
    }

    public static Pair<Object, Long> R(qxf0 qxf0Var, g gVar, boolean z, int i, boolean z2, qxf0.c cVar, qxf0.b bVar) {
        int iS;
        qxf0 qxf0Var2 = gVar.a;
        if (qxf0Var.p()) {
            return null;
        }
        qxf0 qxf0Var3 = qxf0Var2.p() ? qxf0Var : qxf0Var2;
        try {
            Pair<Object, Long> pairI = qxf0Var3.i(cVar, bVar, gVar.b, gVar.c);
            if (!qxf0Var.equals(qxf0Var3)) {
                if (qxf0Var.b(pairI.first) == -1) {
                    if (!z || (iS = S(cVar, bVar, i, z2, pairI.first, qxf0Var3, qxf0Var)) == -1) {
                        return null;
                    }
                    return qxf0Var.i(cVar, bVar, iS, -9223372036854775807L);
                }
                if (qxf0Var3.g(pairI.first, bVar).f && qxf0Var3.m(bVar.c, cVar, 0L).m == qxf0Var3.b(pairI.first)) {
                    return qxf0Var.i(cVar, bVar, qxf0Var.g(pairI.first, bVar).c, gVar.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int S(qxf0.c cVar, qxf0.b bVar, int i, boolean z, Object obj, qxf0 qxf0Var, qxf0 qxf0Var2) {
        qxf0 qxf0Var3 = qxf0Var;
        Object obj2 = qxf0Var3.m(qxf0Var3.g(obj, bVar).c, cVar, 0L).a;
        for (int i2 = 0; i2 < qxf0Var2.o(); i2++) {
            if (qxf0Var2.m(i2, cVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = qxf0Var3.b(obj);
        int iH = qxf0Var3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            qxf0 qxf0Var4 = qxf0Var3;
            int iD = qxf0Var4.d(iB, bVar, cVar, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = qxf0Var2.b(qxf0Var4.l(iD));
            i3++;
            qxf0Var3 = qxf0Var4;
            iB = iD;
        }
        if (iB2 == -1) {
            return -1;
        }
        return qxf0Var2.f(iB2, bVar, false).c;
    }

    public static boolean y(akv akvVar) {
        if (akvVar != null) {
            try {
                zjv zjvVar = akvVar.a;
                if (akvVar.e) {
                    for (rs60 rs60Var : akvVar.c) {
                        if (rs60Var != null) {
                            rs60Var.a();
                        }
                    }
                } else {
                    zjvVar.m();
                }
                if ((!akvVar.e ? 0L : zjvVar.d()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A() {
        akv akvVar = this.H.j;
        long j = akvVar.g.e;
        if (akvVar.e) {
            return j == -9223372036854775807L || this.V.s < j || !o0();
        }
        return false;
    }

    public final void B() {
        boolean zE;
        if (y(this.H.m)) {
            akv akvVar = this.H.m;
            long jO = o(!akvVar.e ? 0L : akvVar.a.d());
            akv akvVar2 = this.H.j;
            long j = this.k0;
            long j2 = akvVar.p;
            if (akvVar != akvVar2) {
                j -= j2;
                j2 = akvVar.g.b;
            }
            long j3 = j - j2;
            long j4 = p0(this.V.a, akvVar.g.a) ? ((tdd) this.J).h : -9223372036854775807L;
            sp10 sp10Var = this.L;
            qxf0 qxf0Var = this.V.a;
            ekv.b bVar = akvVar.g.a;
            float f2 = this.D.c().a;
            boolean z = this.V.l;
            androidx.media3.exoplayer.f.a aVar = new androidx.media3.exoplayer.f.a(sp10Var, qxf0Var, bVar, j3, jO, f2, this.a0, j4);
            zE = this.f.e(aVar);
            akv akvVar3 = this.H.j;
            if (!zE && akvVar3.e && jO < 500000 && (this.B > 0 || this.C)) {
                akvVar3.a.u(this.V.s, false);
                zE = this.f.e(aVar);
            }
        } else {
            zE = false;
        }
        this.c0 = zE;
        if (zE) {
            akv akvVar4 = this.H.m;
            akvVar4.getClass();
            androidx.media3.exoplayer.g.a aVar2 = new androidx.media3.exoplayer.g.a();
            aVar2.a = this.k0 - akvVar4.p;
            float f3 = this.D.c().a;
            ly0.b(f3 > 0.0f || f3 == -3.4028235E38f);
            aVar2.b = f3;
            long j5 = this.b0;
            ly0.b(j5 >= 0 || j5 == -9223372036854775807L);
            aVar2.c = j5;
            androidx.media3.exoplayer.g gVar = new androidx.media3.exoplayer.g(aVar2);
            ly0.f(akvVar4.m == null);
            akvVar4.a.b(gVar);
        }
        t0();
    }

    public final void C() {
        h hVar = this.H;
        hVar.j();
        akv akvVar = hVar.n;
        if (akvVar != null) {
            zjv zjvVar = akvVar.a;
            if ((!akvVar.d || akvVar.e) && !zjvVar.a()) {
                qxf0 qxf0Var = this.V.a;
                if (akvVar.e) {
                    zjvVar.s();
                }
                if (this.f.f()) {
                    if (!akvVar.d) {
                        long j = akvVar.g.b;
                        akvVar.d = true;
                        zjvVar.o(this, j);
                        return;
                    }
                    androidx.media3.exoplayer.g.a aVar = new androidx.media3.exoplayer.g.a();
                    aVar.a = this.k0 - akvVar.p;
                    float f2 = this.D.c().a;
                    ly0.b(f2 > 0.0f || f2 == -3.4028235E38f);
                    aVar.b = f2;
                    long j2 = this.b0;
                    ly0.b(j2 >= 0 || j2 == -9223372036854775807L);
                    aVar.c = j2;
                    androidx.media3.exoplayer.g gVar = new androidx.media3.exoplayer.g(aVar);
                    ly0.f(akvVar.m == null);
                    zjvVar.b(gVar);
                }
            }
        }
    }

    public final void D() {
        C0064e c0064e = this.W;
        co10 co10Var = this.V;
        boolean z = c0064e.a | (c0064e.b != co10Var);
        c0064e.a = z;
        c0064e.b = co10Var;
        if (z) {
            androidx.media3.exoplayer.d dVar = this.G.a;
            dVar.j.i(new pxg(dVar, c0064e));
            this.W = new C0064e(this.V);
        }
    }

    public final void E(int i) {
        e850 e850Var = this.a[i];
        try {
            akv akvVar = this.H.j;
            akvVar.getClass();
            k kVarC = e850Var.c(akvVar);
            kVarC.getClass();
            kVarC.o();
        } catch (IOException | RuntimeException e) {
            int iQ = e850Var.a.q();
            if (iQ != 3 && iQ != 5) {
                throw e;
            }
            ujg0 ujg0Var = this.H.j.o;
            cft.d("ExoPlayerImplInternal", "Disabling track due to error: ".concat(androidx.media3.common.a.c(ujg0Var.c[i].r())), e);
            ujg0 ujg0Var2 = new ujg0((d850[]) ujg0Var.b.clone(), (oyg[]) ujg0Var.c.clone(), ujg0Var.d, ujg0Var.e);
            ujg0Var2.b[i] = null;
            ujg0Var2.c[i] = null;
            f(i);
            akv akvVar2 = this.H.j;
            akvVar2.a(ujg0Var2, this.V.s, false, new boolean[akvVar2.j.length]);
        }
    }

    public final void F(final int i, final boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.N.i(new Runnable() { // from class: jyg
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = this.a;
                    xz xzVar = eVar.M;
                    e850[] e850VarArr = eVar.a;
                    int i2 = i;
                    xzVar.W(i2, e850VarArr[i2].a.q(), z);
                }
            });
        }
    }

    public final void G() throws Throwable {
        u(this.I.b(), true);
    }

    public final void H(c cVar) throws Throwable {
        this.W.a(1);
        cVar.getClass();
        i iVar = this.I;
        ly0.b(iVar.b.size() >= 0);
        iVar.j = null;
        u(iVar.b(), false);
    }

    public final void I() {
        this.W.a(1);
        N(false, false, false, true);
        this.f.i(this.L);
        k0(this.V.a.p() ? 4 : 2);
        co10 co10Var = this.V;
        boolean z = co10Var.l;
        w0(this.P.d(co10Var.e, z), co10Var.n, co10Var.m, z);
        zad zadVarA = this.i.a();
        i iVar = this.I;
        ArrayList arrayList = iVar.b;
        ly0.f(!iVar.k);
        iVar.l = zadVarA;
        for (int i = 0; i < arrayList.size(); i++) {
            i.c cVar = (i.c) arrayList.get(i);
            iVar.e(cVar);
            iVar.g.add(cVar);
        }
        iVar.k = true;
        this.v.k(2);
    }

    public final void J(eoa eoaVar) {
        do10 do10Var = this.w;
        cdl cdlVar = this.v;
        try {
            N(true, false, true, false);
            K();
            this.f.g(this.L);
            a31 a31Var = this.P;
            a31Var.c = null;
            a31Var.a();
            a31Var.c(0);
            this.d.d();
            k0(1);
        } finally {
            cdlVar.d();
            do10Var.a();
            eoaVar.c();
        }
    }

    public final void K() {
        for (int i = 0; i < this.a.length; i++) {
            androidx.media3.exoplayer.b bVar = (androidx.media3.exoplayer.b) this.b[i];
            synchronized (bVar.a) {
                bVar.G = null;
            }
            e850 e850Var = this.a[i];
            e850Var.a.release();
            e850Var.e = false;
            k kVar = e850Var.c;
            if (kVar != null) {
                kVar.release();
                e850Var.f = false;
            }
        }
    }

    public final void L(int i, int i2, tb90 tb90Var) throws Throwable {
        this.W.a(1);
        i iVar = this.I;
        iVar.getClass();
        ly0.b(i >= 0 && i <= i2 && i2 <= iVar.b.size());
        iVar.j = tb90Var;
        iVar.g(i, i2);
        u(iVar.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x016c  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public final void M() {
        int i;
        int i2;
        float f2 = this.D.c().a;
        h hVar = this.H;
        akv akvVar = hVar.j;
        akv akvVar2 = hVar.k;
        ujg0 ujg0Var = null;
        akv akvVar3 = akvVar;
        boolean z = true;
        while (akvVar3 != null && akvVar3.e) {
            co10 co10Var = this.V;
            ujg0 ujg0VarJ = akvVar3.j(f2, co10Var.a, co10Var.l);
            ujg0 ujg0Var2 = akvVar3 == this.H.j ? ujg0VarJ : ujg0Var;
            ujg0 ujg0Var3 = akvVar3.o;
            oyg[] oygVarArr = ujg0VarJ.c;
            if (ujg0Var3 != null && ujg0Var3.c.length == oygVarArr.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= oygVarArr.length) {
                        if (akvVar3 == akvVar2) {
                            z = false;
                        }
                        akvVar3 = akvVar3.m;
                        ujg0Var = ujg0Var2;
                    } else if (ujg0VarJ.a(ujg0Var3, i3)) {
                        i3++;
                    }
                }
            }
            h hVar2 = this.H;
            if (!z) {
                i = 4;
                hVar2.n(akvVar3);
                if (akvVar3.e) {
                    long jMax = Math.max(akvVar3.g.b, this.k0 - akvVar3.p);
                    if (this.O && c() && this.H.l == akvVar3) {
                        d();
                    }
                    i2 = 4;
                    akvVar3.a(ujg0VarJ, jMax, false, new boolean[akvVar3.j.length]);
                }
                t(true);
                if (this.V.e != i2) {
                    B();
                    x0();
                    this.v.k(2);
                    return;
                }
                return;
            }
            akv akvVar4 = hVar2.j;
            boolean z2 = (hVar2.n(akvVar4) & 1) != 0;
            boolean[] zArr = new boolean[this.a.length];
            ujg0Var2.getClass();
            long jA = akvVar4.a(ujg0Var2, this.V.s, z2, zArr);
            co10 co10Var2 = this.V;
            boolean z3 = (co10Var2.e == 4 || jA == co10Var2.s) ? false : true;
            co10 co10Var3 = this.V;
            i = 4;
            this.V = x(co10Var3.b, jA, co10Var3.c, co10Var3.d, z3, 5);
            if (z3) {
                P(jA);
            }
            d();
            boolean[] zArr2 = new boolean[this.a.length];
            int i4 = 0;
            while (true) {
                e850[] e850VarArr = this.a;
                if (i4 >= e850VarArr.length) {
                    break;
                }
                int iB = e850VarArr[i4].b();
                zArr2[i4] = this.a[i4].f();
                e850 e850Var = this.a[i4];
                rs60 rs60Var = akvVar4.c[i4];
                zdd zddVar = this.D;
                long j = this.k0;
                boolean z4 = zArr[i4];
                k kVar = e850Var.a;
                if (e850.g(kVar)) {
                    if (rs60Var != kVar.z()) {
                        e850Var.a(kVar, zddVar);
                    } else if (z4) {
                        kVar.B(j);
                    }
                }
                k kVar2 = e850Var.c;
                if (kVar2 != null && e850.g(kVar2)) {
                    if (rs60Var != kVar2.z()) {
                        e850Var.a(kVar2, zddVar);
                    } else if (z4) {
                        kVar2.B(j);
                    }
                }
                if (iB - this.a[i4].b() > 0) {
                    F(i4, false);
                }
                this.i0 -= iB - this.a[i4].b();
                i4++;
            }
            j(zArr2, this.k0);
            akvVar4.h = true;
            i2 = i;
            t(true);
            if (this.V.e != i2) {
                B();
                x0();
                this.v.k(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0138  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0142  */
    /* JADX WARN: Code duplicated, block: B:69:0x0147  */
    /* JADX WARN: Code duplicated, block: B:71:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0175  */
    /* JADX WARN: Code duplicated, block: B:76:0x017f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0199  */
    public final void N(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        qxf0 br10Var;
        ekv.b bVar;
        co10 co10Var;
        ljg0 ljg0Var;
        ujg0 ujg0Var;
        List list;
        h hVar;
        this.v.l(2);
        this.T = false;
        this.U = null;
        this.o0 = null;
        z0(false, true);
        zdd zddVar = this.D;
        zddVar.f = false;
        lvd0 lvd0Var = zddVar.a;
        if (lvd0Var.b) {
            lvd0Var.a(lvd0Var.v());
            lvd0Var.b = false;
        }
        this.k0 = 1000000000000L;
        for (int i = 0; i < this.a.length; i++) {
            try {
                f(i);
            } catch (RuntimeException e) {
                e = e;
                cft.d("ExoPlayerImplInternal", "Disable failed.", e);
            } catch (rwg e2) {
                e = e2;
                cft.d("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.r0 = -9223372036854775807L;
        if (z) {
            for (e850 e850Var : this.a) {
                try {
                    e850Var.j();
                } catch (RuntimeException e3) {
                    cft.d("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.i0 = 0;
        co10 co10Var2 = this.V;
        ekv.b bVar2 = co10Var2.b;
        long j4 = co10Var2.s;
        if (this.V.b.b()) {
            j = this.V.c;
        } else {
            co10 co10Var3 = this.V;
            qxf0.b bVar3 = this.A;
            ekv.b bVar4 = co10Var3.b;
            qxf0 qxf0Var = co10Var3.a;
            if (qxf0Var.p() || qxf0Var.g(bVar4.a, bVar3).f) {
                j = this.V.c;
            } else {
                j = this.V.s;
            }
        }
        if (z2) {
            this.j0 = null;
            Pair<ekv.b, Long> pairN = n(this.V.a);
            bVar2 = (ekv.b) pairN.first;
            long jLongValue = ((Long) pairN.second).longValue();
            z5 = bVar2.equals(this.V.b) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            j2 = j4;
            j3 = j;
            z5 = false;
        }
        this.H.b();
        this.c0 = false;
        qxf0 qxf0Var2 = this.V.a;
        if (z3 && (qxf0Var2 instanceof br10)) {
            br10 br10Var2 = (br10) qxf0Var2;
            tb90 tb90Var = this.I.j;
            qxf0[] qxf0VarArr = br10Var2.i;
            qxf0[] qxf0VarArr2 = new qxf0[qxf0VarArr.length];
            for (int i2 = 0; i2 < qxf0VarArr.length; i2++) {
                qxf0VarArr2[i2] = new ar10(qxf0VarArr[i2]);
            }
            br10Var = new br10(qxf0VarArr2, br10Var2.j, tb90Var);
            if (bVar2.b != -1) {
                br10Var.g(bVar2.a, this.A);
                int i3 = this.A.c;
                qxf0.c cVar = this.z;
                br10Var.m(i3, cVar, 0L);
                if (cVar.a()) {
                    bVar = new ekv.b(bVar2.a, bVar2.d);
                }
            }
            co10Var = this.V;
            int i4 = co10Var.e;
            rwg rwgVar = z4 ? null : co10Var.f;
            if (z5) {
                ljg0Var = ljg0.d;
            } else {
                ljg0Var = co10Var.h;
            }
            ljg0 ljg0Var2 = ljg0Var;
            if (z5) {
                ujg0Var = this.e;
            } else {
                ujg0Var = co10Var.i;
            }
            ujg0 ujg0Var2 = ujg0Var;
            if (z5) {
                pcn.b bVar5 = pcn.b;
                list = c150.e;
            } else {
                list = co10Var.j;
            }
            this.V = new co10(br10Var, bVar, j3, j2, i4, rwgVar, false, ljg0Var2, ujg0Var2, list, bVar, co10Var.l, co10Var.m, co10Var.n, co10Var.o, j2, 0L, j2, 0L, false);
            if (z3) {
                hVar = this.H;
                if (!hVar.r.isEmpty()) {
                    hVar.m(new ArrayList());
                }
                i iVar = this.I;
                HashMap<i.c, i.b> map = iVar.f;
                for (i.b bVar6 : map.values()) {
                    try {
                        bVar6.a.f(bVar6.b);
                    } catch (RuntimeException e4) {
                        cft.d("MediaSourceList", "Failed to release child source.", e4);
                    }
                    ekv ekvVar = bVar6.a;
                    i.a aVar = bVar6.c;
                    ekvVar.b(aVar);
                    bVar6.a.d(aVar);
                }
                map.clear();
                iVar.g.clear();
                iVar.k = false;
            }
        }
        br10Var = qxf0Var2;
        bVar = bVar2;
        co10Var = this.V;
        int i5 = co10Var.e;
        rwg rwgVar2 = z4 ? null : co10Var.f;
        if (z5) {
            ljg0Var = ljg0.d;
        } else {
            ljg0Var = co10Var.h;
        }
        ljg0 ljg0Var3 = ljg0Var;
        if (z5) {
            ujg0Var = this.e;
        } else {
            ujg0Var = co10Var.i;
        }
        ujg0 ujg0Var3 = ujg0Var;
        if (z5) {
            pcn.b bVar7 = pcn.b;
            list = c150.e;
        } else {
            list = co10Var.j;
        }
        this.V = new co10(br10Var, bVar, j3, j2, i5, rwgVar2, false, ljg0Var3, ujg0Var3, list, bVar, co10Var.l, co10Var.m, co10Var.n, co10Var.o, j2, 0L, j2, 0L, false);
        if (z3) {
            hVar = this.H;
            if (!hVar.r.isEmpty()) {
                hVar.m(new ArrayList());
            }
            i iVar2 = this.I;
            HashMap<i.c, i.b> map2 = iVar2.f;
            while (r4.hasNext()) {
                bVar6.a.f(bVar6.b);
                ekv ekvVar2 = bVar6.a;
                i.a aVar2 = bVar6.c;
                ekvVar2.b(aVar2);
                bVar6.a.d(aVar2);
            }
            map2.clear();
            iVar2.g.clear();
            iVar2.k = false;
        }
    }

    public final void O() {
        akv akvVar = this.H.j;
        this.Z = akvVar != null && akvVar.g.i && this.Y;
    }

    public final void P(long j) {
        akv akvVar = this.H.j;
        long j2 = j + (akvVar == null ? 1000000000000L : akvVar.p);
        this.k0 = j2;
        this.D.a.a(j2);
        for (e850 e850Var : this.a) {
            long j3 = this.k0;
            k kVarC = e850Var.c(akvVar);
            if (kVarC != null) {
                kVarC.B(j3);
            }
        }
        for (akv akvVar2 = r0.j; akvVar2 != null; akvVar2 = akvVar2.m) {
            for (oyg oygVar : akvVar2.o.c) {
                if (oygVar != null) {
                    oygVar.j();
                }
            }
        }
    }

    public final void Q(qxf0 qxf0Var, qxf0 qxf0Var2) {
        if (qxf0Var.p() && qxf0Var2.p()) {
            return;
        }
        ArrayList<d> arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw null;
        }
    }

    public final void T(long j) {
        boolean z;
        if (this.S) {
            this.R.getClass();
            z = true;
        } else {
            z = false;
        }
        co10 co10Var = this.V;
        long jMin = 1000;
        long j2 = u0;
        if (z) {
            jMin = co10Var.e != 3 ? j2 : 1000L;
            for (e850 e850Var : this.a) {
                long j3 = this.k0;
                long j4 = this.l0;
                k kVar = e850Var.c;
                k kVar2 = e850Var.a;
                long jS = e850.g(kVar2) ? kVar2.s(j3, j4) : Long.MAX_VALUE;
                if (kVar != null && kVar.getState() != 0) {
                    jS = Math.min(jS, kVar.s(j3, j4));
                }
                jMin = Math.min(jMin, jrh0.Z(jS));
            }
            if (this.V.m()) {
                akv akvVar = this.H.j;
                akv akvVar2 = akvVar != null ? akvVar.m : null;
                if (akvVar2 != null) {
                    if ((jrh0.O(jMin) * this.V.o.a) + this.k0 >= akvVar2.e()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (co10Var.e != 3 || o0()) {
            jMin = j2;
        }
        this.v.j(j + jMin);
    }

    public final void U(boolean z) {
        ekv.b bVar = this.H.j.g.a;
        long jW = W(bVar, this.V.s, true, false);
        if (jW != this.V.s) {
            co10 co10Var = this.V;
            this.V = x(bVar, jW, co10Var.c, co10Var.d, z, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:129:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7 A[Catch: all -> 0x00aa, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x00aa, blocks: (B:26:0x00a7, B:32:0x00b6, B:34:0x00ba, B:35:0x00bd, B:42:0x00d4, B:46:0x00dc, B:50:0x00eb, B:51:0x00f0), top: B:124:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6 A[Catch: all -> 0x00aa, TRY_ENTER, TryCatch #5 {all -> 0x00aa, blocks: (B:26:0x00a7, B:32:0x00b6, B:34:0x00ba, B:35:0x00bd, B:42:0x00d4, B:46:0x00dc, B:50:0x00eb, B:51:0x00f0), top: B:124:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba A[Catch: all -> 0x00aa, TryCatch #5 {all -> 0x00aa, blocks: (B:26:0x00a7, B:32:0x00b6, B:34:0x00ba, B:35:0x00bd, B:42:0x00d4, B:46:0x00dc, B:50:0x00eb, B:51:0x00f0), top: B:124:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c6 A[Catch: all -> 0x018a, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x018a, blocks: (B:24:0x009d, B:38:0x00c6), top: B:125:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:77:0x0145  */
    /* JADX WARN: Code duplicated, block: B:78:0x0147  */
    /* JADX WARN: Code duplicated, block: B:81:0x0150  */
    /* JADX WARN: Code duplicated, block: B:83:0x0153  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code duplicated, block: B:88:0x015f  */
    public final void V(g gVar, boolean z) throws Throwable {
        long jLongValue;
        long j;
        ekv.b bVarP;
        long j2;
        boolean z2;
        long j3;
        boolean z3;
        long j4;
        co10 co10Var;
        akv akvVar;
        long jF;
        co10 co10Var2;
        int i;
        long j5;
        int i2;
        long j6;
        ekv.b bVar;
        long j7;
        boolean z4;
        h hVar;
        boolean z5;
        boolean z6;
        ekv.b bVar2;
        long j8;
        e eVar = this;
        eVar.W.a(z ? 1 : 0);
        if (eVar.T) {
            eVar.U = gVar;
            return;
        }
        Pair<Object, Long> pairR = R(eVar.V.a, gVar, true, eVar.d0, eVar.e0, eVar.z, eVar.A);
        try {
            try {
                if (pairR != null) {
                    Object obj = pairR.first;
                    jLongValue = ((Long) pairR.second).longValue();
                    j = gVar.c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                    bVarP = eVar.H.p(eVar.V.a, obj, jLongValue);
                    if (bVarP.b()) {
                        eVar.V.a.g(bVarP.a, eVar.A);
                        if (eVar.A.e(bVarP.b) == bVarP.c) {
                            eVar.A.g.getClass();
                        }
                        z2 = true;
                        jLongValue = 0;
                    } else {
                        j2 = 0;
                        z2 = gVar.c == -9223372036854775807L;
                    }
                    if (eVar.V.a.p()) {
                        co10Var = eVar.V;
                        if (pairR == null) {
                            if (co10Var.e != 1) {
                                eVar.k0(4);
                            }
                            eVar.N(false, true, false, true);
                        } else {
                            if (bVarP.equals(co10Var.b)) {
                                try {
                                    akvVar = eVar.H.j;
                                    if (akvVar == null && akvVar.e && jLongValue != j2) {
                                        zjv zjvVar = akvVar.a;
                                        long j9 = eVar.z.l;
                                        if (eVar.S && j9 != -9223372036854775807L) {
                                            eVar.R.getClass();
                                        }
                                        jF = zjvVar.f(jLongValue, eVar.Q);
                                    } else {
                                        jF = jLongValue;
                                    }
                                    j3 = jLongValue;
                                    try {
                                        if (jrh0.Z(jF) != jrh0.Z(eVar.V.s) && ((i = (co10Var2 = eVar.V).e) == 2 || i == 3)) {
                                            j5 = co10Var2.s;
                                            i2 = 2;
                                            j6 = j5;
                                            z3 = z2;
                                            bVar = bVarP;
                                            j7 = j;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        z3 = z2;
                                        j4 = j3;
                                        eVar.V = eVar.x(bVarP, j4, j, j4, z3, 2);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    j3 = jLongValue;
                                }
                            } else {
                                j3 = jLongValue;
                                jF = j3;
                            }
                            try {
                                eVar.T = eVar.S;
                                if (eVar.V.e == 4) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                try {
                                    hVar = eVar.H;
                                    if (hVar.j != hVar.k) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    jLongValue = eVar.W(bVarP, jF, z5, z4);
                                    if (j3 != jLongValue) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    z3 = z2 | z6;
                                    try {
                                        co10 co10Var3 = eVar.V;
                                        bVar2 = bVarP;
                                        try {
                                            qxf0 qxf0Var = co10Var3.a;
                                            j8 = j;
                                            try {
                                                eVar.y0(qxf0Var, bVar2, qxf0Var, co10Var3.b, j8, true);
                                                bVar = bVar2;
                                                j7 = j8;
                                                j5 = jLongValue;
                                                i2 = 2;
                                                j6 = j5;
                                                eVar = this;
                                            } catch (Throwable th3) {
                                                th = th3;
                                                bVarP = bVar2;
                                                j = j8;
                                                j4 = jLongValue;
                                                eVar.V = eVar.x(bVarP, j4, j, j4, z3, 2);
                                                throw th;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            bVarP = bVar2;
                                            j = j;
                                            j4 = jLongValue;
                                            eVar.V = eVar.x(bVarP, j4, j, j4, z3, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    z3 = z2;
                                    j4 = j3;
                                    eVar.V = eVar.x(bVarP, j4, j, j4, z3, 2);
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        }
                        eVar.V = eVar.x(bVar, j5, j7, j6, z3, i2);
                        return;
                    }
                    eVar.j0 = gVar;
                    z3 = z2;
                    bVar = bVarP;
                    j7 = j;
                    j5 = jLongValue;
                    i2 = 2;
                    j6 = j5;
                    eVar = this;
                    eVar.V = eVar.x(bVar, j5, j7, j6, z3, i2);
                    return;
                }
                Pair<ekv.b, Long> pairN = eVar.n(eVar.V.a);
                bVarP = (ekv.b) pairN.first;
                jLongValue = ((Long) pairN.second).longValue();
                z2 = !eVar.V.a.p();
                j = -9223372036854775807L;
                if (eVar.V.a.p()) {
                    co10Var = eVar.V;
                    if (pairR == null) {
                        if (co10Var.e != 1) {
                            eVar.k0(4);
                        }
                        eVar.N(false, true, false, true);
                    } else {
                        if (bVarP.equals(co10Var.b)) {
                            akvVar = eVar.H.j;
                            if (akvVar == null) {
                                jF = jLongValue;
                            } else {
                                jF = jLongValue;
                            }
                            j3 = jLongValue;
                            if (jrh0.Z(jF) != jrh0.Z(eVar.V.s)) {
                            }
                        } else {
                            j3 = jLongValue;
                            jF = j3;
                        }
                        eVar.T = eVar.S;
                        if (eVar.V.e == 4) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        hVar = eVar.H;
                        if (hVar.j != hVar.k) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        jLongValue = eVar.W(bVarP, jF, z5, z4);
                        if (j3 != jLongValue) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z3 = z2 | z6;
                        co10 co10Var4 = eVar.V;
                        bVar2 = bVarP;
                        qxf0 qxf0Var2 = co10Var4.a;
                        j8 = j;
                        eVar.y0(qxf0Var2, bVar2, qxf0Var2, co10Var4.b, j8, true);
                        bVar = bVar2;
                        j7 = j8;
                        j5 = jLongValue;
                        i2 = 2;
                        j6 = j5;
                        eVar = this;
                    }
                    eVar.V = eVar.x(bVar, j5, j7, j6, z3, i2);
                    return;
                }
                eVar.j0 = gVar;
                z3 = z2;
                bVar = bVarP;
                j7 = j;
                j5 = jLongValue;
                i2 = 2;
                j6 = j5;
                eVar = this;
                eVar.V = eVar.x(bVar, j5, j7, j6, z3, i2);
                return;
            } catch (Throwable th8) {
                th = th8;
                z3 = z2;
                bVarP = bVarP;
                j4 = jLongValue;
                j = j;
            }
        } catch (Throwable th9) {
            th = th9;
            z2 = z2;
            bVarP = bVarP;
            j3 = jLongValue;
        }
        j2 = 0;
    }

    public final long W(ekv.b bVar, long j, boolean z, boolean z2) {
        e850[] e850VarArr;
        s0();
        z0(false, true);
        if (z2 || this.V.e == 3) {
            k0(2);
        }
        h hVar = this.H;
        akv akvVar = hVar.j;
        akv akvVar2 = akvVar;
        while (akvVar2 != null && !bVar.equals(akvVar2.g.a)) {
            akvVar2 = akvVar2.m;
        }
        if (z || akvVar != akvVar2 || (akvVar2 != null && akvVar2.p + j < 0)) {
            int i = 0;
            while (true) {
                e850VarArr = this.a;
                if (i >= e850VarArr.length) {
                    break;
                }
                f(i);
                i++;
            }
            this.r0 = -9223372036854775807L;
            if (akvVar2 != null) {
                while (hVar.j != akvVar2) {
                    hVar.a();
                }
                hVar.n(akvVar2);
                akvVar2.p = 1000000000000L;
                j(new boolean[e850VarArr.length], hVar.k.e());
                akvVar2.h = true;
            }
        }
        d();
        if (akvVar2 != null) {
            zjv zjvVar = akvVar2.a;
            hVar.n(akvVar2);
            if (!akvVar2.e) {
                akvVar2.g = akvVar2.g.b(j);
            } else if (akvVar2.f) {
                j = zjvVar.h(j);
                zjvVar.u(j - this.B, this.C);
            }
            P(j);
            B();
        } else {
            hVar.b();
            P(j);
        }
        t(false);
        this.v.k(2);
        return j;
    }

    public final void X(j jVar) {
        jVar.getClass();
        cdl cdlVar = this.v;
        if (jVar.e != this.y) {
            cdlVar.e(15, jVar).b();
            return;
        }
        synchronized (jVar) {
        }
        try {
            jVar.a.m(jVar.c, jVar.d);
            jVar.a(true);
            int i = this.V.e;
            if (i == 3 || i == 2) {
                cdlVar.k(2);
            }
        } catch (Throwable th) {
            jVar.a(true);
            throw th;
        }
    }

    public final void Y(final j jVar) {
        Looper looper = jVar.e;
        if (looper.getThread().isAlive()) {
            this.F.c(looper, null).i(new Runnable(this) { // from class: kyg
                @Override // java.lang.Runnable
                public final void run() {
                    j jVar2 = jVar;
                    try {
                        synchronized (jVar2) {
                        }
                        try {
                            jVar2.a.m(jVar2.c, jVar2.d);
                        } finally {
                            jVar2.a(true);
                        }
                    } catch (rwg e) {
                        cft.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                        gqm.a(e);
                    }
                }
            });
        } else {
            cft.g("TAG", "Trying to send message on a dead thread.");
            jVar.a(false);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    /* JADX WARN: Code duplicated, block: B:16:0x002e  */
    public final void Z(r21 r21Var, boolean z) {
        int i;
        this.d.f(r21Var);
        if (!z) {
            r21Var = null;
        }
        a31 a31Var = this.P;
        if (!Objects.equals(a31Var.d, r21Var)) {
            a31Var.d = r21Var;
            if (r21Var != null) {
                int i2 = r21Var.b;
                i = 3;
                switch (i2) {
                    case 0:
                        cft.g("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i = 1;
                        break;
                    case 1:
                    case 14:
                        i = 1;
                        break;
                    case 2:
                    case 4:
                        i = 2;
                        break;
                    case 3:
                        i = 0;
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        break;
                    case 11:
                        if (r21Var.a == 1) {
                            i = 2;
                        }
                        break;
                    default:
                        h08.a(i2, "Unidentified audio usage: ", "AudioFocusManager");
                        i = 0;
                        break;
                }
            } else {
                i = 0;
            }
            a31Var.f = i;
            ly0.a("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        co10 co10Var = this.V;
        boolean z2 = co10Var.l;
        w0(a31Var.d(co10Var.e, z2), co10Var.n, co10Var.m, z2);
    }

    public final void a(b bVar, int i) throws Throwable {
        this.W.a(1);
        i iVar = this.I;
        if (i == -1) {
            i = iVar.b.size();
        }
        u(iVar.a(i, bVar.a, bVar.b), false);
    }

    public final void a0(boolean z, eoa eoaVar) {
        if (this.f0 != z) {
            this.f0 = z;
            if (!z) {
                for (e850 e850Var : this.a) {
                    e850Var.j();
                }
            }
        }
        if (eoaVar != null) {
            eoaVar.c();
        }
    }

    public final void b() {
        for (e850 e850Var : this.a) {
            zr70 zr70Var = this.S ? this.R : null;
            e850Var.a.m(18, zr70Var);
            k kVar = e850Var.c;
            if (kVar != null) {
                kVar.m(18, zr70Var);
            }
        }
    }

    public final void b0(b bVar) throws Throwable {
        this.W.a(1);
        int i = bVar.c;
        tb90 tb90Var = bVar.b;
        ArrayList arrayList = bVar.a;
        if (i != -1) {
            this.j0 = new g(new br10(arrayList, tb90Var), bVar.c, bVar.d);
        }
        i iVar = this.I;
        ArrayList arrayList2 = iVar.b;
        iVar.g(0, arrayList2.size());
        u(iVar.a(arrayList2.size(), arrayList, tb90Var), false);
    }

    public final boolean c() {
        if (!this.O) {
            return false;
        }
        for (e850 e850Var : this.a) {
            if (e850Var.e()) {
                return true;
            }
        }
        return false;
    }

    public final void c0(boolean z) {
        this.Y = z;
        O();
        if (this.Z) {
            h hVar = this.H;
            if (hVar.k != hVar.j) {
                U(true);
                t(false);
            }
        }
    }

    public final void d() {
        k kVar;
        if (this.O && c()) {
            for (e850 e850Var : this.a) {
                int iB = e850Var.b();
                if (e850Var.e()) {
                    int i = e850Var.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        kVar = e850Var.a;
                    } else {
                        kVar = e850Var.c;
                        kVar.getClass();
                    }
                    e850Var.a(kVar, this.D);
                    e850Var.h(z);
                    e850Var.d = i2;
                }
                this.i0 -= iB - e850Var.b();
            }
            this.r0 = -9223372036854775807L;
        }
    }

    public final void d0(eo10 eo10Var) {
        this.v.l(16);
        zdd zddVar = this.D;
        zddVar.e(eo10Var);
        eo10 eo10VarC = zddVar.c();
        w(eo10VarC, eo10VarC.a, true, true);
    }

    @Override // xc80.a
    public final void e(xc80 xc80Var) {
        this.v.e(9, (zjv) xc80Var).b();
    }

    public final void e0(ExoPlayer.c cVar) {
        this.q0 = cVar;
        qxf0 qxf0Var = this.V.a;
        h hVar = this.H;
        hVar.i = cVar;
        hVar.i.getClass();
        if (hVar.r.isEmpty()) {
            return;
        }
        hVar.m(new ArrayList());
    }

    public final void f(int i) {
        e850[] e850VarArr = this.a;
        int iB = e850VarArr[i].b();
        e850 e850Var = e850VarArr[i];
        k kVar = e850Var.a;
        zdd zddVar = this.D;
        e850Var.a(kVar, zddVar);
        k kVar2 = e850Var.c;
        if (kVar2 != null) {
            boolean z = (kVar2.getState() == 0 || e850Var.d == 3) ? false : true;
            e850Var.a(kVar2, zddVar);
            e850Var.h(false);
            if (z) {
                k kVar3 = e850Var.a;
                kVar2.getClass();
                kVar2.m(17, kVar3);
            }
        }
        e850Var.d = 0;
        F(i, false);
        this.i0 -= iB;
    }

    public final void f0(int i) {
        this.d0 = i;
        qxf0 qxf0Var = this.V.a;
        h hVar = this.H;
        hVar.g = i;
        int iR = hVar.r(qxf0Var);
        if ((iR & 1) != 0) {
            U(true);
        } else if ((iR & 2) != 0) {
            d();
        }
        t(false);
    }

    @Override // zjv.a
    public final void g(zjv zjvVar) {
        this.v.e(8, zjvVar).b();
    }

    public final void g0(boolean z) throws Throwable {
        if (!z) {
            this.T = false;
            this.v.l(37);
            g gVar = this.U;
            if (gVar != null) {
                V(gVar, false);
                this.U = null;
            }
        }
        this.S = z;
        b();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:197:0x0359  */
    /* JADX WARN: Code duplicated, block: B:199:0x035d  */
    /* JADX WARN: Code duplicated, block: B:208:0x0388  */
    /* JADX WARN: Code duplicated, block: B:242:0x0403  */
    /* JADX WARN: Code duplicated, block: B:312:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:393:0x0637  */
    /* JADX WARN: Code duplicated, block: B:434:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:436:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:438:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:439:0x06d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:440:0x06db  */
    /* JADX WARN: Code duplicated, block: B:441:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:443:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:444:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:446:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:447:0x0700  */
    /* JADX WARN: Code duplicated, block: B:450:0x070a  */
    /* JADX WARN: Code duplicated, block: B:453:0x0712  */
    /* JADX WARN: Code duplicated, block: B:456:0x071d  */
    /* JADX WARN: Code duplicated, block: B:459:0x0723  */
    /* JADX WARN: Code duplicated, block: B:461:0x0726 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:465:0x076a  */
    /* JADX WARN: Code duplicated, block: B:467:0x0777  */
    /* JADX WARN: Code duplicated, block: B:469:0x0785  */
    /* JADX WARN: Code duplicated, block: B:471:0x0793  */
    /* JADX WARN: Code duplicated, block: B:474:0x079c  */
    /* JADX WARN: Code duplicated, block: B:482:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:484:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:486:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:488:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:494:0x07df  */
    /* JADX WARN: Code duplicated, block: B:496:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:503:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:506:0x0804  */
    /* JADX WARN: Code duplicated, block: B:508:0x080c  */
    /* JADX WARN: Code duplicated, block: B:526:0x0859  */
    /* JADX WARN: Code duplicated, block: B:532:0x086f  */
    /* JADX WARN: Code duplicated, block: B:539:0x087b  */
    /* JADX WARN: Code duplicated, block: B:542:0x0882  */
    /* JADX WARN: Code duplicated, block: B:611:0x0812 A[EDGE_INSN: B:611:0x0812->B:510:0x0812 BREAK  A[LOOP:12: B:504:0x07ff->B:509:0x080f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:0x080f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:0x07ce A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:484:0x07bf, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68, types: [int] */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r4v54, types: [androidx.media3.exoplayer.j$b, androidx.media3.exoplayer.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [androidx.media3.exoplayer.j$b, androidx.media3.exoplayer.k, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void h() {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        co10 co10Var;
        akv akvVar;
        tdd tddVar;
        long j2;
        long j3;
        int i;
        h hVar;
        akv akvVar2;
        long j4;
        akv akvVar3;
        boolean z5;
        boolean z6;
        boolean zA;
        lvd0 lvd0Var;
        boolean z7;
        co10 co10VarI;
        int i2;
        int i3;
        e850[] e850VarArr;
        co10 co10Var2;
        boolean z8;
        long j5;
        akv akvVar4;
        akv akvVar5;
        akv akvVar6;
        boolean z9;
        boolean z10;
        int length;
        int i4;
        k kVar;
        boolean zB;
        k kVar2;
        k kVar3;
        int i5;
        int i6;
        akv akvVar7;
        akv akvVar8;
        int i7;
        long jB = this.F.b();
        this.v.l(2);
        long j6 = -9223372036854775807L;
        if (this.V.a.p() || !this.I.k) {
            z = true;
        } else {
            this.H.l(this.k0);
            h hVar2 = this.H;
            akv akvVar9 = hVar2.m;
            if (akvVar9 == null || (!akvVar9.g.j && akvVar9.g() && hVar2.m.g.e != -9223372036854775807L && hVar2.o < 100)) {
                h hVar3 = this.H;
                long j7 = this.k0;
                co10 co10Var3 = this.V;
                akv akvVar10 = hVar3.m;
                bkv bkvVarD = akvVar10 == null ? hVar3.d(co10Var3.a, co10Var3.b, co10Var3.c, co10Var3.s) : hVar3.c(co10Var3.a, akvVar10, j7);
                if (bkvVarD != null) {
                    h hVar4 = this.H;
                    akv akvVar11 = hVar4.m;
                    long j8 = akvVar11 == null ? 1000000000000L : (akvVar11.p + akvVar11.g.e) - bkvVarD.b;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= hVar4.r.size()) {
                            j5 = j6;
                            akvVar4 = null;
                            break;
                        }
                        bkv bkvVar = ((akv) hVar4.r.get(i8)).g;
                        long j9 = bkvVar.e;
                        j5 = j6;
                        long j10 = bkvVarD.e;
                        if ((j9 == j5 || j9 == j10) && bkvVar.b == bkvVarD.b && bkvVar.a.equals(bkvVarD.a)) {
                            akvVar4 = (akv) hVar4.r.remove(i8);
                            break;
                        } else {
                            i8++;
                            j6 = j5;
                        }
                    }
                    if (akvVar4 == null) {
                        e eVar = hVar4.e.a;
                        l[] lVarArr = eVar.b;
                        tjg0 tjg0Var = eVar.d;
                        tf tfVarD = eVar.f.d();
                        i iVar = eVar.I;
                        ujg0 ujg0Var = eVar.e;
                        eVar.q0.getClass();
                        akvVar4 = new akv(lVarArr, j8, tjg0Var, tfVarD, iVar, bkvVarD, ujg0Var);
                    } else {
                        akvVar4.g = bkvVarD;
                        akvVar4.p = j8;
                    }
                    akv akvVar12 = hVar4.m;
                    if (akvVar12 == null) {
                        hVar4.j = akvVar4;
                        hVar4.k = akvVar4;
                        hVar4.l = akvVar4;
                    } else if (akvVar4 != akvVar12.m) {
                        akvVar12.b();
                        akvVar12.m = akvVar4;
                        akvVar12.c();
                    }
                    hVar4.p = null;
                    hVar4.m = akvVar4;
                    hVar4.o++;
                    hVar4.k();
                    if (!akvVar4.d) {
                        long j11 = bkvVarD.b;
                        akvVar4.d = true;
                        akvVar4.a.o(this, j11);
                    } else if (akvVar4.e) {
                        this.v.e(8, akvVar4.a).b();
                    }
                    if (this.H.j == akvVar4) {
                        P(bkvVarD.b);
                    }
                    t(false);
                } else {
                    j5 = -9223372036854775807L;
                }
            } else {
                j5 = -9223372036854775807L;
            }
            if (this.c0) {
                this.c0 = y(this.H.m);
                t0();
            } else {
                B();
            }
            h hVar5 = this.H;
            if (!this.Z && this.O && !this.s0 && !c() && (akvVar7 = hVar5.l) != null && akvVar7 == hVar5.k && (akvVar8 = akvVar7.m) != null && akvVar8.e) {
                hVar5.l = akvVar8;
                hVar5.k();
                ly0.g(hVar5.l);
                e850[] e850VarArr2 = this.a;
                akv akvVar13 = hVar5.l;
                if (akvVar13 != null) {
                    ujg0 ujg0Var2 = akvVar13.o;
                    for (int i9 = 0; i9 < e850VarArr2.length; i9++) {
                        if (ujg0Var2.b(i9)) {
                            e850 e850Var = e850VarArr2[i9];
                            if (e850Var.c != null && !e850Var.e()) {
                                e850 e850Var2 = e850VarArr2[i9];
                                ly0.f(!e850Var2.e());
                                if (e850.g(e850Var2.a)) {
                                    i7 = 3;
                                } else {
                                    k kVar4 = e850Var2.c;
                                    i7 = (kVar4 == null || kVar4.getState() == 0) ? 2 : 4;
                                }
                                e850Var2.d = i7;
                                i(akvVar13, i9, false, akvVar13.e());
                            }
                        }
                    }
                    if (c()) {
                        this.r0 = akvVar13.a.j();
                        if (!akvVar13.g()) {
                            hVar5.n(akvVar13);
                            t(false);
                            B();
                        }
                    }
                }
            }
            boolean z11 = this.O;
            e850[] e850VarArr3 = this.a;
            h hVar6 = this.H;
            akv akvVar14 = hVar6.k;
            if (akvVar14 != null) {
                if (akvVar14.m == null || this.Z) {
                    if (akvVar14.g.j || this.Z) {
                        for (e850 e850Var3 : e850VarArr3) {
                            if (e850Var3.c(akvVar14) != null) {
                                k kVarC = e850Var3.c(akvVar14);
                                kVarC.getClass();
                                if (kVarC.f()) {
                                    long j12 = akvVar14.g.e;
                                    long j13 = (j12 == -9223372036854775807L || j12 == Long.MIN_VALUE) ? -9223372036854775807L : j12 + akvVar14.p;
                                    k kVarC2 = e850Var3.c(akvVar14);
                                    kVarC2.getClass();
                                    e850.k(kVarC2, j13);
                                }
                            }
                        }
                    }
                } else if (akvVar14.e) {
                    int i10 = 0;
                    while (true) {
                        if (i10 < e850VarArr3.length) {
                            e850 e850Var4 = e850VarArr3[i10];
                            if (!e850Var4.d(akvVar14, e850Var4.a) || !e850Var4.d(akvVar14, e850Var4.c)) {
                                break;
                            } else {
                                i10++;
                            }
                        } else {
                            if (c() && hVar6.l == hVar6.k) {
                                break;
                            }
                            akv akvVar15 = akvVar14.m;
                            if (!akvVar15.e && this.k0 < akvVar15.e()) {
                                break;
                            }
                            ujg0 ujg0Var3 = akvVar14.o;
                            akv akvVar16 = hVar6.l;
                            akv akvVar17 = hVar6.k;
                            if (akvVar16 == akvVar17) {
                                ly0.g(akvVar17);
                                hVar6.l = akvVar17.m;
                            }
                            akv akvVar18 = hVar6.k;
                            ly0.g(akvVar18);
                            hVar6.k = akvVar18.m;
                            hVar6.k();
                            akv akvVar19 = hVar6.k;
                            ly0.g(akvVar19);
                            ujg0 ujg0Var4 = akvVar19.o;
                            qxf0 qxf0Var = this.V.a;
                            y0(qxf0Var, akvVar19.g.a, qxf0Var, akvVar14.g.a, -9223372036854775807L, false);
                            if (!akvVar19.e || ((!z11 || this.r0 == j5) && akvVar19.a.j() == j5)) {
                                length = e850VarArr3.length;
                                i4 = 0;
                                while (i4 < length) {
                                    e850 e850Var5 = e850VarArr3[i4];
                                    long jE = akvVar19.e();
                                    kVar = e850Var5.a;
                                    int i11 = e850Var5.b;
                                    zB = ujg0Var3.b(i11);
                                    boolean zB2 = ujg0Var4.b(i11);
                                    kVar2 = e850Var5.c;
                                    int i12 = length;
                                    if (kVar2 != null || (i5 = e850Var5.d) == 3 || (i5 == 0 && e850.g(kVar))) {
                                        kVar3 = kVar;
                                    } else {
                                        kVar3 = kVar2;
                                    }
                                    if (!zB && !kVar3.p()) {
                                        boolean z12 = kVar.q() == -2;
                                        d850 d850Var = ujg0Var3.b[i11];
                                        d850 d850Var2 = ujg0Var4.b[i11];
                                        if (!zB2 || !Objects.equals(d850Var2, d850Var) || z12 || e850Var5.e()) {
                                            e850.k(kVar3, jE);
                                        }
                                    }
                                    i4++;
                                    length = i12;
                                }
                            } else {
                                this.r0 = j5;
                                boolean z13 = z11 && !this.s0;
                                if (z13) {
                                    for (int i13 = 0; i13 < e850VarArr3.length; i13++) {
                                        boolean zB3 = ujg0Var4.b(i13);
                                        oyg[] oygVarArr = ujg0Var4.c;
                                        if (zB3 && e850VarArr3[i13].a.q() != -2 && !gqv.a(oygVarArr[i13].r().n, oygVarArr[i13].r().k) && !e850VarArr3[i13].e()) {
                                            z13 = false;
                                            break;
                                        }
                                    }
                                }
                                if (z13) {
                                    length = e850VarArr3.length;
                                    i4 = 0;
                                    while (i4 < length) {
                                        e850 e850Var6 = e850VarArr3[i4];
                                        long jE2 = akvVar19.e();
                                        kVar = e850Var6.a;
                                        int i14 = e850Var6.b;
                                        zB = ujg0Var3.b(i14);
                                        boolean zB4 = ujg0Var4.b(i14);
                                        kVar2 = e850Var6.c;
                                        int i15 = length;
                                        if (kVar2 != null) {
                                            kVar3 = kVar;
                                        } else {
                                            kVar3 = kVar;
                                        }
                                        if (!zB) {
                                        }
                                        i4++;
                                        length = i15;
                                    }
                                } else {
                                    long jE3 = akvVar19.e();
                                    for (e850 e850Var7 : e850VarArr3) {
                                        k kVar5 = e850Var7.c;
                                        k kVar6 = e850Var7.a;
                                        if (e850.g(kVar6) && (i6 = e850Var7.d) != 4 && i6 != 2) {
                                            e850.k(kVar6, jE3);
                                        }
                                        if (kVar5 != null && kVar5.getState() != 0 && e850Var7.d != 3) {
                                            e850.k(kVar5, jE3);
                                        }
                                    }
                                    if (!akvVar19.g()) {
                                        hVar6.n(akvVar19);
                                        t(false);
                                        B();
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            }
            h hVar7 = this.H;
            akv akvVar20 = hVar7.k;
            if (akvVar20 == null || hVar7.j == akvVar20 || akvVar20.h) {
                z = true;
            } else {
                e850[] e850VarArr4 = this.a;
                ujg0 ujg0Var5 = akvVar20.o;
                boolean z14 = true;
                for (int i16 = 0; i16 < e850VarArr4.length; i16++) {
                    int iB = e850VarArr4[i16].b();
                    e850 e850Var8 = e850VarArr4[i16];
                    zdd zddVar = this.D;
                    int i17 = e850Var8.i(e850Var8.a, akvVar20, ujg0Var5, zddVar);
                    int i18 = e850Var8.i(e850Var8.c, akvVar20, ujg0Var5, zddVar);
                    if (i17 == 1) {
                        i17 = i18;
                    }
                    if ((i17 & 2) != 0 && (z10 = this.h0) && z10) {
                        this.h0 = false;
                        if (this.V.p) {
                            this.v.k(2);
                        }
                    }
                    this.i0 -= iB - e850VarArr4[i16].b();
                    z14 &= (i17 & 1) != 0;
                }
                z = true;
                if (z14) {
                    for (int i19 = 0; i19 < e850VarArr4.length; i19++) {
                        if (ujg0Var5.b(i19) && e850VarArr4[i19].c(akvVar20) == null) {
                            i(akvVar20, i19, false, akvVar20.e());
                        }
                    }
                }
                if (z14) {
                    hVar7.k.h = true;
                }
            }
            e850[] e850VarArr5 = this.a;
            h hVar8 = this.H;
            boolean z15 = false;
            while (o0() && !this.Z && (akvVar5 = hVar8.j) != null && (akvVar6 = akvVar5.m) != null && this.k0 >= akvVar6.e() && akvVar6.h) {
                if (z15) {
                    D();
                }
                this.s0 = false;
                akv akvVarA = hVar8.a();
                akvVarA.getClass();
                if (this.V.b.a.equals(akvVarA.g.a.a)) {
                    ekv.b bVar = this.V.b;
                    if (bVar.b == -1) {
                        ekv.b bVar2 = akvVarA.g.a;
                        if (bVar2.b != -1 || bVar.e == bVar2.e) {
                            z9 = false;
                        } else {
                            z9 = z;
                        }
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
                bkv bkvVar2 = akvVarA.g;
                ekv.b bVar3 = bkvVar2.a;
                long j14 = bkvVar2.b;
                this.V = x(bVar3, j14, bkvVar2.c, j14, !z9, 0);
                O();
                x0();
                if (c() && akvVarA == hVar8.l) {
                    for (e850 e850Var9 : e850VarArr5) {
                        int i20 = e850Var9.d;
                        if (i20 == 3 || i20 == 4) {
                            boolean z16 = i20 == 4 ? z : false;
                            ?? r4 = e850Var9.a;
                            ?? r5 = e850Var9.c;
                            if (z16) {
                                r5.getClass();
                                r5.m(17, r4);
                            } else {
                                r5.getClass();
                                r4.m(17, r5);
                            }
                            e850Var9.d = e850Var9.d == 4 ? 0 : z;
                        } else if (i20 == 2) {
                            e850Var9.d = 0;
                        }
                    }
                }
                if (this.V.e == 3) {
                    q0();
                }
                ujg0 ujg0Var6 = hVar8.j.o;
                for (int i21 = 0; i21 < e850VarArr5.length; i21++) {
                    if (ujg0Var6.b(i21)) {
                        e850 e850Var10 = e850VarArr5[i21];
                        k kVar7 = e850Var10.c;
                        k kVar8 = e850Var10.a;
                        if (e850.g(kVar8)) {
                            kVar8.i();
                        } else if (kVar7 != null && kVar7.getState() != 0) {
                            kVar7.i();
                        }
                    }
                }
                z15 = z;
            }
            this.q0.getClass();
        }
        int i22 = this.V.e;
        if (i22 == z || i22 == 4) {
            return;
        }
        akv akvVar21 = this.H.j;
        if (akvVar21 == null) {
            T(jB);
            return;
        }
        Trace.beginSection("doSomeWork");
        x0();
        if (akvVar21.e) {
            this.l0 = jrh0.O(this.F.d());
            akvVar21.a.u(this.V.s - this.B, this.C);
            z2 = z;
            z3 = z2;
            int i23 = 0;
            while (true) {
                e850[] e850VarArr6 = this.a;
                if (i23 >= e850VarArr6.length) {
                    break;
                }
                e850 e850Var11 = e850VarArr6[i23];
                if (e850Var11.b() == 0) {
                    F(i23, false);
                } else {
                    long j15 = this.k0;
                    long j16 = this.l0;
                    k kVar9 = e850Var11.c;
                    k kVar10 = e850Var11.a;
                    if (e850.g(kVar10)) {
                        kVar10.h(j15, j16);
                    }
                    if (kVar9 != null && kVar9.getState() != 0) {
                        kVar9.h(j15, j16);
                    }
                    if (z3) {
                        k kVar11 = e850Var11.c;
                        k kVar12 = e850Var11.a;
                        boolean zB5 = e850.g(kVar12) ? kVar12.b() : z;
                        if (kVar11 != null && kVar11.getState() != 0) {
                            zB5 &= kVar11.b();
                        }
                        if (zB5) {
                            z8 = z;
                        } else {
                            z8 = false;
                        }
                    } else {
                        z8 = false;
                    }
                    k kVarC3 = e850Var11.c(akvVar21);
                    boolean z17 = (kVarC3 == null || kVarC3.f() || kVarC3.isReady() || kVarC3.b()) ? z : false;
                    F(i23, z17);
                    z2 = (z2 && z17) ? z : false;
                    if (!z17) {
                        E(i23);
                    }
                    z3 = z8;
                }
                i23++;
            }
        } else {
            akvVar21.a.m();
            z2 = z;
            z3 = z2;
        }
        long j17 = akvVar21.g.e;
        if (z3 && akvVar21.e) {
            j = -9223372036854775807L;
            z4 = (j17 == -9223372036854775807L || j17 <= this.V.s) ? z : false;
            if (z4 && this.Z) {
                this.Z = false;
                int i24 = this.V.n;
                this.W.a(0);
                w0(this.P.d(this.V.e, false), i24, 5, false);
            }
            if (z4 || !akvVar21.g.j) {
                co10Var = this.V;
                if (co10Var.e == 2) {
                    hVar = this.H;
                    if (this.i0 == 0) {
                        zA = A();
                    } else if (!z2) {
                        zA = false;
                    } else if (co10Var.g) {
                        akvVar2 = hVar.j;
                        if (p0(co10Var.a, akvVar2.g.a)) {
                            j4 = ((tdd) this.J).h;
                        } else {
                            j4 = j;
                        }
                        akvVar3 = hVar.m;
                        if (akvVar3.g() || !akvVar3.g.j) {
                            z5 = false;
                        } else {
                            z5 = z;
                        }
                        if (akvVar3.g.a.b() || akvVar3.e) {
                            z6 = false;
                        } else {
                            z6 = z;
                        }
                        if (!z5 || z6) {
                            zA = z;
                        } else {
                            long jO = o(akvVar3.d());
                            androidx.media3.exoplayer.f fVar = this.f;
                            sp10 sp10Var = this.L;
                            qxf0 qxf0Var2 = this.V.a;
                            ekv.b bVar4 = akvVar2.g.a;
                            long j18 = this.k0 - akvVar2.p;
                            float f2 = this.D.c().a;
                            boolean z18 = this.V.l;
                            zA = fVar.a(new androidx.media3.exoplayer.f.a(sp10Var, qxf0Var2, bVar4, j18, jO, f2, this.a0, j4));
                        }
                    } else {
                        zA = z;
                    }
                    if (zA) {
                        k0(3);
                        this.o0 = null;
                        if (o0()) {
                            z0(false, false);
                            zdd zddVar2 = this.D;
                            zddVar2.f = z;
                            lvd0Var = zddVar2.a;
                            if (!lvd0Var.b) {
                                lvd0Var.d = lvd0Var.a.d();
                                lvd0Var.b = z;
                            }
                            q0();
                        }
                    }
                } else {
                    j = j;
                }
                if (this.V.e == 3 && (this.i0 != 0 ? !z2 : !A())) {
                    z0(o0(), false);
                    k0(2);
                    if (this.a0) {
                        for (akvVar = this.H.j; akvVar != null; akvVar = akvVar.m) {
                            for (oyg oygVar : akvVar.o.c) {
                                if (oygVar != null) {
                                    oygVar.t();
                                }
                            }
                        }
                        tddVar = (tdd) this.J;
                        j2 = tddVar.h;
                        if (j2 != j) {
                            long j19 = j2 + tddVar.b;
                            tddVar.h = j19;
                            j3 = tddVar.g;
                            if (j3 != j && j19 > j3) {
                                tddVar.h = j3;
                            }
                            tddVar.l = j;
                        }
                    }
                    s0();
                }
            } else {
                k0(4);
                s0();
            }
            if (this.V.e == 2) {
                i3 = 0;
                while (true) {
                    e850VarArr = this.a;
                    if (i3 < e850VarArr.length) {
                        break;
                    }
                    if (e850VarArr[i3].c(akvVar21) != null) {
                        E(i3);
                    }
                    i3++;
                }
                co10Var2 = this.V;
                if (co10Var2.g && co10Var2.r < 500000 && y(this.H.m) && o0()) {
                    long j20 = this.p0;
                    vs7 vs7Var = this.F;
                    if (j20 == -9223372036854775807L) {
                        this.p0 = vs7Var.d();
                    } else if (vs7Var.d() - this.p0 >= 4000) {
                        ib5.a("Playback stuck buffering and not loading");
                        return;
                    }
                } else {
                    this.p0 = -9223372036854775807L;
                }
            } else {
                this.p0 = -9223372036854775807L;
            }
            if (o0() || this.V.e != 3) {
                z7 = false;
            } else {
                z7 = z;
            }
            if (this.h0 || !this.g0 || !z7) {
                z = false;
            }
            co10VarI = this.V;
            if (co10VarI.p != z) {
                co10VarI = co10VarI.i(z);
                this.V = co10VarI;
            }
            this.g0 = false;
            if (!z && (i2 = co10VarI.e) != 4 && (z7 || i2 == 2 || (i2 == 3 && this.i0 != 0))) {
                T(jB);
            }
            Trace.endSection();
        }
        j = -9223372036854775807L;
        if (z4) {
            this.Z = false;
            int i25 = this.V.n;
            this.W.a(0);
            w0(this.P.d(this.V.e, false), i25, 5, false);
        }
        if (z4) {
            co10Var = this.V;
            if (co10Var.e == 2) {
                hVar = this.H;
                if (this.i0 == 0) {
                    zA = A();
                } else if (!z2) {
                    zA = false;
                } else if (co10Var.g) {
                    zA = z;
                } else {
                    akvVar2 = hVar.j;
                    if (p0(co10Var.a, akvVar2.g.a)) {
                        j4 = ((tdd) this.J).h;
                    } else {
                        j4 = j;
                    }
                    akvVar3 = hVar.m;
                    if (akvVar3.g()) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (akvVar3.g.a.b()) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (z5) {
                        zA = z;
                    } else {
                        zA = z;
                    }
                }
                if (zA) {
                    k0(3);
                    this.o0 = null;
                    if (o0()) {
                        z0(false, false);
                        zdd zddVar3 = this.D;
                        zddVar3.f = z;
                        lvd0Var = zddVar3.a;
                        if (!lvd0Var.b) {
                            lvd0Var.d = lvd0Var.a.d();
                            lvd0Var.b = z;
                        }
                        q0();
                    }
                }
            } else {
                j = j;
            }
            if (this.V.e == 3) {
                z0(o0(), false);
                k0(2);
                if (this.a0) {
                    while (akvVar != null) {
                        while (i < r4) {
                            if (oygVar != null) {
                                oygVar.t();
                            }
                        }
                    }
                    tddVar = (tdd) this.J;
                    j2 = tddVar.h;
                    if (j2 != j) {
                        long j110 = j2 + tddVar.b;
                        tddVar.h = j110;
                        j3 = tddVar.g;
                        if (j3 != j) {
                            tddVar.h = j3;
                        }
                        tddVar.l = j;
                    }
                }
                s0();
            }
        } else {
            co10Var = this.V;
            if (co10Var.e == 2) {
                hVar = this.H;
                if (this.i0 == 0) {
                    zA = A();
                } else if (!z2) {
                    zA = false;
                } else if (co10Var.g) {
                    zA = z;
                } else {
                    akvVar2 = hVar.j;
                    if (p0(co10Var.a, akvVar2.g.a)) {
                        j4 = ((tdd) this.J).h;
                    } else {
                        j4 = j;
                    }
                    akvVar3 = hVar.m;
                    if (akvVar3.g()) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (akvVar3.g.a.b()) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    if (z5) {
                        zA = z;
                    } else {
                        zA = z;
                    }
                }
                if (zA) {
                    k0(3);
                    this.o0 = null;
                    if (o0()) {
                        z0(false, false);
                        zdd zddVar4 = this.D;
                        zddVar4.f = z;
                        lvd0Var = zddVar4.a;
                        if (!lvd0Var.b) {
                            lvd0Var.d = lvd0Var.a.d();
                            lvd0Var.b = z;
                        }
                        q0();
                    }
                }
            } else {
                j = j;
            }
            if (this.V.e == 3) {
                z0(o0(), false);
                k0(2);
                if (this.a0) {
                    while (akvVar != null) {
                        while (i < r4) {
                            if (oygVar != null) {
                                oygVar.t();
                            }
                        }
                    }
                    tddVar = (tdd) this.J;
                    j2 = tddVar.h;
                    if (j2 != j) {
                        long j111 = j2 + tddVar.b;
                        tddVar.h = j111;
                        j3 = tddVar.g;
                        if (j3 != j) {
                            tddVar.h = j3;
                        }
                        tddVar.l = j;
                    }
                }
                s0();
            }
        }
        if (this.V.e == 2) {
            i3 = 0;
            while (true) {
                e850VarArr = this.a;
                if (i3 < e850VarArr.length) {
                    break;
                    break;
                } else {
                    if (e850VarArr[i3].c(akvVar21) != null) {
                        E(i3);
                    }
                    i3++;
                }
            }
            co10Var2 = this.V;
            if (co10Var2.g) {
                this.p0 = -9223372036854775807L;
            } else {
                this.p0 = -9223372036854775807L;
            }
        } else {
            this.p0 = -9223372036854775807L;
        }
        if (o0()) {
            z7 = false;
        } else {
            z7 = false;
        }
        if (this.h0) {
            z = false;
        } else {
            z = false;
        }
        co10VarI = this.V;
        if (co10VarI.p != z) {
            co10VarI = co10VarI.i(z);
            this.V = co10VarI;
        }
        this.g0 = false;
        if (!z) {
            T(jB);
        }
        Trace.endSection();
    }

    public final void h0(zr70 zr70Var) {
        this.R = zr70Var;
        b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        int i2;
        akv akvVar;
        ekv.b bVar;
        akv akvVar2;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.W.a(1);
                    w0(this.P.d(this.V.e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    V((g) message.obj, true);
                    break;
                case 4:
                    d0((eo10) message.obj);
                    break;
                case 5:
                    this.Q = (q480) message.obj;
                    break;
                case 6:
                    r0(false, true);
                    break;
                case 7:
                    J((eoa) message.obj);
                    return true;
                case 8:
                    v((zjv) message.obj);
                    break;
                case 9:
                    r((zjv) message.obj);
                    break;
                case 10:
                    M();
                    break;
                case 11:
                    f0(message.arg1);
                    break;
                case 12:
                    i0(message.arg1 != 0);
                    break;
                case 13:
                    a0(message.arg1 != 0, (eoa) message.obj);
                    break;
                case 14:
                    X((j) message.obj);
                    break;
                case 15:
                    Y((j) message.obj);
                    break;
                case 16:
                    eo10 eo10Var = (eo10) message.obj;
                    w(eo10Var, eo10Var.a, true, false);
                    break;
                case 17:
                    b0((b) message.obj);
                    break;
                case 18:
                    a((b) message.obj, message.arg1);
                    break;
                case 19:
                    H((c) message.obj);
                    break;
                case 20:
                    L(message.arg1, message.arg2, (tb90) message.obj);
                    break;
                case 21:
                    j0((tb90) message.obj);
                    break;
                case 22:
                    G();
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    c0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case KYCBannerItem.STATUS_DEPRECATE /* 25 */:
                    M();
                    U(true);
                    break;
                case RuntimeVersion.MINOR /* 26 */:
                    M();
                    U(true);
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    v0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    e0((ExoPlayer.c) message.obj);
                    break;
                case 29:
                    I();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    m0(pair.first, (eoa) pair.second);
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    Z((r21) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    n0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    q();
                    break;
                case 35:
                    l0((s4i0) message.obj);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    g0(((Boolean) message.obj).booleanValue());
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    this.T = false;
                    g gVar = this.U;
                    if (gVar != null) {
                        V(gVar, false);
                        this.U = null;
                    }
                    break;
                case 38:
                    h0((zr70) message.obj);
                    break;
            }
        } catch (ae2 e) {
            s(e, 1002);
        } catch (dqc e2) {
            s(e2, e2.a);
        } catch (IOException e3) {
            s(e3, 2000);
        } catch (RuntimeException e4) {
            rwg rwgVar = new rwg(2, e4, ((e4 instanceof IllegalStateException) || (e4 instanceof IllegalArgumentException)) ? 1004 : 1000);
            cft.d("ExoPlayerImplInternal", "Playback error", rwgVar);
            r0(true, false);
            this.V = this.V.f(rwgVar);
        } catch (lef.a e5) {
            s(e5, e5.a);
        } catch (rwg e6) {
            e = e6;
            int i5 = e.c;
            h hVar = this.H;
            if (i5 == 1 && (akvVar2 = hVar.k) != null && e.v == null) {
                e = e.b(akvVar2.g.a);
            }
            int i6 = e.c;
            cdl cdlVar = this.v;
            if (i6 == 1 && (bVar = e.v) != null && z(e.e, bVar)) {
                this.s0 = true;
                d();
                akv akvVar3 = hVar.l;
                akv akvVar4 = hVar.j;
                if (akvVar4 != akvVar3) {
                    while (akvVar4 != null) {
                        akv akvVar5 = akvVar4.m;
                        if (akvVar5 == akvVar3) {
                            break;
                        }
                        akvVar4 = akvVar5;
                    }
                }
                hVar.n(akvVar4);
                if (this.V.e != 4) {
                    B();
                    cdlVar.k(2);
                }
            } else {
                rwg rwgVar2 = this.o0;
                if (rwgVar2 != null) {
                    rwgVar2.addSuppressed(e);
                    e = this.o0;
                }
                if (e.c == 1 && hVar.j != hVar.k) {
                    while (true) {
                        akvVar = hVar.j;
                        if (akvVar == hVar.k) {
                            break;
                        }
                        hVar.a();
                    }
                    ly0.d(akvVar);
                    D();
                    bkv bkvVar = akvVar.g;
                    ekv.b bVar2 = bkvVar.a;
                    long j = bkvVar.b;
                    this.V = x(bVar2, j, bkvVar.c, j, true, 0);
                }
                if (e.w && (this.o0 == null || (i2 = e.a) == 5004 || i2 == 5003)) {
                    cft.h("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.o0 == null) {
                        this.o0 = e;
                    }
                    cdlVar.h(cdlVar.e(25, e));
                } else {
                    cft.d("ExoPlayerImplInternal", "Playback error", e);
                    r0(true, false);
                    this.V = this.V.f(e);
                }
            }
        } catch (ssz e7) {
            boolean z2 = e7.a;
            int i7 = e7.b;
            if (i7 == 1) {
                i = z2 ? 3001 : 3003;
            } else {
                if (i7 == 4) {
                    i = z2 ? 3002 : 3004;
                }
                s(e7, i3);
            }
            i3 = i;
            s(e7, i3);
        }
        D();
        return true;
    }

    public final void i(akv akvVar, int i, boolean z, long j) {
        e850 e850Var = this.a[i];
        if (e850Var.f()) {
            return;
        }
        boolean z2 = akvVar == this.H.j;
        ujg0 ujg0Var = akvVar.o;
        d850 d850Var = ujg0Var.b[i];
        oyg oygVar = ujg0Var.c[i];
        boolean z3 = o0() && this.V.e == 3;
        boolean z4 = !z && z3;
        this.i0++;
        rs60 rs60Var = akvVar.c[i];
        long j2 = akvVar.p;
        ekv.b bVar = akvVar.g.a;
        k kVar = e850Var.c;
        int length = oygVar != null ? oygVar.length() : 0;
        androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[length];
        for (int i2 = 0; i2 < length; i2++) {
            oygVar.getClass();
            aVarArr[i2] = oygVar.e(i2);
        }
        int i3 = e850Var.d;
        zdd zddVar = this.D;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            e850Var.e = true;
            e850Var.a.n(d850Var, aVarArr, rs60Var, z4, z2, j, j2, bVar);
            zddVar.a(e850Var.a);
        } else {
            e850Var.f = true;
            kVar.getClass();
            kVar.n(d850Var, aVarArr, rs60Var, z4, z2, j, j2, bVar);
            zddVar.a(kVar);
        }
        a aVar = new a();
        k kVarC = e850Var.c(akvVar);
        kVarC.getClass();
        kVarC.m(11, aVar);
        if (z3 && z2) {
            e850Var.l();
        }
    }

    public final void i0(boolean z) {
        this.e0 = z;
        qxf0 qxf0Var = this.V.a;
        h hVar = this.H;
        hVar.h = z;
        int iR = hVar.r(qxf0Var);
        if ((iR & 1) != 0) {
            U(true);
        } else if ((iR & 2) != 0) {
            d();
        }
        t(false);
    }

    public final void j(boolean[] zArr, long j) {
        e850[] e850VarArr;
        e eVar;
        long j2;
        akv akvVar = this.H.k;
        ujg0 ujg0Var = akvVar.o;
        int i = 0;
        while (true) {
            e850VarArr = this.a;
            if (i >= e850VarArr.length) {
                break;
            }
            if (!ujg0Var.b(i)) {
                e850VarArr[i].j();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < e850VarArr.length) {
            if (ujg0Var.b(i2) && e850VarArr[i2].c(akvVar) == null) {
                eVar = this;
                j2 = j;
                eVar.i(akvVar, i2, zArr[i2], j2);
            } else {
                eVar = this;
                j2 = j;
            }
            i2++;
            this = eVar;
            j = j2;
        }
    }

    public final void j0(tb90 tb90Var) throws Throwable {
        this.W.a(1);
        i iVar = this.I;
        int size = iVar.b.size();
        if (tb90Var.getLength() != size) {
            tb90Var = tb90Var.e().g(0, size);
        }
        iVar.j = tb90Var;
        u(iVar.b(), false);
    }

    @Override // defpackage.s4i0
    public final void k(long j, long j2, androidx.media3.common.a aVar, MediaFormat mediaFormat) {
        if (this.T) {
            this.v.c(37).b();
        }
    }

    public final void k0(int i) {
        co10 co10VarI = this.V;
        if (co10VarI.e != i) {
            if (i != 2) {
                this.p0 = -9223372036854775807L;
            }
            if (i != 3 && co10VarI.p) {
                co10VarI = co10VarI.i(false);
                this.V = co10VarI;
            }
            this.V = co10VarI.h(i);
        }
    }

    public final long l(qxf0 qxf0Var, Object obj, long j) {
        qxf0.b bVar = this.A;
        int i = qxf0Var.g(obj, bVar).c;
        qxf0.c cVar = this.z;
        qxf0Var.n(i, cVar);
        if (cVar.e == -9223372036854775807L || !cVar.a() || !cVar.h) {
            return -9223372036854775807L;
        }
        long j2 = cVar.f;
        return jrh0.O((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime()) - cVar.e) - (j + bVar.e);
    }

    public final void l0(s4i0 s4i0Var) {
        for (e850 e850Var : this.a) {
            k kVar = e850Var.a;
            if (kVar.q() == 2) {
                kVar.m(7, s4i0Var);
                k kVar2 = e850Var.c;
                if (kVar2 != null) {
                    kVar2.m(7, s4i0Var);
                }
            }
        }
    }

    public final long m(akv akvVar) {
        if (akvVar == null) {
            return 0L;
        }
        long jMax = akvVar.p;
        if (!akvVar.e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            e850[] e850VarArr = this.a;
            if (i >= e850VarArr.length) {
                return jMax;
            }
            if (e850VarArr[i].c(akvVar) != null) {
                k kVarC = e850VarArr[i].c(akvVar);
                Objects.requireNonNull(kVarC);
                long jA = kVarC.A();
                if (jA == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jA, jMax);
            }
            i++;
        }
    }

    public final void m0(Object obj, eoa eoaVar) {
        for (e850 e850Var : this.a) {
            k kVar = e850Var.a;
            if (kVar.q() == 2) {
                int i = e850Var.d;
                if (i == 4 || i == 1) {
                    k kVar2 = e850Var.c;
                    kVar2.getClass();
                    kVar2.m(1, obj);
                } else {
                    kVar.m(1, obj);
                }
            }
        }
        int i2 = this.V.e;
        if (i2 == 3 || i2 == 2) {
            this.v.k(2);
        }
        if (eoaVar != null) {
            eoaVar.c();
        }
    }

    public final Pair<ekv.b, Long> n(qxf0 qxf0Var) {
        long j = 0;
        if (qxf0Var.p()) {
            return Pair.create(co10.u, 0L);
        }
        int iA = qxf0Var.a(this.e0);
        Pair<Object, Long> pairI = qxf0Var.i(this.z, this.A, iA, -9223372036854775807L);
        ekv.b bVarP = this.H.p(qxf0Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (bVarP.b()) {
            Object obj = bVarP.a;
            qxf0.b bVar = this.A;
            qxf0Var.g(obj, bVar);
            if (bVarP.c == bVar.e(bVarP.b)) {
                bVar.g.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(bVarP, Long.valueOf(j));
    }

    public final void n0(float f2) {
        this.t0 = f2;
        float f3 = f2 * this.P.g;
        for (e850 e850Var : this.a) {
            k kVar = e850Var.a;
            if (kVar.q() == 1) {
                kVar.m(2, Float.valueOf(f3));
                k kVar2 = e850Var.c;
                if (kVar2 != null) {
                    kVar2.m(2, Float.valueOf(f3));
                }
            }
        }
    }

    public final long o(long j) {
        akv akvVar = this.H.m;
        if (akvVar == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.k0 - akvVar.p));
    }

    public final boolean o0() {
        co10 co10Var = this.V;
        return co10Var.l && co10Var.n == 0;
    }

    public final void p(int i) {
        co10 co10Var = this.V;
        w0(i, co10Var.n, co10Var.m, co10Var.l);
    }

    public final boolean p0(qxf0 qxf0Var, ekv.b bVar) {
        if (bVar.b() || qxf0Var.p()) {
            return false;
        }
        int i = qxf0Var.g(bVar.a, this.A).c;
        qxf0.c cVar = this.z;
        qxf0Var.n(i, cVar);
        return cVar.a() && cVar.h && cVar.e != -9223372036854775807L;
    }

    public final void q() {
        n0(this.t0);
    }

    public final void q0() {
        akv akvVar = this.H.j;
        if (akvVar == null) {
            return;
        }
        ujg0 ujg0Var = akvVar.o;
        int i = 0;
        while (true) {
            e850[] e850VarArr = this.a;
            if (i >= e850VarArr.length) {
                return;
            }
            if (ujg0Var.b(i)) {
                e850VarArr[i].l();
            }
            i++;
        }
    }

    public final void r(zjv zjvVar) {
        h hVar = this.H;
        akv akvVar = hVar.m;
        if (akvVar != null && akvVar.a == zjvVar) {
            hVar.l(this.k0);
            B();
            return;
        }
        akv akvVar2 = hVar.n;
        if (akvVar2 == null || akvVar2.a != zjvVar) {
            return;
        }
        C();
    }

    public final void r0(boolean z, boolean z2) {
        N(z || !this.f0, false, true, false);
        this.W.a(z2 ? 1 : 0);
        this.f.h(this.L);
        this.P.d(1, this.V.l);
        k0(1);
    }

    public final void s(IOException iOException, int i) {
        rwg rwgVar = new rwg(0, iOException, i);
        akv akvVar = this.H.j;
        if (akvVar != null) {
            rwgVar = rwgVar.b(akvVar.g.a);
        }
        cft.d("ExoPlayerImplInternal", "Playback error", rwgVar);
        r0(false, false);
        this.V = this.V.f(rwgVar);
    }

    public final void s0() {
        zdd zddVar = this.D;
        zddVar.f = false;
        lvd0 lvd0Var = zddVar.a;
        if (lvd0Var.b) {
            lvd0Var.a(lvd0Var.v());
            lvd0Var.b = false;
        }
        for (e850 e850Var : this.a) {
            k kVar = e850Var.c;
            k kVar2 = e850Var.a;
            if (e850.g(kVar2) && kVar2.getState() == 2) {
                kVar2.stop();
            }
            if (kVar != null && kVar.getState() != 0 && kVar.getState() == 2) {
                kVar.stop();
            }
        }
    }

    public final void t(boolean z) {
        akv akvVar = this.H.m;
        ekv.b bVar = akvVar == null ? this.V.b : akvVar.g.a;
        boolean zEquals = this.V.k.equals(bVar);
        if (!zEquals) {
            this.V = this.V.c(bVar);
        }
        co10 co10Var = this.V;
        co10Var.q = akvVar == null ? co10Var.s : akvVar.d();
        co10 co10Var2 = this.V;
        co10Var2.r = o(co10Var2.q);
        if ((!zEquals || z) && akvVar != null && akvVar.e) {
            u0(akvVar.g.a, akvVar.n, akvVar.o);
        }
    }

    public final void t0() {
        akv akvVar = this.H.m;
        boolean z = this.c0 || (akvVar != null && akvVar.a.a());
        co10 co10Var = this.V;
        if (z != co10Var.g) {
            this.V = co10Var.b(z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:199:0x033c  */
    /* JADX WARN: Code duplicated, block: B:200:0x033f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0354  */
    /* JADX WARN: Code duplicated, block: B:207:0x035e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:213:0x0373  */
    /* JADX WARN: Code duplicated, block: B:216:0x037e  */
    /* JADX WARN: Code duplicated, block: B:218:0x0383  */
    /* JADX WARN: Code duplicated, block: B:222:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:227:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:228:0x03be  */
    /* JADX WARN: Code duplicated, block: B:231:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:233:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:235:0x03db A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:244:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:246:0x0400  */
    /* JADX WARN: Code duplicated, block: B:250:0x0421  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [qxf0] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v12 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v17 */
    /* JADX WARN: Type inference failed for: r25v19 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v20 */
    /* JADX WARN: Type inference failed for: r25v21 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r2v10, types: [qxf0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [co10] */
    /* JADX WARN: Type inference failed for: r2v34, types: [androidx.media3.exoplayer.h] */
    /* JADX WARN: Type inference failed for: r35v0, types: [androidx.media3.exoplayer.e] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v25, types: [qxf0] */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u(qxf0 qxf0Var, boolean z) throws Throwable {
        long jLongValue;
        qxf0 qxf0Var2;
        qxf0.c cVar;
        Object obj;
        int iA;
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        long j3;
        long j4;
        f fVar;
        int i;
        long jLongValue2;
        boolean z6;
        boolean z7;
        boolean z8;
        ?? r25;
        ?? r11;
        ekv.b bVar;
        ?? r26;
        long j5;
        ekv.b bVar2;
        Object obj2;
        ?? r9;
        int i2;
        boolean z9;
        ?? r27;
        ?? r8;
        qxf0 qxf0Var3;
        akv akvVar;
        boolean z10;
        long j6;
        ekv.b bVar3;
        Object obj3;
        boolean z11;
        int i3;
        co10 co10Var = this.V;
        g gVar = this.j0;
        h hVar = this.H;
        int i4 = this.d0;
        boolean z12 = this.e0;
        qxf0.c cVar2 = this.z;
        qxf0.b bVar4 = this.A;
        int i5 = 4;
        if (qxf0Var.p()) {
            r25 = 1;
            jLongValue = 0;
            qxf0Var2 = qxf0Var;
            fVar = new f(co10.u, 0L, -9223372036854775807L, false, true, false);
        } else {
            ekv.b bVar5 = co10Var.b;
            Object obj4 = bVar5.a;
            qxf0 qxf0Var4 = co10Var.a;
            boolean z13 = qxf0Var4.p() || qxf0Var4.g(bVar5.a, bVar4).f;
            jLongValue = (co10Var.b.b() || z13) ? co10Var.c : co10Var.s;
            if (gVar != null) {
                boolean z14 = false;
                qxf0Var2 = qxf0Var;
                Pair<Object, Long> pairR = R(qxf0Var2, gVar, true, i4, z12, cVar2, bVar4);
                if (pairR == null) {
                    iA = qxf0Var2.a(z12);
                    obj = obj4;
                    z7 = false;
                    jLongValue2 = jLongValue;
                    z8 = true;
                } else {
                    long j7 = gVar.c;
                    obj = pairR.first;
                    if (j7 == -9223372036854775807L) {
                        iA = qxf0Var2.g(obj, bVar4).c;
                        obj = obj4;
                        z6 = false;
                        jLongValue2 = jLongValue;
                    } else {
                        jLongValue2 = ((Long) pairR.second).longValue();
                        iA = -1;
                        z6 = true;
                    }
                    z14 = co10Var.e == 4;
                    z7 = z6;
                    z8 = false;
                }
                jLongValue = jLongValue2;
                cVar = cVar2;
                z3 = z8;
                z2 = z14;
                z4 = z7;
            } else {
                qxf0Var2 = qxf0Var;
                if (co10Var.a.p()) {
                    iA = qxf0Var2.a(z12);
                    cVar = cVar2;
                    obj = obj4;
                } else if (qxf0Var2.b(obj4) == -1) {
                    int iS = S(cVar2, bVar4, i4, z12, obj, co10Var.a, qxf0Var2);
                    cVar = cVar2;
                    if (iS == -1) {
                        obj = obj4;
                        qxf0Var2 = qxf0Var2;
                        bVar4 = bVar4;
                        iS = qxf0Var2.a(z12);
                        z5 = true;
                    } else {
                        obj = obj4;
                        qxf0Var2 = qxf0Var2;
                        bVar4 = bVar4;
                        z5 = false;
                    }
                    iA = iS;
                    z3 = z5;
                    jLongValue = jLongValue;
                    z2 = false;
                    z4 = false;
                } else {
                    cVar = cVar2;
                    if (jLongValue == -9223372036854775807L) {
                        obj = obj4;
                        iA = qxf0Var2.g(obj, bVar4).c;
                    } else if (z13) {
                        co10Var.a.g(bVar5.a, bVar4);
                        if (co10Var.a.m(bVar4.c, cVar, 0L).m == co10Var.a.b(bVar5.a)) {
                            Pair<Object, Long> pairI = qxf0Var2.i(cVar, bVar4, qxf0Var2.g(obj, bVar4).c, jLongValue + bVar4.e);
                            obj = pairI.first;
                            j = ((Long) pairI.second).longValue();
                        } else {
                            j = qxf0Var2.g(obj, bVar4).d != -9223372036854775807L ? jrh0.j(jLongValue, 0L, bVar4.d - 1) : jLongValue;
                        }
                        jLongValue = j;
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                    } else {
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        z4 = false;
                    }
                }
                z2 = false;
                z3 = false;
                z4 = false;
            }
            if (iA != -1) {
                Pair<Object, Long> pairI2 = qxf0Var2.i(cVar, bVar4, iA, -9223372036854775807L);
                obj = pairI2.first;
                jLongValue = ((Long) pairI2.second).longValue();
                j3 = -9223372036854775807L;
                j2 = jLongValue;
            } else {
                j2 = jLongValue;
                j3 = j2;
            }
            ekv.b bVarP = hVar.p(qxf0Var2, obj, j2);
            int i6 = bVarP.e;
            boolean z15 = bVar5.a.equals(obj) && !bVar5.b() && !bVarP.b() && (i6 == -1 || ((i = bVar5.e) != -1 && i6 >= i));
            qxf0.b bVarG = qxf0Var2.g(obj, bVar4);
            if (!z13 && jLongValue == j3) {
                Object obj5 = bVar5.a;
                int i7 = bVar5.b;
                if (obj5.equals(bVarP.a)) {
                    if (bVar5.b()) {
                        bVarG.g(i7);
                    }
                    if (bVarP.b()) {
                        bVarG.g(bVarP.b);
                    }
                }
            }
            if (z15) {
                bVarP = bVar5;
            }
            if (!bVarP.b()) {
                j4 = j2;
            } else if (bVarP.equals(bVar5)) {
                j2 = co10Var.s;
                j4 = j2;
            } else {
                qxf0Var2.g(bVarP.a, bVar4);
                if (bVarP.c == bVar4.e(bVarP.b)) {
                    bVar4.g.getClass();
                }
                j4 = 0;
            }
            ekv.b bVar6 = bVarP;
            fVar = new f(bVar6, j4, j3, z2, z3, z4);
            r25 = bVar6;
        }
        ekv.b bVar7 = fVar.a;
        long j8 = fVar.c;
        boolean z16 = fVar.d;
        long j9 = fVar.b;
        boolean z17 = (this.V.b.equals(bVar7) && j9 == this.V.s) ? false : true;
        try {
            if (fVar.e) {
                try {
                    z9 = true;
                    z9 = true;
                    if (this.V.e != 1) {
                        try {
                            k0(4);
                        } catch (Throwable th) {
                            th = th;
                            r11 = qxf0Var2;
                            bVar = bVar7;
                            jLongValue = j9;
                            r26 = z9;
                            i5 = 2;
                        }
                    }
                    N(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z9 = true;
                    r11 = qxf0Var2;
                    bVar = bVar7;
                    jLongValue = j9;
                    r26 = z9;
                    i5 = 2;
                }
            } else {
                z9 = true;
            }
            e850[] e850VarArr = this.a;
            int length = e850VarArr.length;
            int i8 = 0;
            ?? r10 = z9;
            while (i8 < length) {
                e850 e850Var = e850VarArr[i8];
                e850Var.a.r(qxf0Var2);
                k kVar = e850Var.c;
                if (kVar != null) {
                    kVar.r(qxf0Var2);
                }
                i8++;
                r10 = 1;
            }
            try {
                if (z17) {
                    r10 = qxf0Var2;
                    jLongValue = j9;
                    i5 = 2;
                    z10 = true;
                    z10 = true;
                    r27 = 1;
                    r25 = 1;
                    if (r10.p()) {
                        bVar = bVar7;
                    } else {
                        for (akv akvVar2 = this.H.j; akvVar2 != null; akvVar2 = akvVar2.m) {
                            if (akvVar2.g.a.equals(bVar7)) {
                                akvVar2.g = this.H.g(r10, akvVar2.g);
                                akvVar2.k();
                            }
                        }
                        try {
                            h hVar2 = this.H;
                            bVar = bVar7;
                            try {
                                jLongValue = W(bVar, jLongValue, hVar2.j != hVar2.k, z16);
                            } catch (Throwable th3) {
                                th = th3;
                                jLongValue = jLongValue;
                                r8 = r10;
                                r11 = r8;
                                r26 = r27;
                                co10 co10Var2 = this.V;
                                qxf0 qxf0Var5 = co10Var2.a;
                                ekv.b bVar8 = co10Var2.b;
                                if (fVar.f) {
                                    j5 = jLongValue;
                                } else {
                                    j5 = -9223372036854775807L;
                                }
                                bVar2 = bVar;
                                y0(r11, bVar2, qxf0Var5, bVar8, j5, false);
                                if (z17) {
                                    co10 co10Var3 = this.V;
                                    obj2 = co10Var3.b.a;
                                    qxf0 qxf0Var6 = co10Var3.a;
                                    if (z17) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    long j10 = this.V.d;
                                    if (r11.b(obj2) == -1) {
                                        i2 = 4;
                                    } else {
                                        i2 = 3;
                                    }
                                    this.V = x(bVar2, jLongValue, j8, j10, r9, i2);
                                } else {
                                    co10 co10Var4 = this.V;
                                    obj2 = co10Var4.b.a;
                                    qxf0 qxf0Var7 = co10Var4.a;
                                    if (z17) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    long j11 = this.V.d;
                                    if (r11.b(obj2) == -1) {
                                        i2 = 4;
                                    } else {
                                        i2 = 3;
                                    }
                                    this.V = x(bVar2, jLongValue, j8, j11, r9, i2);
                                }
                                O();
                                Q(r11, this.V.a);
                                this.V = this.V.j(r11);
                                if (!r11.p()) {
                                    this.j0 = null;
                                }
                                t(false);
                                this.v.k(i5);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            bVar = bVar7;
                            r8 = r10;
                            r27 = r25;
                            r11 = r8;
                            r26 = r27;
                            co10 co10Var5 = this.V;
                            qxf0 qxf0Var8 = co10Var5.a;
                            ekv.b bVar9 = co10Var5.b;
                            if (fVar.f) {
                                j5 = jLongValue;
                            } else {
                                j5 = -9223372036854775807L;
                            }
                            bVar2 = bVar;
                            y0(r11, bVar2, qxf0Var8, bVar9, j5, false);
                            if (z17) {
                                co10 co10Var6 = this.V;
                                obj2 = co10Var6.b.a;
                                qxf0 qxf0Var9 = co10Var6.a;
                                if (z17) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                long j12 = this.V.d;
                                if (r11.b(obj2) == -1) {
                                    i2 = 4;
                                } else {
                                    i2 = 3;
                                }
                                this.V = x(bVar2, jLongValue, j8, j12, r9, i2);
                            } else {
                                co10 co10Var7 = this.V;
                                obj2 = co10Var7.b.a;
                                qxf0 qxf0Var10 = co10Var7.a;
                                if (z17) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                long j13 = this.V.d;
                                if (r11.b(obj2) == -1) {
                                    i2 = 4;
                                } else {
                                    i2 = 3;
                                }
                                this.V = x(bVar2, jLongValue, j8, j13, r9, i2);
                            }
                            O();
                            Q(r11, this.V.a);
                            this.V = this.V.j(r11);
                            if (!r11.p()) {
                                this.j0 = null;
                            }
                            t(false);
                            this.v.k(i5);
                            throw th;
                        }
                    }
                    co10 co10Var8 = this.V;
                    qxf0 qxf0Var11 = co10Var8.a;
                    ekv.b bVar10 = co10Var8.b;
                    if (fVar.f) {
                        j6 = jLongValue;
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    bVar3 = bVar;
                    y0(qxf0Var, bVar3, qxf0Var11, bVar10, j6, false);
                    if (z17) {
                        co10 co10Var9 = this.V;
                        obj3 = co10Var9.b.a;
                        qxf0 qxf0Var12 = co10Var9.a;
                        if (z17) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        long j14 = this.V.d;
                        if (qxf0Var.b(obj3) == -1) {
                            i3 = 4;
                        } else {
                            i3 = 3;
                        }
                        this.V = x(bVar3, jLongValue, j8, j14, z11, i3);
                    } else {
                        co10 co10Var10 = this.V;
                        obj3 = co10Var10.b.a;
                        qxf0 qxf0Var13 = co10Var10.a;
                        if (z17) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        long j15 = this.V.d;
                        if (qxf0Var.b(obj3) == -1) {
                            i3 = 4;
                        } else {
                            i3 = 3;
                        }
                        this.V = x(bVar3, jLongValue, j8, j15, z11, i3);
                    }
                    O();
                    Q(qxf0Var, this.V.a);
                    this.V = this.V.j(qxf0Var);
                    if (!qxf0Var.p()) {
                        this.j0 = null;
                    }
                    t(false);
                    this.v.k(i5);
                    return;
                }
                try {
                    akv akvVar3 = this.H.k;
                    try {
                        jLongValue = j9;
                        try {
                            i5 = 2;
                            r25 = 1;
                            z10 = true;
                            z10 = true;
                            z10 = true;
                            try {
                                int iS2 = this.H.s(qxf0Var, this.k0, akvVar3 == null ? 0L : m(akvVar3), (!c() || (akvVar = this.H.l) == null) ? 0L : m(akvVar));
                                if ((iS2 & 1) != 0) {
                                    U(false);
                                } else if ((iS2 & 2) != 0) {
                                    d();
                                }
                                bVar = bVar7;
                                co10 co10Var11 = this.V;
                                qxf0 qxf0Var14 = co10Var11.a;
                                ekv.b bVar11 = co10Var11.b;
                                if (fVar.f) {
                                    j6 = jLongValue;
                                } else {
                                    j6 = -9223372036854775807L;
                                }
                                bVar3 = bVar;
                                y0(qxf0Var, bVar3, qxf0Var14, bVar11, j6, false);
                                if (z17 || j8 != this.V.c) {
                                    co10 co10Var12 = this.V;
                                    obj3 = co10Var12.b.a;
                                    qxf0 qxf0Var15 = co10Var12.a;
                                    if (z17 || !z || qxf0Var15.p() || qxf0Var15.g(obj3, this.A).f) {
                                        z11 = false;
                                    } else {
                                        z11 = z10;
                                    }
                                    long j16 = this.V.d;
                                    if (qxf0Var.b(obj3) == -1) {
                                        i3 = 4;
                                    } else {
                                        i3 = 3;
                                    }
                                    this.V = x(bVar3, jLongValue, j8, j16, z11, i3);
                                }
                                O();
                                Q(qxf0Var, this.V.a);
                                this.V = this.V.j(qxf0Var);
                                if (!qxf0Var.p()) {
                                    this.j0 = null;
                                }
                                t(false);
                                this.v.k(i5);
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                r10 = qxf0Var;
                                bVar = bVar7;
                                r8 = r10;
                                r27 = r25;
                                r11 = r8;
                                r26 = r27;
                                co10 co10Var13 = this.V;
                                qxf0 qxf0Var16 = co10Var13.a;
                                ekv.b bVar12 = co10Var13.b;
                                if (fVar.f) {
                                    j5 = jLongValue;
                                } else {
                                    j5 = -9223372036854775807L;
                                }
                                bVar2 = bVar;
                                y0(r11, bVar2, qxf0Var16, bVar12, j5, false);
                                if (z17) {
                                    co10 co10Var14 = this.V;
                                    obj2 = co10Var14.b.a;
                                    qxf0 qxf0Var17 = co10Var14.a;
                                    if (z17) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    long j17 = this.V.d;
                                    if (r11.b(obj2) == -1) {
                                        i2 = 4;
                                    } else {
                                        i2 = 3;
                                    }
                                    this.V = x(bVar2, jLongValue, j8, j17, r9, i2);
                                } else {
                                    co10 co10Var15 = this.V;
                                    obj2 = co10Var15.b.a;
                                    qxf0 qxf0Var18 = co10Var15.a;
                                    if (z17) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    long j18 = this.V.d;
                                    if (r11.b(obj2) == -1) {
                                        i2 = 4;
                                    } else {
                                        i2 = 3;
                                    }
                                    this.V = x(bVar2, jLongValue, j8, j18, r9, i2);
                                }
                                O();
                                Q(r11, this.V.a);
                                this.V = this.V.j(r11);
                                if (!r11.p()) {
                                    this.j0 = null;
                                }
                                t(false);
                                this.v.k(i5);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            r10 = qxf0Var;
                            i5 = 2;
                            r25 = 1;
                            bVar = bVar7;
                            r8 = r10;
                            r27 = r25;
                            r11 = r8;
                            r26 = r27;
                            co10 co10Var16 = this.V;
                            qxf0 qxf0Var19 = co10Var16.a;
                            ekv.b bVar13 = co10Var16.b;
                            if (fVar.f) {
                                j5 = jLongValue;
                            } else {
                                j5 = -9223372036854775807L;
                            }
                            bVar2 = bVar;
                            y0(r11, bVar2, qxf0Var19, bVar13, j5, false);
                            if (z17) {
                                co10 co10Var17 = this.V;
                                obj2 = co10Var17.b.a;
                                qxf0 qxf0Var110 = co10Var17.a;
                                if (z17) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                long j19 = this.V.d;
                                if (r11.b(obj2) == -1) {
                                    i2 = 4;
                                } else {
                                    i2 = 3;
                                }
                                this.V = x(bVar2, jLongValue, j8, j19, r9, i2);
                            } else {
                                co10 co10Var18 = this.V;
                                obj2 = co10Var18.b.a;
                                qxf0 qxf0Var111 = co10Var18.a;
                                if (z17) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                long j110 = this.V.d;
                                if (r11.b(obj2) == -1) {
                                    i2 = 4;
                                } else {
                                    i2 = 3;
                                }
                                this.V = x(bVar2, jLongValue, j8, j110, r9, i2);
                            }
                            O();
                            Q(r11, this.V.a);
                            this.V = this.V.j(r11);
                            if (!r11.p()) {
                                this.j0 = null;
                            }
                            t(false);
                            this.v.k(i5);
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        qxf0Var3 = qxf0Var;
                        jLongValue = j9;
                        r10 = qxf0Var3;
                        i5 = 2;
                        r25 = 1;
                        bVar = bVar7;
                        r8 = r10;
                        r27 = r25;
                        r11 = r8;
                        r26 = r27;
                        co10 co10Var19 = this.V;
                        qxf0 qxf0Var112 = co10Var19.a;
                        ekv.b bVar14 = co10Var19.b;
                        if (fVar.f) {
                            j5 = jLongValue;
                        } else {
                            j5 = -9223372036854775807L;
                        }
                        bVar2 = bVar;
                        y0(r11, bVar2, qxf0Var112, bVar14, j5, false);
                        if (z17) {
                            co10 co10Var110 = this.V;
                            obj2 = co10Var110.b.a;
                            qxf0 qxf0Var113 = co10Var110.a;
                            if (z17) {
                                r9 = 0;
                            } else {
                                r9 = 0;
                            }
                            long j111 = this.V.d;
                            if (r11.b(obj2) == -1) {
                                i2 = 4;
                            } else {
                                i2 = 3;
                            }
                            this.V = x(bVar2, jLongValue, j8, j111, r9, i2);
                        } else {
                            co10 co10Var111 = this.V;
                            obj2 = co10Var111.b.a;
                            qxf0 qxf0Var114 = co10Var111.a;
                            if (z17) {
                                r9 = 0;
                            } else {
                                r9 = 0;
                            }
                            long j112 = this.V.d;
                            if (r11.b(obj2) == -1) {
                                i2 = 4;
                            } else {
                                i2 = 3;
                            }
                            this.V = x(bVar2, jLongValue, j8, j112, r9, i2);
                        }
                        O();
                        Q(r11, this.V.a);
                        this.V = this.V.j(r11);
                        if (!r11.p()) {
                            this.j0 = null;
                        }
                        t(false);
                        this.v.k(i5);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    qxf0Var3 = qxf0Var2;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            r11 = qxf0Var2;
            bVar = bVar7;
            jLongValue = j9;
            i5 = 2;
            r26 = 1;
        }
        co10 co10Var112 = this.V;
        qxf0 qxf0Var115 = co10Var112.a;
        ekv.b bVar15 = co10Var112.b;
        if (fVar.f) {
            j5 = jLongValue;
        } else {
            j5 = -9223372036854775807L;
        }
        bVar2 = bVar;
        y0(r11, bVar2, qxf0Var115, bVar15, j5, false);
        if (z17 || j8 != this.V.c) {
            co10 co10Var113 = this.V;
            obj2 = co10Var113.b.a;
            qxf0 qxf0Var116 = co10Var113.a;
            if (z17 || !z || qxf0Var116.p() || qxf0Var116.g(obj2, this.A).f) {
                r9 = 0;
            } else {
                r9 = r26;
            }
            long j113 = this.V.d;
            if (r11.b(obj2) == -1) {
                i2 = 4;
            } else {
                i2 = 3;
            }
            this.V = x(bVar2, jLongValue, j8, j113, r9, i2);
        }
        O();
        Q(r11, this.V.a);
        this.V = this.V.j(r11);
        if (!r11.p()) {
            this.j0 = null;
        }
        t(false);
        this.v.k(i5);
        throw th;
    }

    public final void u0(ekv.b bVar, ljg0 ljg0Var, ujg0 ujg0Var) {
        h hVar = this.H;
        akv akvVar = hVar.m;
        akvVar.getClass();
        akv akvVar2 = hVar.j;
        long j = this.k0;
        long j2 = akvVar.p;
        if (akvVar != akvVar2) {
            j -= j2;
            j2 = akvVar.g.b;
        }
        long j3 = j - j2;
        long jO = o(akvVar.d());
        long j4 = p0(this.V.a, akvVar.g.a) ? ((tdd) this.J).h : -9223372036854775807L;
        qxf0 qxf0Var = this.V.a;
        float f2 = this.D.c().a;
        boolean z = this.V.l;
        this.f.j(new androidx.media3.exoplayer.f.a(this.L, qxf0Var, bVar, j3, jO, f2, this.a0, j4), ujg0Var.c);
    }

    public final void v(zjv zjvVar) {
        akv akvVar;
        e eVar;
        h hVar = this.H;
        akv akvVar2 = hVar.m;
        zdd zddVar = this.D;
        if (akvVar2 != null && akvVar2.a == zjvVar) {
            akvVar2.getClass();
            if (!akvVar2.e) {
                float f2 = zddVar.c().a;
                co10 co10Var = this.V;
                akvVar2.f(f2, co10Var.a, co10Var.l);
            }
            u0(akvVar2.g.a, akvVar2.n, akvVar2.o);
            if (akvVar2 == hVar.j) {
                P(akvVar2.g.b);
                j(new boolean[this.a.length], hVar.k.e());
                akvVar2.h = true;
                co10 co10Var2 = this.V;
                ekv.b bVar = co10Var2.b;
                long j = akvVar2.g.b;
                eVar = this;
                eVar.V = x(bVar, j, co10Var2.c, j, false, 5);
            } else {
                eVar = this;
            }
            eVar.B();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= hVar.r.size()) {
                akvVar = null;
                break;
            }
            akvVar = (akv) hVar.r.get(i);
            if (akvVar.a == zjvVar) {
                break;
            } else {
                i++;
            }
        }
        if (akvVar != null) {
            ly0.f(!akvVar.e);
            float f3 = zddVar.c().a;
            co10 co10Var3 = this.V;
            akvVar.f(f3, co10Var3.a, co10Var3.l);
            akv akvVar3 = hVar.n;
            if (akvVar3 == null || akvVar3.a != zjvVar) {
                return;
            }
            C();
        }
    }

    public final void v0(int i, int i2, List<njv> list) throws Throwable {
        this.W.a(1);
        i iVar = this.I;
        iVar.getClass();
        ArrayList arrayList = iVar.b;
        ly0.b(i >= 0 && i <= i2 && i2 <= arrayList.size());
        ly0.b(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((i.c) arrayList.get(i3)).a.g(list.get(i3 - i));
        }
        u(iVar.b(), false);
    }

    public final void w(eo10 eo10Var, float f2, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.W.a(1);
            }
            this.V = this.V.g(eo10Var);
        }
        float f3 = eo10Var.a;
        akv akvVar = this.H.j;
        while (true) {
            i = 0;
            if (akvVar == null) {
                break;
            }
            oyg[] oygVarArr = akvVar.o.c;
            int length = oygVarArr.length;
            while (i < length) {
                oyg oygVar = oygVarArr[i];
                if (oygVar != null) {
                    oygVar.h(f3);
                }
                i++;
            }
            akvVar = akvVar.m;
        }
        e850[] e850VarArr = this.a;
        int length2 = e850VarArr.length;
        while (i < length2) {
            e850 e850Var = e850VarArr[i];
            float f4 = eo10Var.a;
            e850Var.a.w(f2, f4);
            k kVar = e850Var.c;
            if (kVar != null) {
                kVar.w(f2, f4);
            }
            i++;
        }
    }

    public final void w0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        co10 co10Var = this.V;
        if (co10Var.l == z2 && co10Var.n == i2 && co10Var.m == i3) {
            return;
        }
        this.V = co10Var.e(i3, i2, z2);
        z0(false, false);
        h hVar = this.H;
        for (akv akvVar = hVar.j; akvVar != null; akvVar = akvVar.m) {
            for (oyg oygVar : akvVar.o.c) {
                if (oygVar != null) {
                    oygVar.n(z2);
                }
            }
        }
        if (!o0()) {
            s0();
            x0();
            co10 co10Var2 = this.V;
            if (co10Var2.p) {
                this.V = co10Var2.i(false);
            }
            hVar.l(this.k0);
            return;
        }
        int i4 = this.V.e;
        cdl cdlVar = this.v;
        if (i4 != 3) {
            if (i4 == 2) {
                cdlVar.k(2);
                return;
            }
            return;
        }
        zdd zddVar = this.D;
        zddVar.f = true;
        lvd0 lvd0Var = zddVar.a;
        if (!lvd0Var.b) {
            lvd0Var.d = lvd0Var.a.d();
            lvd0Var.b = true;
        }
        q0();
        cdlVar.k(2);
    }

    public final co10 x(ekv.b bVar, long j, long j2, long j3, boolean z, int i) {
        c150 c150VarG;
        boolean z2;
        this.n0 = (!this.n0 && j == this.V.s && bVar.equals(this.V.b)) ? false : true;
        O();
        co10 co10Var = this.V;
        ljg0 ljg0Var = co10Var.h;
        ujg0 ujg0Var = co10Var.i;
        List<uov> list = co10Var.j;
        if (this.I.k) {
            akv akvVar = this.H.j;
            ljg0Var = akvVar == null ? ljg0.d : akvVar.n;
            ujg0Var = akvVar == null ? this.e : akvVar.o;
            oyg[] oygVarArr = ujg0Var.c;
            pcn.a aVar = new pcn.a();
            boolean z3 = false;
            for (oyg oygVar : oygVarArr) {
                if (oygVar != null) {
                    uov uovVar = oygVar.e(0).l;
                    if (uovVar == null) {
                        aVar.c(new uov(new uov.a[0]));
                    } else {
                        aVar.c(uovVar);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                c150VarG = aVar.g();
            } else {
                pcn.b bVar2 = pcn.b;
                c150VarG = c150.e;
            }
            list = c150VarG;
            if (akvVar != null) {
                bkv bkvVar = akvVar.g;
                if (bkvVar.c != j2) {
                    akvVar.g = bkvVar.a(j2);
                }
            }
            e850[] e850VarArr = this.a;
            h hVar = this.H;
            akv akvVar2 = hVar.j;
            if (akvVar2 == hVar.k && akvVar2 != null) {
                ujg0 ujg0Var2 = akvVar2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= e850VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (ujg0Var2.b(i2)) {
                        if (e850VarArr[i2].a.q() != 1) {
                            z2 = false;
                            break;
                        }
                        if (ujg0Var2.b[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.h0) {
                    this.h0 = z5;
                    if (!z5 && this.V.p) {
                        this.v.k(2);
                    }
                }
            }
        } else if (!bVar.equals(co10Var.b)) {
            ljg0Var = ljg0.d;
            ujg0Var = this.e;
            pcn.b bVar3 = pcn.b;
            list = c150.e;
        }
        ujg0 ujg0Var3 = ujg0Var;
        List<uov> list2 = list;
        ljg0 ljg0Var2 = ljg0Var;
        if (z) {
            C0064e c0064e = this.W;
            if (!c0064e.d || c0064e.e == 5) {
                c0064e.a = true;
                c0064e.d = true;
                c0064e.e = i;
            } else {
                ly0.b(i == 5);
            }
        }
        co10 co10Var2 = this.V;
        return co10Var2.d(bVar, j, j2, j3, o(co10Var2.q), ljg0Var2, ujg0Var3, list2);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x0() {
        long j;
        int i;
        boolean z;
        eo10 eo10VarC;
        float f2;
        long j2;
        akv akvVar = this.H.j;
        if (akvVar == null) {
            return;
        }
        long j3 = akvVar.e ? akvVar.a.j() : -9223372036854775807L;
        if (j3 != -9223372036854775807L) {
            if (!akvVar.g()) {
                this.H.n(akvVar);
                t(false);
                B();
            }
            P(j3);
            if (j3 != this.V.s) {
                co10 co10Var = this.V;
                j = -9223372036854775807L;
                i = 1;
                z = false;
                this.V = x(co10Var.b, j3, co10Var.c, j3, true, 5);
            } else {
                j = -9223372036854775807L;
                i = 1;
                z = false;
            }
        } else {
            j = -9223372036854775807L;
            i = 1;
            z = false;
            zdd zddVar = this.D;
            Object[] objArr = akvVar != this.H.k;
            lvd0 lvd0Var = zddVar.a;
            k kVar = zddVar.c;
            if (kVar == null || kVar.b() || ((objArr == true && zddVar.c.getState() != 2) || (!zddVar.c.isReady() && (objArr == true || zddVar.c.f())))) {
                zddVar.e = true;
                if (zddVar.f && !lvd0Var.b) {
                    lvd0Var.d = lvd0Var.a.d();
                    lvd0Var.b = true;
                }
            } else {
                uiv uivVar = zddVar.d;
                uivVar.getClass();
                long jV = uivVar.v();
                if (!zddVar.e) {
                    lvd0Var.a(jV);
                    eo10VarC = uivVar.c();
                    if (!eo10VarC.equals(lvd0Var.e)) {
                        lvd0Var.e(eo10VarC);
                        zddVar.b.v.e(16, eo10VarC).b();
                    }
                } else if (jV >= lvd0Var.v()) {
                    zddVar.e = false;
                    if (zddVar.f && !lvd0Var.b) {
                        lvd0Var.d = lvd0Var.a.d();
                        lvd0Var.b = true;
                    }
                    lvd0Var.a(jV);
                    eo10VarC = uivVar.c();
                    if (!eo10VarC.equals(lvd0Var.e)) {
                        lvd0Var.e(eo10VarC);
                        zddVar.b.v.e(16, eo10VarC).b();
                    }
                } else if (lvd0Var.b) {
                    lvd0Var.a(lvd0Var.v());
                    lvd0Var.b = false;
                }
            }
            long jV2 = zddVar.v();
            this.k0 = jV2;
            long j4 = jV2 - akvVar.p;
            long j5 = this.V.s;
            if (!this.E.isEmpty() && !this.V.b.b()) {
                if (this.n0) {
                    j5--;
                    this.n0 = false;
                }
                co10 co10Var2 = this.V;
                int iB = co10Var2.a.b(co10Var2.b.a);
                int iMin = Math.min(this.m0, this.E.size());
                d dVar = iMin > 0 ? this.E.get(iMin - 1) : null;
                while (dVar != null && (iB < 0 || (iB == 0 && 0 > j5))) {
                    int i2 = iMin - 1;
                    dVar = i2 > 0 ? this.E.get(iMin - 2) : null;
                    iMin = i2;
                }
                if (iMin < this.E.size()) {
                    this.E.get(iMin);
                }
                this.m0 = iMin;
            }
            if (this.D.l()) {
                boolean z2 = !this.W.d;
                co10 co10Var3 = this.V;
                this.V = x(co10Var3.b, j4, co10Var3.c, j4, z2, 6);
            } else {
                co10 co10Var4 = this.V;
                co10Var4.s = j4;
                co10Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.V.q = this.H.m.d();
        co10 co10Var5 = this.V;
        co10Var5.r = o(co10Var5.q);
        co10 co10Var6 = this.V;
        if (co10Var6.l && co10Var6.e == 3 && p0(co10Var6.a, co10Var6.b)) {
            co10 co10Var7 = this.V;
            float fH = 1.0f;
            if (co10Var7.o.a == 1.0f) {
                vrs vrsVar = this.J;
                long jL = l(co10Var7.a, co10Var7.b.a, co10Var7.s);
                long j6 = this.V.r;
                tdd tddVar = (tdd) vrsVar;
                int i3 = i;
                boolean z3 = z;
                if (tddVar.c != j) {
                    long j7 = jL - j6;
                    long j8 = tddVar.m;
                    if (j8 == j) {
                        tddVar.m = j7;
                        tddVar.n = 0L;
                    } else {
                        long jMax = Math.max(j7, (long) ((j7 * 9.999871E-4f) + (j8 * 0.999f)));
                        tddVar.m = jMax;
                        tddVar.n = (long) ((9.999871E-4f * Math.abs(j7 - jMax)) + (0.999f * tddVar.n));
                    }
                    if (tddVar.l == j || SystemClock.elapsedRealtime() - tddVar.l >= 1000) {
                        tddVar.l = SystemClock.elapsedRealtime();
                        long j9 = (tddVar.n * 3) + tddVar.m;
                        if (tddVar.h > j9) {
                            float fO = jrh0.O(1000L);
                            long j10 = ((long) ((tddVar.k - 1.0f) * fO)) + ((long) ((tddVar.i - 1.0f) * fO));
                            long j11 = tddVar.e;
                            f2 = 1.0E-7f;
                            long j12 = tddVar.h - j10;
                            long[] jArr = new long[3];
                            jArr[z3 ? 1 : 0] = j9;
                            jArr[i3] = j11;
                            jArr[2] = j12;
                            j2 = jArr[z3 ? 1 : 0];
                            for (int i4 = i3; i4 < 3; i4++) {
                                long j13 = jArr[i4];
                                if (j13 > j2) {
                                    j2 = j13;
                                }
                            }
                            tddVar.h = j2;
                        } else {
                            f2 = 1.0E-7f;
                            j2 = jrh0.j(jL - ((long) (Math.max(0.0f, tddVar.k - 1.0f) / 1.0E-7f)), tddVar.h, j9);
                            tddVar.h = j2;
                            long j14 = tddVar.g;
                            if (j14 != j && j2 > j14) {
                                tddVar.h = j14;
                                j2 = j14;
                            }
                        }
                        long j15 = jL - j2;
                        if (Math.abs(j15) < tddVar.a) {
                            tddVar.k = 1.0f;
                        } else {
                            fH = jrh0.h((f2 * j15) + 1.0f, tddVar.j, tddVar.i);
                            tddVar.k = fH;
                        }
                    } else {
                        fH = tddVar.k;
                    }
                }
                if (this.D.c().a != fH) {
                    eo10 eo10Var = new eo10(fH, this.V.o.b);
                    this.v.l(16);
                    this.D.e(eo10Var);
                    w(this.V.o, this.D.c().a, z3, z3);
                }
            }
        }
    }

    public final void y0(qxf0 qxf0Var, ekv.b bVar, qxf0 qxf0Var2, ekv.b bVar2, long j, boolean z) {
        boolean zP0 = p0(qxf0Var, bVar);
        Object obj = bVar.a;
        if (!zP0) {
            eo10 eo10Var = bVar.b() ? eo10.d : this.V.o;
            zdd zddVar = this.D;
            if (zddVar.c().equals(eo10Var)) {
                return;
            }
            this.v.l(16);
            zddVar.e(eo10Var);
            w(this.V.o, eo10Var.a, false, false);
            return;
        }
        qxf0.b bVar3 = this.A;
        int i = qxf0Var.g(obj, bVar3).c;
        qxf0.c cVar = this.z;
        qxf0Var.n(i, cVar);
        njv.d dVar = cVar.i;
        String str = jrh0.a;
        tdd tddVar = (tdd) this.J;
        tddVar.getClass();
        tddVar.c = jrh0.O(dVar.a);
        tddVar.f = jrh0.O(dVar.b);
        tddVar.g = jrh0.O(dVar.c);
        float f2 = dVar.d;
        if (f2 == -3.4028235E38f) {
            f2 = 0.97f;
        }
        tddVar.j = f2;
        float f3 = dVar.e;
        if (f3 == -3.4028235E38f) {
            f3 = 1.03f;
        }
        tddVar.i = f3;
        if (f2 == 1.0f && f3 == 1.0f) {
            tddVar.c = -9223372036854775807L;
        }
        tddVar.a();
        if (j != -9223372036854775807L) {
            tddVar.d = l(qxf0Var, obj, j);
            tddVar.a();
            return;
        }
        if (!Objects.equals(!qxf0Var2.p() ? qxf0Var2.m(qxf0Var2.g(bVar2.a, bVar3).c, cVar, 0L).a : null, cVar.a) || z) {
            tddVar.d = -9223372036854775807L;
            tddVar.a();
        }
    }

    public final boolean z(int i, ekv.b bVar) {
        h hVar = this.H;
        akv akvVar = hVar.l;
        if (akvVar != null && akvVar.g.a.equals(bVar)) {
            e850 e850Var = this.a[i];
            akv akvVar2 = hVar.l;
            int i2 = e850Var.d;
            boolean z = (i2 == 2 || i2 == 4) && e850Var.c(akvVar2) == e850Var.a;
            boolean z2 = e850Var.d == 3 && e850Var.c(akvVar2) == e850Var.c;
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void z0(boolean z, boolean z2) {
        this.a0 = z;
        this.b0 = (!z || z2) ? -9223372036854775807L : this.F.d();
    }
}
