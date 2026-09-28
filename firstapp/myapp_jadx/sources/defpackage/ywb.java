package defpackage;

import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.sportyherov2.remote.models.CashoutRequest;
import com.sportygames.sportyherov2.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ywb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ywb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CashoutRequest cashoutRequest;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                return Unit.a;
            default:
                q1c0 q1c0Var = (q1c0) obj;
                w3c0 w3c0Var = (w3c0) q1c0Var.b;
                int i2 = 1;
                if (w3c0Var != null) {
                    long betId = w3c0Var.d.getBetId();
                    w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                    if (w3c0Var2 != null) {
                        long roundId = w3c0Var2.d.getRoundId();
                        MultiplierResponse multiplierResponse = q1c0Var.h0;
                        if (multiplierResponse == null) {
                            Intrinsics.n("multiplierResponse");
                            throw null;
                        }
                        String currentMultiplier = multiplierResponse.getCurrentMultiplier();
                        Boolean bool = Boolean.FALSE;
                        String strValueOf = String.valueOf(System.currentTimeMillis());
                        boolean z = q1c0Var.T1;
                        MultiplierResponse multiplierResponse2 = q1c0Var.h0;
                        if (multiplierResponse2 == null) {
                            Intrinsics.n("multiplierResponse");
                            throw null;
                        }
                        Double dH = b.h(multiplierResponse2.getCurrentMultiplier());
                        cashoutRequest = new CashoutRequest(betId, roundId, currentMultiplier, bool, strValueOf, z, q1c0Var.e1(1, dH != null ? dH.doubleValue() : 0.0d));
                    } else {
                        cashoutRequest = null;
                    }
                } else {
                    cashoutRequest = null;
                }
                if (cashoutRequest != null) {
                    String strJ = new eal().j(cashoutRequest);
                    foa0 foa0Var = (foa0) q1c0Var.a;
                    if (foa0Var != null) {
                        w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                        Long lValueOf = w3c0Var3 != null ? Long.valueOf(w3c0Var3.d.getRoundId()) : null;
                        w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                        foa0Var.K1(strJ, "CLASSIC", lValueOf, w3c0Var4 != null ? Long.valueOf(w3c0Var4.d.getBetId()) : null, new o0c(i2, q1c0Var, strJ));
                    }
                    GameDetails gameDetails = q1c0Var.W1;
                    wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "1", "No");
                    q1c0Var.L1("1", null, "CLASSIC", true);
                }
                return Unit.a;
        }
    }
}
