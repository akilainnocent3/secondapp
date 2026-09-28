package defpackage;

import com.sportybet.android.instantwin.presentation.bethistory2.InstantWinBetHistoryActivity;
import com.sportybet.android.instantwin.presentation.bethistory2.a;
import com.sportybet.android.instantwin.presentation.bethistory2.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b9o implements ud, paj {
    public final /* synthetic */ InstantWinBetHistoryActivity a;

    public b9o(InstantWinBetHistoryActivity instantWinBetHistoryActivity) {
        this.a = instantWinBetHistoryActivity;
    }

    @Override // defpackage.ud
    public final void a(Object obj) {
        fn7 fn7Var = (fn7) obj;
        fn7Var.getClass();
        q8i0 q8i0Var = this.a.b;
        int i = InstantWinBetHistoryActivity.f;
        if (fn7Var instanceof fn7.a) {
            ((c) q8i0Var.getValue()).A1(a.m.a);
        } else if (fn7Var instanceof fn7.c) {
            fn7.c cVar = (fn7.c) fn7Var;
            ((c) q8i0Var.getValue()).A1(new a.n(cVar.a, cVar.b));
        } else {
            if ((fn7Var instanceof fn7.b) || (fn7Var instanceof fn7.d)) {
                return;
            }
            uhc.a();
        }
    }

    @Override // defpackage.paj
    public final haj<?> c() {
        return new saj(1, this.a, InstantWinBetHistoryActivity.class, "onCalendarResultReceived", "onCalendarResultReceived(Lcom/sportybet/android/instantwin/router/calendar/ChooseInstantCalendarResult;)V", 0);
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
