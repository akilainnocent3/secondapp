package defpackage;

import android.content.Intent;
import com.google.android.material.snackbar.Snackbar;
import com.sportybet.android.bethistory.presentation.activity.BetHistoryCalendarActivity;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.activity.BetHistoryCalendarActivity$initViewModel$1$3", f = "BetHistoryCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class yp2 extends tje0 implements Function2<aq2, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ BetHistoryCalendarActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp2(BetHistoryCalendarActivity betHistoryCalendarActivity, v1b<? super yp2> v1bVar) {
        super(2, v1bVar);
        this.b = betHistoryCalendarActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yp2 yp2Var = new yp2(this.b, v1bVar);
        yp2Var.a = obj;
        return yp2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(aq2 aq2Var, v1b<? super Unit> v1bVar) {
        return ((yp2) create(aq2Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        aq2 aq2Var = (aq2) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = aq2Var instanceof aq2.b;
        BetHistoryCalendarActivity betHistoryCalendarActivity = this.b;
        if (z) {
            betHistoryCalendarActivity.setResult(0);
            betHistoryCalendarActivity.finish();
        } else if (aq2Var instanceof aq2.a) {
            betHistoryCalendarActivity.setResult(-1, new Intent());
            betHistoryCalendarActivity.finish();
        } else if (aq2Var instanceof aq2.c) {
            Intent intent = new Intent();
            intent.putExtra("resultType", "GoOlderBetHistory");
            betHistoryCalendarActivity.setResult(-1, intent);
            betHistoryCalendarActivity.finish();
        } else {
            if (!(aq2Var instanceof aq2.d)) {
                uhc.a();
                return null;
            }
            yfd0 yfd0Var = betHistoryCalendarActivity.c;
            if (yfd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            Snackbar.h(yfd0Var.a, betHistoryCalendarActivity.getCMSString(R.string.page_transaction__please_select_date_range_vnumber_days, "30"), 0).j();
        }
        return Unit.a;
    }
}
