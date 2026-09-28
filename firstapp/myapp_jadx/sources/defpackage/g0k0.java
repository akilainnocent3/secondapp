package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g0k0 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        t0k0 t0k0Var = (t0k0) this.receiver;
        t0k0Var.J1();
        int iOrdinal = t0k0Var.F.ordinal();
        if (iOrdinal == 2) {
            t0k0Var.F1();
        } else if (iOrdinal != 4) {
            t0k0Var.D1(false);
        } else {
            t0k0Var.E1();
        }
        return Unit.a;
    }
}
