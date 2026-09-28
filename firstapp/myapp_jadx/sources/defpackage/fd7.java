package defpackage;

import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportygames.crash.models.bet.BetContainerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fd7 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fd7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ux4 ux4Var = (ux4) obj;
                ux4Var.getClass();
                ((td7) obj2).m0().H.m(ux4Var);
                return Unit.a;
            case 1:
                fgb fgbVar = (fgb) obj2;
                String str = (String) obj;
                str.getClass();
                if (!str.equals(".")) {
                    boolean zEquals = str.equals(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                    int i2 = fgbVar.p1;
                    if (zEquals) {
                        if (i2 == 1) {
                            fgbVar.R0().Q1(11);
                            fgbVar.R0().M1(!((BetContainerState) fgbVar.R0().a.getValue()).getExtraKey());
                        } else if (fgbVar.R0().z1()) {
                            fgbVar.Z0().f(11);
                            fgbVar.Z0().e(!((Boolean) ((x5a0) fgbVar.Z0().c).getValue()).booleanValue());
                        } else {
                            fgbVar.S0().Q1(11);
                            fgbVar.S0().M1(!((BetContainerState) fgbVar.S0().a.getValue()).getExtraKey());
                        }
                    } else if (i2 == 1) {
                        fgbVar.R0().Q1(Integer.parseInt(str));
                        fgbVar.R0().M1(!((BetContainerState) fgbVar.R0().a.getValue()).getExtraKey());
                    } else if (fgbVar.R0().z1()) {
                        fgbVar.Z0().f(Integer.parseInt(str));
                        fgbVar.Z0().e(!((Boolean) ((x5a0) fgbVar.Z0().c).getValue()).booleanValue());
                    } else {
                        fgbVar.S0().Q1(Integer.parseInt(str));
                        fgbVar.S0().M1(!((BetContainerState) fgbVar.S0().a.getValue()).getExtraKey());
                    }
                } else if (fgbVar.p1 == 1) {
                    fgbVar.R0().Q1(10);
                    fgbVar.R0().M1(!((BetContainerState) fgbVar.R0().a.getValue()).getExtraKey());
                } else if (fgbVar.R0().z1()) {
                    fgbVar.Z0().f(10);
                    fgbVar.Z0().e(!((Boolean) ((x5a0) fgbVar.Z0().c).getValue()).booleanValue());
                } else {
                    fgbVar.S0().Q1(10);
                    fgbVar.S0().M1(!((BetContainerState) fgbVar.S0().a.getValue()).getExtraKey());
                }
                return Unit.a;
            default:
                xqj0 xqj0Var = (xqj0) obj2;
                AlertDialogCallbackType alertDialogCallbackType = (AlertDialogCallbackType) obj;
                alertDialogCallbackType.getClass();
                if (alertDialogCallbackType instanceof AlertDialogCallbackType.Positive) {
                    vtw<m480> vtwVar = xqj0Var.n;
                    if (vtwVar == null) {
                        Intrinsics.n("securityUiEventFlow");
                        throw null;
                    }
                    vtwVar.a(m480.j.a);
                }
                return Unit.a;
        }
    }
}
