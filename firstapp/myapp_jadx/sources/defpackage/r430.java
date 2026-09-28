package defpackage;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class r430 extends h32 {
    public final zpc.a h;
    public final k430.a i;
    public final nef j;
    public final sws k;
    public final int l;
    public final androidx.media3.common.a m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public mrg0 r;
    public njv s;

    public class a extends kui {
        @Override // defpackage.kui, defpackage.qxf0
        public final qxf0.b f(int i, qxf0.b bVar, boolean z) {
            super.f(i, bVar, z);
            bVar.f = true;
            return bVar;
        }

        @Override // defpackage.kui, defpackage.qxf0
        public final qxf0.c m(int i, qxf0.c cVar, long j) {
            super.m(i, cVar, j);
            cVar.j = true;
            return cVar;
        }
    }

    public static final class b implements ekv.a {
        public final zpc.a a;
        public final s430 b;
        public final zbd c;
        public final udd d;
        public final int e;

        public b(zpc.a aVar, mcd mcdVar) {
            s430 s430Var = new s430(mcdVar);
            zbd zbdVar = new zbd();
            udd uddVar = new udd();
            this.a = aVar;
            this.b = s430Var;
            this.c = zbdVar;
            this.d = uddVar;
            this.e = 1048576;
        }

        @Override // ekv.a
        public final ekv b(njv njvVar) {
            njvVar.b.getClass();
            return new r430(njvVar, this.a, this.b, this.c.b(njvVar), this.d, this.e, null);
        }
    }

    public r430(njv njvVar, zpc.a aVar, s430 s430Var, nef nefVar, sws swsVar, int i, androidx.media3.common.a aVar2) {
        this.s = njvVar;
        this.h = aVar;
        this.i = s430Var;
        this.j = nefVar;
        this.k = swsVar;
        this.l = i;
        this.m = aVar2;
    }

    @Override // defpackage.ekv
    public final zjv c(ekv.b bVar, tf tfVar, long j) {
        zpc zpcVarA = this.h.a();
        mrg0 mrg0Var = this.r;
        if (mrg0Var != null) {
            zpcVarA.g(mrg0Var);
        }
        njv.e eVar = e().b;
        eVar.getClass();
        Uri uri = eVar.a;
        ly0.g(this.g);
        return new q430(uri, zpcVarA, new xj5(((s430) this.i).a), this.j, new mef.a(this.d.c, 0, bVar), this.k, new mkv.a(this.c.c, 0, bVar), this, tfVar, this.l, this.m, jrh0.O(eVar.e), null);
    }

    @Override // defpackage.ekv
    public final synchronized njv e() {
        return this.s;
    }

    @Override // defpackage.ekv
    public final synchronized void g(njv njvVar) {
        this.s = njvVar;
    }

    @Override // defpackage.ekv
    public final void o(zjv zjvVar) {
        q430 q430Var = (q430) zjvVar;
        if (q430Var.L) {
            for (ps60 ps60Var : q430Var.I) {
                ps60Var.i();
                lef lefVar = ps60Var.h;
                if (lefVar != null) {
                    lefVar.i(ps60Var.e);
                    ps60Var.h = null;
                    ps60Var.g = null;
                }
            }
        }
        q430Var.A.c(q430Var);
        q430Var.F.removeCallbacksAndMessages(null);
        q430Var.G = null;
        q430Var.d0 = true;
    }

    @Override // defpackage.h32
    public final void r(mrg0 mrg0Var) {
        this.r = mrg0Var;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        sp10 sp10Var = this.g;
        ly0.g(sp10Var);
        nef nefVar = this.j;
        nefVar.e(looperMyLooper, sp10Var);
        nefVar.d();
        u();
    }

    @Override // defpackage.h32
    public final void t() {
        this.j.release();
    }

    public final void u() {
        long j = this.o;
        boolean z = this.p;
        boolean z2 = this.q;
        njv njvVarE = e();
        qxf0 hv90Var = new hv90(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, njvVarE, z2 ? njvVarE.c : null);
        if (this.n) {
            hv90Var = new a(hv90Var);
        }
        s(hv90Var);
    }

    public final void v(long j, p480 p480Var, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        boolean zG = p480Var.g();
        if (!this.n && this.o == j && this.p == zG && this.q == z) {
            return;
        }
        this.o = j;
        this.p = zG;
        this.q = z;
        this.n = false;
        u();
    }

    @Override // defpackage.ekv
    public final void l() {
    }
}
