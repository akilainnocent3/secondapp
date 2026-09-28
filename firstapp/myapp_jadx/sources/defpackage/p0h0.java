package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.ui.calendar.TxCalendarActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.calendar.TxCalendarActivity$initViewModel$1$2", f = "TxCalendarActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class p0h0 extends tje0 implements Function2<jse, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxCalendarActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0h0(TxCalendarActivity txCalendarActivity, v1b<? super p0h0> v1bVar) {
        super(2, v1bVar);
        this.b = txCalendarActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p0h0 p0h0Var = new p0h0(this.b, v1bVar);
        p0h0Var.a = obj;
        return p0h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jse jseVar, v1b<? super Unit> v1bVar) {
        return ((p0h0) create(jseVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jse jseVar = (jse) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        TxCalendarActivity txCalendarActivity = this.b;
        af afVar = txCalendarActivity.b;
        if (afVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        afVar.C.setText(txCalendarActivity.getCMSString(R.string.common_functions__from_date, jseVar.b()));
        af afVar2 = txCalendarActivity.b;
        if (afVar2 != null) {
            afVar2.B.setText(txCalendarActivity.getCMSString(R.string.common_functions__to_date, jseVar.a()));
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
