package defpackage;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a7n implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a7n(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                c7n c7nVar = (c7n) obj;
                Bundle bundleA = x6.a("key - result submit", true);
                Unit unit = Unit.a;
                c7nVar.getParentFragmentManager().m0("IdReVerificationDialogFragment - request", bundleA);
                c7nVar.dismissAllowingStateLoss();
                break;
            default:
                fd90 fd90Var = (fd90) obj;
                fd90Var.m();
                boolean zN = fd90Var.n();
                qub0 qub0Var = fd90Var.a;
                if (zN) {
                    qub0Var.E0();
                } else {
                    qub0Var.J0();
                }
                break;
        }
        return Unit.a;
    }
}
