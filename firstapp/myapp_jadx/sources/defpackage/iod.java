package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;

/* JADX INFO: loaded from: classes5.dex */
public final class iod extends yy1<DepositDropAlertStatus> {
    public final lyd e;
    public final psm f;
    public final wwd0 g;

    public static final class a {
        public final lyd a;
        public final psm b;

        public a(lyd lydVar, psm psmVar) {
            psmVar.getClass();
            this.a = lydVar;
            this.b = psmVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iod(lyd lydVar, psm psmVar, w9e w9eVar) {
        super(psmVar, w9eVar);
        psmVar.getClass();
        w9eVar.getClass();
        this.e = lydVar;
        this.f = psmVar;
        this.g = xwd0.a(DepositDropAlertStatus.Unavailable.a);
    }

    @Override // defpackage.yy1
    public final UiText a(DepositDropAlertStatus depositDropAlertStatus, UiText uiText) {
        DepositDropAlertStatus depositDropAlertStatus2 = depositDropAlertStatus;
        depositDropAlertStatus2.getClass();
        return n200.a(uiText, depositDropAlertStatus2, false, false).a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.yy1
    public final Object b(Integer num, x1b x1bVar) {
        jod jodVar;
        if (x1bVar instanceof jod) {
            jodVar = (jod) x1bVar;
            int i = jodVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jodVar.c = i - Integer.MIN_VALUE;
            } else {
                jodVar = new jod(this, x1bVar);
            }
        } else {
            jodVar = new jod(this, x1bVar);
        }
        jod jodVar2 = jodVar;
        Object objB = jodVar2.a;
        y5b y5bVar = y5b.a;
        int i2 = jodVar2.c;
        if (i2 == 0) {
            uj50.b(objB);
            if (num != null) {
                int iIntValue = num.intValue();
                jodVar2.c = 1;
                objB = lyd.b(this.e, iIntValue, null, null, jodVar2, 6);
                if (objB == y5bVar) {
                    return y5bVar;
                }
            }
            return DepositDropAlertStatus.Unavailable.a;
        }
        if (i2 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objB);
        DepositDropAlertStatus depositDropAlertStatus = (DepositDropAlertStatus) objB;
        if (depositDropAlertStatus != null) {
            return depositDropAlertStatus;
        }
        return DepositDropAlertStatus.Unavailable.a;
    }

    @Override // defpackage.yy1
    public final wwd0 c() {
        return this.g;
    }
}
