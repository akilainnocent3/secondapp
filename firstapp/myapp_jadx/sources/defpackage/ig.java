package defpackage;

import com.sporty.android.platform.features.account.addemailprompt.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ig implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ig(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(a.C0205a.a);
                break;
            default:
                m410 m410Var = (m410) obj;
                int i2 = m410Var.R0;
                if (i2 == m410Var.S0) {
                    ixi ixiVar = (ixi) m410Var.b;
                    if (ixiVar != null) {
                        ixiVar.b.setBetDone();
                    }
                } else if (i2 == m410Var.T0) {
                    ixi ixiVar2 = (ixi) m410Var.b;
                    if (ixiVar2 != null) {
                        ixiVar2.c.setBetDone();
                    }
                } else if (i2 == m410Var.U0) {
                    boolean z = m410Var.d0;
                    B b = m410Var.b;
                    if (z) {
                        ixi ixiVar3 = (ixi) b;
                        if (ixiVar3 != null) {
                            ixiVar3.b.setDone();
                        }
                    } else {
                        ixi ixiVar4 = (ixi) b;
                        if (ixiVar4 != null) {
                            ixiVar4.c.setDone();
                        }
                    }
                } else if (i2 == m410Var.V0) {
                    boolean z2 = m410Var.d0;
                    B b2 = m410Var.b;
                    if (z2) {
                        ixi ixiVar5 = (ixi) b2;
                        if (ixiVar5 != null) {
                            ixiVar5.b.setDone();
                        }
                    } else {
                        ixi ixiVar6 = (ixi) b2;
                        if (ixiVar6 != null) {
                            ixiVar6.c.setDone();
                        }
                    }
                }
                ixi ixiVar7 = (ixi) m410Var.b;
                if (ixiVar7 != null) {
                    ixiVar7.b.setBetDone();
                }
                ixi ixiVar8 = (ixi) m410Var.b;
                if (ixiVar8 != null) {
                    ixiVar8.c.setBetDone();
                }
                ixi ixiVar9 = (ixi) m410Var.b;
                if (ixiVar9 != null) {
                    ixiVar9.b.f();
                }
                ixi ixiVar10 = (ixi) m410Var.b;
                if (ixiVar10 != null) {
                    ixiVar10.c.f();
                }
                ixi ixiVar11 = (ixi) m410Var.b;
                if (ixiVar11 != null) {
                    ixiVar11.M.setVisibility(8);
                }
                m410Var.q1(false);
                break;
        }
        return Unit.a;
    }
}
