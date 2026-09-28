package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;

/* JADX INFO: loaded from: classes6.dex */
public final class lyd {
    public final sr10 a;

    public lyd(sr10 sr10Var) {
        sr10Var.getClass();
        this.a = sr10Var;
    }

    public static /* synthetic */ Object b(lyd lydVar, int i, String str, Integer num, x1b x1bVar, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            num = null;
        }
        return lydVar.a(i, str, num, x1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(int i, String str, Integer num, x1b x1bVar) {
        kyd kydVar;
        Object bVar;
        if (x1bVar instanceof kyd) {
            kydVar = (kyd) x1bVar;
            int i2 = kydVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kydVar.c = i2 - Integer.MIN_VALUE;
            } else {
                kydVar = new kyd(this, x1bVar);
            }
        } else {
            kydVar = new kyd(this, x1bVar);
        }
        Object objX = kydVar.a;
        y5b y5bVar = y5b.a;
        int i3 = kydVar.c;
        try {
            if (i3 == 0) {
                uj50.b(objX);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = this.a;
                kydVar.c = 1;
                objX = sr10Var.x(i, str, num, kydVar);
                if (objX == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objX);
            }
            bVar = (kod) objX;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            return DepositDropAlertStatus.Unavailable.a;
        }
        kod kodVar = (kod) bVar;
        boolean z = kodVar.d;
        UiText uiText = kodVar.e;
        if (z) {
            return new DepositDropAlertStatus.MaintenanceAlert(uiText, kodVar.f);
        }
        if (kodVar.b) {
            return new DepositDropAlertStatus.DropAlert(uiText);
        }
        return kodVar.c ? new DepositDropAlertStatus.CustomHint(uiText) : DepositDropAlertStatus.Gone.a;
    }
}
