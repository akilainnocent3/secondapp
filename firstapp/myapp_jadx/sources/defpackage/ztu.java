package defpackage;

import android.util.Pair;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ztu extends s7k0 {
    public final boolean l;
    public final qxf0.c m;
    public final qxf0.b n;
    public a o;
    public ytu p;
    public boolean q;
    public boolean r;
    public boolean s;

    public static final class a extends kui {
        public static final Object e = new Object();
        public final Object c;
        public final Object d;

        public a(qxf0 qxf0Var, Object obj, Object obj2) {
            super(qxf0Var);
            this.c = obj;
            this.d = obj2;
        }

        @Override // defpackage.kui, defpackage.qxf0
        public final int b(Object obj) {
            Object obj2;
            if (e == obj && (obj2 = this.d) != null) {
                obj = obj2;
            }
            return this.b.b(obj);
        }

        @Override // defpackage.kui, defpackage.qxf0
        public final qxf0.b f(int i, qxf0.b bVar, boolean z) {
            this.b.f(i, bVar, z);
            if (Objects.equals(bVar.b, this.d) && z) {
                bVar.b = e;
            }
            return bVar;
        }

        @Override // defpackage.kui, defpackage.qxf0
        public final Object l(int i) {
            Object objL = this.b.l(i);
            return Objects.equals(objL, this.d) ? e : objL;
        }

        @Override // defpackage.kui, defpackage.qxf0
        public final qxf0.c m(int i, qxf0.c cVar, long j) {
            this.b.m(i, cVar, j);
            if (Objects.equals(cVar.a, this.c)) {
                cVar.a = qxf0.c.p;
            }
            return cVar;
        }
    }

    public static final class b extends qxf0 {
        public final njv b;

        public b(njv njvVar) {
            this.b = njvVar;
        }

        @Override // defpackage.qxf0
        public final int b(Object obj) {
            return obj == a.e ? 0 : -1;
        }

        @Override // defpackage.qxf0
        public final qxf0.b f(int i, qxf0.b bVar, boolean z) {
            bVar.h(z ? 0 : null, z ? a.e : null, 0, -9223372036854775807L, 0L, kf.c, true);
            return bVar;
        }

        @Override // defpackage.qxf0
        public final int h() {
            return 1;
        }

        @Override // defpackage.qxf0
        public final Object l(int i) {
            return a.e;
        }

        @Override // defpackage.qxf0
        public final qxf0.c m(int i, qxf0.c cVar, long j) {
            Object obj = qxf0.c.p;
            cVar.b(this.b, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0L);
            cVar.j = true;
            return cVar;
        }

        @Override // defpackage.qxf0
        public final int o() {
            return 1;
        }
    }

    public ztu(ekv ekvVar, boolean z) {
        super(ekvVar);
        this.l = z && ekvVar.m();
        this.m = new qxf0.c();
        this.n = new qxf0.b();
        qxf0 qxf0VarN = ekvVar.n();
        if (qxf0VarN == null) {
            this.o = new a(new b(ekvVar.e()), qxf0.c.p, a.e);
        } else {
            this.o = new a(qxf0VarN, null, null);
            this.s = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.s7k0
    public final void A(qxf0 qxf0Var) {
        long j;
        a aVar;
        ekv.b bVarA;
        a aVar2;
        if (this.r) {
            a aVar3 = this.o;
            this.o = new a(qxf0Var, aVar3.c, aVar3.d);
            ytu ytuVar = this.p;
            if (ytuVar != null) {
                E(ytuVar.v);
            }
        } else {
            if (!qxf0Var.p()) {
                qxf0.c cVar = this.m;
                qxf0Var.n(0, cVar);
                long j2 = cVar.k;
                Object obj = cVar.a;
                ytu ytuVar2 = this.p;
                qxf0.b bVar = this.n;
                if (ytuVar2 != null) {
                    long j3 = ytuVar2.b;
                    this.o.g(ytuVar2.a.a, bVar);
                    long j4 = bVar.e + j3;
                    this.o.m(0, cVar, 0L);
                    if (j4 != cVar.k) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair<Object, Long> pairI = qxf0Var.i(cVar, bVar, 0, j);
                Object obj2 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.s) {
                    a aVar4 = this.o;
                    aVar = new a(qxf0Var, aVar4.c, aVar4.d);
                } else {
                    aVar = new a(qxf0Var, obj, obj2);
                }
                this.o = aVar;
                ytu ytuVar3 = this.p;
                if (ytuVar3 != null && E(jLongValue)) {
                    ekv.b bVar2 = ytuVar3.a;
                    Object obj3 = bVar2.a;
                    if (this.o.d != null && obj3.equals(a.e)) {
                        obj3 = this.o.d;
                    }
                    bVarA = bVar2.a(obj3);
                }
                this.s = true;
                this.r = true;
                s(this.o);
                if (bVarA != null) {
                    ytu ytuVar4 = this.p;
                    ytuVar4.getClass();
                    ytuVar4.i(bVarA);
                }
            }
            if (this.s) {
                a aVar5 = this.o;
                aVar2 = new a(qxf0Var, aVar5.c, aVar5.d);
            } else {
                aVar2 = new a(qxf0Var, qxf0.c.p, a.e);
            }
            this.o = aVar2;
        }
        bVarA = null;
        this.s = true;
        this.r = true;
        s(this.o);
        if (bVarA != null) {
            ytu ytuVar5 = this.p;
            ytuVar5.getClass();
            ytuVar5.i(bVarA);
        }
    }

    @Override // defpackage.s7k0
    public final void C() {
        if (this.l) {
            return;
        }
        this.q = true;
        B();
    }

    @Override // defpackage.ekv
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public final ytu c(ekv.b bVar, tf tfVar, long j) {
        ytu ytuVar = new ytu(bVar, tfVar, j);
        ly0.f(ytuVar.d == null);
        ytuVar.d = this.k;
        if (!this.r) {
            this.p = ytuVar;
            if (!this.q) {
                this.q = true;
                B();
            }
            return ytuVar;
        }
        Object obj = bVar.a;
        if (this.o.d != null && obj.equals(a.e)) {
            obj = this.o.d;
        }
        ytuVar.i(bVar.a(obj));
        return ytuVar;
    }

    public final boolean E(long j) {
        ytu ytuVar = this.p;
        int iB = this.o.b(ytuVar.a.a);
        if (iB == -1) {
            return false;
        }
        a aVar = this.o;
        qxf0.b bVar = this.n;
        aVar.f(iB, bVar, false);
        long j2 = bVar.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        ytuVar.v = j;
        return true;
    }

    @Override // defpackage.s7k0, defpackage.ekv
    public final void g(njv njvVar) {
        if (this.s) {
            a aVar = this.o;
            this.o = new a(new rxf0(this.o.b, njvVar), aVar.c, aVar.d);
        } else {
            this.o = new a(new b(njvVar), qxf0.c.p, a.e);
        }
        this.k.g(njvVar);
    }

    @Override // defpackage.ekv
    public final void o(zjv zjvVar) {
        ytu ytuVar = (ytu) zjvVar;
        if (ytuVar.e != null) {
            ekv ekvVar = ytuVar.d;
            ekvVar.getClass();
            ekvVar.o(ytuVar.e);
        }
        if (zjvVar == this.p) {
            this.p = null;
        }
    }

    @Override // defpackage.jma, defpackage.h32
    public final void t() {
        this.r = false;
        this.q = false;
        super.t();
    }

    @Override // defpackage.s7k0
    public final ekv.b z(ekv.b bVar) {
        Object obj = bVar.a;
        Object obj2 = this.o.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = a.e;
        }
        return bVar.a(obj);
    }
}
