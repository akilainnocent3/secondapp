package defpackage;

import com.sportybet.android.instantwin.presentation.legends.SportyLegendsActivity;
import com.sportybet.android.instantwin.presentation.legends.d;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class t9c0 implements ud, paj {
    public final /* synthetic */ SportyLegendsActivity a;

    public t9c0(SportyLegendsActivity sportyLegendsActivity) {
        this.a = sportyLegendsActivity;
    }

    @Override // defpackage.ud
    public final void a(Object obj) {
        gqk gqkVar = (gqk) obj;
        gqkVar.getClass();
        int i = SportyLegendsActivity.A;
        if (gqkVar instanceof gqk.b) {
            return;
        }
        boolean z = gqkVar instanceof gqk.c;
        SportyLegendsActivity sportyLegendsActivity = this.a;
        if (z) {
            sportyLegendsActivity.A1().j1(((gqk.c) gqkVar).a);
            return;
        }
        if (gqkVar instanceof gqk.a) {
            gqk.a aVar = (gqk.a) gqkVar;
            String str = aVar.a;
            String str2 = aVar.b;
            d dVarA1 = sportyLegendsActivity.A1();
            bz3 bz3Var = bz3.SINGLE;
            dVarA1.I(SimulateBetConsts.BetslipType.SINGLE, str, str2);
            return;
        }
        if (!(gqkVar instanceof gqk.d)) {
            uhc.a();
            return;
        }
        d dVarA2 = sportyLegendsActivity.A1();
        bz3 bz3Var2 = bz3.SINGLE;
        dVarA2.E(SimulateBetConsts.BetslipType.SINGLE);
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return new saj(1, this.a, SportyLegendsActivity.class, "onGiftPickerResultReceived", "onGiftPickerResultReceived(Lcom/sportybet/android/instantwin/router/giftpicker/GiftPickerResult;)V", 0);
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
