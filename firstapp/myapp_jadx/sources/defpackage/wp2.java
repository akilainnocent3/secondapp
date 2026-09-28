package defpackage;

import com.sportybet.android.bethistory.presentation.activity.BetHistoryCalendarActivity;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.activity.BetHistoryCalendarActivity$initViewModel$1$1", f = "BetHistoryCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wp2 extends tje0 implements Function2<jse, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ BetHistoryCalendarActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp2(BetHistoryCalendarActivity betHistoryCalendarActivity, v1b<? super wp2> v1bVar) {
        super(2, v1bVar);
        this.b = betHistoryCalendarActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wp2 wp2Var = new wp2(this.b, v1bVar);
        wp2Var.a = obj;
        return wp2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jse jseVar, v1b<? super Unit> v1bVar) {
        return ((wp2) create(jseVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jse jseVar = (jse) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = jseVar instanceof jse.b;
        BetHistoryCalendarActivity betHistoryCalendarActivity = this.b;
        if (z) {
            yfd0 yfd0Var = betHistoryCalendarActivity.c;
            if (yfd0Var == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yfd0Var.f.setVisibility(8);
            yfd0 yfd0Var2 = betHistoryCalendarActivity.c;
            if (yfd0Var2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yfd0Var2.v.setVisibility(0);
            yfd0 yfd0Var3 = betHistoryCalendarActivity.c;
            if (yfd0Var3 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yfd0Var3.i.setVisibility(0);
        } else {
            if (!(jseVar instanceof jse.c)) {
                uhc.a();
                return null;
            }
            yfd0 yfd0Var4 = betHistoryCalendarActivity.c;
            if (yfd0Var4 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yfd0Var4.f.setVisibility(0);
            yfd0 yfd0Var5 = betHistoryCalendarActivity.c;
            if (yfd0Var5 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yfd0Var5.v.setVisibility(8);
            yfd0 yfd0Var6 = betHistoryCalendarActivity.c;
            if (yfd0Var6 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            yfd0Var6.i.setVisibility(8);
        }
        yfd0 yfd0Var7 = betHistoryCalendarActivity.c;
        if (yfd0Var7 == null) {
            Intrinsics.n("binding");
            throw null;
        }
        yfd0Var7.v.setText(betHistoryCalendarActivity.getCMSString(R.string.common_functions__from_date, jseVar.b()));
        yfd0 yfd0Var8 = betHistoryCalendarActivity.c;
        if (yfd0Var8 != null) {
            yfd0Var8.i.setText(betHistoryCalendarActivity.getCMSString(R.string.common_functions__to_date, jseVar.a()));
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
