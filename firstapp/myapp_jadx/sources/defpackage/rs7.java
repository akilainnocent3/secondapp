package defpackage;

import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rs7 extends s7k0 {
    public final long l;
    public final boolean m;
    public final ArrayList<qs7> n;
    public final qxf0.c o;
    public b p;
    public c q;
    public long r;
    public long s;

    public static final class a {
        public final ekv a;
        public long b;
        public boolean c;
        public boolean d;

        public a(ekv ekvVar) {
            ekvVar.getClass();
            this.a = ekvVar;
            this.c = true;
            this.b = Long.MIN_VALUE;
        }
    }

    public static final class b extends kui {
        public final long c;
        public final long d;
        public final long e;
        public final boolean f;

        public b(qxf0 qxf0Var, long j, long j2) throws c {
            super(qxf0Var);
            if (j2 != Long.MIN_VALUE && j2 < j) {
                throw new c(2, j, j2);
            }
            boolean z = false;
            if (qxf0Var.h() != 1) {
                throw new c(0);
            }
            qxf0.c cVarM = qxf0Var.m(0, new qxf0.c(), 0L);
            long jMax = Math.max(0L, j);
            if (!cVarM.j && jMax != 0 && !cVarM.g) {
                throw new c(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? cVarM.l : Math.max(0L, j2);
            long j3 = cVarM.l;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.c = jMax;
            this.d = jMax2;
            this.e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
            if (cVarM.h && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z = true;
            }
            this.f = z;
        }

        @Override // defpackage.kui, defpackage.qxf0
        public final qxf0.b f(int i, qxf0.b bVar, boolean z) {
            this.b.f(0, bVar, z);
            long j = bVar.e - this.c;
            long j2 = this.e;
            bVar.h(bVar.a, bVar.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, kf.c, false);
            return bVar;
        }

        @Override // defpackage.kui, defpackage.qxf0
        public final qxf0.c m(int i, qxf0.c cVar, long j) {
            this.b.m(0, cVar, 0L);
            long j2 = cVar.o;
            long j3 = this.c;
            cVar.o = j2 + j3;
            cVar.l = this.e;
            cVar.h = this.f;
            long j4 = cVar.k;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                cVar.k = jMax;
                long j5 = this.d;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                cVar.k = jMax - j3;
            }
            long jZ = jrh0.Z(j3);
            long j6 = cVar.d;
            if (j6 != -9223372036854775807L) {
                cVar.d = j6 + jZ;
            }
            long j7 = cVar.e;
            if (j7 != -9223372036854775807L) {
                cVar.e = j7 + jZ;
            }
            return cVar;
        }
    }

    public static final class c extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        public c(int i, long j, long j2) {
            String str;
            if (i != 0) {
                if (i == 1) {
                    str = "not seekable to start";
                } else if (i != 2) {
                    str = "unknown";
                } else {
                    ly0.f((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                    str = "start exceeds end. Start time: " + j + ", End time: " + j2;
                }
            } else {
                str = "invalid period count";
            }
            super(oAudzpbdOhCI.aGJbqGDzTZ.concat(str));
        }

        public c(int i) {
            this(i, -9223372036854775807L, -9223372036854775807L);
        }
    }

    public rs7(a aVar) {
        super(aVar.a);
        this.l = aVar.b;
        this.m = aVar.c;
        this.n = new ArrayList<>();
        this.o = new qxf0.c();
    }

    @Override // defpackage.s7k0
    public final void A(qxf0 qxf0Var) {
        if (this.q != null) {
            return;
        }
        D(qxf0Var);
    }

    public final void D(qxf0 qxf0Var) {
        long j;
        qxf0.c cVar = this.o;
        qxf0Var.n(0, cVar);
        long j2 = cVar.o;
        b bVar = this.p;
        long j3 = this.l;
        ArrayList<qs7> arrayList = this.n;
        if (bVar == null || arrayList.isEmpty()) {
            this.r = j2;
            this.s = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                qs7 qs7Var = arrayList.get(i);
                long j4 = this.r;
                long j5 = this.s;
                qs7Var.e = j4;
                qs7Var.f = j5;
            }
            j = 0;
        } else {
            j = this.r - j2;
            j3 = j3 == Long.MIN_VALUE ? Long.MIN_VALUE : this.s - j2;
        }
        try {
            b bVar2 = new b(qxf0Var, j, j3);
            this.p = bVar2;
            s(bVar2);
        } catch (c e) {
            this.q = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).i = this.q;
            }
        }
    }

    @Override // defpackage.ekv
    public final zjv c(ekv.b bVar, tf tfVar, long j) {
        qs7 qs7Var = new qs7(this.k.c(bVar, tfVar, j), this.m, this.r, this.s);
        this.n.add(qs7Var);
        return qs7Var;
    }

    @Override // defpackage.jma, defpackage.ekv
    public final void l() throws c {
        c cVar = this.q;
        if (cVar != null) {
            throw cVar;
        }
        super.l();
    }

    @Override // defpackage.ekv
    public final void o(zjv zjvVar) {
        ArrayList<qs7> arrayList = this.n;
        ly0.f(arrayList.remove(zjvVar));
        this.k.o(((qs7) zjvVar).a);
        if (arrayList.isEmpty()) {
            b bVar = this.p;
            bVar.getClass();
            D(bVar.b);
        }
    }

    @Override // defpackage.jma, defpackage.h32
    public final void t() {
        super.t();
        this.q = null;
        this.p = null;
    }
}
