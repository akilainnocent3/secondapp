package defpackage;

import com.sportygames.crash.models.bet.BetContainerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class se2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ se2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                if (((Boolean) ((ytw) obj2).getValue()).booleanValue()) {
                    lzaVar.b2();
                }
                break;
            default:
                fgb fgbVar = (fgb) obj2;
                double dDoubleValue = ((Double) obj).doubleValue();
                ((u5a0) fgbVar.R0().M).k(0);
                fgbVar.i2 = (int) dDoubleValue;
                fgbVar.S0().S1(true);
                fgbVar.R0().G1(true);
                if (!((BetContainerState) fgbVar.R0().a.getValue()).getBetPlaced()) {
                    fgbVar.p0(fgbVar.R0(), ((BetContainerState) fgbVar.R0().a.getValue()).getBetData(), null);
                }
                fgbVar.S0().S1(true);
                fgbVar.S0().P1(0);
                ytw<Boolean> ytwVar = fgbVar.j1;
                Boolean bool = Boolean.FALSE;
                ((x5a0) ytwVar).setValue(bool);
                ((x5a0) fgbVar.E1).setValue(bool);
                break;
        }
        return Unit.a;
    }
}
