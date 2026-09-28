package defpackage;

import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class ygk {
    public final phj0 a;

    public ygk(phj0 phj0Var) {
        this.a = phj0Var;
    }

    public final v340 a(final lyh lyhVar, v340 v340Var, mjj0.g gVar, final et7 et7Var) {
        lyhVar.getClass();
        v340Var.getClass();
        gVar.getClass();
        et7Var.getClass();
        return e1i.e(r1i.a((uwd0) hwr.b(new Function0() { // from class: ugk
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                WithdrawAlertHintStatus.Gone gone = WithdrawAlertHintStatus.Gone.a;
                return e1i.e(nb4.b(lyhVar, gone, new xgk(this, null)), et7Var, q490.a.b, gone);
            }
        }).getValue(), new vgk(v340Var), gVar, new wgk(4, null)), et7Var, q490.a.b, new mij0(0));
    }
}
