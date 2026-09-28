package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventActivity;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qxu implements ud, paj {
    public final /* synthetic */ MatchEventActivity a;

    public qxu(MatchEventActivity matchEventActivity) {
        this.a = matchEventActivity;
    }

    @Override // defpackage.ud
    public final void a(Object obj) {
        gqk gqkVar = (gqk) obj;
        gqkVar.getClass();
        int i = MatchEventActivity.a0;
        if (gqkVar instanceof gqk.b) {
            return;
        }
        boolean z = gqkVar instanceof gqk.c;
        MatchEventActivity matchEventActivity = this.a;
        if (z) {
            matchEventActivity.I1().j1(((gqk.c) gqkVar).a);
            return;
        }
        if (gqkVar instanceof gqk.a) {
            gqk.a aVar = (gqk.a) gqkVar;
            String str = aVar.a;
            String str2 = aVar.b;
            z5v z5vVarI1 = matchEventActivity.I1();
            bz3 bz3Var = bz3.SINGLE;
            z5vVarI1.I(SimulateBetConsts.BetslipType.SINGLE, str, str2);
            return;
        }
        if (!(gqkVar instanceof gqk.d)) {
            uhc.a();
            return;
        }
        z5v z5vVarI2 = matchEventActivity.I1();
        bz3 bz3Var2 = bz3.SINGLE;
        z5vVarI2.E(SimulateBetConsts.BetslipType.SINGLE);
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return new saj(1, this.a, MatchEventActivity.class, "onGiftPickerResultReceived", "onGiftPickerResultReceived(Lcom/sportybet/android/instantwin/router/giftpicker/GiftPickerResult;)V", 0);
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
