package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eqr extends saj implements Function1<Long, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) {
        wwd0 wwd0Var;
        lqr lqrVar;
        Long l2 = l;
        lqr lqrVar2 = (lqr) this.receiver;
        wwd0 wwd0Var2 = lqrVar2.a;
        while (true) {
            Object value = wwd0Var2.getValue();
            wwd0Var = wwd0Var2;
            lqrVar = lqrVar2;
            if (wwd0Var.g(value, jqr.a((jqr) value, null, null, null, null, null, null, null, null, null, null, null, 0, l2, null, null, false, false, false, false, false, false, false, false, 16769023))) {
                break;
            }
            wwd0Var2 = wwd0Var;
            lqrVar2 = lqrVar;
        }
        ijf0 ijf0Var = ((jqr) wwd0Var.getValue()).o;
        if (ijf0Var.a.b.length() <= 0) {
            ijf0Var = null;
        }
        if (ijf0Var != null) {
            lqrVar.H1(ijf0Var);
        }
        return Unit.a;
    }
}
