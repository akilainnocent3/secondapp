package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z3b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z3b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((n6s) obj).d();
            case 1:
                phx phxVar = (phx) obj;
                ygx ygxVarI = phxVar.b.i();
                if (Intrinsics.g(ygxVarI != null ? ygxVarI.b.f : null, "GAME")) {
                    phxVar.k();
                }
                return Unit.a;
            default:
                tt60 tt60Var = (tt60) obj;
                uwd0 uwd0Var = (uwd0) tt60Var.p.getValue();
                lyh<? extends xhj0> lyhVar = tt60Var.f;
                if (lyhVar == null) {
                    Intrinsics.n("withdrawAmountValidationFlow");
                    throw null;
                }
                n1i n1iVar = new n1i(uwd0Var, lyhVar, new tt60.g(3, null));
                et7 et7Var = tt60Var.k;
                if (et7Var != null) {
                    return e1i.e(n1iVar, et7Var, q490.a.b, Boolean.FALSE);
                }
                Intrinsics.n("scope");
                throw null;
        }
    }
}
