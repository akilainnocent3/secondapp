package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c9x {
    public static final Object a(wwd0 wwd0Var, tje0 tje0Var) {
        b9x b9xVar = (b9x) wwd0Var.getValue();
        if ((b9xVar instanceof b9x.c) || Intrinsics.g(b9xVar, b9x.a.a)) {
            wwd0Var.setValue(b9x.b.a);
            Unit unit = Unit.a;
            y5b y5bVar = y5b.a;
            return unit;
        }
        if (!(b9xVar instanceof b9x.e)) {
            return Unit.a;
        }
        wwd0Var.setValue(b9x.h.a);
        Unit unit2 = Unit.a;
        y5b y5bVar2 = y5b.a;
        return unit2;
    }

    public static final Object b(wwd0 wwd0Var, pjd pjdVar, gux.c.a aVar) {
        b9x b9xVar = (b9x) wwd0Var.getValue();
        if (!Intrinsics.g(b9xVar, b9x.b.a) && !(b9xVar instanceof b9x.d)) {
            return Unit.a;
        }
        wwd0Var.setValue(new b9x.g(pjdVar));
        Unit unit = Unit.a;
        y5b y5bVar = y5b.a;
        return unit;
    }

    public static final Object c(ztw ztwVar, x1b x1bVar) {
        Object objEmit = ztwVar.emit(b9x.c.a, x1bVar);
        return objEmit == y5b.a ? objEmit : Unit.a;
    }
}
