package defpackage;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ccj0 {
    public final j3f a;
    public final rdd0 b;
    public final wwd0 c;
    public final wwd0 d;
    public final wwd0 e;
    public wwd0 f;
    public j4f g;
    public uwd0<kdj0> h;

    public ccj0(j3f j3fVar, rdd0 rdd0Var) {
        this.a = j3fVar;
        this.b = rdd0Var;
        cdj0 cdj0Var = cdj0.a;
        this.c = xwd0.a(new dcj0(cdj0Var, cdj0Var));
        this.d = xwd0.a(cdj0Var);
        this.e = xwd0.a(cdj0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) throws Throwable {
        xbj0 xbj0Var;
        Object value;
        Object value2;
        Object value3;
        if (x1bVar instanceof xbj0) {
            xbj0Var = (xbj0) x1bVar;
            int i = xbj0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xbj0Var.c = i - Integer.MIN_VALUE;
            } else {
                xbj0Var = new xbj0(this, x1bVar);
            }
        } else {
            xbj0Var = new xbj0(this, x1bVar);
        }
        Object objA = xbj0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = xbj0Var.c;
        wwd0 wwd0Var = this.d;
        if (i2 == 0) {
            uj50.b(objA);
            j4f j4fVar = this.g;
            if (j4fVar != null && !c()) {
                this.b.a(new r5f(b()), k00.d, k00.c);
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, cdj0.b));
                String str = j4fVar.a;
                xbj0Var.c = 1;
                objA = this.a.a(str, xbj0Var);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objA);
        r0f r0fVar = (r0f) objA;
        if (r0fVar instanceof r0f.e) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, cdj0.d));
            return ((r0f.e) r0fVar).a;
        }
        if (!(r0fVar instanceof r0f.b)) {
            uhc.a();
            return null;
        }
        do {
            value2 = wwd0Var.getValue();
        } while (!wwd0Var.g(value2, cdj0.c));
        return null;
    }

    public final String b() {
        wwd0 wwd0Var = this.f;
        if (wwd0Var != null) {
            String str = ((v1f) wwd0Var.getValue()) != null ? "sr:sport:3" : null;
            return str == null ? "" : str;
        }
        Intrinsics.n("hostGameResultStateFlow");
        throw null;
    }

    public final boolean c() {
        wwd0 wwd0Var = this.d;
        Object value = wwd0Var.getValue();
        cdj0 cdj0Var = cdj0.b;
        if (value == cdj0Var) {
            return true;
        }
        Object value2 = wwd0Var.getValue();
        cdj0 cdj0Var2 = cdj0.d;
        if (value2 == cdj0Var2) {
            return true;
        }
        wwd0 wwd0Var2 = this.e;
        return wwd0Var2.getValue() == cdj0Var || wwd0Var2.getValue() == cdj0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(x1b x1bVar) throws Throwable {
        bcj0 bcj0Var;
        Object value;
        j4f j4fVar;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        Object value2;
        Object value3;
        if (x1bVar instanceof bcj0) {
            bcj0Var = (bcj0) x1bVar;
            int i = bcj0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bcj0Var.f = i - Integer.MIN_VALUE;
            } else {
                bcj0Var = new bcj0(this, x1bVar);
            }
        } else {
            bcj0Var = new bcj0(this, x1bVar);
        }
        bcj0 bcj0Var2 = bcj0Var;
        Object obj = bcj0Var2.d;
        y5b y5bVar = y5b.a;
        int i2 = bcj0Var2.f;
        wwd0 wwd0Var = this.e;
        if (i2 == 0) {
            uj50.b(obj);
            j4f j4fVar2 = this.g;
            if (j4fVar2 != null) {
                BigDecimal bigDecimal3 = j4fVar2.g;
                BigDecimal bigDecimal4 = j4fVar2.e;
                uwd0<kdj0> uwd0Var = this.h;
                if (uwd0Var == null) {
                    Intrinsics.n("stakeInputStateFlow");
                    throw null;
                }
                kdj0 value4 = uwd0Var.getValue();
                BigDecimal bigDecimalA = value4.a();
                bigDecimal4.getClass();
                bigDecimal3.getClass();
                Comparable comparableE = wl8.e(bigDecimalA, wl8.e(bigDecimal4, bigDecimal3));
                BigDecimal bigDecimal5 = BigDecimal.ZERO;
                if (((BigDecimal) comparableE).compareTo(bigDecimal5) <= 0) {
                    comparableE = null;
                }
                BigDecimal bigDecimal6 = (BigDecimal) comparableE;
                if (bigDecimal6 != null) {
                    BigDecimal bigDecimalSubtract = bigDecimal4.subtract((BigDecimal) wl8.e(value4.a(), bigDecimal3));
                    bigDecimalSubtract.getClass();
                    BigDecimal bigDecimal7 = bigDecimalSubtract.compareTo(bigDecimal5) >= 0 ? bigDecimalSubtract : null;
                    if (bigDecimal7 != null && !c()) {
                        String strB = b();
                        String plainString = s5y.a(bigDecimal4).toPlainString();
                        plainString.getClass();
                        u5f u5fVar = new u5f(strB, plainString, value4.c.b);
                        k00 k00Var = k00.d;
                        k00 k00Var2 = k00.c;
                        rdd0 rdd0Var = this.b;
                        rdd0Var.a(u5fVar, k00Var, k00Var2);
                        if (value4.a().compareTo(bigDecimal4) != 0) {
                            rdd0Var.a(new v5f(b()), k00Var, k00Var2);
                        }
                        do {
                            value = wwd0Var.getValue();
                        } while (!wwd0Var.g(value, cdj0.b));
                        String str = j4fVar2.a;
                        long jLongValue = bigDecimal6.longValue();
                        int i3 = j4fVar2.b;
                        bcj0Var2.a = j4fVar2;
                        bcj0Var2.b = bigDecimal6;
                        bcj0Var2.c = bigDecimal7;
                        bcj0Var2.f = 1;
                        Object objB = this.a.b(str, jLongValue, i3, bcj0Var2);
                        if (objB == y5bVar) {
                            return y5bVar;
                        }
                        j4fVar = j4fVar2;
                        bigDecimal = bigDecimal6;
                        obj = objB;
                        bigDecimal2 = bigDecimal7;
                    }
                }
            }
            return null;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bigDecimal2 = bcj0Var2.c;
        bigDecimal = bcj0Var2.b;
        j4fVar = bcj0Var2.a;
        uj50.b(obj);
        w0f w0fVar = (w0f) obj;
        if (w0fVar instanceof w0f.g) {
            do {
                value3 = wwd0Var.getValue();
            } while (!wwd0Var.g(value3, cdj0.d));
            return new dej0(((w0f.g) w0fVar).a, s5y.a(bigDecimal), s5y.a(bigDecimal2), j4fVar.i);
        }
        if (!(w0fVar instanceof w0f.b)) {
            uhc.a();
            return null;
        }
        do {
            value2 = wwd0Var.getValue();
        } while (!wwd0Var.g(value2, cdj0.c));
        return null;
    }
}
