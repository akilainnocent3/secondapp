package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h7d0 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        c8d0 c8d0Var = (c8d0) this.receiver;
        wwd0 wwd0Var = c8d0Var.w;
        e0b e0bVar = ((w7d0) wwd0Var.getValue()).c;
        e0b.c cVar = e0bVar instanceof e0b.c ? (e0b.c) e0bVar : null;
        if (cVar != null && cVar.b && !cVar.c) {
            wwd0Var.k(null, w7d0.a((w7d0) wwd0Var.getValue(), null, null, e0b.c.a(cVar, null, false, true, false, null, 19), 3));
            jvd0 jvd0Var = c8d0Var.C;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            c8d0Var.C = ej5.c(o8i0.d(c8d0Var), null, null, new b8d0(c8d0Var, null), 3);
        }
        return Unit.a;
    }
}
