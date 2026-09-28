package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t440 implements Function1 {
    public final /* synthetic */ o540 a;

    public /* synthetic */ t440(o540 o540Var) {
        this.a = o540Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        o540 o540Var = this.a;
        d740 d740VarQ0 = o540Var.q0();
        ej5.c(o8i0.d(d740VarQ0), null, null, new m740(null, d740VarQ0), 3);
        d740 d740VarQ1 = o540Var.q0();
        ej5.c(o8i0.d(d740VarQ1), null, null, new k740(d740VarQ1, str, new q440(o540Var, 0), null), 3);
        return Unit.a;
    }
}
