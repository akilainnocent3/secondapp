package defpackage;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class ut5 {
    public final d100 a;

    public ut5(d100 d100Var) {
        d100Var.getClass();
        this.a = d100Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(final BigDecimal bigDecimal, final Integer num, x1b x1bVar) {
        tt5 tt5Var;
        if (x1bVar instanceof tt5) {
            tt5Var = (tt5) x1bVar;
            int i = tt5Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tt5Var.e = i - Integer.MIN_VALUE;
            } else {
                tt5Var = new tt5(this, x1bVar);
            }
        } else {
            tt5Var = new tt5(this, x1bVar);
        }
        Object objP = tt5Var.c;
        y5b y5bVar = y5b.a;
        int i2 = tt5Var.e;
        if (i2 == 0) {
            uj50.b(objP);
            wl50 wl50VarF = this.a.f();
            tt5Var.a = bigDecimal;
            tt5Var.b = num;
            tt5Var.e = 1;
            objP = bm50.p(wl50VarF, tt5Var);
            if (objP == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            num = tt5Var.b;
            bigDecimal = tt5Var.a;
            uj50.b(objP);
        }
        return bm50.l((lk50) objP, new Function1() { // from class: st5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int iIntValue;
                nsj0 nsj0Var = (nsj0) obj;
                nsj0Var.getClass();
                Integer num2 = num;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    c100 c100Var = c100.e;
                    iIntValue = 0;
                }
                int i3 = iIntValue;
                long jLongValue = p54.c(bigDecimal).longValue();
                BigDecimal bigDecimal2 = nsj0Var.d;
                long jLongValue2 = bigDecimal2 != null ? bigDecimal2.longValue() : 0L;
                BigDecimal bigDecimal3 = nsj0Var.b;
                long jLongValue3 = bigDecimal3 != null ? bigDecimal3.longValue() : 0L;
                List list = nsj0Var.a;
                if (list == null) {
                    list = m2g.a;
                }
                return p54.b(new BigDecimal(flc.c(i3, jLongValue, jLongValue2, jLongValue3, list)));
            }
        });
    }
}
