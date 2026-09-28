package defpackage;

import com.sportybet.android.instantwin.presentation.penalty.SportyPenaltyActivity;
import com.sportybet.android.instantwin.presentation.penalty.d;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wuc0 implements ud, paj {
    public final /* synthetic */ SportyPenaltyActivity a;

    public wuc0(SportyPenaltyActivity sportyPenaltyActivity) {
        this.a = sportyPenaltyActivity;
    }

    @Override // defpackage.ud
    public final void a(Object obj) {
        gqk gqkVar = (gqk) obj;
        gqkVar.getClass();
        int i = SportyPenaltyActivity.w;
        if (gqkVar instanceof gqk.b) {
            return;
        }
        boolean z = gqkVar instanceof gqk.c;
        SportyPenaltyActivity sportyPenaltyActivity = this.a;
        if (z) {
            sportyPenaltyActivity.z1().j1(((gqk.c) gqkVar).a);
            return;
        }
        if (gqkVar instanceof gqk.a) {
            gqk.a aVar = (gqk.a) gqkVar;
            String str = aVar.a;
            String str2 = aVar.b;
            d dVarZ1 = sportyPenaltyActivity.z1();
            bz3 bz3Var = bz3.SINGLE;
            dVarZ1.I(SimulateBetConsts.BetslipType.SINGLE, str, str2);
            return;
        }
        if (!(gqkVar instanceof gqk.d)) {
            uhc.a();
            return;
        }
        d dVarZ2 = sportyPenaltyActivity.z1();
        bz3 bz3Var2 = bz3.SINGLE;
        dVarZ2.E(SimulateBetConsts.BetslipType.SINGLE);
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return new saj(1, this.a, SportyPenaltyActivity.class, "onGiftPickerResultReceived", "onGiftPickerResultReceived(Lcom/sportybet/android/instantwin/router/giftpicker/GiftPickerResult;)V", 0);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ud) && (obj instanceof paj)) {
            return Intrinsics.g(c(), ((paj) obj).c());
        }
        return false;
    }

    public final int hashCode() {
        return c().hashCode();
    }
}
