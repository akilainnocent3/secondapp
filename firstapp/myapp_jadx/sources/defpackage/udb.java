package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportygames.crash.models.bet.BetContainerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class udb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ udb(Object obj, int i) {
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
                fgb fgbVar = (fgb) obj2;
                fgbVar.j2 = (int) ((Double) obj).doubleValue();
                ((u5a0) fgbVar.S0().M).k(0);
                fgbVar.R0().S1(true);
                fgbVar.S0().G1(true);
                if (!((BetContainerState) fgbVar.S0().a.getValue()).getBetPlaced()) {
                    fgbVar.p0(fgbVar.S0(), ((BetContainerState) fgbVar.S0().a.getValue()).getBetData(), null);
                }
                fgbVar.S0().S1(true);
                fgbVar.S0().P1(1);
                ytw<Boolean> ytwVar = fgbVar.j1;
                Boolean bool = Boolean.FALSE;
                ((x5a0) ytwVar).setValue(bool);
                ((x5a0) fgbVar.F1).setValue(bool);
                break;
            default:
                czf czfVar = (czf) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                czfVar.b = OtpData.EmailChange.a((OtpData.EmailChange) czfVar.B1(), oTPResult);
                break;
        }
        return Unit.a;
    }
}
