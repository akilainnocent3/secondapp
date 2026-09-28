package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.feature.payment.impl.withdraw.domain.model.WithdrawAlertHintStatus;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class phj0 {
    public final sr10 a;
    public final psm b;

    public phj0(psm psmVar, sr10 sr10Var) {
        sr10Var.getClass();
        psmVar.getClass();
        this.a = sr10Var;
        this.b = psmVar;
    }

    public static /* synthetic */ Object b(phj0 phj0Var, int i, int i2, Function1 function1, String str, String str2, iw1 iw1Var, x1b x1bVar, int i3) {
        if ((i3 & 16) != 0) {
            str2 = null;
        }
        if ((i3 & 32) != 0) {
            iw1Var = null;
        }
        return phj0Var.a(i, i2, function1, str, str2, iw1Var, x1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(int i, int i2, Function1 function1, String str, String str2, iw1 iw1Var, x1b x1bVar) {
        ohj0 ohj0Var;
        Object bVar;
        if (x1bVar instanceof ohj0) {
            ohj0Var = (ohj0) x1bVar;
            int i3 = ohj0Var.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ohj0Var.e = i3 - Integer.MIN_VALUE;
            } else {
                ohj0Var = new ohj0(this, x1bVar);
            }
        } else {
            ohj0Var = new ohj0(this, x1bVar);
        }
        ohj0 ohj0Var2 = ohj0Var;
        Object objQ = ohj0Var2.c;
        y5b y5bVar = y5b.a;
        int i4 = ohj0Var2.e;
        try {
            if (i4 == 0) {
                uj50.b(objQ);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = this.a;
                ohj0Var2.a = function1;
                ohj0Var2.b = str;
                ohj0Var2.e = 1;
                objQ = sr10Var.q(i, i2, str2, iw1Var, ohj0Var2);
                if (objQ == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i4 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ohj0Var2.b;
                function1 = ohj0Var2.a;
                uj50.b(objQ);
            }
            bVar = (qhj0) objQ;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Object obj = qhj0.d;
        if (bVar instanceof zi50.b) {
            bVar = obj;
        }
        qhj0 qhj0Var = (qhj0) bVar;
        boolean z = qhj0Var.a;
        boolean z2 = qhj0Var.b;
        if (z && z2) {
            return WithdrawAlertHintStatus.Gone.a;
        }
        if (z) {
            return (WithdrawAlertHintStatus) function1.invoke(qhj0Var);
        }
        return z2 ? new WithdrawAlertHintStatus.CustomHint(qhj0Var.c, str) : WithdrawAlertHintStatus.Gone.a;
    }

    public final Object c(at atVar, x1b x1bVar) {
        int i;
        int i2 = 1;
        if (!(atVar instanceof at.a)) {
            if (!(atVar instanceof at.c)) {
                if (atVar instanceof at.b) {
                    return b(this, 4, ((at.b) atVar).a, new mw60(i2), null, null, null, x1bVar, 48);
                }
                uhc.a();
                return null;
            }
            at.c cVar = (at.c) atVar;
            final String str = cVar.a;
            Integer num = cVar.b;
            String str2 = cVar.c;
            return (str == null || num == null || str2 == null) ? WithdrawAlertHintStatus.Gone.a : b(this, 4, num.intValue(), new Function1() { // from class: nhj0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    qhj0 qhj0Var = (qhj0) obj;
                    qhj0Var.getClass();
                    return new WithdrawAlertHintStatus.DropAlert.Momo(qhj0Var.c, str);
                }
            }, str, str2, null, x1bVar, 32);
        }
        at.a aVar = (at.a) atVar;
        final String str3 = aVar.a;
        iw1 iw1Var = aVar.b;
        if (str3 == null || iw1Var == null) {
            return WithdrawAlertHintStatus.Gone.a;
        }
        CountryCodeName countryCode = this.b.getCountryCode();
        countryCode.getClass();
        int i3 = y300.a.C1320a.a[countryCode.ordinal()];
        if (i3 == 1) {
            c100 c100Var = c100.e;
            i = 140;
        } else if (i3 == 2) {
            c100 c100Var2 = c100.e;
            i = 21;
        } else {
            if (i3 != 3) {
                throw new Exception(l4j0.a("`payChId` undefine for ", countryCode, " in PayMethodWithdraw.Bank"));
            }
            c100 c100Var3 = c100.e;
            i = 26003;
        }
        return b(this, 2, i, new Function1() { // from class: mhj0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                qhj0 qhj0Var = (qhj0) obj;
                qhj0Var.getClass();
                return new WithdrawAlertHintStatus.DropAlert.Bank(qhj0Var.c, str3);
            }
        }, str3, null, iw1Var, x1bVar, 16);
    }
}
