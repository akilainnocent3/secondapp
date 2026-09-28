package defpackage;

import java.math.BigDecimal;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class eth0 {
    public final d100 a;

    public eth0(d100 d100Var) {
        d100Var.getClass();
        this.a = d100Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(BigDecimal bigDecimal, x1b x1bVar) {
        dth0 dth0Var;
        BigDecimal bigDecimal2;
        lk50 lk50Var;
        lk50.c cVar;
        vw vwVar;
        BigDecimal bigDecimal3;
        if (x1bVar instanceof dth0) {
            dth0Var = (dth0) x1bVar;
            int i = dth0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dth0Var.d = i - Integer.MIN_VALUE;
            } else {
                dth0Var = new dth0(this, x1bVar);
            }
        } else {
            dth0Var = new dth0(this, x1bVar);
        }
        Object objA = dth0Var.b;
        y5b y5bVar = y5b.a;
        int i2 = dth0Var.d;
        d100 d100Var = this.a;
        if (i2 == 0) {
            uj50.b(objA);
            if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
                return lod.b.a;
            }
            r100 r100VarJ = d100Var.J(log0.a);
            dth0Var.a = bigDecimal;
            dth0Var.d = 1;
            objA = s0i.a(r100VarJ, dth0Var);
            if (objA != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            bigDecimal = dth0Var.a;
            uj50.b(objA);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bigDecimal2 = dth0Var.a;
            uj50.b(objA);
        }
        lk50Var = (lk50) objA;
        if (lk50Var instanceof lk50.c) {
            cVar = (lk50.c) lk50Var;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            vwVar = (vw) cVar.a;
        } else {
            vwVar = null;
        }
        if (vwVar != null) {
            bigDecimal3 = (BigDecimal) vwVar.b;
        } else {
            bigDecimal3 = null;
        }
        BigDecimal bigDecimal4 = vwVar != null ? (BigDecimal) vwVar.a : null;
        if (bigDecimal3 != null || bigDecimal4 == null) {
            return lod.f.a;
        }
        if (bigDecimal2.compareTo(bigDecimal4) < 0) {
            return new lod.d(bigDecimal4);
        }
        return bigDecimal2.compareTo(bigDecimal3) > 0 ? new lod.c(bigDecimal3) : lod.e.a;
        if (!((Boolean) objA).booleanValue()) {
            String plainString = bigDecimal.toPlainString();
            plainString.getClass();
            if (StringsKt.N(plainString, '.')) {
                return lod.a.a;
            }
        }
        wl50 wl50VarH = d100Var.H(log0.a);
        dth0Var.a = bigDecimal;
        dth0Var.d = 2;
        objA = bm50.p(wl50VarH, dth0Var);
        if (objA != y5bVar) {
            bigDecimal2 = bigDecimal;
            lk50Var = (lk50) objA;
            if (lk50Var instanceof lk50.c) {
                cVar = (lk50.c) lk50Var;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                vwVar = (vw) cVar.a;
            } else {
                vwVar = null;
            }
            if (vwVar != null) {
                bigDecimal3 = (BigDecimal) vwVar.b;
            } else {
                bigDecimal3 = null;
            }
            if (vwVar != null) {
            }
            if (bigDecimal3 != null) {
            }
            return lod.f.a;
        }
        return y5bVar;
    }
}
