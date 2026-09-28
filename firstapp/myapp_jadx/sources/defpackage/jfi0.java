package defpackage;

import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljfi0;", "Lj8i0;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jfi0 extends j8i0 {
    public final ofi0 a;
    public final wwd0 b = xwd0.a(null);

    public jfi0(ofi0 ofi0Var) {
        this.a = ofi0Var;
        ej5.c(o8i0.d(this), null, null, new hfi0(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x1(x1b x1bVar) {
        ifi0 ifi0Var;
        Object objA;
        wwd0 wwd0Var;
        Object value;
        if (x1bVar instanceof ifi0) {
            ifi0Var = (ifi0) x1bVar;
            int i = ifi0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ifi0Var.c = i - Integer.MIN_VALUE;
            } else {
                ifi0Var = new ifi0(this, x1bVar);
            }
        } else {
            ifi0Var = new ifi0(this, x1bVar);
        }
        Object obj = ifi0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ifi0Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            ifi0Var.c = 1;
            objA = this.a.a(ifi0Var);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        lfi0 lfi0Var = (lfi0) (objA instanceof zi50.b ? null : objA);
        if (lfi0Var == null) {
            return Unit.a;
        }
        do {
            wwd0Var = this.b;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, new e530(lfi0Var.a, lfi0Var.b, lfi0Var.c, lfi0Var.d, lfi0Var.e)));
        return Unit.a;
    }
}
