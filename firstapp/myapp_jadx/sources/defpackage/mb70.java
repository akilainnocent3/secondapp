package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class mb70 {
    public final mg70 a;
    public final mgb0 b;
    public final wwd0 c = xwd0.a(nb70.c);
    public final wwd0 d = xwd0.a(null);

    public mb70(mg70 mg70Var, mgb0 mgb0Var) {
        this.a = mg70Var;
        this.b = mgb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, x1b x1bVar) {
        fb70 fb70Var;
        Object objI;
        if (x1bVar instanceof fb70) {
            fb70Var = (fb70) x1bVar;
            int i = fb70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fb70Var.c = i - Integer.MIN_VALUE;
            } else {
                fb70Var = new fb70(this, x1bVar);
            }
        } else {
            fb70Var = new fb70(this, x1bVar);
        }
        Object obj = fb70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = fb70Var.c;
        if (i2 == 0) {
            uj50.b(obj);
            fb70Var.c = 1;
            objI = this.a.i(str, fb70Var);
            if (objI == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objI = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        nb70 nb70Var = (nb70) (objI instanceof zi50.b ? null : objI);
        if (nb70Var != null) {
            b(nb70Var);
        }
        return Unit.a;
    }

    public final void b(nb70 nb70Var) {
        wwd0 wwd0Var;
        Object value;
        nb70 nb70Var2;
        do {
            wwd0Var = this.c;
            value = wwd0Var.getValue();
            nb70Var2 = (nb70) value;
            nb70 nb70Var3 = nb70Var.b > nb70Var2.b ? nb70Var : null;
            if (nb70Var3 != null) {
                nb70Var2 = nb70Var3;
            }
        } while (!wwd0Var.g(value, nb70Var2));
    }
}
