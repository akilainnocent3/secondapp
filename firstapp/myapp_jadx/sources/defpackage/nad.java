package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.exoplayer.d;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class nad implements xz {
    public final vs7 a;
    public final qxf0.b b;
    public final qxf0.c c;
    public final a d;
    public final SparseArray<j00.a> e;
    public bjs<j00> f;
    public so10 i;
    public cdl v;
    public boolean w;

    public static final class a {
        public final qxf0.b a;
        public pcn<ekv.b> b;
        public d150 c;
        public ekv.b d;
        public ekv.b e;
        public ekv.b f;

        public a(qxf0.b bVar) {
            this.a = bVar;
            pcn.b bVar2 = pcn.b;
            this.b = c150.e;
            this.c = d150.i;
        }

        public static ekv.b b(so10 so10Var, pcn<ekv.b> pcnVar, ekv.b bVar, qxf0.b bVar2) {
            qxf0 qxf0VarV = so10Var.v();
            int iF = so10Var.F();
            Object objL = qxf0VarV.p() ? null : qxf0VarV.l(iF);
            int iB = (so10Var.g() || qxf0VarV.p()) ? -1 : qxf0VarV.f(iF, bVar2, false).b(jrh0.O(so10Var.e0()) - bVar2.e);
            for (int i = 0; i < pcnVar.size(); i++) {
                ekv.b bVar3 = pcnVar.get(i);
                if (c(bVar3, objL, so10Var.g(), so10Var.s(), so10Var.I(), iB)) {
                    return bVar3;
                }
            }
            if (pcnVar.isEmpty() && bVar != null && c(bVar, objL, so10Var.g(), so10Var.s(), so10Var.I(), iB)) {
                return bVar;
            }
            return null;
        }

        public static boolean c(ekv.b bVar, Object obj, boolean z, int i, int i2, int i3) {
            Object obj2 = bVar.a;
            int i4 = bVar.b;
            if (!obj2.equals(obj)) {
                return false;
            }
            if (z && i4 == i && bVar.c == i2) {
                return true;
            }
            return !z && i4 == -1 && bVar.e == i3;
        }

        public final void a(rcn.a<ekv.b, qxf0> aVar, ekv.b bVar, qxf0 qxf0Var) {
            if (bVar == null) {
                return;
            }
            if (qxf0Var.b(bVar.a) != -1) {
                aVar.b(bVar, qxf0Var);
                return;
            }
            qxf0 qxf0Var2 = (qxf0) this.c.get(bVar);
            if (qxf0Var2 != null) {
                aVar.b(bVar, qxf0Var2);
            }
        }

        public final void d(qxf0 qxf0Var) {
            pcn<ekv.b> pcnVar;
            rcn.a<ekv.b, qxf0> aVar = new rcn.a<>(4);
            if (this.b.isEmpty()) {
                a(aVar, this.e, qxf0Var);
                if (!Objects.equals(this.f, this.e)) {
                    a(aVar, this.f, qxf0Var);
                }
                if (!Objects.equals(this.d, this.e) && !Objects.equals(this.d, this.f)) {
                    a(aVar, this.d, qxf0Var);
                }
            } else {
                int i = 0;
                while (true) {
                    int size = this.b.size();
                    pcnVar = this.b;
                    if (i >= size) {
                        break;
                    }
                    a(aVar, pcnVar.get(i), qxf0Var);
                    i++;
                }
                if (!pcnVar.contains(this.d)) {
                    a(aVar, this.d, qxf0Var);
                }
            }
            this.c = aVar.a();
        }
    }

    public nad(vs7 vs7Var) {
        vs7Var.getClass();
        this.a = vs7Var;
        String str = jrh0.a;
        Looper looperMyLooper = Looper.myLooper();
        this.f = new bjs<>(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, vs7Var, new j9d());
        qxf0.b bVar = new qxf0.b();
        this.b = bVar;
        this.c = new qxf0.c();
        this.d = new a(bVar);
        this.e = new SparseArray<>();
    }

    @Override // so10.c
    public final void A(int i) {
        so10 so10Var = this.i;
        so10Var.getClass();
        a aVar = this.d;
        aVar.d = a.b(so10Var, aVar.b, aVar.e, aVar.a);
        aVar.d(so10Var.v());
        j00.a aVarK0 = k0();
        p0(aVarK0, 0, new lad(i, aVarK0));
    }

    @Override // defpackage.xz
    public final void B(y31 y31Var) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 1031, new dad(aVarO0, y31Var));
    }

    @Override // so10.c
    public final void D(boolean z) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 23, new iad(aVarO0, z));
    }

    @Override // defpackage.xz
    public final void E(Exception exc) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 1014, new a9d(aVarO0, exc));
    }

    @Override // so10.c
    public final void F(final List<j4c> list) {
        final j00.a aVarK0 = k0();
        p0(aVarK0, 27, new bjs.a(aVarK0, list) { // from class: i9d
            public final /* synthetic */ List a;

            {
                this.a = list;
            }

            @Override // bjs.a
            public final void invoke(Object obj) {
            }
        });
    }

    @Override // defpackage.xz
    public final void G(long j) {
        p0(o0(), 1010, new rn4());
    }

    @Override // so10.c
    public final void H(uov uovVar) {
        p0(k0(), 28, new e9d());
    }

    @Override // so10.c
    public final void J(njv njvVar, int i) {
        p0(k0(), 1, new mad());
    }

    @Override // so10.c
    public final void K(int i, int i2) {
        p0(o0(), 24, new p9d());
    }

    @Override // defpackage.mkv
    public final void L(int i, ekv.b bVar, tws twsVar, pjv pjvVar, int i2) {
        p0(n0(i, bVar), 1000, new t9d());
    }

    @Override // defpackage.mkv
    public final void M(int i, ekv.b bVar, final pjv pjvVar) {
        final j00.a aVarN0 = n0(i, bVar);
        p0(aVarN0, 1004, new bjs.a() { // from class: r9d
            @Override // bjs.a
            public final void invoke(Object obj) {
                ((j00) obj).n(aVarN0, pjvVar);
            }
        });
    }

    @Override // so10.c
    public final void N(r21 r21Var) {
        p0(o0(), 20, new d9d());
    }

    @Override // so10.c
    public final void O(rjg0 rjg0Var) {
        p0(k0(), 19, new u9d());
    }

    @Override // so10.c
    public final void P(boolean z) {
        j00.a aVarK0 = k0();
        p0(aVarK0, 3, new iad(aVarK0, z));
    }

    @Override // so10.c
    public final void Q(int i, boolean z) {
        j00.a aVarK0 = k0();
        p0(aVarK0, 5, new c9d(aVarK0, z, i));
    }

    @Override // so10.c
    public final void R(float f) {
        p0(o0(), 22, new mp4());
    }

    @Override // defpackage.mkv
    public final void S(int i, ekv.b bVar, tws twsVar, pjv pjvVar) {
        j00.a aVarN0 = n0(i, bVar);
        p0(aVarN0, 1002, new bad(aVarN0, twsVar, pjvVar));
    }

    @Override // defpackage.xz
    public final void T(e5d e5dVar) {
        j00.a aVarL0 = l0(this.d.e);
        p0(aVarL0, 1013, new w9d(aVarL0, e5dVar));
    }

    @Override // defpackage.mkv
    public final void U(int i, ekv.b bVar, tws twsVar, pjv pjvVar) {
        j00.a aVarN0 = n0(i, bVar);
        p0(aVarN0, WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY, new bad(aVarN0, twsVar, pjvVar));
    }

    @Override // so10.c
    public final void V(o4c o4cVar) {
        p0(k0(), 27, new v9d());
    }

    @Override // defpackage.xz
    public final void W(int i, int i2, boolean z) {
        p0(o0(), 1033, new h9d());
    }

    @Override // so10.c
    public final void X(bkg0 bkg0Var) {
        p0(k0(), 2, new k9d());
    }

    @Override // so10.c
    public final void Y(bo10 bo10Var) {
        ekv.b bVar;
        p0((!(bo10Var instanceof rwg) || (bVar = ((rwg) bo10Var).v) == null) ? k0() : l0(bVar), 10, new g9d());
    }

    @Override // defpackage.xz
    public final void Z(j00 j00Var) {
        j00Var.getClass();
        this.f.a(j00Var);
    }

    @Override // so10.c
    public final void a(final v5i0 v5i0Var) {
        final j00.a aVarO0 = o0();
        p0(aVarO0, 25, new bjs.a(aVarO0, v5i0Var) { // from class: ead
            public final /* synthetic */ v5i0 a;

            {
                this.a = v5i0Var;
            }

            @Override // bjs.a
            public final void invoke(Object obj) {
                v5i0 v5i0Var2 = this.a;
                ((j00) obj).a(v5i0Var2);
                int i = v5i0Var2.a;
            }
        });
    }

    @Override // so10.c
    public final void a0(qjv qjvVar) {
        p0(k0(), 14, new ro4());
    }

    @Override // defpackage.xz
    public final void b(final e5d e5dVar) {
        final j00.a aVarL0 = l0(this.d.e);
        p0(aVarL0, 1020, new bjs.a(aVarL0, e5dVar) { // from class: s9d
            public final /* synthetic */ e5d a;

            {
                this.a = e5dVar;
            }

            @Override // bjs.a
            public final void invoke(Object obj) {
                ((j00) obj).b(this.a);
            }
        });
    }

    @Override // defpackage.xz
    public final void b0(long j, String str, long j2) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 1008, new f9d(aVarO0, str, j2, j));
    }

    @Override // defpackage.xz
    public final void c(final androidx.media3.common.a aVar, final i5d i5dVar) {
        final j00.a aVarO0 = o0();
        p0(aVarO0, 1017, new bjs.a() { // from class: cad
            @Override // bjs.a
            public final void invoke(Object obj) {
                ((j00) obj).l(aVarO0, aVar, i5dVar);
            }
        });
    }

    @Override // so10.c
    public final void c0(int i) {
        j00.a aVarK0 = k0();
        p0(aVarK0, 8, new lad(i, aVarK0));
    }

    @Override // defpackage.xz
    public final void d(String str) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 1019, new jad(aVarO0, str));
    }

    @Override // so10.c
    public final void d0(int i, boolean z) {
        j00.a aVarK0 = k0();
        p0(aVarK0, -1, new c9d(aVarK0, z, i));
    }

    @Override // defpackage.xz
    public final void e(long j, String str, long j2) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 1016, new f9d(aVarO0, str, j2, j));
    }

    @Override // defpackage.xz
    public final void e0(Exception exc) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 1029, new a9d(aVarO0, exc));
    }

    @Override // defpackage.xz
    public final void f(Exception exc) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 1030, new a9d(aVarO0, exc));
    }

    @Override // so10.c
    public final void f0(eo10 eo10Var) {
        p0(k0(), 12, new z8d());
    }

    @Override // defpackage.xz
    public final void g(int i, long j) {
        p0(l0(this.d.e), 1021, new aad());
    }

    @Override // so10.c
    public final void g0(so10.a aVar) {
        p0(k0(), 13, new kad());
    }

    @Override // defpackage.xz
    public final void h(e5d e5dVar) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 1015, new w9d(aVarO0, e5dVar));
    }

    @Override // defpackage.xz
    public final void h0(int i, long j, long j2) {
        p0(o0(), 1011, new x9d());
    }

    @Override // so10.c
    public final void i(final bo10 bo10Var) {
        ekv.b bVar;
        final j00.a aVarK0 = (!(bo10Var instanceof rwg) || (bVar = ((rwg) bo10Var).v) == null) ? k0() : l0(bVar);
        p0(aVarK0, 10, new bjs.a(aVarK0, bo10Var) { // from class: l9d
            public final /* synthetic */ bo10 a;

            {
                this.a = bo10Var;
            }

            @Override // bjs.a
            public final void invoke(Object obj) {
                ((j00) obj).i(this.a);
            }
        });
    }

    @Override // defpackage.xz
    public final void i0(e5d e5dVar) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 1007, new w9d(aVarO0, e5dVar));
    }

    @Override // defpackage.xz
    public final void j(final int i, final long j) {
        final j00.a aVarL0 = l0(this.d.e);
        p0(aVarL0, 1018, new bjs.a() { // from class: z9d
            @Override // bjs.a
            public final void invoke(Object obj) {
                ((j00) obj).o(aVarL0, i, j);
            }
        });
    }

    @Override // so10.c
    public final void j0(boolean z) {
        j00.a aVarK0 = k0();
        p0(aVarK0, 7, new iad(aVarK0, z));
    }

    @Override // defpackage.xz
    public final void k(final Object obj, final long j) {
        final j00.a aVarO0 = o0();
        p0(aVarO0, 26, new bjs.a(aVarO0, obj, j) { // from class: gad
            public final /* synthetic */ Object a;

            {
                this.a = obj;
            }

            @Override // bjs.a
            public final void invoke(Object obj2) {
            }
        });
    }

    public final j00.a k0() {
        return l0(this.d.d);
    }

    @Override // so10.c
    public final void l(int i) {
        j00.a aVarK0 = k0();
        p0(aVarK0, 6, new lad(i, aVarK0));
    }

    public final j00.a l0(ekv.b bVar) {
        this.i.getClass();
        qxf0 qxf0Var = bVar == null ? null : (qxf0) this.d.c.get(bVar);
        if (bVar != null && qxf0Var != null) {
            return m0(qxf0Var, qxf0Var.g(bVar.a, this.b).c, bVar);
        }
        int iU = this.i.U();
        qxf0 qxf0VarV = this.i.v();
        if (iU >= qxf0VarV.o()) {
            qxf0VarV = qxf0.a;
        }
        return m0(qxf0VarV, iU, null);
    }

    @Override // defpackage.xz
    public final void m(j00 j00Var) {
        this.f.e(j00Var);
    }

    public final j00.a m0(qxf0 qxf0Var, int i, ekv.b bVar) {
        ekv.b bVar2 = qxf0Var.p() ? null : bVar;
        long jD = this.a.d();
        boolean z = qxf0Var.equals(this.i.v()) && i == this.i.U();
        long jZ = 0;
        if (bVar2 == null || !bVar2.b()) {
            if (z) {
                jZ = this.i.O();
            } else if (!qxf0Var.p()) {
                jZ = jrh0.Z(qxf0Var.m(i, this.c, 0L).k);
            }
        } else if (z && this.i.s() == bVar2.b && this.i.I() == bVar2.c) {
            jZ = this.i.e0();
        }
        return new j00.a(jD, qxf0Var, i, bVar2, jZ, this.i.v(), this.i.U(), this.d.d, this.i.e0(), this.i.h());
    }

    @Override // defpackage.mkv
    public final void n(int i, ekv.b bVar, pjv pjvVar) {
        p0(n0(i, bVar), WebSocketProtocol.CLOSE_NO_STATUS_CODE, new had());
    }

    public final j00.a n0(int i, ekv.b bVar) {
        this.i.getClass();
        if (bVar != null) {
            return ((qxf0) this.d.c.get(bVar)) != null ? l0(bVar) : m0(qxf0.a, i, bVar);
        }
        qxf0 qxf0VarV = this.i.v();
        if (i >= qxf0VarV.o()) {
            qxf0VarV = qxf0.a;
        }
        return m0(qxf0VarV, i, null);
    }

    @Override // defpackage.xz
    public final void o(final d dVar, Looper looper) {
        ly0.f(this.i == null || this.d.b.isEmpty());
        dVar.getClass();
        this.i = dVar;
        this.v = this.a.c(looper, null);
        bjs<j00> bjsVar = this.f;
        this.f = new bjs<>(bjsVar.d, looper, bjsVar.a, new bjs.b() { // from class: b9d
            @Override // bjs.b
            public final void a(Object obj, iuh iuhVar) {
                ((j00) obj).p(dVar, new j00.b(iuhVar, this.a.e));
            }
        }, bjsVar.i);
    }

    public final j00.a o0() {
        return l0(this.d.f);
    }

    @Override // so10.c
    public final void p(int i) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 21, new lad(i, aVarO0));
    }

    public final void p0(j00.a aVar, int i, bjs.a<j00> aVar2) {
        this.e.put(i, aVar);
        this.f.f(i, aVar2);
    }

    @Override // so10.c
    public final void q(int i) {
        j00.a aVarK0 = k0();
        p0(aVarK0, 4, new lad(i, aVarK0));
    }

    @Override // fw1.a
    public final void r(final int i, final long j, final long j2) {
        a aVar = this.d;
        final j00.a aVarL0 = l0(aVar.b.isEmpty() ? null : (ekv.b) t3p.a(aVar.b));
        p0(aVarL0, 1006, new bjs.a(i, j, j2) { // from class: q9d
            public final /* synthetic */ int b;
            public final /* synthetic */ long c;

            @Override // bjs.a
            public final void invoke(Object obj) {
                ((j00) obj).k(this.a, this.b, this.c);
            }
        });
    }

    @Override // defpackage.xz
    public final void release() {
        cdl cdlVar = this.v;
        ly0.g(cdlVar);
        cdlVar.i(new Runnable() { // from class: o9d
            @Override // java.lang.Runnable
            public final void run() {
                nad nadVar = this.a;
                j00.a aVarK0 = nadVar.k0();
                nadVar.p0(aVarK0, 1028, new m9d(aVarK0));
                nadVar.f.d();
            }
        });
    }

    @Override // defpackage.xz
    public final void s() {
        if (this.w) {
            return;
        }
        j00.a aVarK0 = k0();
        this.w = true;
        p0(aVarK0, -1, new m9d(aVarK0));
    }

    @Override // defpackage.xz
    public final void t(String str) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 1012, new jad(aVarO0, str));
    }

    @Override // so10.c
    public final void u(boolean z) {
        j00.a aVarK0 = k0();
        p0(aVarK0, 9, new iad(aVarK0, z));
    }

    @Override // defpackage.mkv
    public final void v(int i, ekv.b bVar, final tws twsVar, final pjv pjvVar, final IOException iOException, final boolean z) {
        final j00.a aVarN0 = n0(i, bVar);
        p0(aVarN0, 1003, new bjs.a(aVarN0, twsVar, pjvVar, iOException, z) { // from class: y9d
            public final /* synthetic */ pjv a;
            public final /* synthetic */ IOException b;

            {
                this.a = pjvVar;
                this.b = iOException;
            }

            @Override // bjs.a
            public final void invoke(Object obj) {
                ((j00) obj).j(this.a, this.b);
            }
        });
    }

    @Override // defpackage.xz
    public final void w(y31 y31Var) {
        j00.a aVarO0 = o0();
        p0(aVarO0, 1032, new dad(aVarO0, y31Var));
    }

    @Override // defpackage.xz
    public final void x(c150 c150Var, ekv.b bVar) {
        so10 so10Var = this.i;
        so10Var.getClass();
        pcn<ekv.b> pcnVarJ = pcn.j(c150Var);
        a aVar = this.d;
        aVar.b = pcnVarJ;
        if (!c150Var.isEmpty()) {
            aVar.e = (ekv.b) c150Var.get(0);
            bVar.getClass();
            aVar.f = bVar;
        }
        if (aVar.d == null) {
            aVar.d = a.b(so10Var, aVar.b, aVar.e, aVar.a);
        }
        aVar.d(so10Var.v());
    }

    @Override // defpackage.xz
    public final void y(androidx.media3.common.a aVar, i5d i5dVar) {
        p0(o0(), 1009, new fad());
    }

    @Override // so10.c
    public final void z(final int i, final so10.d dVar, final so10.d dVar2) {
        if (i == 1) {
            this.w = false;
        }
        so10 so10Var = this.i;
        so10Var.getClass();
        a aVar = this.d;
        aVar.d = a.b(so10Var, aVar.b, aVar.e, aVar.a);
        final j00.a aVarK0 = k0();
        p0(aVarK0, 11, new bjs.a(aVarK0, i, dVar, dVar2) { // from class: n9d
            public final /* synthetic */ int a;
            public final /* synthetic */ so10.d b;

            {
                this.a = i;
                this.b = dVar;
            }

            @Override // bjs.a
            public final void invoke(Object obj) {
                ((j00) obj).m(this.b, this.a);
            }
        });
    }

    @Override // so10.c
    public final void C() {
    }

    @Override // so10.c
    public final void I(d dVar, so10.b bVar) {
    }
}
