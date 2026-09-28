package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class wzj0 extends saj implements Function1<Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        t0k0 t0k0Var = (t0k0) this.receiver;
        v6k0 v6k0Var = t0k0Var.z;
        l0k0 l0k0Var = t0k0Var.F;
        if (zBooleanValue) {
            brg brgVar = l0k0Var.a;
            v6k0Var.getClass();
            if (!v6k0Var.c) {
                v6k0Var.a.a(new vbg0(brgVar), k00.d);
                v6k0Var.c = true;
            }
        } else {
            brg brgVar2 = l0k0Var.a;
            v6k0Var.getClass();
            if (!v6k0Var.d) {
                v6k0Var.a.a(new ubg0(brgVar2), k00.d);
                v6k0Var.d = true;
            }
        }
        return Unit.a;
    }
}
