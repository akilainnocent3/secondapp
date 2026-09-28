package defpackage;

import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.bet.BetContainerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sdb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fgb b;

    public /* synthetic */ sdb(fgb fgbVar, int i) {
        this.a = i;
        this.b = fgbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        fgb fgbVar = this.b;
        switch (i) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    gvi gviVar = fgbVar.z;
                    if (gviVar != null) {
                        gviVar.g0.setVisibility(8);
                    }
                    gvi gviVar2 = fgbVar.z;
                    if (gviVar2 != null) {
                        gviVar2.V.setVisibility(8);
                    }
                    ((dug0) fgbVar.H1.getValue()).a.m(Boolean.FALSE);
                }
                break;
            default:
                ylb0 ylb0Var = (ylb0) fgbVar;
                BetData betData = (BetData) obj;
                betData.getClass();
                if (ylb0Var.j0) {
                    ((BetContainerState) ylb0Var.R0().a.getValue()).setBetData(betData);
                    goj.A1(ylb0Var.c1(), betData, ylb0Var.z0, ylb0Var.U0, ylb0Var.h2, 0, "MANUAL", new vlb0(), new xeb(ylb0Var, 1), null, null, null, 1792);
                } else {
                    ylb0Var.p0(ylb0Var.R0(), betData, null);
                }
                ylb0Var.S0().S1(true);
                ((x5a0) ylb0Var.j1).setValue(Boolean.FALSE);
                break;
        }
        return Unit.a;
    }
}
