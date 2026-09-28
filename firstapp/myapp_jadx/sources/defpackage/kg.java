package defpackage;

import com.sporty.android.platform.features.account.addemailprompt.a;
import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(a.e.a);
                break;
            case 1:
                ((Function1) obj).invoke(b.x.a);
                break;
            default:
                m410 m410Var = (m410) obj;
                int i2 = m410Var.R0;
                if (i2 == m410Var.S0) {
                    ixi ixiVar = (ixi) m410Var.b;
                    if (ixiVar != null) {
                        ixiVar.b.setBetClear();
                    }
                } else if (i2 == m410Var.T0) {
                    ixi ixiVar2 = (ixi) m410Var.b;
                    if (ixiVar2 != null) {
                        ixiVar2.c.setBetClear();
                    }
                } else if (i2 == m410Var.U0) {
                    boolean z = m410Var.d0;
                    B b = m410Var.b;
                    if (z) {
                        ixi ixiVar3 = (ixi) b;
                        if (ixiVar3 != null) {
                            ixiVar3.b.setClear();
                        }
                    } else {
                        ixi ixiVar4 = (ixi) b;
                        if (ixiVar4 != null) {
                            ixiVar4.c.setClear();
                        }
                    }
                } else if (i2 == m410Var.V0) {
                    boolean z2 = m410Var.d0;
                    B b2 = m410Var.b;
                    if (z2) {
                        ixi ixiVar5 = (ixi) b2;
                        if (ixiVar5 != null) {
                            ixiVar5.b.setClear();
                        }
                    } else {
                        ixi ixiVar6 = (ixi) b2;
                        if (ixiVar6 != null) {
                            ixiVar6.c.setClear();
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
