package defpackage;

import com.sportybet.android.virtual.presentation.activity.MatchEventDetailActivity;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zzu implements ud, paj {
    public final /* synthetic */ MatchEventDetailActivity a;

    public zzu(MatchEventDetailActivity matchEventDetailActivity) {
        this.a = matchEventDetailActivity;
    }

    @Override // defpackage.ud
    public final void a(Object obj) {
        gqk gqkVar = (gqk) obj;
        gqkVar.getClass();
        int i = MatchEventDetailActivity.U;
        if (gqkVar instanceof gqk.b) {
            return;
        }
        boolean z = gqkVar instanceof gqk.c;
        MatchEventDetailActivity matchEventDetailActivity = this.a;
        if (z) {
            matchEventDetailActivity.I1().j1(((gqk.c) gqkVar).a);
            return;
        }
        if (gqkVar instanceof gqk.a) {
            gqk.a aVar = (gqk.a) gqkVar;
            String str = aVar.a;
            String str2 = aVar.b;
            m3v m3vVarI1 = matchEventDetailActivity.I1();
            bz3 bz3Var = bz3.SINGLE;
            m3vVarI1.I(SimulateBetConsts.BetslipType.SINGLE, str, str2);
            return;
        }
        if (!(gqkVar instanceof gqk.d)) {
            uhc.a();
            return;
        }
        m3v m3vVarI2 = matchEventDetailActivity.I1();
        bz3 bz3Var2 = bz3.SINGLE;
        m3vVarI2.E(SimulateBetConsts.BetslipType.SINGLE);
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return new saj(1, this.a, MatchEventDetailActivity.class, "onGiftPickerResultReceived", "onGiftPickerResultReceived(Lcom/sportybet/android/instantwin/router/giftpicker/GiftPickerResult;)V", 0);
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
