package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class un30 {
    public static final Object a(wwd0 wwd0Var, tje0 tje0Var) {
        tn30 tn30Var = (tn30) wwd0Var.getValue();
        if (!(tn30Var instanceof tn30.b) && !Intrinsics.g(tn30Var, tn30.c.a)) {
            return Unit.a;
        }
        wwd0Var.setValue(tn30.a.a);
        Unit unit = Unit.a;
        y5b y5bVar = y5b.a;
        return unit;
    }

    public static final Object b(ztw ztwVar, x1b x1bVar) {
        Object objEmit = ztwVar.emit(tn30.b.a, x1bVar);
        return objEmit == y5b.a ? objEmit : Unit.a;
    }
}
