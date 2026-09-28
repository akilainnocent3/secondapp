package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;

/* JADX INFO: loaded from: classes5.dex */
public final class dhj0 extends yy1<WithdrawAlertHintStatus> {
    public final phj0 e;
    public final psm f;
    public final wwd0 g;

    public static final class a {
        public final phj0 a;
        public final psm b;

        public a(phj0 phj0Var, psm psmVar) {
            psmVar.getClass();
            this.a = phj0Var;
            this.b = psmVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhj0(phj0 phj0Var, psm psmVar, w9e w9eVar) {
        super(psmVar, w9eVar);
        psmVar.getClass();
        w9eVar.getClass();
        this.e = phj0Var;
        this.f = psmVar;
        this.g = xwd0.a(WithdrawAlertHintStatus.Gone.a);
    }

    @Override // defpackage.yy1
    public final UiText a(WithdrawAlertHintStatus withdrawAlertHintStatus, UiText uiText) {
        WithdrawAlertHintStatus withdrawAlertHintStatus2 = withdrawAlertHintStatus;
        withdrawAlertHintStatus2.getClass();
        if (uiText != null) {
            return uiText;
        }
        if (withdrawAlertHintStatus2.isVisible()) {
            return khj0.a(withdrawAlertHintStatus2, false);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.yy1
    public final Object b(Integer num, x1b x1bVar) {
        ehj0 ehj0Var;
        if (x1bVar instanceof ehj0) {
            ehj0Var = (ehj0) x1bVar;
            int i = ehj0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ehj0Var.c = i - Integer.MIN_VALUE;
            } else {
                ehj0Var = new ehj0(this, x1bVar);
            }
        } else {
            ehj0Var = new ehj0(this, x1bVar);
        }
        Object objC = ehj0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = ehj0Var.c;
        if (i2 == 0) {
            uj50.b(objC);
            if (num != null) {
                at.b bVar = new at.b(num.intValue());
                ehj0Var.c = 1;
                objC = this.e.c(bVar, ehj0Var);
                if (objC == y5bVar) {
                    return y5bVar;
                }
            }
            return WithdrawAlertHintStatus.Gone.a;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objC);
        WithdrawAlertHintStatus withdrawAlertHintStatus = (WithdrawAlertHintStatus) objC;
        if (withdrawAlertHintStatus != null) {
            return withdrawAlertHintStatus;
        }
        return WithdrawAlertHintStatus.Gone.a;
    }

    @Override // defpackage.yy1
    public final wwd0 c() {
        return this.g;
    }
}
