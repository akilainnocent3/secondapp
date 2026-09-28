package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u8e0 extends bjb0 implements edp {
    public final qla b;
    public final wbp c;
    public final u7k0 d;
    public final edp[] e;
    public final y3l f;
    public final fcp g;
    public boolean h;
    public String i;
    public String j;

    public u8e0(qla qlaVar, wbp wbpVar, u7k0 u7k0Var, edp[] edpVarArr) {
        qlaVar.getClass();
        this.b = qlaVar;
        this.c = wbpVar;
        this.d = u7k0Var;
        this.e = edpVarArr;
        this.f = wbpVar.b;
        this.g = wbpVar.a;
        int iOrdinal = u7k0Var.ordinal();
        if (edpVarArr != null) {
            edp edpVar = edpVarArr[iOrdinal];
            if (edpVar == null && edpVar == this) {
                return;
            }
            edpVarArr[iOrdinal] = this;
        }
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void C(int i) {
        if (this.h) {
            E(String.valueOf(i));
        } else {
            this.b.d(i);
        }
    }

    @Override // defpackage.bjb0, defpackage.fma
    public final <T> void D(pd80 pd80Var, int i, he80<? super T> he80Var, T t) {
        pd80Var.getClass();
        he80Var.getClass();
        if (t != null || this.g.b) {
            super.D(pd80Var, i, he80Var, t);
        }
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void E(String str) {
        str.getClass();
        this.b.h(str);
    }

    @Override // defpackage.bjb0
    public final void J(pd80 pd80Var, int i) {
        pd80Var.getClass();
        int iOrdinal = this.d.ordinal();
        qla qlaVar = this.b;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!qlaVar.b) {
                qlaVar.c(',');
            }
            qlaVar.a();
            return;
        }
        if (iOrdinal == 2) {
            if (qlaVar.b) {
                this.h = true;
                qlaVar.a();
                return;
            }
            if (i % 2 == 0) {
                qlaVar.c(',');
                qlaVar.a();
            } else {
                qlaVar.c(':');
                qlaVar.i();
                z = false;
            }
            this.h = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!qlaVar.b) {
                qlaVar.c(',');
            }
            qlaVar.a();
            rdp.d(this.c, pd80Var);
            E(pd80Var.e(i));
            qlaVar.c(':');
            qlaVar.i();
            return;
        }
        if (i == 0) {
            this.h = true;
        }
        if (i == 1) {
            qlaVar.c(',');
            qlaVar.i();
            this.h = false;
        }
    }

    @Override // defpackage.bjb0, defpackage.fma
    public final boolean a(pd80 pd80Var) {
        pd80Var.getClass();
        return false;
    }

    @Override // defpackage.bjb0, defpackage.fma
    public final void b(pd80 pd80Var) {
        pd80Var.getClass();
        qla qlaVar = this.b;
        qlaVar.getClass();
        qlaVar.b = false;
        qlaVar.c(this.d.b);
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final fma c(pd80 pd80Var) {
        edp edpVar;
        pd80Var.getClass();
        wbp wbpVar = this.c;
        u7k0 u7k0VarB = v7k0.b(wbpVar, pd80Var);
        char c = u7k0VarB.a;
        qla qlaVar = this.b;
        qlaVar.c(c);
        qlaVar.b = true;
        String str = this.i;
        if (str != null) {
            String strH = this.j;
            if (strH == null) {
                strH = pd80Var.h();
            }
            qlaVar.a();
            qlaVar.h(str);
            qlaVar.c(':');
            E(strH);
            this.i = null;
            this.j = null;
        }
        if (this.d == u7k0VarB) {
            return this;
        }
        edp[] edpVarArr = this.e;
        return (edpVarArr == null || (edpVar = edpVarArr[u7k0VarB.ordinal()]) == null) ? new u8e0(qlaVar, wbpVar, u7k0VarB, edpVarArr) : edpVar;
    }

    @Override // defpackage.f4g
    public final y3l d() {
        return this.f;
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void e(double d) {
        boolean z = this.h;
        qla qlaVar = this.b;
        if (z) {
            E(String.valueOf(d));
        } else {
            qlaVar.a.c(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw jdp.a(Double.valueOf(d), qlaVar.a.toString());
        }
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void g(byte b) {
        if (this.h) {
            E(String.valueOf((int) b));
        } else {
            this.b.b(b);
        }
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final f4g h(pd80 pd80Var) {
        pd80Var.getClass();
        boolean zA = v8e0.a(pd80Var);
        u7k0 u7k0Var = this.d;
        wbp wbpVar = this.c;
        qla slaVar = this.b;
        if (zA) {
            if (!(slaVar instanceof tla)) {
                slaVar = new tla(slaVar.a, this.h);
            }
            return new u8e0(slaVar, wbpVar, u7k0Var, null);
        }
        if (pd80Var.isInline() && pd80Var.equals(ucp.a)) {
            if (!(slaVar instanceof sla)) {
                slaVar = new sla(slaVar.a, this.h);
            }
            return new u8e0(slaVar, wbpVar, u7k0Var, null);
        }
        if (this.i != null) {
            this.j = pd80Var.h();
        }
        return this;
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void m(pd80 pd80Var, int i) {
        pd80Var.getClass();
        E(pd80Var.e(i));
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void p(long j) {
        if (this.h) {
            E(String.valueOf(j));
        } else {
            this.b.e(j);
        }
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void t() {
        qla qlaVar = this.b;
        qlaVar.getClass();
        qlaVar.a.c("null");
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void u(short s) {
        if (this.h) {
            E(String.valueOf((int) s));
        } else {
            this.b.g(s);
        }
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void v(boolean z) {
        if (this.h) {
            E(String.valueOf(z));
        } else {
            this.b.a.c(String.valueOf(z));
        }
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void w(float f) {
        boolean z = this.h;
        qla qlaVar = this.b;
        if (z) {
            E(String.valueOf(f));
        } else {
            qlaVar.a.c(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw jdp.a(Float.valueOf(f), qlaVar.a.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.f4g
    public final <T> void x(he80<? super T> he80Var, T t) {
        String strB;
        he80Var.getClass();
        wbp wbpVar = this.c;
        boolean z = he80Var instanceof q4;
        wp7 wp7Var = wbpVar.a.f;
        if (!z) {
            int iOrdinal = wp7Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    yd80 kind = he80Var.getDescriptor().getKind();
                    strB = (Intrinsics.g(kind, ebe0.a.a) || Intrinsics.g(kind, ebe0.d.a)) ? g120.b(wbpVar, he80Var.getDescriptor()) : null;
                } else if (iOrdinal != 2) {
                    uhc.a();
                    return;
                }
            }
        } else if (wp7Var != wp7.a) {
        }
        if (z) {
            q4 q4Var = (q4) he80Var;
            if (t == 0) {
                efx.a(q4Var.getDescriptor(), "Value for serializer ", " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            he80<? super T> he80VarE = byx.e(q4Var, this, t);
            if (strB != null) {
                g120.c(he80Var, he80VarE, strB);
                g120.a(he80VarE.getDescriptor().getKind());
            }
            he80Var = he80VarE;
        }
        if (strB != null) {
            String strH = he80Var.getDescriptor().h();
            this.i = strB;
            this.j = strH;
        }
        he80Var.serialize(this, t);
    }

    @Override // defpackage.bjb0, defpackage.f4g
    public final void y(char c) {
        E(String.valueOf(c));
    }
}
