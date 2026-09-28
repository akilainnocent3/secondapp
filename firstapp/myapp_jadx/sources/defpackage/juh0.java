package defpackage;

import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sporty.android.core.model.pocket.withdraw.WithDrawInfo;
import java.math.BigDecimal;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class juh0 {
    public final d100 a;
    public final sr10 b;
    public final uy0 c;
    public final ut5 d;
    public final shj0 e;

    public juh0(d100 d100Var, sr10 sr10Var, uy0 uy0Var, ut5 ut5Var, shj0 shj0Var) {
        d100Var.getClass();
        sr10Var.getClass();
        uy0Var.getClass();
        this.a = d100Var;
        this.b = sr10Var;
        this.c = uy0Var;
        this.d = ut5Var;
        this.e = shj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:57:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0106  */
    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(BigDecimal bigDecimal, Integer num, BigDecimal bigDecimal2, BigDecimal bigDecimal3, x1b x1bVar) {
        huh0 huh0Var;
        Object objQ;
        Integer num2;
        BigDecimal bigDecimal4;
        BigDecimal bigDecimal5;
        Integer num3;
        WithDrawInfo withDrawInfo;
        BigDecimal bigDecimalB;
        BigDecimal bigDecimal6;
        lk50 lk50Var;
        BigDecimal bigDecimal7;
        BigDecimal bigDecimalA;
        if (x1bVar instanceof huh0) {
            huh0Var = (huh0) x1bVar;
            int i = huh0Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                huh0Var.w = i - Integer.MIN_VALUE;
            } else {
                huh0Var = new huh0(this, x1bVar);
            }
        } else {
            huh0Var = new huh0(this, x1bVar);
        }
        Object objQ2 = huh0Var.i;
        y5b y5bVar = y5b.a;
        int i2 = huh0Var.w;
        if (i2 == 0) {
            uj50.b(objQ2);
            lyh lyhVarH = this.c.h(new pu0.a(0));
            huh0Var.a = bigDecimal;
            huh0Var.b = num;
            huh0Var.c = bigDecimal2;
            huh0Var.d = bigDecimal3;
            huh0Var.w = 1;
            objQ2 = bm50.q(lyhVarH, huh0Var);
            if (objQ2 != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            bigDecimal3 = huh0Var.d;
            bigDecimal2 = huh0Var.c;
            num = huh0Var.b;
            bigDecimal = huh0Var.a;
            uj50.b(objQ2);
        } else {
            if (i2 == 2) {
                bigDecimal5 = huh0Var.e;
                BigDecimal bigDecimal8 = huh0Var.d;
                bigDecimal2 = huh0Var.c;
                Integer num4 = huh0Var.b;
                BigDecimal bigDecimal9 = huh0Var.a;
                uj50.b(objQ2);
                num2 = num4;
                bigDecimal3 = bigDecimal8;
                bigDecimal4 = bigDecimal9;
                objQ = objQ2;
                num3 = num2;
                withDrawInfo = (WithDrawInfo) objQ;
                if (withDrawInfo != null) {
                    bigDecimalB = xzf.b(withDrawInfo);
                } else {
                    bigDecimalB = null;
                }
                if (bigDecimal4.compareTo(bigDecimal3) < 0) {
                    return new xhj0.h(bigDecimal3);
                }
                if (bigDecimal4.compareTo(bigDecimal2) > 0) {
                    return new xhj0.g(bigDecimal2);
                }
                if (bigDecimal5 == null) {
                    BigDecimal bigDecimal10 = BigDecimal.ZERO;
                    bigDecimal10.getClass();
                    return new xhj0.e(bigDecimal10);
                }
                huh0Var.a = bigDecimal4;
                huh0Var.b = null;
                huh0Var.c = null;
                huh0Var.d = null;
                huh0Var.e = bigDecimal5;
                huh0Var.f = bigDecimalB;
                huh0Var.w = 3;
                objQ2 = this.d.a(bigDecimal4, num3, huh0Var);
                if (objQ2 != y5bVar) {
                    bigDecimal6 = bigDecimalB;
                }
                return y5bVar;
            }
            if (i2 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bigDecimal6 = huh0Var.f;
            bigDecimal5 = huh0Var.e;
            bigDecimal4 = huh0Var.a;
            uj50.b(objQ2);
        }
        lk50Var = (lk50) objQ2;
        if (lk50Var instanceof lk50.c) {
            bigDecimal7 = (BigDecimal) ((lk50.c) lk50Var).a;
        } else {
            bigDecimal7 = BigDecimal.ZERO;
        }
        if (bigDecimal4.compareTo(bigDecimal5) > 0) {
            return new xhj0.e(bigDecimal5);
        }
        if (bigDecimal6 != null) {
            BigDecimal bigDecimalSubtract = bigDecimal6.subtract(bigDecimal7);
            bigDecimalSubtract.getClass();
            bigDecimalA = p54.a(bigDecimalSubtract);
            if (bigDecimal4.compareTo(bigDecimalA) > 0) {
                return new xhj0.f(bigDecimalA);
            }
        }
        return xhj0.i.a;
        AssetsInfo assetsInfo = (AssetsInfo) objQ2;
        BigDecimal bigDecimalB2 = assetsInfo != null ? ty0.b(assetsInfo) : null;
        g1i g1iVarJ0 = this.b.j0(new pu0.a(0));
        huh0Var.a = bigDecimal;
        huh0Var.b = num;
        huh0Var.c = bigDecimal2;
        huh0Var.d = bigDecimal3;
        huh0Var.e = bigDecimalB2;
        huh0Var.w = 2;
        objQ = bm50.q(g1iVarJ0, huh0Var);
        if (objQ != y5bVar) {
            num2 = num;
            bigDecimal4 = bigDecimal;
            bigDecimal5 = bigDecimalB2;
            num3 = num2;
            withDrawInfo = (WithDrawInfo) objQ;
            if (withDrawInfo != null) {
                bigDecimalB = xzf.b(withDrawInfo);
            } else {
                bigDecimalB = null;
            }
            if (bigDecimal4.compareTo(bigDecimal3) < 0) {
                return new xhj0.h(bigDecimal3);
            }
            if (bigDecimal4.compareTo(bigDecimal2) > 0) {
                return new xhj0.g(bigDecimal2);
            }
            if (bigDecimal5 == null) {
                BigDecimal bigDecimal11 = BigDecimal.ZERO;
                bigDecimal11.getClass();
                return new xhj0.e(bigDecimal11);
            }
            huh0Var.a = bigDecimal4;
            huh0Var.b = null;
            huh0Var.c = null;
            huh0Var.d = null;
            huh0Var.e = bigDecimal5;
            huh0Var.f = bigDecimalB;
            huh0Var.w = 3;
            objQ2 = this.d.a(bigDecimal4, num3, huh0Var);
            if (objQ2 != y5bVar) {
                bigDecimal6 = bigDecimalB;
                lk50Var = (lk50) objQ2;
                if (lk50Var instanceof lk50.c) {
                    bigDecimal7 = (BigDecimal) ((lk50.c) lk50Var).a;
                } else {
                    bigDecimal7 = BigDecimal.ZERO;
                }
                if (bigDecimal4.compareTo(bigDecimal5) > 0) {
                    return new xhj0.e(bigDecimal5);
                }
                if (bigDecimal6 != null) {
                    BigDecimal bigDecimalSubtract2 = bigDecimal6.subtract(bigDecimal7);
                    bigDecimalSubtract2.getClass();
                    bigDecimalA = p54.a(bigDecimalSubtract2);
                    if (bigDecimal4.compareTo(bigDecimalA) > 0) {
                        return new xhj0.f(bigDecimalA);
                    }
                }
                return xhj0.i.a;
            }
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(BigDecimal bigDecimal, Integer num, y300 y300Var, x1b x1bVar) {
        iuh0 iuh0Var;
        BigDecimal bigDecimal2;
        boolean z;
        Integer num2;
        vw vwVar;
        Object objA;
        if (x1bVar instanceof iuh0) {
            iuh0Var = (iuh0) x1bVar;
            int i = iuh0Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                iuh0Var.i = i - Integer.MIN_VALUE;
            } else {
                iuh0Var = new iuh0(this, x1bVar);
            }
        } else {
            iuh0Var = new iuh0(this, x1bVar);
        }
        iuh0 iuh0Var2 = iuh0Var;
        Object objA2 = iuh0Var2.e;
        Object obj = y5b.a;
        int i2 = iuh0Var2.i;
        if (i2 == 0) {
            uj50.b(objA2);
            if (bigDecimal.compareTo(BigDecimal.ZERO) == 0) {
                return xhj0.d.a;
            }
            r100 r100VarJ = this.a.J(log0.b);
            iuh0Var2.a = bigDecimal;
            iuh0Var2.b = num;
            iuh0Var2.c = y300Var;
            iuh0Var2.i = 1;
            objA2 = s0i.a(r100VarJ, iuh0Var2);
            if (objA2 != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            y300Var = iuh0Var2.c;
            num = iuh0Var2.b;
            bigDecimal = iuh0Var2.a;
            uj50.b(objA2);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    uj50.b(objA2);
                    return objA2;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = iuh0Var2.d;
            num = iuh0Var2.b;
            bigDecimal2 = iuh0Var2.a;
            uj50.b(objA2);
        }
        num2 = num;
        vwVar = (vw) objA2;
        if (vwVar == null) {
            return xhj0.j.a;
        }
        BigDecimal bigDecimal3 = (BigDecimal) vwVar.b;
        BigDecimal bigDecimal4 = (BigDecimal) vwVar.a;
        iuh0Var2.a = null;
        iuh0Var2.b = null;
        iuh0Var2.c = null;
        iuh0Var2.d = z;
        iuh0Var2.i = 3;
        objA = a(bigDecimal2, num2, bigDecimal3, bigDecimal4, iuh0Var2);
        if (objA != obj) {
            return obj;
        }
        return objA;
        boolean zBooleanValue = ((Boolean) objA2).booleanValue();
        if (!zBooleanValue) {
            String plainString = bigDecimal.toPlainString();
            plainString.getClass();
            if (StringsKt.N(plainString, '.')) {
                return xhj0.c.a;
            }
        }
        rhj0 rhj0VarA = this.e.a(y300Var);
        iuh0Var2.a = bigDecimal;
        iuh0Var2.b = num;
        iuh0Var2.c = null;
        iuh0Var2.d = zBooleanValue;
        iuh0Var2.i = 2;
        Object objA3 = s0i.a(rhj0VarA, iuh0Var2);
        if (objA3 != obj) {
            bigDecimal2 = bigDecimal;
            z = zBooleanValue;
            objA2 = objA3;
            num2 = num;
            vwVar = (vw) objA2;
            if (vwVar == null) {
                return xhj0.j.a;
            }
            BigDecimal bigDecimal5 = (BigDecimal) vwVar.b;
            BigDecimal bigDecimal6 = (BigDecimal) vwVar.a;
            iuh0Var2.a = null;
            iuh0Var2.b = null;
            iuh0Var2.c = null;
            iuh0Var2.d = z;
            iuh0Var2.i = 3;
            objA = a(bigDecimal2, num2, bigDecimal5, bigDecimal6, iuh0Var2);
            if (objA != obj) {
                return objA;
            }
        }
        return obj;
    }
}
