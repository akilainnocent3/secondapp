package defpackage;

import com.sportybet.android.instantwin.presentation.racingevent.InstantRacingEventActivity;
import com.sportybet.android.instantwin.presentation.racingevent.b;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class stn implements ud, paj {
    public final /* synthetic */ InstantRacingEventActivity a;

    public stn(InstantRacingEventActivity instantRacingEventActivity) {
        this.a = instantRacingEventActivity;
    }

    @Override // defpackage.ud
    public final void a(Object obj) {
        gqk gqkVar = (gqk) obj;
        gqkVar.getClass();
        int i = InstantRacingEventActivity.w;
        if (gqkVar instanceof gqk.b) {
            return;
        }
        boolean z = gqkVar instanceof gqk.c;
        InstantRacingEventActivity instantRacingEventActivity = this.a;
        if (z) {
            instantRacingEventActivity.z1().j1(((gqk.c) gqkVar).a);
            return;
        }
        if (gqkVar instanceof gqk.a) {
            gqk.a aVar = (gqk.a) gqkVar;
            String str = aVar.a;
            String str2 = aVar.b;
            b bVarZ1 = instantRacingEventActivity.z1();
            bz3 bz3Var = bz3.SINGLE;
            bVarZ1.I(SimulateBetConsts.BetslipType.SINGLE, str, str2);
            return;
        }
        if (!(gqkVar instanceof gqk.d)) {
            uhc.a();
            return;
        }
        b bVarZ2 = instantRacingEventActivity.z1();
        bz3 bz3Var2 = bz3.SINGLE;
        bVarZ2.E(SimulateBetConsts.BetslipType.SINGLE);
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return new saj(1, this.a, InstantRacingEventActivity.class, "onGiftPickerResultReceived", "onGiftPickerResultReceived(Lcom/sportybet/android/instantwin/router/giftpicker/GiftPickerResult;)V", 0);
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
