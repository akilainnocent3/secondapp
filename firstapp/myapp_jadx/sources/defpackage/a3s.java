package defpackage;

import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.pingpong.remote.models.CashoutRequest;
import com.sportygames.pingpong.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a3s implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a3s(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
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
                final m410 m410Var = (m410) obj;
                ixi ixiVar = (ixi) m410Var.b;
                if (ixiVar != null) {
                    long betId = ixiVar.b.getBetId();
                    ixi ixiVar2 = (ixi) m410Var.b;
                    if (ixiVar2 != null) {
                        long roundId = ixiVar2.b.getRoundId();
                        MultiplierResponse multiplierResponse = m410Var.U;
                        if (multiplierResponse == null) {
                            Intrinsics.n("multiplierResponse");
                            throw null;
                        }
                        cashoutRequest = new CashoutRequest(betId, roundId, multiplierResponse.getMultiplier(), Boolean.FALSE, String.valueOf(System.currentTimeMillis()), m410Var.d1);
                    } else {
                        cashoutRequest = null;
                    }
                } else {
                    cashoutRequest = null;
                }
                if (cashoutRequest != null) {
                    final String strJ = new eal().j(cashoutRequest);
                    goa0 goa0Var = (goa0) m410Var.a;
                    if (goa0Var != null) {
                        ixi ixiVar3 = (ixi) m410Var.b;
                        Long lValueOf = ixiVar3 != null ? Long.valueOf(ixiVar3.b.getRoundId()) : null;
                        ixi ixiVar4 = (ixi) m410Var.b;
                        goa0.H1(goa0Var, strJ, lValueOf, ixiVar4 != null ? Long.valueOf(ixiVar4.b.getBetId()) : null, new Function0() { // from class: b110
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                m410 m410Var2 = m410Var;
                                cgb.a(m410Var2.P0(), m410Var2.F0, "cashout", strJ);
                                return Unit.a;
                            }
                        });
                    }
                    GameDetails gameDetails = m410Var.r1;
                    wz.a("Cashout", gameDetails != null ? gameDetails.getName() : null, "1", "No");
                    m410Var.b1("1", true);
                }
                return Unit.a;
        }
    }
}
