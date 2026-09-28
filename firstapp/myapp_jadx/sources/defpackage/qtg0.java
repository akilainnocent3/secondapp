package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qtg0 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u480 u480Var = (u480) obj;
        long j = u480Var.f;
        ((r6a0) vtg0.b.getValue()).d(u480Var, vtg0.a, u480Var.g);
        long j2 = u480Var.f;
        if (j != j2) {
            u480.a aVar = u480Var.n;
            if (aVar != null) {
                if (aVar.a > j2) {
                    u480Var.o0();
                } else {
                    aVar.g = j2;
                    if (aVar.b == null) {
                        aVar.h = ycv.c((1.0d - ((double) aVar.e.a(0))) * u480Var.f);
                    }
                }
            } else if (j2 != 0) {
                u480Var.t0();
            }
        }
        return Unit.a;
    }
}
