package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.ScheduledFootballActivity;
import com.sportybet.android.instantwin.presentation.scheduledfootball.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wz60 implements ud, paj {
    public final /* synthetic */ ScheduledFootballActivity a;

    public wz60(ScheduledFootballActivity scheduledFootballActivity) {
        this.a = scheduledFootballActivity;
    }

    @Override // defpackage.ud
    public final void a(Object obj) {
        gqk gqkVar = (gqk) obj;
        gqkVar.getClass();
        int i = ScheduledFootballActivity.v;
        if (gqkVar instanceof gqk.b) {
            return;
        }
        boolean z = gqkVar instanceof gqk.c;
        ScheduledFootballActivity scheduledFootballActivity = this.a;
        if (z) {
            scheduledFootballActivity.z1().j1(((gqk.c) gqkVar).a);
            return;
        }
        if (gqkVar instanceof gqk.a) {
            gqk.a aVar = (gqk.a) gqkVar;
            String str = aVar.a;
            String str2 = aVar.b;
            d dVarZ1 = scheduledFootballActivity.z1();
            dVarZ1.J.I(dVarZ1.d.b().a, str, str2);
            return;
        }
        if (!(gqkVar instanceof gqk.d)) {
            uhc.a();
            return;
        }
        d dVarZ2 = scheduledFootballActivity.z1();
        dVarZ2.J.E(dVarZ2.d.b().a);
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return new saj(1, this.a, ScheduledFootballActivity.class, "onGiftPickerResultReceived", "onGiftPickerResultReceived(Lcom/sportybet/android/instantwin/router/giftpicker/GiftPickerResult;)V", 0);
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
