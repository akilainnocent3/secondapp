package defpackage;

import com.sportygames.redblack.remote.models.PlaceBetRequest;
import com.sportygames.redblack.remote.models.RoundInitializeResponse;
import com.sportygames.redblack.remote.models.RoundRequest;
import com.sportygames.redblack.remote.models.enums.BetCardDecision;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kp00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kp00(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Function2) obj3).invoke((String) obj, ((bba0.a) ((bba0) obj2)).b);
                break;
            default:
                nn40 nn40Var = (nn40) obj3;
                BetCardDecision betCardDecision = (BetCardDecision) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                nn40Var.s0();
                nn40Var.N0(false);
                if (zBooleanValue) {
                    RoundInitializeResponse roundInitializeResponseD = nn40Var.C0().c.d();
                    Integer numValueOf = roundInitializeResponseD != null ? Integer.valueOf(roundInitializeResponseD.getTurnId() + 1) : null;
                    int i2 = nn40Var.b0;
                    if (numValueOf == null || numValueOf.intValue() != i2) {
                        if (yju.a("br")) {
                            ynh0 ynh0VarD0 = nn40Var.D0();
                            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                            Double d = nn40Var.C0().d.d();
                            RoundInitializeResponse roundInitializeResponseD2 = nn40Var.C0().c.d();
                            Long lValueOf = roundInitializeResponseD2 != null ? Long.valueOf(roundInitializeResponseD2.getRoundId()) : null;
                            g060.b bVarD = nn40Var.C0().e.d();
                            String giftId = bVarD != null ? bVarD.a.getGiftId() : null;
                            g060.b bVarD2 = nn40Var.C0().e.d();
                            ynh0VarD0.y1(new PlaceBetRequest(iIntValue, d, betCardDecision, lValueOf, giftId, bVarD2 != null ? Double.valueOf(bVarD2.b) : null, nn40Var.t0, null, 128, null), nn40Var.getActivity());
                        } else {
                            ynh0 ynh0VarD1 = nn40Var.D0();
                            int iIntValue2 = numValueOf != null ? numValueOf.intValue() : 0;
                            Double d2 = nn40Var.C0().d.d();
                            RoundInitializeResponse roundInitializeResponseD3 = nn40Var.C0().c.d();
                            Long lValueOf2 = roundInitializeResponseD3 != null ? Long.valueOf(roundInitializeResponseD3.getRoundId()) : null;
                            g060.b bVarD3 = nn40Var.C0().e.d();
                            String giftId2 = bVarD3 != null ? bVarD3.a.getGiftId() : null;
                            g060.b bVarD4 = nn40Var.C0().e.d();
                            ynh0VarD1.x1(new PlaceBetRequest(iIntValue2, d2, betCardDecision, lValueOf2, giftId2, bVarD4 != null ? Double.valueOf(bVarD4.b) : null, nn40Var.t0, null, 128, null), false);
                        }
                        nn40Var.b0 = nn40Var.M;
                        nn40Var.getParentFragmentManager().a0();
                    } else if (numValueOf.intValue() != 5) {
                        g060 g060VarC0 = nn40Var.C0();
                        RoundInitializeResponse roundInitializeResponseD4 = nn40Var.C0().c.d();
                        g060VarC0.y1(new RoundRequest(roundInitializeResponseD4 != null ? Long.valueOf(roundInitializeResponseD4.getRoundId()) : null));
                    } else {
                        g060 g060VarC1 = nn40Var.C0();
                        RoundInitializeResponse roundInitializeResponseD5 = nn40Var.C0().c.d();
                        g060VarC1.x1(new RoundRequest(roundInitializeResponseD5 != null ? Long.valueOf(roundInitializeResponseD5.getRoundId()) : null));
                        nn40Var.C0().z1();
                    }
                } else {
                    nn40Var.getParentFragmentManager().a0();
                    nn40Var.K0();
                }
                break;
        }
        return Unit.a;
    }
}
