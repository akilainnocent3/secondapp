package defpackage;

import android.text.TextUtils;
import com.sportybet.android.virtual.presentation.activity.InstantCalendarActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.activity.InstantCalendarActivity$initViewModel$1$1", f = "InstantCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kpn extends tje0 implements Function2<jse, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ InstantCalendarActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpn(InstantCalendarActivity instantCalendarActivity, v1b<? super kpn> v1bVar) {
        super(2, v1bVar);
        this.b = instantCalendarActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kpn kpnVar = new kpn(this.b, v1bVar);
        kpnVar.a = obj;
        return kpnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jse jseVar, v1b<? super Unit> v1bVar) {
        return ((kpn) create(jseVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jse jseVar = (jse) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zIsEmpty = TextUtils.isEmpty(jseVar.b());
        InstantCalendarActivity instantCalendarActivity = this.b;
        if (!zIsEmpty) {
            int i = InstantCalendarActivity.F;
            instantCalendarActivity.H1().f.setText(jseVar.b());
        }
        if (!TextUtils.isEmpty(jseVar.a())) {
            int i2 = InstantCalendarActivity.F;
            instantCalendarActivity.H1().e.setText(jseVar.a());
        }
        return Unit.a;
    }
}
