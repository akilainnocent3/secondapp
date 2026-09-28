package defpackage;

import androidx.compose.ui.layout.y;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ifb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ifb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PreviousMultiplierResponse previousMultiplierResponse;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj2;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = fgb.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    gvi gviVar = fgbVar.z;
                    if (gviVar != null) {
                        gviVar.Y.N();
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (previousMultiplierResponse = (PreviousMultiplierResponse) hTTPResponse.getData()) != null) {
                        fgbVar.E2(previousMultiplierResponse);
                    }
                    loa0 loa0VarK1 = fgbVar.k1();
                    usm usmVar = loa0VarK1.b;
                    brb brbVar = brb.d;
                    usm.i(usmVar, brbVar, tzm.a(loa0VarK1.c, brbVar, null, 6));
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    gvi gviVar2 = fgbVar.z;
                    if (gviVar2 != null) {
                        gviVar2.Y.N();
                    }
                }
                return Unit.a;
            case 1:
                y.a aVar = (y.a) obj;
                aVar.getClass();
                y.a.A(aVar, (y) obj2, 0, 0);
                return Unit.a;
            default:
                d030 d030Var = (d030) obj2;
                WithdrawalPinStatusInfo withdrawalPinStatusInfo = (WithdrawalPinStatusInfo) obj;
                ohp<Object>[] ohpVarArr = d030.S;
                if (withdrawalPinStatusInfo == null) {
                    return Unit.a;
                }
                d030Var.O = withdrawalPinStatusInfo.getUsage();
                return Unit.a;
        }
    }
}
