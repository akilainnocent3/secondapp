package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class q430 implements zjv, m4h, nxs.a<a>, nxs.e, ps60.c {
    public static final Map<String, String> e0;
    public static final androidx.media3.common.a f0;
    public final nxs A;
    public final xj5 B;
    public final eoa C;
    public final m430 D;
    public final n430 E;
    public final Handler F;
    public zjv.a G;
    public m6n H;
    public ps60[] I;
    public c[] J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public d O;
    public p480 P;
    public long Q;
    public boolean R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public boolean X;
    public long Y;
    public long Z;
    public final Uri a;
    public boolean a0;
    public final zpc b;
    public int b0;
    public final nef c;
    public boolean c0;
    public final sws d;
    public boolean d0;
    public final mkv.a e;
    public final mef.a f;
    public final r430 i;
    public final tf v;
    public final long w;
    public final androidx.media3.common.a y;
    public final long z;

    public final class a implements nxs.d {
        public final Uri a;
        public final ozd0 b;
        public final k430 c;
        public final q430 d;
        public final eoa e;
        public volatile boolean g;
        public long i;
        public gqc j;
        public njg0 k;
        public boolean l;
        public final k620 f = new k620();
        public boolean h = true;

        public a(Uri uri, zpc zpcVar, xj5 xj5Var, q430 q430Var, eoa eoaVar) {
            this.a = uri;
            this.b = new ozd0(zpcVar);
            this.c = xj5Var;
            this.d = q430Var;
            this.e = eoaVar;
            tws.c.getAndIncrement();
            this.j = c(0L);
        }

        @Override // nxs.d
        public final void a() {
            zpc k6nVar;
            k4h k4hVar;
            int i;
            int iA = 0;
            while (iA == 0 && !this.g) {
                try {
                    long j = this.f.a;
                    gqc gqcVarC = c(j);
                    this.j = gqcVarC;
                    long jA = this.b.a(gqcVarC);
                    if (this.g) {
                        if (iA != 1 && ((xj5) this.c).a() != -1) {
                            this.f.a = ((xj5) this.c).a();
                        }
                        fqc.a(this.b);
                        return;
                    }
                    if (jA != -1) {
                        jA += j;
                        final q430 q430Var = q430.this;
                        Map<String, String> map = q430.e0;
                        q430Var.F.post(new Runnable() { // from class: l430
                            @Override // java.lang.Runnable
                            public final void run() {
                                q430Var.X = true;
                            }
                        });
                    }
                    long j2 = jA;
                    q430.this.H = m6n.d(this.b.a.d());
                    ozd0 ozd0Var = this.b;
                    m6n m6nVar = q430.this.H;
                    if (m6nVar == null || (i = m6nVar.f) == -1) {
                        k6nVar = ozd0Var;
                    } else {
                        k6nVar = new k6n(ozd0Var, i, this);
                        njg0 njg0VarD = q430.this.D(new c(0, true));
                        this.k = njg0VarD;
                        njg0VarD.d(q430.f0);
                    }
                    ((xj5) this.c).b(k6nVar, this.a, this.b.a.d(), j, j2, this.d);
                    if (q430.this.H != null && (k4hVar = ((xj5) this.c).b) != null) {
                        k4h k4hVarE = k4hVar.e();
                        if (k4hVarE instanceof a8w) {
                            ((a8w) k4hVarE).r = true;
                        }
                    }
                    if (this.h) {
                        k430 k430Var = this.c;
                        long j3 = this.i;
                        k4h k4hVar2 = ((xj5) k430Var).b;
                        k4hVar2.getClass();
                        k4hVar2.c(j, j3);
                        this.h = false;
                    }
                    while (iA == 0 && !this.g) {
                        try {
                            eoa eoaVar = this.e;
                            synchronized (eoaVar) {
                                while (!eoaVar.b) {
                                    try {
                                        eoaVar.a.getClass();
                                        eoaVar.wait();
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                            k430 k430Var2 = this.c;
                            k620 k620Var = this.f;
                            xj5 xj5Var = (xj5) k430Var2;
                            k4h k4hVar3 = xj5Var.b;
                            k4hVar3.getClass();
                            jcd jcdVar = xj5Var.c;
                            jcdVar.getClass();
                            iA = k4hVar3.a(jcdVar, k620Var);
                            long jA2 = ((xj5) this.c).a();
                            if (jA2 > q430.this.w + j) {
                                eoa eoaVar2 = this.e;
                                synchronized (eoaVar2) {
                                    eoaVar2.b = false;
                                }
                                q430 q430Var2 = q430.this;
                                q430Var2.F.post(q430Var2.E);
                                j = jA2;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iA == 1) {
                        iA = 0;
                    } else if (((xj5) this.c).a() != -1) {
                        this.f.a = ((xj5) this.c).a();
                    }
                    fqc.a(this.b);
                } catch (Throwable th2) {
                    if (iA != 1 && ((xj5) this.c).a() != -1) {
                        this.f.a = ((xj5) this.c).a();
                    }
                    fqc.a(this.b);
                    throw th2;
                }
            }
        }

        @Override // nxs.d
        public final void b() {
            this.g = true;
        }

        public final gqc c(long j) {
            Map map = Collections.EMPTY_MAP;
            Map<String, String> map2 = q430.e0;
            Uri uri = this.a;
            ly0.h(uri, "The uri must be set.");
            return new gqc(uri, 0L, 1, null, map2, j, -1L, null, 6);
        }
    }

    public final class b implements rs60 {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        @Override // defpackage.rs60
        public final void a() throws IOException {
            int i = this.a;
            q430 q430Var = q430.this;
            ps60 ps60Var = q430Var.I[i];
            lef lefVar = ps60Var.h;
            if (lefVar != null && lefVar.getState() == 1) {
                lef.a aVarE = ps60Var.h.e();
                aVarE.getClass();
                throw aVarE;
            }
            nxs nxsVar = q430Var.A;
            int iB = q430Var.d.b(q430Var.S);
            IOException iOException = nxsVar.c;
            if (iOException != null) {
                throw iOException;
            }
            nxs.c<? extends nxs.d> cVar = nxsVar.b;
            if (cVar != null) {
                if (iB == Integer.MIN_VALUE) {
                    iB = cVar.a;
                }
                IOException iOException2 = cVar.e;
                if (iOException2 != null && cVar.f > iB) {
                    throw iOException2;
                }
            }
        }

        @Override // defpackage.rs60
        public final int b(yti ytiVar, g5d g5dVar, int i) {
            q430 q430Var = q430.this;
            if (q430Var.G()) {
                return -3;
            }
            int i2 = this.a;
            q430Var.B(i2);
            int iV = q430Var.I[i2].v(ytiVar, g5dVar, i, q430Var.c0);
            if (iV == -3) {
                q430Var.C(i2);
            }
            return iV;
        }

        @Override // defpackage.rs60
        public final int c(long j) throws Throwable {
            q430 q430Var = q430.this;
            if (q430Var.G()) {
                return 0;
            }
            int i = this.a;
            q430Var.B(i);
            ps60 ps60Var = q430Var.I[i];
            int iP = ps60Var.p(j, q430Var.c0);
            ps60Var.z(iP);
            if (iP == 0) {
                q430Var.C(i);
            }
            return iP;
        }

        @Override // defpackage.rs60
        public final boolean isReady() {
            q430 q430Var = q430.this;
            return !q430Var.G() && q430Var.I[this.a].r(q430Var.c0);
        }
    }

    public static final class c {
        public final int a;
        public final boolean b;

        public c(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    public static final class d {
        public final ljg0 a;
        public final boolean[] b;
        public final boolean[] c;
        public final boolean[] d;

        public d(ljg0 ljg0Var, boolean[] zArr) {
            this.a = ljg0Var;
            this.b = zArr;
            int i = ljg0Var.a;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        e0 = Collections.unmodifiableMap(map);
        androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
        c0062a.a = "icy";
        c0062a.m = gqv.m("application/x-icy");
        f0 = new androidx.media3.common.a(c0062a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [m430] */
    /* JADX WARN: Type inference failed for: r1v6, types: [n430] */
    public q430(Uri uri, zpc zpcVar, xj5 xj5Var, nef nefVar, mef.a aVar, sws swsVar, mkv.a aVar2, r430 r430Var, tf tfVar, int i, androidx.media3.common.a aVar3, long j, t250 t250Var) {
        this.a = uri;
        this.b = zpcVar;
        this.c = nefVar;
        this.f = aVar;
        this.d = swsVar;
        this.e = aVar2;
        this.i = r430Var;
        this.v = tfVar;
        this.w = i;
        this.y = aVar3;
        this.A = t250Var != null ? new nxs(t250Var) : new nxs("ProgressiveMediaPeriod");
        this.B = xj5Var;
        this.z = j;
        this.C = new eoa();
        this.D = new Runnable() { // from class: m430
            @Override // java.lang.Runnable
            public final void run() {
                this.a.A();
            }
        };
        this.E = new Runnable() { // from class: n430
            @Override // java.lang.Runnable
            public final void run() {
                q430 q430Var = this.a;
                if (q430Var.d0) {
                    return;
                }
                zjv.a aVar4 = q430Var.G;
                aVar4.getClass();
                aVar4.e(q430Var);
            }
        };
        this.F = jrh0.p(null);
        this.J = new c[0];
        this.I = new ps60[0];
        this.Z = -9223372036854775807L;
        this.S = 1;
    }

    public final void A() {
        long j = this.z;
        if (this.d0 || this.L || !this.K || this.P == null) {
            return;
        }
        for (ps60 ps60Var : this.I) {
            if (ps60Var.q() == null) {
                return;
            }
        }
        eoa eoaVar = this.C;
        synchronized (eoaVar) {
            eoaVar.b = false;
        }
        int length = this.I.length;
        jjg0[] jjg0VarArr = new jjg0[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            androidx.media3.common.a aVarQ = this.I[i].q();
            aVarQ.getClass();
            String str = aVarQ.n;
            boolean zI = gqv.i(str);
            boolean z = zI || gqv.l(str);
            zArr[i] = z;
            this.M = z | this.M;
            this.N = j != -9223372036854775807L && length == 1 && gqv.j(str);
            m6n m6nVar = this.H;
            if (m6nVar != null) {
                int i2 = m6nVar.a;
                if (zI || this.J[i].b) {
                    uov uovVar = aVarQ.l;
                    uov uovVar2 = uovVar == null ? new uov(m6nVar) : uovVar.a(m6nVar);
                    androidx.media3.common.a.C0062a c0062aA = aVarQ.a();
                    c0062aA.k = uovVar2;
                    aVarQ = new androidx.media3.common.a(c0062aA);
                }
                if (zI && aVarQ.h == -1 && aVarQ.i == -1 && i2 != -1) {
                    androidx.media3.common.a.C0062a c0062aA2 = aVarQ.a();
                    c0062aA2.h = i2;
                    aVarQ = new androidx.media3.common.a(c0062aA2);
                }
            }
            int iG = this.c.g(aVarQ);
            androidx.media3.common.a.C0062a c0062aA3 = aVarQ.a();
            c0062aA3.N = iG;
            androidx.media3.common.a aVar = new androidx.media3.common.a(c0062aA3);
            jjg0VarArr[i] = new jjg0(Integer.toString(i), aVar);
            this.V = aVar.t | this.V;
        }
        this.O = new d(new ljg0(jjg0VarArr), zArr);
        if (this.N && this.Q == -9223372036854775807L) {
            this.Q = j;
            this.P = new p430(this, this.P);
        }
        this.i.v(this.Q, this.P, this.R);
        this.L = true;
        zjv.a aVar2 = this.G;
        aVar2.getClass();
        aVar2.g(this);
    }

    public final void B(int i) {
        w();
        d dVar = this.O;
        boolean[] zArr = dVar.d;
        if (zArr[i]) {
            return;
        }
        androidx.media3.common.a aVar = dVar.a.a(i).d[0];
        pjv pjvVar = new pjv(1, gqv.h(aVar.n), aVar, 0, null, jrh0.Z(this.Y), -9223372036854775807L);
        mkv.a aVar2 = this.e;
        aVar2.a(new fkv(aVar2, pjvVar));
        zArr[i] = true;
    }

    public final void C(int i) {
        w();
        if (this.a0) {
            if ((!this.M || this.O.b[i]) && !this.I[i].r(false)) {
                this.Z = 0L;
                this.a0 = false;
                this.U = true;
                this.Y = 0L;
                this.b0 = 0;
                for (ps60 ps60Var : this.I) {
                    ps60Var.w(false);
                }
                zjv.a aVar = this.G;
                aVar.getClass();
                aVar.e(this);
            }
        }
    }

    public final njg0 D(c cVar) {
        int length = this.I.length;
        for (int i = 0; i < length; i++) {
            if (cVar.equals(this.J[i])) {
                return this.I[i];
            }
        }
        if (this.K) {
            cft.g("ProgressiveMediaPeriod", "Extractor added new track (id=" + cVar.a + ") after finishing tracks.");
            return new dre();
        }
        nef nefVar = this.c;
        nefVar.getClass();
        ps60 ps60Var = new ps60(this.v, nefVar, this.f);
        ps60Var.f = this;
        int i2 = length + 1;
        c[] cVarArr = (c[]) Arrays.copyOf(this.J, i2);
        cVarArr[length] = cVar;
        String str = jrh0.a;
        this.J = cVarArr;
        ps60[] ps60VarArr = (ps60[]) Arrays.copyOf(this.I, i2);
        ps60VarArr[length] = ps60Var;
        this.I = ps60VarArr;
        return ps60Var;
    }

    public final void E(p480 p480Var) {
        this.P = this.H == null ? p480Var : new p480.b(-9223372036854775807L);
        this.Q = p480Var.k();
        boolean z = !this.X && p480Var.k() == -9223372036854775807L;
        this.R = z;
        this.S = z ? 7 : 1;
        if (this.L) {
            this.i.v(this.Q, p480Var, z);
        } else {
            A();
        }
    }

    public final void F() {
        a aVar = new a(this.a, this.b, this.B, this, this.C);
        if (this.L) {
            ly0.f(z());
            long j = this.Q;
            if (j != -9223372036854775807L && this.Z > j) {
                this.c0 = true;
                this.Z = -9223372036854775807L;
                return;
            }
            p480 p480Var = this.P;
            p480Var.getClass();
            long j2 = p480Var.d(this.Z).a.b;
            long j3 = this.Z;
            aVar.f.a = j2;
            aVar.i = j3;
            aVar.h = true;
            aVar.l = false;
            for (ps60 ps60Var : this.I) {
                ps60Var.t = this.Z;
            }
            this.Z = -9223372036854775807L;
        }
        this.b0 = x();
        this.A.d(aVar, this, this.d.b(this.S));
    }

    public final boolean G() {
        return this.U || z();
    }

    @Override // defpackage.xc80
    public final boolean a() {
        boolean z;
        if (!this.A.b()) {
            return false;
        }
        eoa eoaVar = this.C;
        synchronized (eoaVar) {
            z = eoaVar.b;
        }
        return z;
    }

    @Override // defpackage.xc80
    public final boolean b(g gVar) {
        if (this.c0) {
            return false;
        }
        nxs nxsVar = this.A;
        if (nxsVar.c != null || this.a0) {
            return false;
        }
        if ((this.L || this.y != null) && this.W == 0) {
            return false;
        }
        boolean zC = this.C.c();
        if (nxsVar.b()) {
            return zC;
        }
        F();
        return true;
    }

    @Override // defpackage.zjv
    public final long c(oyg[] oygVarArr, boolean[] zArr, rs60[] rs60VarArr, boolean[] zArr2, long j) {
        oyg oygVar;
        w();
        d dVar = this.O;
        ljg0 ljg0Var = dVar.a;
        boolean[] zArr3 = dVar.c;
        int i = this.W;
        int i2 = 0;
        for (int i3 = 0; i3 < oygVarArr.length; i3++) {
            rs60 rs60Var = rs60VarArr[i3];
            if (rs60Var != null && (oygVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((b) rs60Var).a;
                ly0.f(zArr3[i4]);
                this.W--;
                zArr3[i4] = false;
                rs60VarArr[i3] = null;
            }
        }
        boolean z = !this.T ? j == 0 || this.N : i != 0;
        for (int i5 = 0; i5 < oygVarArr.length; i5++) {
            if (rs60VarArr[i5] == null && (oygVar = oygVarArr[i5]) != null) {
                ly0.f(oygVar.length() == 1);
                ly0.f(oygVar.f(0) == 0);
                int iIndexOf = ljg0Var.b.indexOf(oygVar.m());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                ly0.f(!zArr3[iIndexOf]);
                this.W++;
                zArr3[iIndexOf] = true;
                this.V = oygVar.r().t | this.V;
                rs60VarArr[i5] = new b(iIndexOf);
                zArr2[i5] = true;
                if (!z) {
                    ps60 ps60Var = this.I[iIndexOf];
                    z = (ps60Var.n() == 0 || ps60Var.y(j, true)) ? false : true;
                }
            }
        }
        if (this.W == 0) {
            this.a0 = false;
            this.U = false;
            this.V = false;
            nxs nxsVar = this.A;
            if (nxsVar.b()) {
                ps60[] ps60VarArr = this.I;
                int length = ps60VarArr.length;
                while (i2 < length) {
                    ps60VarArr[i2].i();
                    i2++;
                }
                nxsVar.a();
            } else {
                this.c0 = false;
                for (ps60 ps60Var2 : this.I) {
                    ps60Var2.w(false);
                }
            }
        } else if (z) {
            j = h(j);
            while (i2 < rs60VarArr.length) {
                if (rs60VarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.T = true;
        return j;
    }

    @Override // defpackage.xc80
    public final long d() {
        return s();
    }

    @Override // nxs.a
    public final void e(nxs.d dVar, long j, long j2) {
        a aVar = (a) dVar;
        if (this.Q == -9223372036854775807L && this.P != null) {
            long jY = y(true);
            long j3 = jY == Long.MIN_VALUE ? 0L : jY + 10000;
            this.Q = j3;
            this.i.v(j3, this.P, this.R);
        }
        ozd0 ozd0Var = aVar.b;
        Uri uri = ozd0Var.c;
        tws twsVar = new tws(ozd0Var.d, j2);
        this.d.getClass();
        this.e.c(twsVar, 1, -1, null, 0, null, aVar.i, this.Q);
        this.c0 = true;
        zjv.a aVar2 = this.G;
        aVar2.getClass();
        aVar2.e(this);
    }

    @Override // defpackage.zjv
    public final long f(long j, q480 q480Var) {
        w();
        if (!this.P.g()) {
            return 0L;
        }
        p480.a aVarD = this.P.d(j);
        return q480Var.a(j, aVarD.a.a, aVarD.b.a);
    }

    @Override // nxs.a
    public final void g(nxs.d dVar, long j, long j2, int i) {
        tws twsVar;
        a aVar = (a) dVar;
        ozd0 ozd0Var = aVar.b;
        if (i == 0) {
            twsVar = new tws(aVar.j);
        } else {
            Uri uri = ozd0Var.c;
            twsVar = new tws(ozd0Var.d, j2);
        }
        this.e.e(twsVar, 1, -1, null, 0, null, aVar.i, this.Q, i);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007a  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f A[LOOP:1: B:40:0x007d->B:41:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0094 A[LOOP:2: B:45:0x0092->B:46:0x0094, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x007a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x008b, please report this as an issue */
    @Override // defpackage.zjv
    public final long h(long j) {
        int i;
        w();
        boolean[] zArr = this.O.b;
        if (!this.P.g()) {
            j = 0;
        }
        this.U = false;
        boolean z = this.Y == j;
        this.Y = j;
        if (z()) {
            this.Z = j;
            return j;
        }
        int i2 = this.S;
        nxs nxsVar = this.A;
        if (i2 == 7 || !(this.c0 || nxsVar.b())) {
            this.a0 = false;
            this.Z = j;
            this.c0 = false;
            this.V = false;
            if (nxsVar.b()) {
                nxsVar.c = null;
                for (ps60 ps60Var : this.I) {
                    ps60Var.w(false);
                }
                break;
            }
            for (ps60 ps60Var2 : this.I) {
                ps60Var2.i();
            }
            nxsVar.a();
            return j;
        }
        int length = this.I.length;
        for (int i3 = 0; i3 < length; i3++) {
            ps60 ps60Var3 = this.I[i3];
            if (ps60Var3.n() != 0 || !z) {
                if (!(this.N ? ps60Var3.x(ps60Var3.q) : ps60Var3.y(j, this.c0)) && (zArr[i3] || !this.M)) {
                    this.a0 = false;
                    this.Z = j;
                    this.c0 = false;
                    this.V = false;
                    if (nxsVar.b()) {
                        nxsVar.c = null;
                        while (i < r0) {
                            ps60Var.w(false);
                        }
                        break;
                        break;
                    }
                    while (i < r0) {
                        ps60Var2.i();
                    }
                    nxsVar.a();
                    return j;
                }
            }
        }
        return j;
    }

    @Override // nxs.a
    public final nxs.b i(nxs.d dVar, long j, long j2, IOException iOException, int i) {
        nxs.b bVar;
        p480 p480Var;
        a aVar = (a) dVar;
        ozd0 ozd0Var = aVar.b;
        Uri uri = ozd0Var.c;
        tws twsVar = new tws(ozd0Var.d, j2);
        jrh0.Z(aVar.i);
        jrh0.Z(this.Q);
        long jA = this.d.a(new sws.c(iOException, i));
        if (jA == -9223372036854775807L) {
            bVar = nxs.f;
        } else {
            int iX = x();
            int i2 = iX > this.b0 ? 1 : 0;
            if (this.X || !((p480Var = this.P) == null || p480Var.k() == -9223372036854775807L)) {
                this.b0 = iX;
            } else if (!this.L || G()) {
                this.U = this.L;
                this.Y = 0L;
                this.b0 = 0;
                for (ps60 ps60Var : this.I) {
                    ps60Var.w(false);
                }
                aVar.f.a = 0L;
                aVar.i = 0L;
                aVar.h = true;
                aVar.l = false;
            } else {
                this.a0 = true;
                bVar = nxs.e;
            }
            bVar = new nxs.b(i2, jA);
        }
        int i3 = bVar.a;
        this.e.d(twsVar, 1, -1, null, 0, null, aVar.i, this.Q, iOException, !(i3 == 0 || i3 == 1));
        return bVar;
    }

    @Override // defpackage.zjv
    public final long j() {
        if (this.V) {
            this.V = false;
            return this.Y;
        }
        if (!this.U) {
            return -9223372036854775807L;
        }
        if (!this.c0 && x() <= this.b0) {
            return -9223372036854775807L;
        }
        this.U = false;
        return this.Y;
    }

    @Override // defpackage.m4h
    public final void k(final p480 p480Var) {
        this.F.post(new Runnable() { // from class: o430
            @Override // java.lang.Runnable
            public final void run() {
                this.a.E(p480Var);
            }
        });
    }

    @Override // nxs.e
    public final void l() {
        for (ps60 ps60Var : this.I) {
            ps60Var.w(true);
            lef lefVar = ps60Var.h;
            if (lefVar != null) {
                lefVar.i(ps60Var.e);
                ps60Var.h = null;
                ps60Var.g = null;
            }
        }
        xj5 xj5Var = this.B;
        k4h k4hVar = xj5Var.b;
        if (k4hVar != null) {
            k4hVar.release();
            xj5Var.b = null;
        }
        xj5Var.c = null;
    }

    @Override // defpackage.zjv
    public final void m() throws IOException {
        int iB = this.d.b(this.S);
        nxs nxsVar = this.A;
        IOException iOException = nxsVar.c;
        if (iOException != null) {
            throw iOException;
        }
        nxs.c<? extends nxs.d> cVar = nxsVar.b;
        if (cVar != null) {
            if (iB == Integer.MIN_VALUE) {
                iB = cVar.a;
            }
            IOException iOException2 = cVar.e;
            if (iOException2 != null && cVar.f > iB) {
                throw iOException2;
            }
        }
        if (this.c0 && !this.L) {
            throw ssz.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // defpackage.m4h
    public final void n() {
        this.K = true;
        this.F.post(this.D);
    }

    @Override // defpackage.zjv
    public final void o(zjv.a aVar, long j) {
        this.G = aVar;
        androidx.media3.common.a aVar2 = this.y;
        if (aVar2 == null) {
            this.C.c();
            F();
        } else {
            r(0, 3).d(aVar2);
            E(new efn(-9223372036854775807L, new long[]{0}, new long[]{0}));
            n();
            this.Z = j;
        }
    }

    @Override // nxs.a
    public final void p(nxs.d dVar, long j, long j2, boolean z) {
        a aVar = (a) dVar;
        ozd0 ozd0Var = aVar.b;
        Uri uri = ozd0Var.c;
        tws twsVar = new tws(ozd0Var.d, j2);
        this.d.getClass();
        this.e.b(twsVar, 1, -1, null, 0, null, aVar.i, this.Q);
        if (z) {
            return;
        }
        for (ps60 ps60Var : this.I) {
            ps60Var.w(false);
        }
        if (this.W > 0) {
            zjv.a aVar2 = this.G;
            aVar2.getClass();
            aVar2.e(this);
        }
    }

    @Override // defpackage.zjv
    public final ljg0 q() {
        w();
        return this.O.a;
    }

    @Override // defpackage.m4h
    public final njg0 r(int i, int i2) {
        return D(new c(i, false));
    }

    @Override // defpackage.xc80
    public final long s() {
        long jY;
        boolean z;
        long j;
        w();
        if (this.c0 || this.W == 0) {
            return Long.MIN_VALUE;
        }
        if (z()) {
            return this.Z;
        }
        if (this.M) {
            int length = this.I.length;
            jY = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                d dVar = this.O;
                if (dVar.b[i] && dVar.c[i]) {
                    ps60 ps60Var = this.I[i];
                    synchronized (ps60Var) {
                        z = ps60Var.w;
                    }
                    if (z) {
                        continue;
                    } else {
                        ps60 ps60Var2 = this.I[i];
                        synchronized (ps60Var2) {
                            j = ps60Var2.v;
                        }
                        jY = Math.min(jY, j);
                    }
                }
            }
        } else {
            jY = Long.MAX_VALUE;
        }
        if (jY == Long.MAX_VALUE) {
            jY = y(false);
        }
        return jY == Long.MIN_VALUE ? this.Y : jY;
    }

    @Override // ps60.c
    public final void t() {
        this.F.post(this.D);
    }

    @Override // defpackage.zjv
    public final void u(long j, boolean z) throws Throwable {
        if (this.N) {
            return;
        }
        w();
        if (z()) {
            return;
        }
        boolean[] zArr = this.O.c;
        int length = this.I.length;
        for (int i = 0; i < length; i++) {
            this.I[i].h(j, z, zArr[i]);
        }
    }

    public final void w() {
        ly0.f(this.L);
        this.O.getClass();
        this.P.getClass();
    }

    public final int x() {
        int i = 0;
        for (ps60 ps60Var : this.I) {
            i += ps60Var.q + ps60Var.p;
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final long y(boolean z) {
        ps60 ps60Var;
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < this.I.length; i++) {
            if (z) {
                ps60Var = this.I[i];
                synchronized (ps60Var) {
                    jMax = Math.max(jMax, ps60Var.v);
                }
            } else {
                d dVar = this.O;
                dVar.getClass();
                if (dVar.c[i]) {
                    ps60Var = this.I[i];
                    synchronized (ps60Var) {
                    }
                    jMax = Math.max(jMax, ps60Var.v);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    public final boolean z() {
        return this.Z != -9223372036854775807L;
    }

    @Override // defpackage.xc80
    public final void v(long j) {
    }
}
