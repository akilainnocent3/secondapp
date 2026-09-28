package defpackage;

import android.content.Intent;
import com.google.android.material.snackbar.Snackbar;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.virtual.presentation.activity.InstantCalendarActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.activity.InstantCalendarActivity$initViewModel$1$3", f = "InstantCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mpn extends tje0 implements Function2<aq2, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ InstantCalendarActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpn(InstantCalendarActivity instantCalendarActivity, v1b<? super mpn> v1bVar) {
        super(2, v1bVar);
        this.b = instantCalendarActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mpn mpnVar = new mpn(this.b, v1bVar);
        mpnVar.a = obj;
        return mpnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(aq2 aq2Var, v1b<? super Unit> v1bVar) {
        return ((mpn) create(aq2Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        aq2 aq2Var = (aq2) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = aq2Var instanceof aq2.b;
        InstantCalendarActivity instantCalendarActivity = this.b;
        if (z) {
            instantCalendarActivity.setResult(0);
            instantCalendarActivity.finish();
        } else if (aq2Var instanceof aq2.a) {
            instantCalendarActivity.setResult(-1, new Intent());
            instantCalendarActivity.finish();
        } else if (aq2Var instanceof aq2.c) {
            Intent intent = new Intent();
            intent.putExtra("extra_result_type", "extra_value_older_bet_history");
            instantCalendarActivity.setResult(-1, intent);
            instantCalendarActivity.finish();
        } else {
            if (!(aq2Var instanceof aq2.d)) {
                uhc.a();
                return null;
            }
            int i = InstantCalendarActivity.F;
            Snackbar.h(instantCalendarActivity.H1().a, instantCalendarActivity.getCMSString(R.string.page_transaction__please_select_date_range_vnumber_days, "30"), 0).j();
        }
        return Unit.a;
    }
}
